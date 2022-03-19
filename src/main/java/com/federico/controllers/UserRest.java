package com.federico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.federico.entities.Role;
import com.federico.entities.User;
import com.federico.interfacesDao.UsersCRUDRepository;

@RestController
@RequestMapping("user")
public class UserRest {

	@Autowired
	private UsersCRUDRepository userCRUDRepository;
	
	@RequestMapping("/web")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		return model;
		
		
	}
	@PutMapping("/addUser")
	public void addUser(@RequestParam(value="id", required = true) int id, @RequestParam(value="enabled", required = true)
			int enabled, @RequestParam(value="user", required = true) String user,
			@RequestParam(value="password", required=true) String password, @RequestParam(value="role", required=true)
			int role_id) {
		
		if (userCRUDRepository.findById(id) != null || userCRUDRepository.findByUser(user) != null) {
			User userr = new User();
			userr.setId(id);
			userr.setEnabled(enabled);
			userr.setUser(user);
			userr.setPassword(password);
			Role role = new Role();
			role.setId(role_id);
			userr.setRole(role);
		} else {
			System.out.println("el usuario existe carapan");
		}
	}
}
