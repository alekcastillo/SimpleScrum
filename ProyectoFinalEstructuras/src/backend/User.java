/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author alekc
 */
public class User {
    private String name, lastname, email, password;
    private int id, type;
    
    public User(String name, String lastname, String email, String password, int type) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.type = type;
    }
    
    //Setters & Getters

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getType() {
        return type;
    }
    
    
}
