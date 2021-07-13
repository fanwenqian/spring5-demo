package com.fan.spring5;

/**
 * @author fans
 */
public class User {

    private String name;

    public void add() {
        System.out.println("add.....");
    }

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
