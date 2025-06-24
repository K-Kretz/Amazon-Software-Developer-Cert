package com.example.error_handling.model;

public class Event {

    private long id;
    private String name;
    private String date; //Format: YYYY-MM-DD

    //No-arg constructor
    public Event(){}

    public Event(long id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
