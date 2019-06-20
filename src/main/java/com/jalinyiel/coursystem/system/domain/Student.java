package com.jalinyiel.coursystem.system.domain;

public class Student {
    private Long stuId;

    private String stuName;

    private String classes;

    private String subject;

    public Long getStuId() {
        return stuId;
    }

    public Student(Long stuId, String stuName, String classes, String subject) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.classes = classes;
        this.subject = subject;
    }

    public Student() {
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }
}