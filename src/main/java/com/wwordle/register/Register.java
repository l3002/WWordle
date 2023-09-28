package com.wwordle.register;

import com.wwordle.credential.Credential;
import com.wwordle.user.User;

public class Register {
    private User user;
    private Credential credential;

    public User getUser(){
        return this.user;
    }

    public Credential getCredential(){
        return this.credential;
    }

    public Register(String name, String email, short Yob, String password){
        this.user = new User(name, email, Yob);
        this.credential = new Credential(password);
    }
    
}
