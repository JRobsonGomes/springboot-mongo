package com.robson.springbootmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.robson.springbootmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}