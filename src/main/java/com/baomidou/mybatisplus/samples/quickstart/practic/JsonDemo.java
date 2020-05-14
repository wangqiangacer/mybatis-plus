package com.baomidou.mybatisplus.samples.quickstart.practic;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;

public class JsonDemo {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 20; i++) {
                URL url=new URL("http://duanziwang.com/page/"+(i+1));
                Document document = Jsoup.parse(url, 100000);
                Elements elements = document.select("h1[class='post-title']");
                for (Element element : elements) {
                    System.out.println(element.text());
                }
                System.out.println("爬取第"+(i+1)+"页成功");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
