package com.test.project.dao;

import com.fasterxml.jackson.core.JsonFactory;
import com.test.project.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2017/4/3.
 */

public interface LoginDao {

    public User login(@Param("username") String username, @Param("password") String password);
}
