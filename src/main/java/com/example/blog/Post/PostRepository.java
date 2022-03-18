package com.example.blog.Post;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    Post findByAuthor(String author);
    List findAllByAuthor(String author);
}
