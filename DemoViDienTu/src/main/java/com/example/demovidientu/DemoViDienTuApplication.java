package com.example.demovidientu;

import com.example.demovidientu.model.ClassTechMaster;
import com.example.demovidientu.model.Level;
import com.example.demovidientu.model.Student;
import com.example.demovidientu.repository.ClassTechMasterRepository;
import com.example.demovidientu.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoViDienTuApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoViDienTuApplication.class, args);
    }
    @Autowired
    ClassTechMasterRepository classTechMasterRepository;

    @Autowired
    StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {

        /*ClassTechMaster classTechMaster = classTechMasterRepository.findById(1).get();


        Student student = new Student();
        student.setName("Thai");
        student.setAge(25);
        student.setLevel(Level.OK);
        student.setClassTechMaster(classTechMaster);
        studentRepository.save(student);
*/
    }
}
