package com.maicoding.timelog.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    protected User(){}

    @Id
    private Long id;
    private String name;
    private String nickname;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
