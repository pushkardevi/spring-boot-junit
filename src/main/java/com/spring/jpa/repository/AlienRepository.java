package com.spring.jpa.repository;

import com.spring.jpa.model.AlienName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienRepository extends JpaRepository<AlienName, String> {
}
