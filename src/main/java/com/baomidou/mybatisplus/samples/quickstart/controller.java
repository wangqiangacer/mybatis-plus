package com.baomidou.mybatisplus.samples.quickstart;

import com.baomidou.mybatisplus.samples.quickstart.service.CityConstantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RequestMapping("/city")
@RestController
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
}
