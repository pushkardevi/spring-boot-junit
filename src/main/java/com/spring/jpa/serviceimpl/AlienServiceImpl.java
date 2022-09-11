package com.spring.jpa.serviceimpl;

import com.spring.jpa.model.AlienName;
import com.spring.jpa.repository.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlienServiceImpl {


    @Autowired
    private AlienRepository repository;

    //    public List<AlienName> getAliens() {
//        List<AlienName> list = new ArrayList<>();
//        AlienName a1 = new AlienName("Jon", "Rosy", "Der");
//        AlienName a2 = new AlienName("Ros", "Paul", "Mad");
//        list.add(a1);
//        list.add(a2);
//        return list;
//    }
    public List<AlienName> getAliens() {

        List<AlienName> list;
        list = repository.findAll();
        list.forEach(System.out::println);
        return repository.findAll();
    }
}
