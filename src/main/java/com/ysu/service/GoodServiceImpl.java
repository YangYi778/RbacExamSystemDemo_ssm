package com.ysu.service;

import com.ysu.dao.GoodMapper;
import com.ysu.po.Good;
import com.ysu.po.GoodExample;
import com.ysu.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "goodService")
public class GoodServiceImpl implements GoodService {

    private GoodMapper goodMapper;
    @Autowired
    public void setGoodMapper(GoodMapper goodMapper) {
        this.goodMapper = goodMapper;
    }

    @Override
    public List<Good> findAll() {
        GoodExample example = new GoodExample();
        GoodExample.Criteria criteria = example.createCriteria();
        criteria.andIdGreaterThanOrEqualTo(1);
        return goodMapper.selectByExample(example);
    }

    @Override
    public Good findById(int id) {
        return goodMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateById(Good good) {
        goodMapper.updateByPrimaryKeySelective(good);
    }

    @Override
    public void deleteById(int id) {
        goodMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insertGood(Good good) {
        goodMapper.insertSelective(good);
    }
}
