package com.cmdbms.mapper;

import com.cmdbms.model.Financialconsumables;
import java.util.List;

public interface FinancialconsumablesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_financial_consumables
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    int deleteByPrimaryKey(Integer matId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_financial_consumables
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    int insert(Financialconsumables record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_financial_consumables
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    Financialconsumables selectByPrimaryKey(Integer matId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_financial_consumables
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    List<Financialconsumables> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_financial_consumables
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    int updateByPrimaryKey(Financialconsumables record);
}