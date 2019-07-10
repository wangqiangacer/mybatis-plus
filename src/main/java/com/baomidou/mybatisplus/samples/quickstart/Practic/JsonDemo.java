package com.baomidou.mybatisplus.samples.quickstart.Practic;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class JsonDemo {
    public static void main(String[] args) {
        try {
            URL url=new URL("http://www.52maps.com/china_city.php");
            Document document = Jsoup.parse(url, 100000);
            System.out.println(document);
//            Elements elements = document.select("a[target='_blank']");
//            for (Element element : elements) {
//                System.out.println(element.text());
//            }
//            System.out.println(elements);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
