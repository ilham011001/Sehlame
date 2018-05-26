package com.hamz.sehatalaislam.model;

/**
 * Created by Hamz on 29/04/2018.
 */

public class Status {

    String name;
    String level;
    String date;
    String type;
    String topic;

    public Status(){};

    public Status(String name, String level, String date, String type, String topic) {
        this.name = name;
        this.level = level;
        this.date = date;
        this.type = type;
        this.topic = topic;
    }

    public String getDate() {
        return date;
    }

    public String getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public String getTopic() {
        return topic;
    }

    public String getType() {
        return type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setType(String type) {
        this.type = type;
    }
}
