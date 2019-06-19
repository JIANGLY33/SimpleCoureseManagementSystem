package com.jalinyiel.coursystem.system.domain;

public class StudentDTO extends Student {
    String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StudentDTO(Long stuId, String stuName, String classes, String subject) {
        super(stuId, stuName, classes, subject);
    }

    public StudentDTO() {
    }

    @Override
    public String toString() {
        return super.toString() + "StudentDTO{" +
                "password='" + password + '\'' +
                '}';
    }
}
