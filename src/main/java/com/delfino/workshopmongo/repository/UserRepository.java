package com.delfino.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.delfino.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
