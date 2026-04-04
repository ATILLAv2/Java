package laba10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class JSONTask {
    private static final String filePath = "src/laba10/tasks.json";
    private static JSONObject jsonObject;
    private static JSONArray tasksArray;

    public static void main(String[] args) {
        load();

        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Вывести все задачи");
            System.out.println("2. Добавить новую задачу");
            System.out.println("3. Поиск задачи по названию");
            System.out.println("4. Удалить задачу по названию");
            System.out.println("5. Выйти");
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
                    search(in);
                    break;
                case 4:
                    delete(in);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        } while (choice != 5);
        in.close();
    }

    private static void load() {
        try {
            JSONParser parser = new JSONParser();
            FileReader reader = new FileReader(filePath);
            jsonObject = (JSONObject) parser.parse(reader);
            tasksArray = (JSONArray) jsonObject.get("tasks");
            reader.close();
            System.out.println("JSON файл задач успешно загружен!");
        } catch (IOException | ParseException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void save() {
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jsonObject.toJSONString());
            System.out.println("Изменения сохранены!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    // 1. Вывод всех задач
    private static void display() {
        if (tasksArray.isEmpty()) {
            System.out.println("Список задач пуст");
            return;
        }

        System.out.println("\nСписок задач");
        int count = 0;
        for (Object obj : tasksArray) {
            JSONObject task = (JSONObject) obj;
            count++;
            System.out.println(count + ". " + task.get("title"));
            System.out.println("   Приоритет: " + task.get("priority"));
            System.out.println("   Дата: " + task.get("date"));
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

        JSONObject newTask = new JSONObject();
        newTask.put("title", title);
        newTask.put("priority", priority);
        newTask.put("date", date);

        tasksArray.add(newTask);

        save();
        System.out.println("Задача \"" + title + "\" успешно добавлена");
    }

    // 3. Поиск задачи по названию
    private static void search(Scanner scanner) {
        System.out.print("\nВведите название задачи для поиска: ");
        String searchTitle = scanner.nextLine();

        boolean found = false;

        for (Object obj : tasksArray) {
            JSONObject task = (JSONObject) obj;
            String title = (String) task.get("title");
            if (title.equalsIgnoreCase(searchTitle)) {
                System.out.println("Название: " + task.get("title"));
                System.out.println("Приоритет: " + task.get("priority"));
                System.out.println("Дата: " + task.get("date"));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Задача \"" + searchTitle + "\" не найдена");
        }
    }

    // 4. Удаление задачи по названию
    private static void delete(Scanner scanner) {
        System.out.print("\nВведите название задачи для удаления: ");
        String deleteTitle = scanner.nextLine();

        boolean found = false;

        Iterator<?> iterator = tasksArray.iterator();
        while (iterator.hasNext()) {
            JSONObject task = (JSONObject) iterator.next();
            String title = (String) task.get("title");

            if (title.equalsIgnoreCase(deleteTitle)) {
                iterator.remove();
                found = true;
                System.out.println("Задача \"" + deleteTitle + "\" удалена");
                break;
            }
        }
        if (found) {
            save();
        } else {
            System.out.println("Задача \"" + deleteTitle + "\" не найдена");
        }
    }
}
