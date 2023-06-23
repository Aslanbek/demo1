package com.example.demo1.entity;

import jakarta.persistence.*;

/**
 * comment for this class
 */
@MappedSuperclass
public class BaseEntity {

    /**
     * IDENTITY
     */
    private Long id;

    /**
     * def construc
     */
    public BaseEntity() {
    }

    /**
     *description
     * @param id set for record
     */


    public void setId(Long id) {
        this.id = id;
    }

    /**
     * description
     * @return id record
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
}
