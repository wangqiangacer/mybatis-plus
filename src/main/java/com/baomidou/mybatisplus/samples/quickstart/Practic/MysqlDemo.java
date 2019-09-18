package com.baomidou.mybatisplus.samples.quickstart.Practic;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.*;

public class MysqlDemo {
    public static void main(String[] args) {
            getConnection();
    }


    public  static  Connection getConnection()
    {
        Connection conn = null;   //数据库连接
        try
        {
            Class.forName("com.mysql.jdbc.Driver"); //加载数据库驱动，注册到驱动管理器
            /*数据库链接地址*/
            String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8&useSSL=false";
            String username = "root";
            String password = "root";
            /*创建Connection链接*/
            conn = DriverManager.getConnection(url, username, password);
            CallableStatement cs = conn.prepareCall("{call getUSER()}");
            ResultSet resultSet = cs.executeQuery();
            String string = resultSet.getString(1);
            System.out.println(string);
            System.out.println(resultSet);


        }
        catch (ClassNotFoundException e){

            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;  //返回数据库连接

    }
}
