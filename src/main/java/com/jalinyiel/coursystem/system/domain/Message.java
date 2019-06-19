package com.jalinyiel.coursystem.system.domain;

import java.util.HashMap;
import java.util.Map;

public class Message {
    int code;
    String message;
    Map<String,Object> res =  new HashMap<>();

    public static Message success() {
        Message msg = new Message();
        msg.code = 200;
        msg.message = "成功！";
        return msg;
    }

    public static Message fail() {
        Message msg = new Message();
        msg.code = 400;
        msg.message = "失败！";
        return msg;
    }

    public Message add(String key, Object value) {
        res.put(key,value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getRes() {
        return res;
    }

    public void setRes(Map<String, Object> res) {
        this.res = res;
    }
}
