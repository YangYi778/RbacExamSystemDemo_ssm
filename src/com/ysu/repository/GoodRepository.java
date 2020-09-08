package com.ysu.repository;

import java.util.List;

import com.ysu.entity.Good;

public interface GoodRepository {
	public List<Good> findAll();

    public Good findById(int id);

    public void updateById(Good good);

    public void deleteById(int id);

    public void insertGood(Good good);
}
