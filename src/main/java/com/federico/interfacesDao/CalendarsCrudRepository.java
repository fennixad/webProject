package com.federico.interfacesDao;

import org.springframework.data.repository.CrudRepository;

import com.federico.entities.Calendar;

public interface CalendarsCrudRepository extends CrudRepository<Calendar, Integer> {

}