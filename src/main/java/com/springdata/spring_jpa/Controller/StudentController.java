package com.springdata.spring_jpa.Controller;

import com.springdata.spring_jpa.Entity.Guardian;
import com.springdata.spring_jpa.Entity.Student;
import com.springdata.spring_jpa.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

//    @PostMapping
//    public void addStudent(@RequestBody Map<String, Object> objectMap) {
//        System.out.println(objectMap);
////        studentRepository.save(student);
//    }

    @PostMapping
    public void addStudent(Student student, Guardian guardian) {
        System.out.println(student);
        System.out.println(guardian);
        studentRepository.save(student);
    }

}
