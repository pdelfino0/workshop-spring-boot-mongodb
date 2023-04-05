package com.delfino.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.delfino.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
