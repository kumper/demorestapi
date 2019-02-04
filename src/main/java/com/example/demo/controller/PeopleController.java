package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @GetMapping
    public List<Person> findPeople() {
        return peopleService.findAll();
    }

}
