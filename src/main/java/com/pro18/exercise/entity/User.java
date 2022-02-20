package com.pro18.exercise.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table (name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotEmpty(message = "Please enter email!")
    private int id;

    @Column(name = "email")
    @NotEmpty(message = "Please enter passwor")
    private String email;

    @Column(name = "password")
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }
}
