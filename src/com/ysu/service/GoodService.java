package com.ysu.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ysu.entity.Good;

@Mapper
public interface GoodService {
	public List<Good> findAll();

    public Good findById(int id);

    public void updateById(Good good);

    public void deleteById(int id);

    public void insertGood(Good good);
}
