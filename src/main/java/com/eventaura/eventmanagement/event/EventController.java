package com.eventaura.eventmanagement.event;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{eventID}")
    Optional<EventModel> getEventById(@PathVariable Integer eventID){
        return eventRepository.findById(eventID);
    }

    @PostMapping("")
    void createEvent(@RequestBody EventModel eventModel){
        eventRepository.save(eventModel);
    }

    @PutMapping("/update/{eventId}")
    void updateEvent(@RequestBody EventModel eventModel, @PathVariable Integer eventId){
        eventRepository.save(eventModel);
    }

    @DeleteMapping("/delete/{eventId}")
    void deleteEvent(@PathVariable Integer eventId){
        eventRepository.deleteById(eventId);
    }

}
