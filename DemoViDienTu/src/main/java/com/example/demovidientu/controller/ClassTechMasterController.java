package com.example.demovidientu.controller;

import com.example.demovidientu.model.ClassTechMaster;
import com.example.demovidientu.model.DTO.ClassTechMasterDTO;
import com.example.demovidientu.model.DTO.StudentDTO;
import com.example.demovidientu.model.Student;
import com.example.demovidientu.repository.ClassTechMasterRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ClassTechMasterController {
    @Autowired
    ClassTechMasterRepository classTechMasterRepository;

    @GetMapping("/class/get-all")
    public ResponseEntity<List<ClassTechMasterDTO>> getAllStudent(){
        ModelMapper mapper = new ModelMapper();
        List<ClassTechMaster> classTechMasters = classTechMasterRepository.findAll();
        List<ClassTechMasterDTO> classTechMasterDTOS = classTechMasters.stream().map(classTechMaster -> mapper.map(classTechMaster,ClassTechMasterDTO.class)).collect(Collectors.toList());
        return ResponseEntity.ok(classTechMasterDTOS);
    }
}
