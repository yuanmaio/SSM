package com.test.project.service;


import com.test.project.bean.User;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/4/3.
 */

public interface LoginService {

    public User login(String username, String password);
}
