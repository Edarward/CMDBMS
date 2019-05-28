package com.cmdbms.mapper;

import com.cmdbms.model.Argcoure;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ArgcoureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_arg_coure
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_arg_coure
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    int insert(Argcoure record);


    Argcoure selectByPrimaryKey(Integer id);


    List<Argcoure> selectAll();


    int updateByPrimaryKey(Argcoure record);

}