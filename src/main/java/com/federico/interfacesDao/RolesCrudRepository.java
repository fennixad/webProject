package com.federico.interfacesDao;

import org.springframework.data.repository.CrudRepository;

import com.federico.entities.Role;

public interface RolesCrudRepository extends CrudRepository<Role, Integer> {

}