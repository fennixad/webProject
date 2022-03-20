package com.federico.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.federico.entities.Role;
import com.federico.entities.User;
import com.federico.interfacesDao.RolesCrudRepository;
import com.federico.interfacesDao.UsersCRUDRepository;

@RestController
//@RequestMapping("user")
public class UserRest {

	@Autowired
	private UsersCRUDRepository userCRUDRepository;
	@Autowired
	private RolesCrudRepository rolesCRUDRepository;
	
	@RequestMapping("/web")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView();
		model.setViewName("test");
		return model;	
	}
	
	@RequestMapping("/web2")
	public String index2(Model model) {
		model.addAttribute("var", "hola mundo");
		return "test2";
	}
//	@PostMapping("/guardar")
//	public void guardar(@RequestBody User usu) {
//		userCRUDRepository.save(usu);
//	}
	public Optional<Role> findRoleByID(int id) {
		return rolesCRUDRepository.findById(id);
	}
	@RequestMapping(value = "/addUser", method = {RequestMethod.PUT, RequestMethod.GET})
	public void addUser(
			@RequestParam(value="enabled", required = true) int enabled, 
			@RequestParam(value="user", required = true) String user,
			@RequestParam(value="password", required=true) String password, 
			@RequestParam(value="role", required=true) int role_id
			){
			
			Role role = new Role();
			role = rolesCRUDRepository.findById(role_id).get();
			User userr = new User();
			userr.setEnabled(enabled);
			userr.setUser(user);
			userr.setPassword(password);
			userr.setRole(role);
			userCRUDRepository.save(userr);
		
	}
}
