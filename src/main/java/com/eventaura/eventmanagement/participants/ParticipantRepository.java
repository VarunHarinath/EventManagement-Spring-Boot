package com.eventaura.eventmanagement.participants;

import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ParticipantRepository extends ListCrudRepository<PariticipantModel,Integer> {
    List<PariticipantModel> getParticipantsByEventId(Integer eventId);
}
