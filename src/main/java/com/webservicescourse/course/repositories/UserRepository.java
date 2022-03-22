package com.webservicescourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservicescourse.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
