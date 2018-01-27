package com.phantom.blog.build.jpa;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Classname: Demo
 * @Description: TODO()
 * @Author: phantom
 * @Created: 2018/1/25 11:32
 */
//@Entity
public class Demo {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
