package com.spring.jpa;

import com.spring.jpa.model.AlienName;
import com.spring.jpa.repository.AlienRepository;
import com.spring.jpa.serviceimpl.AlienServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
class SpringJpaApplicationTests {


    @Autowired
    private AlienServiceImpl impl;

    @MockBean
    private AlienRepository repository;

    @Test
    void getAliens() {
        Mockito.when(repository.findAll()).thenReturn(Stream.of(new AlienName("Usa", "Ali", "Soc"),
                new AlienName("Jan", "Det", "Wal")).collect(Collectors.toList()));

        Assertions.assertEquals(2, impl.getAliens().size());
    }
}
