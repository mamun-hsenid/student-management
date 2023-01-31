package com.springdata.spring_jpa.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Students" ) // this annotation tells Hibernate to make a new table (if it's not in there, if already in there then will through an exception) called Students
public class Student {
    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY  // this tells Hibernate to generate the ID automatically with auto increment by 1
    )
    private Long studentId;
    private String studentName;
    @Column(name = "email_address",
            unique = true,
            nullable = false
    ) // this annotation tells Hibernate to make a column with this name given with it and let this column value to be unique
    private String studentEmail;

    @Embedded   // this annotation tells Hibernate to embed class
    private Guardian guardian;

}
