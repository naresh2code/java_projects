package com.example.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ums.entity.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer>{

}
