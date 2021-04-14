package com.redislab.edu.redi2read.repositories;

import com.redislab.edu.redi2read.models.Category;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, String> {
    
}
