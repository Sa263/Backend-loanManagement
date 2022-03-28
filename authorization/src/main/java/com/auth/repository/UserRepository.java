package com.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.auth.model.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    public UserEntity findByUsernameAndPassword(String name , String pass);

}
