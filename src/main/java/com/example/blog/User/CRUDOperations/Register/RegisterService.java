package com.example.blog.User.CRUDOperations.Register;

import com.example.blog.Configuration.SufixConfig;
import com.example.blog.User.ApplicationUser;
import com.example.blog.User.ApplicationUserRepository;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    private ApplicationUserRepository applicationUserRepository;
    private SufixConfig sufixConfig;

    public RegisterService(ApplicationUserRepository applicationUserRepository, SufixConfig sufixConfig) {
        this.applicationUserRepository = applicationUserRepository;
        this.sufixConfig = sufixConfig;
    }

    public void register(ApplicationUser newUser){

        if(newUser == null){

            throw new IllegalArgumentException();

        }else if(applicationUserRepository.findByUsername(newUser.getUsername()).equals(newUser)){

            throw new IllegalArgumentException();

        }

        newUser.setPassword(sufixConfig.getPasswordEncoder().encode(newUser.getPassword()));
        applicationUserRepository.save(newUser);

    }

}
