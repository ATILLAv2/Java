package laba10;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;
import java.util.Scanner;

public class XMLTask {
    private static final String filePath = "src/laba10/tasks.xml";
    private static Document document;
    private static Element rootElement;

    public static void main(String[] args) {
        load();
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Вывести все задачи");
            System.out.println("2. Добавить новую задачу");
            System.out.println("3. Поиск задач по приоритету");
            System.out.println("4. Поиск задач по дате");
            System.out.println("5. Удалить задачу по названию");
            System.out.println("6. Выйти");
            System.out.print("Выберите действие: ");
            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    addTask(in);
                    break;
                case 3:
                    Priority(in);
                    break;
                case 4:
                    Date(in);
                    break;
                case 5:
                    delete(in);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        } while (choice != 6);

        in.close();
    }

    private static void load() {
        try {
            File inputFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            document = dBuilder.parse(inputFile);
            document.getDocumentElement().normalize();
            rootElement = document.getDocumentElement();
            System.out.println("Файл задач успешно загружен!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static void save() {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(filePath));
            transformer.transform(source, result);
            System.out.println("Изменения сохранены");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    // 1. Вывод всех задач
    private static void display() {
        NodeList nodeList = document.getElementsByTagName("task");

        if (nodeList.getLength() == 0) {
            System.out.println("Список задач пуст!");
            return;
        }
        System.out.println("\nСписок задач");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element task = (Element) nodeList.item(i);
            String title = task.getElementsByTagName("title").item(0).getTextContent();
            String priority = task.getElementsByTagName("priority").item(0).getTextContent();
            String date = task.getElementsByTagName("date").item(0).getTextContent();

            System.out.println((i + 1) + ". " + title);
            System.out.println("   Приоритет: " + priority);
            System.out.println("   Дата: " + date);
            System.out.println();
        }
    }

    // 2. Добавление новой задачи
    private static void addTask(Scanner scanner) {

        System.out.print("Введите название задачи: ");
        String title = scanner.nextLine();

        System.out.print("Введите приоритет (Высокий/Средний/Низкий): ");
        String priority = scanner.nextLine();

        System.out.print("Введите дату выполнения: ");
        String date = scanner.nextLine();

        Element newTask = document.createElement("task");

        Element titleElement = document.createElement("title");
        titleElement.appendChild(document.createTextNode(title));
        newTask.appendChild(titleElement);

        Element priorityElement = document.createElement("priority");
        priorityElement.appendChild(document.createTextNode(priority));
        newTask.appendChild(priorityElement);

        Element dateElement = document.createElement("date");
        dateElement.appendChild(document.createTextNode(date));
        newTask.appendChild(dateElement);

        rootElement.appendChild(newTask);
        save();
        System.out.println("Задача \"" + title + "\" успешно добавлена!");
    }

    // 3. Поиск задач по приоритету
    private static void Priority(Scanner scanner) {
        System.out.print("\nВведите приоритет для поиска (Высокий/Средний/Низкий): ");
        String searchPriority = scanner.nextLine();

        NodeList nodeList = document.getElementsByTagName("task");

        List<Element> tasks = nodeListToStream(nodeList)
                .filter(element -> {
                    String priority = element.getElementsByTagName("priority").item(0).getTextContent();
                    return priority.equalsIgnoreCase(searchPriority);
                })
                .toList();
        System.out.println("\nЗадачи с приоритетом \"" + searchPriority);

        if (tasks.isEmpty()) {
            System.out.println("Задачи с приоритетом \"" + searchPriority + "\" не найдены!");
        } else {
            int count = 0;
            for (Element task : tasks) {
                String title = task.getElementsByTagName("title").item(0).getTextContent();
                String date = task.getElementsByTagName("date").item(0).getTextContent();
                System.out.println((++count) + ". " + title + " (до " + date + ")");
            }
        }
    }

    // 4. Поиск задач по дате
    private static void Date(Scanner scanner) {
        System.out.print("\nВведите дату для поиска: ");
        String searchDate = scanner.nextLine();

        NodeList nodeList = document.getElementsByTagName("task");

        List<Element> tasks = nodeListToStream(nodeList)
                .filter(element -> {
                    String date = element.getElementsByTagName("date").item(0).getTextContent();
                    return date.equals(searchDate);
                })
                .toList();
        System.out.println("\nЗадачи на " + searchDate);

        if (tasks.isEmpty()) {
            System.out.println("Задачи на " + searchDate + " не найдены!");
        } else {
            int count = 0;
            for (Element task : tasks) {
                String title = task.getElementsByTagName("title").item(0).getTextContent();
                String priority = task.getElementsByTagName("priority").item(0).getTextContent();
                System.out.println((++count) + ". " + title + " (приоритет: " + priority + ")");
            }
        }
    }

    // 5. Удаление задачи по названию
    private static void delete(Scanner scanner) {
        System.out.print("\nВведите название задачи для удаления: ");
        String deleteTitle = scanner.nextLine();

        NodeList nodeList = document.getElementsByTagName("task");
        boolean found = false;

        for (int i = 0; i < nodeList.getLength(); i++) {
            Element task = (Element) nodeList.item(i);
            String title = task.getElementsByTagName("title").item(0).getTextContent();

            if (title.equalsIgnoreCase(deleteTitle)) {
                Node parentNode = task.getParentNode();
                parentNode.removeChild(task);
                found = true;
                System.out.println("Задача \"" + title + "\" удалена");
                break;
            }
        }
        if (found) {
            save();
        } else {
            System.out.println("Задача \"" + deleteTitle + "\" не найдена");
        }
    }

    private static java.util.stream.Stream<Element> nodeListToStream(NodeList nodeList) {
        java.util.ArrayList<Element> list = new java.util.ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                list.add((Element) node);
            }
        }
        return list.stream();
    }
}
