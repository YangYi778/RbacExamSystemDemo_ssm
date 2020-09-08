package com.ysu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysu.entity.Good;
import com.ysu.repository.GoodRepository;
import com.ysu.service.GoodService;

@Service
public class GoodServiceImpl implements GoodService {
	
	@Autowired
    private GoodRepository goodRepository;

    @Override
    public List<Good> findAll() {
        return goodRepository.findAll();
    }

    @Override
    public Good findById(int id) {
        return goodRepository.findById(id);
    }

    @Override
    public void updateById(Good good) {
        goodRepository.updateById(good);
    }

    @Override
    public void deleteById(int id) {
        goodRepository.deleteById(id);
    }

    @Override
    public void insertGood(Good good) {
        goodRepository.insertGood(good);
    }
}
