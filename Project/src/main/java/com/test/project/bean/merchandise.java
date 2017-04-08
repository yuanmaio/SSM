package com.test.project.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/4/6.
 */
public class merchandise  implements Serializable{
    private int id;
    private String name;
    private String number;
    private String description;
    private String create_time;
    private String update_time;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public  String getName(){
        return  name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number=number;
    }
    public String getDescription(){
        return  description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getCreate_time(){
        return  create_time;
    }
    public void setCreate_time(String create_time){
        this.create_time=create_time;
    }
    public String getUpdate_time(){
        return update_time;
    }
    public  void setUpdate_time(String update_time){
        this.update_time=update_time;
    }
}
