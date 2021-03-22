package com.example.TestSpring.repoo;

import com.example.TestSpring.Models.Posts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Posts,Long> {
}
