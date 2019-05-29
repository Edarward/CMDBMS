package com.cmdbms.mapper;

import com.cmdbms.model.Choocheck;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface ChoocheckMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_choo_check
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_choo_check
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int insert(Choocheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_choo_check
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    Choocheck selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_choo_check
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    List<Choocheck> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_choo_check
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int updateByPrimaryKey(Choocheck record);

    /*通过课程ID跟学生ID查找时间*/
    Timestamp selApplTimeByClaIdAndStuId(int classId,int StudentId);

    /*通过学生ID 跟 课程ID 查找编号*/
    int selChoCourIdByClaIdAndStuId(int classId,int StudentId);

    List selectInfoByStuId(int stuId);

}