package com.testproject.user.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import com.testproject.user.domain.User;
import com.testproject.user.service.UserService;
import com.testproject.user.vm.Template.ResponseTemplateVM;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
@RequestMapping("/api")
public class UserController {

	public final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		user = this.userService.save(user);
		return ResponseEntity.ok(user);
	}

	@GetMapping("/users")
	public ResponseEntity<List<User>> findALl() {
		List<User> response = this.userService.findAll();
		return ResponseEntity.ok(response);
	}

	@GetMapping("users/user-store/{userId}")
	public ResponseTemplateVM getUserWithStore(@PathVariable Long userId) {
		return this.userService.getUserWithStore(userId);
	}

}
