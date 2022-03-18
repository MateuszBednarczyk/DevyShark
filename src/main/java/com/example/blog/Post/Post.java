package com.example.blog.Post;

import com.sun.istack.NotNull;
import org.hibernate.mapping.List;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long PostID;

    @NotNull
    private String author;

    @NotNull
    private String postContent;

    private List postComments;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public List getPostComments() {
        return postComments;
    }

    public void setPostComments(List postComments) {
        this.postComments = postComments;
    }
}
