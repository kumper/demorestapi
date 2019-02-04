package com.example.demo.service.impl;

import com.example.demo.model.Person;
import com.example.demo.service.PeopleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {
    @Override
    public List<Person> findAll() {
        final Person kamil = new Person("kamil", "parzych");
        final Person jacek = new Person("jacek", "popiołek");
        final ArrayList<Person> people = new ArrayList<>();
        people.add(kamil);
        people.add(jacek);
        return people;
    }
}
