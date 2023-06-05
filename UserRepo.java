package com.main.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.main.Entity.User;

@Repository
@EnableJpaRepositories
public interface UserRepo extends JpaRepository<User, Integer> {

}
