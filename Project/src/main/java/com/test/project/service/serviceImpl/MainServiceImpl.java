package com.test.project.service.serviceImpl;

import com.test.project.bean.merchandise;
import com.test.project.dao.MerchandiseDao;
import com.test.project.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/6.
 */
@Service
public class MainServiceImpl implements MainService {
    @Autowired
    public MerchandiseDao merchandiseDao;
    public List<merchandise> selectmerchandise() {
        System.out.print("merchandiseDao"+merchandiseDao);
       if(merchandiseDao==null) return null;
      List<merchandise> merchandises= merchandiseDao.selectList();
      return merchandises;
    }
}
