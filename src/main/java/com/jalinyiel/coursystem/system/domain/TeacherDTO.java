package com.jalinyiel.coursystem.system.domain;

public class TeacherDTO extends Teacher {
    String password;

    public TeacherDTO() {
    }

    @Override
    public String toString() {
        return super.toString() + "TeacherDTO{" +
                "password='" + password + '\'' +
                '}';
    }

    public TeacherDTO(Teacher teacher) {
        super(teacher.getTeacherId(),teacher.getTeacherName(),teacher.getDepartment());
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
