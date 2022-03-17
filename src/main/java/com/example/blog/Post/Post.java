package com.example.blog.Post;

import com.example.blog.User.ApplicationUser;

import javax.persistence.ManyToOne;

public class Post {

    @ManyToOne
    private ApplicationUser author;


}
