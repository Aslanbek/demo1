package com.example.demo1.model;

/**
 * my base model class
 */
public class BaseModel {
    /**
     * my id
     */
    private Long id;

    /**
     * def constr
     */
    public BaseModel() {
    }

    /**
     * descrr
     * @return model id
     */
    public Long getId() {
        return id;
    }

    /**
     * descr
     * @param id set id
     */
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "id=" + id +
                '}';
    }
}
