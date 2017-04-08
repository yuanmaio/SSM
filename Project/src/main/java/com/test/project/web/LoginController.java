package com.test.project.web;

import com.test.project.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.test.project.factory.LoginFactory;
import com.test.project.service.LoginService;
import com.test.project.service.serviceImpl.LoginServiceImpl;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/4/3.
 */
@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
     public LoginService mLoginService;
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam String username, @RequestParam String password, HttpSession session){
        System.out.println("login");
      User result=mLoginService.login(username,password);
       System.out.print(result+"================>");
      if(result==null){
          return "/login";
      }else{
          session.setAttribute("user",result);
          return "/ListMerchandise";
      }

    }
}
