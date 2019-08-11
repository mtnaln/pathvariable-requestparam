package com.springmvc.springmvcpathvariablerequestparam.model;

/**
 * Created by Metin on 11.08.2019.
 */

public class Star {

    private Long id;
    private String name;
    private String surname;
    private int age;

    public Star() {

    }

    public Star(Long id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
