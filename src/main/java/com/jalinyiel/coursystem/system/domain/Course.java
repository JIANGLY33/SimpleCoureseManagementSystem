package com.jalinyiel.coursystem.system.domain;

public class Course {
    private Integer courNo;

    private String courName;

    private Byte credit;

    public Integer getCourNo() {
        return courNo;
    }

    public void setCourNo(Integer courNo) {
        this.courNo = courNo;
    }

    public String getCourName() {
        return courName;
    }

    public void setCourName(String courName) {
        this.courName = courName == null ? null : courName.trim();
    }

    public Byte getCredit() {
        return credit;
    }

    public void setCredit(Byte credit) {
        this.credit = credit;
    }
}