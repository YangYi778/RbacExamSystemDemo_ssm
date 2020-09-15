package com.ysu.controller;

import com.ysu.po.Good;
import com.ysu.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.math.BigDecimal;

@Controller
@RequestMapping("/good")
public class GoodHandler {
    @Autowired
    private GoodService goodService;
    private static ModelAndView modelAndView = new ModelAndView();
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        modelAndView.setViewName("index");
        modelAndView.addObject("list",goodService.findAll());
        return modelAndView;
    }
    @RequestMapping(value="/findById",params = {"id"})
    public ModelAndView findById(int id){
        modelAndView.setViewName("select");
        modelAndView.addObject("good",goodService.findById(id));
        return modelAndView;
    }

    @RequestMapping(value = "/updateById")
    public ModelAndView updateById(Good good){
        goodService.updateById(good);
        return findAll();
    }
    @RequestMapping(value = "/deleteById", params = {"id"})
    public ModelAndView deleteById(int id){
        goodService.deleteById(id);
        return findAll();
    }
    @RequestMapping("/setGood")
    public ModelAndView setGood(){
        Good good = new Good();
        good.setId(8);
        good.setName("RTX 4090");
        good.setPrice(new BigDecimal(25999));
        good.setNum(199);
        return insertGood(good);
    }
    @RequestMapping(value = "/insertGood")
    public ModelAndView insertGood(Good good){
        goodService.insertGood(good);
        return findAll();
    }
}
