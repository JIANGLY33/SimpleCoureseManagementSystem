package com.jalinyiel.coursystem.system.domain;

public class Teach extends TeachKey {
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }
}