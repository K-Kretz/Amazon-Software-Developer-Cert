package com.example.validation_example.model;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class Event {


    private int id;

    @NotNull(message = "Event name cannot be left blank")
    @Size(min=3, message = "Event name must have at least 3 characters")
    private String name;

    @NotNull(message = "Event data cannot be left blank")
    @Future(message = "Event date must be in the future")
    private LocalDate date; //Format: YYYY-MM-DD

    //No-arg constructor
    public Event(){}

    public Event(int id, String name, LocalDate date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
