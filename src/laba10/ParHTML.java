package laba10;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ParHTML {
    public static void main(String[] args) {
        String url = "https://itlearn.ru/first-steps";
        try {
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");
            for (Element link : links) {
                System.out.println(link.attr("abs:href"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Document doc = Jsoup.connect("https://cat-rtf.urfu.ru/news").get();
            Elements newsParent = doc.select("ul li");

            for (Element item : newsParent) {
                String newsText = item.text();
                if (!newsText.trim().isEmpty()) {
                    System.out.println("- " + newsText);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
