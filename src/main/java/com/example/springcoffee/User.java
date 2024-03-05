package com.example.springcoffee;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_user")


public class User {@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;

    private String Password;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
