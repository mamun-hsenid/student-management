package com.springdata.spring_jpa.Repository;

import com.springdata.spring_jpa.Entity.Guardian;
import com.springdata.spring_jpa.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@DataJpaTest    // this will test your database and flash the data so that the database isn't impacted. this should be done in production level but for testing pusposes to see the effefcts in database we can use the @Spring boot test
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

//    @Test
//    public void saveStudentInfo(){
//        Student student = Student.builder()
//                .studentName("Abdullah Al-Mamun")
//                .studentEmail("abdullah@gmail.com")
//                .gurdianName("Ahsanul Kobir Proloy")
//                .gurdianContact(1234556667L)
//                .gurdianEmail("proloy@gmail.com")
//                .build();
//
//        studentRepository.save(student);
//    }
    @Test
    public void showStudentInfoWithGuardian(){

        Guardian guardian = Guardian.builder()
                .name("Md. Abdul Quddus")
                .email("abdul@gmail.com")
                .contact(196310324L)
                .build();

        Student student = Student.builder()
                .studentName("Abdullah Al-Mamun")
                .studentEmail("abdullah.a@hsenidmobile.com")
                .guardian(guardian)
                .build();
        studentRepository.save(student);
    }

    @Test
    public void showStudentList(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println("studentList = " + studentList);
    }

    @Test
    public void showStudentListBasedOnName(){
            List<Student> students = studentRepository.findByStudentName("Abdullah Al-Mamun");
        System.out.println("students = " + students);
    }


    @Test
    public void showStudentBasedOnEmail(){
        List<Student> students = studentRepository.findByStudentEmail("abdullah.a@hsenidmobile.com");
        System.out.println("students = " + students);
    }
    
//    @Test
//    public void showStudentBasedGurdianName(){
//        List<Student> students = studentRepository.findByGurdianName()
//
//        ("Md. Abdul Quddus");
//        System.out.println("students = " + students);
//    }

    @Test
    public void showStudentBasedOnGuardianName(){
        List<Student> students = studentRepository.findByGuardianName("Md. Abdul Quddus");
        System.out.println("students = " + students);
    }

    @Test
    public void showStudentBasedOnGuardianContact(){
        List<Student> students = studentRepository.findByGuardianContact(Long.valueOf("196310324"));
        System.out.println("students = " + students);
    }

    @Test
    public void showStudentBasedOnStudentId(){
        List<Student> students = studentRepository.findByStudentId(Long.valueOf("1"));
        System.out.println("students = " + students);
    }
}