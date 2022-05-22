package com.rub.agi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Persons")
public class Resource {

    @Autowired
    private PersonRepo personRepo;

    @GetMapping("/getAllPersons")
    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }

    @PostMapping("/putPerson")
    public Person putPerson(@RequestBody Person person) {
        return personRepo.save(person);
    }
}
