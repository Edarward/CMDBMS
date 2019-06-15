package com.cmdbms.service;

import com.cmdbms.model.Studentmsg;

import java.util.List;

public interface StudentsSer {
    String insertStudents(Studentmsg studentmsg);

    String updateStudents(Studentmsg studentmsg);

    Studentmsg selectStudents(Integer id);

    int deleteStudents(Integer id);
}