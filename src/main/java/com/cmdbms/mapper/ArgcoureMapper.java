package com.cmdbms.mapper;

import com.cmdbms.model.Argcoure;
import java.util.List;

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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_arg_coure
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    Argcoure selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_arg_coure
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    List<Argcoure> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_arg_coure
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    int updateByPrimaryKey(Argcoure record);
}