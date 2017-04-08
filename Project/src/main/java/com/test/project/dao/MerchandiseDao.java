package com.test.project.dao;

import com.test.project.bean.merchandise;

import java.util.List;

/**
 * Created by Administrator on 2017/4/6.
 */
public interface MerchandiseDao {
    public List<merchandise> selectList();
}
