package com.example.error_handling.service;

import com.example.error_handling.exceptions.BadRequestException;
import com.example.error_handling.exceptions.ResourceNotFoundException;
import com.example.error_handling.model.Event;

import java.util.List;

public class EventService {
    List<Event> events;

    public Event getEventById(int id){
        Event event= events.get(id);
        if(event != null)
            return event;

        throw new ResourceNotFoundException("Event with id "+ id +" not found.");

    }

    public Event addEvent(Event event){
        if(event.getDate().compareTo("2024-11-01")<0){
            throw new BadRequestException("Event data cannot be in the past.");
        }
        events.put(event.getId(),event);
        return event;
    }
}
