package com.redislab.edu.redi2read.repositories;

import com.redislab.edu.redi2read.models.Role;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository  extends CrudRepository<Role, String>{
    
    Role findFirstByName(String role);
}
