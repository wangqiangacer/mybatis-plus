package com.baomidou.mybatisplus.samples.quickstart;

import com.baomidou.mybatisplus.samples.quickstart.domain.CityConstant;
import com.baomidou.mybatisplus.samples.quickstart.service.CityConstantServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RequestMapping("/city")
@RestController
@Slf4j
public class controller {

    @Autowired
    private CityConstantServiceImpl cityConstantService;
    @RequestMapping("/readFile")
    public void readFile(){
        try{
            String encoding="UTF-8"; //字符编码
            File f = new File("C:\\Users\\Administrator\\Desktop\\mybatis-plus\\mybatis-plus\\src\\city.txt");
            if(f.isFile() && f.exists()){
                InputStreamReader read = new InputStreamReader (new FileInputStream(f),encoding);
                BufferedReader   in   =   new   BufferedReader(read);
                String   line;

                while((line   =   in.readLine())!=null) {
                   // System.out.println(line);
                    Pattern pattern = Pattern.compile(line);
                    String str = "西城区";
                    Matcher m = pattern.matcher(str);
                    System.out.println(m.matches());
                }
                read.close();
            }
        }
        catch(Exception e){
            System.out.println("读取文件内容操作出错");
            e.printStackTrace();
        }
    }
    @RequestMapping("/getCity")
    public  void getCityFromURL(){
        try {
            URL url=new URL("http://www.52maps.com/china_city.php");
            Document document = Jsoup.parse(url, 100000);
            Elements elements = document.select("a[target='_blank']");

            for (Element element : elements) {
                CityConstant cityConstant = new CityConstant();
                String time = System.currentTimeMillis()+"";
                cityConstant.setId(Integer.parseInt(time.substring(7,13)));
                String cityName = element.text();
                cityConstant.setCityName(cityName);
                cityConstantService.save(cityConstant);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
