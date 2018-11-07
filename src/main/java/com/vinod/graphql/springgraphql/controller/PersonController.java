package com.vinod.graphql.springgraphql.controller;

import com.vinod.graphql.springgraphql.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.vinod.graphql.springgraphql.repository.PersonRepository;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/addPerson")
    public String addPerson(@RequestBody Person person) {
        personRepository.save(person);
        return "Record inserted";
    }

    @PostMapping("/persons")
    public boolean addAllPerson(List<Person> persons) {
        personRepository.saveAll(persons);
        System.out.println("record inserted" + persons.size());
        return true;
    }

    @GetMapping("/persons")
    public List<Person> getPersons() {
        return (List<Person>) personRepository.findAll();
    }


}
