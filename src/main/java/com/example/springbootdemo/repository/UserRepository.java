package com.example.springbootdemo.repository;

import com.example.springbootdemo.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
}  