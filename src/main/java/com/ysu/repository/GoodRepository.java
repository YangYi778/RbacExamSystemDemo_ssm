package com.ysu.repository;

import com.ysu.entity.Good;

import java.util.List;
//不用加@Repository注解，因为已经交给IOC管理，会自动注解
public interface GoodRepository {
    public List<Good> findAll();

    public Good findById(int id);

    public void updateById(Good good);

    public void deleteById(int id);

    public void insertGood(Good good);
}

