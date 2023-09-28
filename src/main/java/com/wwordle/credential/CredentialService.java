package com.wwordle.credential;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CredentialService {

    @Autowired
    private CredentialRepository jpaRepository;

    public void saveCredential(final Credential credential){
        jpaRepository.save(credential);
    }
}
