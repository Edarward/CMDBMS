package com.cmdbms.mapper;

import com.cmdbms.model.Teaarrange;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeaarrangeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_arrange
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_arrange
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    int insert(Teaarrange record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_arrange
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    Teaarrange selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_arrange
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    List<Teaarrange> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_arrange
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    int updateByPrimaryKey(Teaarrange record);
}