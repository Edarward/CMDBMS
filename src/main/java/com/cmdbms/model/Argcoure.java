package com.cmdbms.model;

import java.sql.Timestamp;

public class Argcoure {

    private Integer id;

    private Integer teacherId;

    private Integer classId;

    private Integer classroomId;

    private Timestamp courseTime;

    private Timestamp testTime;

    private Integer coureDate;

    private Integer degree;

    public Argcoure(Integer id, Integer teacherId, Integer classId, Integer classroomId,
                    Timestamp courseTime, Timestamp testTime, Integer coureDate, Integer degree) {
        this.id = id;
        this.teacherId = teacherId;
        this.classId = classId;
        this.classroomId = classroomId;
        this.courseTime = courseTime;
        this.testTime = testTime;
        this.coureDate = coureDate;
        this.degree = degree;
    }

    public Argcoure() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public Timestamp getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Timestamp courseTime) {
        this.courseTime = courseTime;
    }

    public Timestamp getTestTime() {
        return testTime;
    }

    public void setTestTime(Timestamp testTime) {
        this.testTime = testTime;
    }

    public Integer getCoureDate() {
        return coureDate;
    }

    public void setCoureDate(Integer coureDate) {
        this.coureDate = coureDate;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }
}