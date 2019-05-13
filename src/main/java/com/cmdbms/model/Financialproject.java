package com.cmdbms.model;

import java.util.Date;

public class Financialproject {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_financial_project.proId
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    private Integer proId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_financial_project.proName
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    private String proName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_financial_project.proMoney
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    private String proMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_financial_project.proStartTime
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    private Date proStartTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_financial_project.proEndTime
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    private Date proEndTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_financial_project
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public Financialproject(Integer proId, String proName, String proMoney, Date proStartTime, Date proEndTime) {
        this.proId = proId;
        this.proName = proName;
        this.proMoney = proMoney;
        this.proStartTime = proStartTime;
        this.proEndTime = proEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_financial_project
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public Financialproject() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_financial_project.proId
     *
     * @return the value of t_financial_project.proId
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public Integer getProId() {
        return proId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_financial_project.proId
     *
     * @param proId the value for t_financial_project.proId
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_financial_project.proName
     *
     * @return the value of t_financial_project.proName
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public String getProName() {
        return proName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_financial_project.proName
     *
     * @param proName the value for t_financial_project.proName
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_financial_project.proMoney
     *
     * @return the value of t_financial_project.proMoney
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public String getProMoney() {
        return proMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_financial_project.proMoney
     *
     * @param proMoney the value for t_financial_project.proMoney
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public void setProMoney(String proMoney) {
        this.proMoney = proMoney == null ? null : proMoney.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_financial_project.proStartTime
     *
     * @return the value of t_financial_project.proStartTime
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public Date getProStartTime() {
        return proStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_financial_project.proStartTime
     *
     * @param proStartTime the value for t_financial_project.proStartTime
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public void setProStartTime(Date proStartTime) {
        this.proStartTime = proStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_financial_project.proEndTime
     *
     * @return the value of t_financial_project.proEndTime
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public Date getProEndTime() {
        return proEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_financial_project.proEndTime
     *
     * @param proEndTime the value for t_financial_project.proEndTime
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public void setProEndTime(Date proEndTime) {
        this.proEndTime = proEndTime;
    }
}