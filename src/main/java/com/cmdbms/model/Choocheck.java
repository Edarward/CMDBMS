package com.cmdbms.model;

import java.util.Date;

public class Choocheck {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_choo_check.id
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_choo_check.clasId
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    private Integer clasId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_choo_check.stuId
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    private Integer stuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_choo_check.applyTime
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    private Date applyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_choo_check.pass
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    private Boolean pass;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_choo_check
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public Choocheck(Integer id, Integer clasId, Integer stuId, Date applyTime, Boolean pass) {
        this.id = id;
        this.clasId = clasId;
        this.stuId = stuId;
        this.applyTime = applyTime;
        this.pass = pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_choo_check
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public Choocheck() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_choo_check.id
     *
     * @return the value of t_choo_check.id
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_choo_check.id
     *
     * @param id the value for t_choo_check.id
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_choo_check.clasId
     *
     * @return the value of t_choo_check.clasId
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public Integer getClasId() {
        return clasId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_choo_check.clasId
     *
     * @param clasId the value for t_choo_check.clasId
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public void setClasId(Integer clasId) {
        this.clasId = clasId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_choo_check.stuId
     *
     * @return the value of t_choo_check.stuId
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public Integer getStuId() {
        return stuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_choo_check.stuId
     *
     * @param stuId the value for t_choo_check.stuId
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_choo_check.applyTime
     *
     * @return the value of t_choo_check.applyTime
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_choo_check.applyTime
     *
     * @param applyTime the value for t_choo_check.applyTime
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_choo_check.pass
     *
     * @return the value of t_choo_check.pass
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public Boolean getPass() {
        return pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_choo_check.pass
     *
     * @param pass the value for t_choo_check.pass
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public void setPass(Boolean pass) {
        this.pass = pass;
    }
}