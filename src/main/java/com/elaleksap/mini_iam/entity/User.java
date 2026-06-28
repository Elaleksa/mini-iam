package com.elaleksap.mini_iam.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String email;

    private String firstName;

    private String lastName;

    private Boolean enabled = true;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}