package com.cmdbms.mapper;

import com.cmdbms.model.Teaarghis;
import java.util.List;

public interface TeaarghisMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_arg_his
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_arg_his
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    int insert(Teaarghis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_arg_his
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    Teaarghis selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_arg_his
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    List<Teaarghis> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_arg_his
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    int updateByPrimaryKey(Teaarghis record);
}