package com.example.hp.recyclerviewlearning;

/**
 * Created by HP on 10/14/2017.
 */

public class Contacts {
    private String name;
    private String email;
    private String phone;
    private int id;

    public Contacts(String name, String email, String phone, int id) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getId() {
        return id;
    }
}
