package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/person")
@RestController
public class PersonController {


    @Autowired
    private PersonService personService;


//    public PersonController(PersonService personService){
//        this.personService = personService;
//    }

    @PostMapping
    public void addPerson(@RequestBody Person person){
        System.out.println("befpre");
        personService.addPerson(person);
        System.out.println("after");
    }

    @GetMapping
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }
}
