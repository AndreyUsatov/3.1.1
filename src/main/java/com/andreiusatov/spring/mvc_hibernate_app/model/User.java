package com.andreiusatov.spring.mvc_hibernate_app.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int age;
    private String lastName;
    private String firstName;
    private String email;

}
// Комментарии

