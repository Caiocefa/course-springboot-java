package com.webservicescourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservicescourse.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
