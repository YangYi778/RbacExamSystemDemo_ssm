package com.ysu.service;

import com.ysu.entity.Good;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GoodService {

    public List<Good> findAll();

    public Good findById(int id);

    public void updateById(Good good);

    public void deleteById(int id);

    public void insertGood(Good good);
}
