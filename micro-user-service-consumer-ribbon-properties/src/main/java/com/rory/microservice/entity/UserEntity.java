package com.rory.microservice.entity;

/**
 * Created by RoryGao on 2017/7/9.
 */
public class UserEntity {
    private long id;
    private String name;
    private Short age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }
}
