package com.spring.jpa.controller;


import com.spring.jpa.model.AlienName;
import com.spring.jpa.serviceimpl.AlienServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlienController {

    @Autowired
    AlienServiceImpl impl;

    @GetMapping("/get")
    public List<AlienName> getAliens(){
        return impl.getAliens();
    }
}
