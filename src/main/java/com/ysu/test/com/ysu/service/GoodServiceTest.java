package com.ysu.service;

import com.ysu.po.Good;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Qiantao-H
 * @version 1.0
 * @date 2020/9/14 0014 15:42
 */
public class GoodServiceTest {


    private GoodService goodService;
    @Autowired
    public void setGoodService(GoodService goodService){
        this.goodService = goodService;
    }
    @Test
    public void findAll() throws Exception{
        List<Good> list = goodService.findAll();

        System.out.println("....");
    }
}