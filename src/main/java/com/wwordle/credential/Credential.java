package com.wwordle.credential;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
 public class Credential {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String password;

    String getPassword(){
        return this.password;
    }
    private void setPassword(String password){
        this.password = password;
    }
    public Credential(String password){
        setPassword(password);
    }
}
