package com.baomidou.mybatisplus.samples.quickstart.controller;

import com.baomidou.mybatisplus.samples.quickstart.domain.DuanZi;
import com.baomidou.mybatisplus.samples.quickstart.service.impl.DuanZiImpl;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URL;

@RequestMapping("/duanzi")
@RestController
@Slf4j
public class DuanZiController {
    @Autowired
    private DuanZiImpl duanziImpl;

    @RequestMapping("/getDuanZi")
    public  void getCityFromURL(){

        try {
            for (int i = 0; i < 150; i++) {
                URL url=new URL("http://duanziwang.com/page/"+(i+1));
                Document document = Jsoup.parse(url, 100000);
                Elements elements = document.select("h1[class='post-title']");
                for (Element element : elements) {
                    String time = System.currentTimeMillis()+"";
                    String content = element.text();
                    DuanZi duanZi = new DuanZi();
                    duanZi.setId(Integer.parseInt(time.substring(7,13)));
                    duanZi.setContent(content);
                    duanziImpl.save(duanZi);
                }
                System.out.println("爬取第"+(i+1)+"页成功");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
