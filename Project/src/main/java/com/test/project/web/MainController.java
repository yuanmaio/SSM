package com.test.project.web;

import com.sun.deploy.net.HttpRequest;
import com.test.project.bean.entity.base;
import com.test.project.bean.merchandise;
import com.test.project.bean.merchandiseList;
import com.test.project.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Administrator on 2017/4/6.
 */
@Controller
@RequestMapping("/merchandise")
public class MainController {
    @Autowired
    public MainService mainService;
    @RequestMapping(value = "/merchandises", method = RequestMethod.GET)
    @ResponseBody
    public void selectmerchadise(HttpServletRequest  request, HttpServletResponse response){
        System.out.print("getmerchandise"+request.getContextPath());

        List<merchandise> list=mainService.selectmerchandise();
        String json="";
        base bases=new base();
        base bases2=new base();
        System.out.print("reesult"+list+"================>");
        if(list==null){

            bases.setCode(201);
            bases.setMessage("服务器异常");
         json=bases2.toGson(bases);

        }else{
          bases.setCode(200);
          bases.setMessage("成功");
            merchandiseList merchandiseList=new merchandiseList();
            merchandiseList.setList(list);
          bases.setResult(merchandiseList);
          json =bases2.toGson(bases);
        }
        response.setContentType("application/json");
        response.setHeader("Cache-Control", "no-cache");
        response.setCharacterEncoding("UTF-8");
        try {
            PrintWriter writer;
            writer = response.getWriter();
            writer.print(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping(value = "/merchandise", method = RequestMethod.GET)
    public String listMerchandise(Model model){
        List<merchandise> list=mainService.selectmerchandise();
        model.addAttribute("list",list);
        return "/ListMerchandise";
    }
}
