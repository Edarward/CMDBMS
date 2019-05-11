package com.cmdbms.model;

import java.util.Date;

public class Examarrange {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_exam_arrange.id
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_exam_arrange.examName
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    private String examName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_exam_arrange.examSubId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    private Integer examSubId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_exam_arrange.examTime
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    private Date examTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_exam_arrange.examClassroomId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    private Integer examClassroomId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_exam_arrange.examTeacherId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    private Integer examTeacherId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exam_arrange
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Examarrange(Integer id, String examName, Integer examSubId, Date examTime, Integer examClassroomId, Integer examTeacherId) {
        this.id = id;
        this.examName = examName;
        this.examSubId = examSubId;
        this.examTime = examTime;
        this.examClassroomId = examClassroomId;
        this.examTeacherId = examTeacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exam_arrange
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Examarrange() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_exam_arrange.id
     *
     * @return the value of t_exam_arrange.id
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_exam_arrange.id
     *
     * @param id the value for t_exam_arrange.id
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_exam_arrange.examName
     *
     * @return the value of t_exam_arrange.examName
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public String getExamName() {
        return examName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_exam_arrange.examName
     *
     * @param examName the value for t_exam_arrange.examName
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public void setExamName(String examName) {
        this.examName = examName == null ? null : examName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_exam_arrange.examSubId
     *
     * @return the value of t_exam_arrange.examSubId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Integer getExamSubId() {
        return examSubId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_exam_arrange.examSubId
     *
     * @param examSubId the value for t_exam_arrange.examSubId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public void setExamSubId(Integer examSubId) {
        this.examSubId = examSubId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_exam_arrange.examTime
     *
     * @return the value of t_exam_arrange.examTime
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Date getExamTime() {
        return examTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_exam_arrange.examTime
     *
     * @param examTime the value for t_exam_arrange.examTime
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public void setExamTime(Date examTime) {
        this.examTime = examTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_exam_arrange.examClassroomId
     *
     * @return the value of t_exam_arrange.examClassroomId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Integer getExamClassroomId() {
        return examClassroomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_exam_arrange.examClassroomId
     *
     * @param examClassroomId the value for t_exam_arrange.examClassroomId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public void setExamClassroomId(Integer examClassroomId) {
        this.examClassroomId = examClassroomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_exam_arrange.examTeacherId
     *
     * @return the value of t_exam_arrange.examTeacherId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public Integer getExamTeacherId() {
        return examTeacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_exam_arrange.examTeacherId
     *
     * @param examTeacherId the value for t_exam_arrange.examTeacherId
     *
     * @mbg.generated Sat May 11 15:09:42 CST 2019
     */
    public void setExamTeacherId(Integer examTeacherId) {
        this.examTeacherId = examTeacherId;
    }
}