package com.eventaura.eventmanagement.registration;

import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface RegistrationRepository extends ListCrudRepository<RegistrationModel,Integer> {
    List<RegistrationModel> getRegistrationByParticipantId(Long participantId);

    List<RegistrationModel> getRegistrationByTicketId(Integer ticketId);
}
