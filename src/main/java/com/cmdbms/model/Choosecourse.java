package com.cmdbms.model;

import java.util.Date;

public class Choosecourse {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_choose_course.id
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_choose_course.classId
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    private Integer classId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_choose_course.stuID
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    private Integer stuID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_choose_course.applytime
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    private Date applytime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_choose_course
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public Choosecourse(Integer id, Integer classId, Integer stuID, Date applytime) {
        this.id = id;
        this.classId = classId;
        this.stuID = stuID;
        this.applytime = applytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_choose_course
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public Choosecourse() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_choose_course.id
     *
     * @return the value of t_choose_course.id
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_choose_course.id
     *
     * @param id the value for t_choose_course.id
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_choose_course.classId
     *
     * @return the value of t_choose_course.classId
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_choose_course.classId
     *
     * @param classId the value for t_choose_course.classId
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_choose_course.stuID
     *
     * @return the value of t_choose_course.stuID
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public Integer getStuID() {
        return stuID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_choose_course.stuID
     *
     * @param stuID the value for t_choose_course.stuID
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public void setStuID(Integer stuID) {
        this.stuID = stuID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_choose_course.applytime
     *
     * @return the value of t_choose_course.applytime
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public Date getApplytime() {
        return applytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_choose_course.applytime
     *
     * @param applytime the value for t_choose_course.applytime
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }
}