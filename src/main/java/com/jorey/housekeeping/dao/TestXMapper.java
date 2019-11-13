package com.jorey.housekeeping.dao;

import com.jorey.housekeeping.bean.TestX;
import com.jorey.housekeeping.bean.TestXExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestXMapper {
    long countByExample(TestXExample example);

    int deleteByExample(TestXExample example);

    int deleteByPrimaryKey(Integer testxId);

    int insert(TestX record);

    int insertSelective(TestX record);

    List<TestX> selectByExample(TestXExample example);

    TestX selectByPrimaryKey(Integer testxId);

    int updateByExampleSelective(@Param("record") TestX record, @Param("example") TestXExample example);

    int updateByExample(@Param("record") TestX record, @Param("example") TestXExample example);

    int updateByPrimaryKeySelective(TestX record);

    int updateByPrimaryKey(TestX record);
}