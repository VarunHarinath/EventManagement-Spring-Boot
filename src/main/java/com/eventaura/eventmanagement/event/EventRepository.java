package com.eventaura.eventmanagement.event;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends ListCrudRepository<EventModel,Integer> {
}
