package com.example.blog.Post;

import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void addPost(Post post){

        postRepository.save(post);

    }

    public List getPosts(String username){

        return postRepository.findAllByAuthor(username);

    }

}
