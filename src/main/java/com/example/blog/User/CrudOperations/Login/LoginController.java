package com.example.blog.User.CrudOperations.Login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm(){

        return "login.html";

    }

    @GetMapping("/home")
    public String successLogin(){

        return "home.html";

    }

}
