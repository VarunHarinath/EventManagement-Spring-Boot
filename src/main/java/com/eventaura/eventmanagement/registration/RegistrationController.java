package com.eventaura.eventmanagement.registration;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/registration")
public class RegistrationController {
    private final RegistrationRepository registrationRepository;

    public RegistrationController(RegistrationRepository registrationRepository){
        this.registrationRepository = registrationRepository;
    }

    @GetMapping("")
    List<RegistrationModel> getAllRegistrations(){
        return registrationRepository.findAll();
    }


    @GetMapping("/participant/{participantId}")
    List<RegistrationModel> getRegistrationByParticipantId(@PathVariable Long participantId ){
        return registrationRepository.getRegistrationByParticipantId(participantId);
    }

    @GetMapping("/ticket/{ticketId}")
    List<RegistrationModel> getRegistrationByTicketId(@PathVariable Integer ticketId){
        return registrationRepository.getRegistrationByTicketId(ticketId);
    }

    @PutMapping("/{tickedId}")
    void updateRegistration(@RequestBody RegistrationModel registrationModel){
        registrationRepository.save(registrationModel);
    }

    @PostMapping("")
    void createRegistration(@RequestBody RegistrationModel registrationModel){
        registrationRepository.save(registrationModel);
    }

}
