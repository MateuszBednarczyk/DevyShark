package com.example.blog.Post;

import com.example.blog.User.ApplicationUser;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long PostID;

    @ManyToOne
    @NotNull
    private ApplicationUser author;


}
