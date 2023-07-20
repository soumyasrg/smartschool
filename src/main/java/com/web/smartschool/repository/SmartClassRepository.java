package com.web.smartschool.repository;

import com.web.smartschool.model.SmartClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartClassRepository extends JpaRepository<SmartClass, Integer> {

}
