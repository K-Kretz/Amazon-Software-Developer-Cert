package com.example.validation_example.service;

import com.example.validation_example.exceptions.BadRequestException;
import com.example.validation_example.exceptions.ResourceNotFoundException;
import com.example.validation_example.model.Event;
import com.example.validation_example.model.Event;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


@Service
public class EventService {
    private Map<Integer, Event> events = new HashMap<>();
    private AtomicInteger idCounter = new AtomicInteger(2);

    public EventService() {
        events.put(1, new Event(1,"Java User Group", LocalDate.parse("2025-01-15")));
        events.put(2, new Event(2,"Angular User Group", LocalDate.parse("2025-02-01")));
    }





    public Event getEventById(int id){
        Event event= events.get(id);
        if(event != null)
            return event;

        throw new ResourceNotFoundException("Event with id "+ id +" not found.");

    }

    public Event addEvent(Event event){
        //Springboot validation will take of this now
//        if(event.getDate().compareTo("2024-11-01")<0){
//            throw new BadRequestException("Event data cannot be in the past.");
//        }
        int generatedId = idCounter.incrementAndGet();
        event.setId(generatedId);
        events.put(generatedId,event);
        return event;
    }
}
