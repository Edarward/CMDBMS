package com.cmdbms.mapper;

import com.cmdbms.model.Classroom;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassroomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_classroom
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_classroom
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    int insert(Classroom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_classroom
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    Classroom selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_classroom
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    List<Classroom> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_classroom
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    int updateByPrimaryKey(Classroom record);
}