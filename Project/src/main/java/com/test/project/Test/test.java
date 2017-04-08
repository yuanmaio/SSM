package com.test.project.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Administrator on 2017/4/4.
 */
public class test
{
    public static  void main(String[] args){
        Connection connection=null;
        Statement stmt=null;
        ResultSet resultSet=null;
        String sql=null;
        String url="jdbc:mysql://182.92.188.244:3306/TtsdMall?useUnicode=true&characterEncoding=UTF-8&serverTimezone=PRC&useSSL=false";
        try {
System.out.print("shujuku"+"\n");
try {
    Class.forName("com.mysql.jdbc.Driver");
}catch (ClassNotFoundException e){
    System.out.print("bb");
    e.printStackTrace();
}finally {
}
connection= DriverManager.getConnection(url,"luhao","ttsd1234");
stmt=connection.createStatement();
sql="select * from user where"+" username="+"ttsddb"+" password="+"ttsd1234";
resultSet=stmt.executeQuery(sql);
while(resultSet.next()){
System.out.print("ccc");
}
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
