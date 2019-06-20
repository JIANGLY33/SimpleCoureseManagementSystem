package com.jalinyiel.coursystem.system.domain;

public class Teacher {
    private Long teacherId;

    private String teacherName;

    private String department;

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Teacher(Long teacherId, String teacherName, String department) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.department = department;
    }

    public Teacher() {
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }
}