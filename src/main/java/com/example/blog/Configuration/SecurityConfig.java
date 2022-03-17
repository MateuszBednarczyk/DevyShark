package com.example.blog.Configuration;

import com.example.blog.User.UserDetailsServiceImplementation;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private UserDetailsServiceImplementation userDetailsServiceImplementation;
    private SufixConfig sufixConfig;

    public SecurityConfig(UserDetailsServiceImplementation userDetailsServiceImplementation, SufixConfig sufixConfig) {
        this.userDetailsServiceImplementation = userDetailsServiceImplementation;
        this.sufixConfig = sufixConfig;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsServiceImplementation).passwordEncoder(sufixConfig.getPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/*").permitAll();
    }
}
