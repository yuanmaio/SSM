package com.test.project.service.serviceImpl;


import com.test.project.bean.User;
import com.test.project.dao.LoginDao;
import com.test.project.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/4/3.
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    public LoginDao mLoginDao;
    /**
     * 数据库查询结果
     * @return
     */
    public User login(String username, String password) {
        System.out.print("login=============>"+mLoginDao);
       // if(mLoginDao==null) return null;
         User user=mLoginDao.login(username,password);
        return user;
    }
}
