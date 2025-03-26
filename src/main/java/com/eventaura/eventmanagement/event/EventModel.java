package com.eventaura.eventmanagement.event;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import java.time.LocalDateTime;

public record EventModel(
        @Id
        Integer id,
        String eventName,
        String eventOrganizer,
        String eventVenue,
        String eventDescription,
        LocalDateTime startTime,
        LocalDateTime endTime,
        Integer totalSeats,
        double price,
        @Version
        Integer version
) {
}
