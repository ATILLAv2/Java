package laba10;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ParHTMLUpd {
    public static void main(String[] args) {
        Document doc = connect();
        if (doc == null) {
            System.out.println("Не удалось подключиться");
            return;
        }
        Elements titles = doc.select(".titleline > a");
        Elements subtext = doc.select(".subtext");

        if (titles.isEmpty()) {
            System.out.println("Новости не найдены");
            return;
        }
        save(titles, subtext);
        display(titles, subtext);
    }

    private static Document connect() {
        for (int attempt = 1; attempt <= 3; attempt++) {
            try {
                System.out.println("Попытка " + attempt);
                return Jsoup.connect("https://news.ycombinator.com/")
                        .userAgent("Mozilla/5.0")
                        .timeout(10000)
                        .get();
            } catch (IOException e) {
                System.out.println("Ошибка (попытка " + attempt + ")");
                if (attempt < 3) {
                    try { Thread.sleep(2000); } catch (InterruptedException ignored) {}
                }
            }
        }
        return null;
    }

    private static String Date(Element subtext) {
        if (subtext == null) return "Дата не указана";
        Element age = subtext.select(".age").first();
        return age != null ? age.text() : "Дата не указана";
    }

    private static void save(Elements titles, Elements subtext) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("src/laba10/news_output.txt", true))) {
            for (int i = 0; i < titles.size(); i++) {
                String title = titles.get(i).text();
                if (title.isEmpty()) continue;

                String date = (i < subtext.size()) ? Date(subtext.get(i)) : "Дата не указана";
                writer.println("Новость " + (i + 1));
                writer.println("Заголовок: " + title);
                writer.println("Дата: " + date);
                writer.println();
            }
            System.out.println("\nНовости сохранены");
        } catch (IOException e) {
            System.out.println("Ошибка сохранения: " + e.getMessage());
        }
    }

    private static void display(Elements titles, Elements subtext) {
        for (int i = 0; i < titles.size() && i < 20; i++) {
            String title = titles.get(i).text();
            if (title.isEmpty()) continue;

            String date = (i < subtext.size()) ? Date(subtext.get(i)) : "Дата не указана";
            System.out.println("\n" + (i + 1) + ". " + title);
            System.out.println("   Дата: " + date);
        }
    }
}
