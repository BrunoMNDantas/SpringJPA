package com.example.controller;

import com.example.model.Person;
import com.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.LinkedList;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository repo;



    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    public Collection<Person> getAll() {
        Collection<Person> people = new LinkedList<>();

        repo.findAll().forEach(people::add);

        return people;
    }

}
