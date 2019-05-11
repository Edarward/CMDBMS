package com.cmdbms.model;

import java.util.Date;

public class Stuexamarrange {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_stu_exam_arrange.id
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_stu_exam_arrange.stuExamSubId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    private Integer stuExamSubId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_stu_exam_arrange.stuExamTime
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    private Date stuExamTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_stu_exam_arrange.stuExamClrId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    private Integer stuExamClrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_stu_exam_arrange.stuExamTeacherId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    private Integer stuExamTeacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_stu_exam_arrange.stuExamStuId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    private Integer stuExamStuId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stu_exam_arrange
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Stuexamarrange(Integer id, Integer stuExamSubId, Date stuExamTime, Integer stuExamClrId, Integer stuExamTeacherId, Integer stuExamStuId) {
        this.id = id;
        this.stuExamSubId = stuExamSubId;
        this.stuExamTime = stuExamTime;
        this.stuExamClrId = stuExamClrId;
        this.stuExamTeacherId = stuExamTeacherId;
        this.stuExamStuId = stuExamStuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stu_exam_arrange
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Stuexamarrange() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_stu_exam_arrange.id
     *
     * @return the value of t_stu_exam_arrange.id
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_stu_exam_arrange.id
     *
     * @param id the value for t_stu_exam_arrange.id
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_stu_exam_arrange.stuExamSubId
     *
     * @return the value of t_stu_exam_arrange.stuExamSubId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Integer getStuExamSubId() {
        return stuExamSubId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_stu_exam_arrange.stuExamSubId
     *
     * @param stuExamSubId the value for t_stu_exam_arrange.stuExamSubId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public void setStuExamSubId(Integer stuExamSubId) {
        this.stuExamSubId = stuExamSubId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_stu_exam_arrange.stuExamTime
     *
     * @return the value of t_stu_exam_arrange.stuExamTime
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Date getStuExamTime() {
        return stuExamTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_stu_exam_arrange.stuExamTime
     *
     * @param stuExamTime the value for t_stu_exam_arrange.stuExamTime
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public void setStuExamTime(Date stuExamTime) {
        this.stuExamTime = stuExamTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_stu_exam_arrange.stuExamClrId
     *
     * @return the value of t_stu_exam_arrange.stuExamClrId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Integer getStuExamClrId() {
        return stuExamClrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_stu_exam_arrange.stuExamClrId
     *
     * @param stuExamClrId the value for t_stu_exam_arrange.stuExamClrId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public void setStuExamClrId(Integer stuExamClrId) {
        this.stuExamClrId = stuExamClrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_stu_exam_arrange.stuExamTeacherId
     *
     * @return the value of t_stu_exam_arrange.stuExamTeacherId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Integer getStuExamTeacherId() {
        return stuExamTeacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_stu_exam_arrange.stuExamTeacherId
     *
     * @param stuExamTeacherId the value for t_stu_exam_arrange.stuExamTeacherId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public void setStuExamTeacherId(Integer stuExamTeacherId) {
        this.stuExamTeacherId = stuExamTeacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_stu_exam_arrange.stuExamStuId
     *
     * @return the value of t_stu_exam_arrange.stuExamStuId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Integer getStuExamStuId() {
        return stuExamStuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_stu_exam_arrange.stuExamStuId
     *
     * @param stuExamStuId the value for t_stu_exam_arrange.stuExamStuId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public void setStuExamStuId(Integer stuExamStuId) {
        this.stuExamStuId = stuExamStuId;
    }
}