package com.federico.interfacesDao;

import org.springframework.data.repository.CrudRepository;

import com.federico.entities.State;



public interface StatesCrudRepository extends CrudRepository<State, Integer> {

}