package com.cmdbms.mapper;

import com.cmdbms.model.Choosecourse;
import java.util.List;

public interface ChoosecourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_choose_course
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_choose_course
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    int insert(Choosecourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_choose_course
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    Choosecourse selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_choose_course
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    List<Choosecourse> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_choose_course
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    int updateByPrimaryKey(Choosecourse record);
}