package com.example.demovidientu.controller;

import com.example.demovidientu.model.ClassTechMaster;
import com.example.demovidientu.model.Student;
import com.example.demovidientu.model.request.RequestInsertStudent;
import com.example.demovidientu.repository.ClassTechMasterRepository;
import com.example.demovidientu.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    ClassTechMasterRepository classTechMasterRepository;

    @PostMapping("/student/insert")
    public ResponseEntity<String> insertStudent(@RequestBody RequestInsertStudent newStudent){
        ClassTechMaster classTechMaster = classTechMasterRepository.findClassTechMasterByAddress(newStudent.getClassAddress());
        if(classTechMaster==null){
            return ResponseEntity.noContent().build();
        }
        else {
            Student student = new Student();
            student.setName(newStudent.getName());
            student.setClassTechMaster(classTechMaster);
            student.setAge(newStudent.getAge());
            student.setLevel(newStudent.getLevel());
            studentRepository.save(student);
            return ResponseEntity.ok("Suscess");
        }
    }
}
