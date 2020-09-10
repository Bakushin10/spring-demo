package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;


@RestController
public class PersonController {


    @Autowired
    private PersonService personService;


//    public PersonController(PersonService personService){
//        this.personService = personService;
//    }

    @PostMapping("/api/v1/person")
    //@RequestMapping("/api/v1/person")
    public void addPerson(@RequestBody @Valid @NonNull Person person){
        System.out.println("befpre");
        personService.addPerson(person);
        System.out.println("after");
    }

    @GetMapping("/api/v1/person")
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }

    @GetMapping(path = "/api/v1/person/{id}")
    public Person getPersonById(@PathVariable("id") UUID id){
        return personService.getPersonById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "/api/v1/person/{id}")
    public void deletePersonByID(@PathVariable("id") UUID id){
        personService.deletePerson(id);
    }

    @PutMapping(path = "/api/v1/person/{id}")
    public void updatePersonByID(@PathVariable("id") UUID id,
                                 @RequestBody @Valid @NonNull Person personToUpdate){
        personService.updatePerson(id, personToUpdate);
    }
}
