package com.eventaura.eventmanagement.event;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/event")
public class EventController {
    private final EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }


    @GetMapping("")
    List<EventModel> getAllEvents(){
        return eventRepository.findAll();
    }

    @GetMapping("/event/{eventID}")
    Optional<EventModel> getEventById(@PathVariable Integer eventId){
        return eventRepository.findById(eventId);
    }

}
