package com.jalinyiel.coursystem.system.domain;

public class Choose {
    private Long stuId;

    private Integer courNo;

    private Long teacherId;

    private Short grades;

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public Integer getCourNo() {
        return courNo;
    }

    public void setCourNo(Integer courNo) {
        this.courNo = courNo;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Short getGrades() {
        return grades;
    }

    public void setGrades(Short grades) {
        this.grades = grades;
    }
}