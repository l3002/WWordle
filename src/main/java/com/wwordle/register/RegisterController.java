package com.wwordle.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wwordle.credential.CredentialService;
import com.wwordle.user.UserService;

@RestController
@ResponseBody
public class RegisterController {

    @Autowired
    private CredentialService credentialService;
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String register(@RequestBody Register register){
        credentialService.saveCredential(register.getCredential());
        return userService.saveUser(register.getUser());
    }
    
}
