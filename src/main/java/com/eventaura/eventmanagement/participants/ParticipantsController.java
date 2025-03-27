package com.eventaura.eventmanagement.participants;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/participant")
public class ParticipantsController {
    private final ParticipantRepository participantRepository;

    public ParticipantsController(ParticipantRepository participantRepository){
        this.participantRepository = participantRepository;

    }

    @PostMapping("")
    void createParticipant(@RequestBody PariticipantModel pariticipantModel){
        participantRepository.save(pariticipantModel);
    }

    @GetMapping("")
    List<PariticipantModel> getAllParticipants(){
        return  participantRepository.findAll();
    }

    @GetMapping("/{participantId}")
    Optional<PariticipantModel> getParticipantById(@PathVariable Integer participantId){
        return participantRepository.findById(participantId);
    }

    @GetMapping("/event/{eventId}")
    List<PariticipantModel> getParticipantByEventId(@PathVariable Integer eventId){
        return participantRepository.getParticipantsByEventId(eventId);
    }

}
