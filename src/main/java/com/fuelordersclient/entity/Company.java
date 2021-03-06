package com.fuelordersclient.entity;

/**
 *
 * @author denis
 */
public class Company {

    private long id;
    private String name;

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Company{" + "id=" + id + ", name=" + name + '}';
    }
}
