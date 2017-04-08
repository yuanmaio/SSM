package com.test.project.bean.entity;

/**
 * Created by Administrator on 2017/4/4.
 */
public class Student {
    private int id;
    private String sname;
    private String gender;
    private int calssid;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String  name){
        this.sname=name;
    }
    public String getSname(){
        return sname;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }
    public void setCalssid(int calssid){
        this.calssid=calssid;
    }
    public int getCalssid(){
        return calssid;
    }
}
