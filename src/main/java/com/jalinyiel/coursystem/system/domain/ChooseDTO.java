package com.jalinyiel.coursystem.system.domain;

public class ChooseDTO extends Choose {
    String stuName;

    String courName;

    public ChooseDTO() {
    }

    public ChooseDTO(Choose choose, String stuName, String courName) {
        super(choose.getStuId(), choose.getCourNo(), choose.getTeacherId());
        this.stuName = stuName;
        this.courName = courName;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getCourName() {
        return courName;
    }

    public void setCourName(String courName) {
        this.courName = courName;
    }

    @Override
    public String toString() {
        return "ChooseDTO{" +
                "stuName='" + stuName + '\'' +
                ", courName='" + courName + '\'' +
                 "choose: " + super.toString() + '}';
    }
}
