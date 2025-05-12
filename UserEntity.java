package com.Application.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false, unique = true) // Email must be unique
    private String email;

    @Column(nullable = false)
    private String password;
  
 // New field for score
    @Column(nullable = false)
    private int score = 0; // Default score is 0

    // Getter and Setter methods
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


	// Constructors
    public User() {
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}
