package com.example.demovidientu.repository;

import com.example.demovidientu.model.ClassTechMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassTechMasterRepository extends JpaRepository<ClassTechMaster,Integer> {
    ClassTechMaster findClassTechMasterByAddress(String address);
}
