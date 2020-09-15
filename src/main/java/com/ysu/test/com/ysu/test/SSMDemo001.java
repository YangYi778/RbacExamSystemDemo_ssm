package com.ysu.test;

import com.ysu.service.impl.GoodServiceImpl;
import org.junit.Test;
import com.ysu.service.*;
import com.ysu.po.*;
import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import java.util.List;


/**
 * @author Qiantao-H
 * @version 1.0
 * @date 2020/9/14 0014 14:14
 */

@Controller
public class SSMDemo001 {

    @Autowired
    private GoodService goodService;
    @Before
    public void before(){
        ApplicationContext  ac = new ClassPathXmlApplicationContext(new String[]{"springmvc.xml","spring.xml"});
        goodService = (GoodService) ac.getBean("goodService");
    }
    @Test
    public void testFindAll() {
        List<Good> list = goodService.findAll();
        for (Good good : list) {
            System.out.println(good);
        }
    }
}
