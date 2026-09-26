package com.vehiclehub.vehiclehub.entity;

import jakarta.annotation.Generated;

@Entity
public class User {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;
    private String email;
    private String password;

    public User() {

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public String getUsername() {
        return Username;
    }
}
