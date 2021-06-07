package com.github.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.github.cinema.entity.UsersEntity;

@Repository
public interface UserRepository extends MongoRepository<UsersEntity, String> {

}
