package com.springdata.spring_jpa.Repository;

import com.springdata.spring_jpa.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    public List<Student> findByStudentEmail(String emailAddress);
    List<Student> findByStudentName(String name);
    List<Student> findByStudentId(Long id);
    List<Student> findByGuardianName(String gurdianName);
    List<Student> findByGuardianContact(Long gurdianContact);

}
