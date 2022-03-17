package com.example.blog.User.CRUDOperations.Register;

import com.example.blog.User.ApplicationUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

    private RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @GetMapping
    public ModelAndView registerNewUser(@RequestBody ApplicationUser newUser){

        registerService.register(newUser);
        return new ModelAndView("test");

    }

}
