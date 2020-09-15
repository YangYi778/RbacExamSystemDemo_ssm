package com.ysu.dao;

import com.ysu.po.Good;
import com.ysu.po.GoodExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository(value = "goodDao")
public interface GoodMapper {

    int countByExample(GoodExample example);

    int deleteByExample(GoodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Good record);

    int insertSelective(Good record);

    List<Good> selectByExample(GoodExample example);

    Good selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Good record, @Param("example") GoodExample example);

    int updateByExample(@Param("record") Good record, @Param("example") GoodExample example);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);
}