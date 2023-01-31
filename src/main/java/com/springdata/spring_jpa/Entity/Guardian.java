package com.springdata.spring_jpa.Entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Embeddable    // This tells Hibernate to make this class embeddable
@AttributeOverrides({
        @AttributeOverride(name = "name", column = @Column(name = "gurdian_name")),
        @AttributeOverride(name = "email", column = @Column(name = "gurdian_email")),
        @AttributeOverride(name = "contact", column = @Column(name = "gurdian_contact"))
})
public class Guardian {
    private String name;
    private String email;
    private Long contact;

}
