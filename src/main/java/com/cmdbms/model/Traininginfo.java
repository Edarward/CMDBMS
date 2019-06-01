package com.cmdbms.model;

import java.sql.Timestamp;
import java.util.Date;

public class Traininginfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_training_info.staffId
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private Integer staffId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_training_info.traingInfo
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private String traingInfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_training_info.startDate
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private Timestamp startDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_training_info.endDate
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private Timestamp endDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_training_info
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Traininginfo(Integer staffId, String traingInfo, Timestamp startDate, Timestamp endDate) {
        this.staffId = staffId;
        this.traingInfo = traingInfo;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_training_info
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Traininginfo() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_training_info.staffId
     *
     * @return the value of t_training_info.staffId
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Integer getStaffId() {
        return staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_training_info.staffId
     *
     * @param staffId the value for t_training_info.staffId
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_training_info.traingInfo
     *
     * @return the value of t_training_info.traingInfo
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public String getTraingInfo() {
        return traingInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_training_info.traingInfo
     *
     * @param traingInfo the value for t_training_info.traingInfo
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setTraingInfo(String traingInfo) {
        this.traingInfo = traingInfo == null ? null : traingInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_training_info.startDate
     *
     * @return the value of t_training_info.startDate
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Timestamp getStartDate() {
        return startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_training_info.startDate
     *
     * @param startDate the value for t_training_info.startDate
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_training_info.endDate
     *
     * @return the value of t_training_info.endDate
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Timestamp getEndDate() {
        return endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_training_info.endDate
     *
     * @param endDate the value for t_training_info.endDate
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }
}