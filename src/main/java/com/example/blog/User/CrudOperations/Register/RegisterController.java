package com.example.blog.User.CrudOperations.Register;

import com.example.blog.User.ApplicationUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {

    private RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @GetMapping("/register")
    public String showRegistrarionForm(){
        return "register.html";
    }


    @PostMapping("/register")
    public String register(@ModelAttribute ApplicationUser applicationUser){

        registerService.register(applicationUser);
        return "redirect:/login";

    }


}
