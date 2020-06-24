package com.robson.springbootmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.robson.springbootmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
