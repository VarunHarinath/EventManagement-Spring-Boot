package com.eventaura.eventmanagement.participants;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Table;

@Table("participant_model")
public record PariticipantModel(
        @Id
        Integer id,
        String name,
        String email,
        String PhoneNumber,
        Integer eventId,
        String qrCode,
        @Version
        Integer version
) {
}
