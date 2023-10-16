package com.maicoding.timelog.category;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Category {

    protected Category(){}

    public Category(Long id, String category) {
        this.id = id;
        this.category = category;
    }

    @Id
    @GeneratedValue
    private Long id;
    private String category;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
