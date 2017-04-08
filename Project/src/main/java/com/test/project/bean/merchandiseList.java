package com.test.project.bean;

import com.test.project.bean.entity.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/6.
 */
public class merchandiseList extends base {
    private List<merchandise> list=new ArrayList<merchandise>();
    public void setList(List<merchandise> list){
        this.list=list;
    }
    public List<merchandise> getList(){
        return list;
    }







}
