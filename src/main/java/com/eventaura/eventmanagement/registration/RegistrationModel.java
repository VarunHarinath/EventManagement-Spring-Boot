package com.eventaura.eventmanagement.registration;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
@Table("registration")
public record RegistrationModel(
        @Id
        Integer ticketId,
        Long eventId,
        Long participantId,
        double price,
        String paymentStatus,
        String qrCode,
        LocalDateTime registrationDate,
        String status
) {
}
