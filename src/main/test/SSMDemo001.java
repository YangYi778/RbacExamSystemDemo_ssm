package com.ysu.test;

import com.ysu.po.Good;
import org.junit.Test;
import com.ysu.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.util.List;


/**
 * @author Qiantao-H
 * @version 1.0
 * @date 2020/9/14 0014 14:14
 */

public class SSMDemo001 {

    @Test
    public void testFindAll(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        GoodService goodService = (GoodService)context.getBean("goodService");
        List<Good> list = goodService.findAll();
    }

    @Test
    public  void  testInsertGood(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        GoodService goodService = (GoodService)context.getBean("goodService");
        Good good = new Good();
        good.setName("恶魔果实");
        good.setPrice(new BigDecimal(100));
        good.setNum(34);
        goodService.insertGood(good);
    }
}
