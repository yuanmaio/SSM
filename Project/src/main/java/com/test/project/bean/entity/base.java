package com.test.project.bean.entity;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/4.
 */
public class base<T> implements Serializable{
    public static int SUCCESS=1;
    public static int FAIL=0;
    private T result;
    private int code;
    private String message;
    public T getResult(){
        return  result;
    }
    public void setResult(T result){
        this.result=result;
    }
    public int getCode(){
        return code;
    }
    public void setCode(int code){
        this.code=code;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String  message){
        this.message=message;
    }
    public String toGson(T json){
        return new Gson().toJson(json);
    }
    public String toString(){
        return "{"+"code"+code+",message"+message+",result"+result+"}";
    }
   }
