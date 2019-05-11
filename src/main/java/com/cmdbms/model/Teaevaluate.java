package com.cmdbms.model;

import java.util.Date;

public class Teaevaluate {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tea_evaluate.id
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tea_evaluate.evaluateLevel
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    private String evaluateLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tea_evaluate.evaluateDate
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    private Date evaluateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tea_evaluate.teacherId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    private Integer teacherId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_evaluate
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Teaevaluate(Integer id, String evaluateLevel, Date evaluateDate, Integer teacherId) {
        this.id = id;
        this.evaluateLevel = evaluateLevel;
        this.evaluateDate = evaluateDate;
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_evaluate
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Teaevaluate() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tea_evaluate.id
     *
     * @return the value of t_tea_evaluate.id
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tea_evaluate.id
     *
     * @param id the value for t_tea_evaluate.id
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tea_evaluate.evaluateLevel
     *
     * @return the value of t_tea_evaluate.evaluateLevel
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public String getEvaluateLevel() {
        return evaluateLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tea_evaluate.evaluateLevel
     *
     * @param evaluateLevel the value for t_tea_evaluate.evaluateLevel
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public void setEvaluateLevel(String evaluateLevel) {
        this.evaluateLevel = evaluateLevel == null ? null : evaluateLevel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tea_evaluate.evaluateDate
     *
     * @return the value of t_tea_evaluate.evaluateDate
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Date getEvaluateDate() {
        return evaluateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tea_evaluate.evaluateDate
     *
     * @param evaluateDate the value for t_tea_evaluate.evaluateDate
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public void setEvaluateDate(Date evaluateDate) {
        this.evaluateDate = evaluateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tea_evaluate.teacherId
     *
     * @return the value of t_tea_evaluate.teacherId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tea_evaluate.teacherId
     *
     * @param teacherId the value for t_tea_evaluate.teacherId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}