package com.example.courseproject.controllers;

public class Person {
    public String name;
    public String surename;
    public int age;
    public int diagnos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDiagnos() {
        return diagnos;
    }

    public void setDiagnos(int diagnos) {
        this.diagnos = diagnos;
    }

    public int getDeprat() {
        return deprat;
    }

    public void setDeprat(int deprat) {
        this.deprat = deprat;
    }

    public int deprat;

    public Person(String name, String surename, int age, int diagnos, int deprat) {
        this.name = name;
        this.surename = surename;
        this.age = age;
        this.diagnos = diagnos;
        this.deprat = deprat;
    }

}
