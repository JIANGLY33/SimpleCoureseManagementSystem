package com.jalinyiel.coursystem.system.domain;

public class Teach  {
    private Long teacherId;

    private Integer courNo;

    public Teach(Long teacherId, Integer courNo, String time) {
        this.teacherId = teacherId;
        this.courNo = courNo;
        this.time = time;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getCourNo() {
        return courNo;
    }

    public void setCourNo(Integer courNo) {
        this.courNo = courNo;
    }

    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Teach() {
    }

    @Override
    public String toString() {
        return "Teach{" +
                "teacherId=" + teacherId +
                ", courNo=" + courNo +
                ", time='" + time + '\'' +
                '}';
    }
}