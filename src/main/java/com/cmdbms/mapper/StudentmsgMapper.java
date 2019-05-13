package com.cmdbms.mapper;

import com.cmdbms.model.Studentmsg;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentmsgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student_msg
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student_msg
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    int insert(Studentmsg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student_msg
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    Studentmsg selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student_msg
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    List<Studentmsg> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student_msg
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    int updateByPrimaryKey(Studentmsg record);
}