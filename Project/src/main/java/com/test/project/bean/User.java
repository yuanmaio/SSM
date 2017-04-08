package com.test.project.bean;

import com.test.project.bean.entity.base;

/**
 * Created by Administrator on 2017/4/6.
 */
public class User extends base {
    private int user_id;
    private String username;
    private String password;
    public int getUser_id(){
        return user_id;
    }
    public void setUser_id(int user_id){
        this.user_id=user_id;
    }
    public String getUsername(){
        return  username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getPassword(){
       return password;
    }
    public void setPassword(String password){
        this.password=password;
    }

}
