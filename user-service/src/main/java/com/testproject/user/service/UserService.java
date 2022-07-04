package com.testproject.user.service;

import java.util.List;
import java.util.Optional;

import com.testproject.user.domain.User;
import com.testproject.user.repository.UserRepository;
import com.testproject.user.vm.Store;
import com.testproject.user.vm.Template.ResponseTemplateVM;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

/**
 * UserService
 */
@Service
@Slf4j
public class UserService {

	private final UserRepository userRepository;

	private final RestTemplate restTemplate;

	public UserService(UserRepository userRepository, RestTemplate restTemplate) {
		this.userRepository = userRepository;
		this.restTemplate = restTemplate;
	}

	public User save(User user) {
		log.info("Guarda el Usuario");
		user = this.userRepository.save(user);
		return user;
	}

	public List<User> findAll() {
		log.info("Lista los usuarios");
		List<User> response = this.userRepository.findAll();
		return response;
	}

	public ResponseTemplateVM getUserWithStore(Long userId) {
		ResponseTemplateVM vm = new ResponseTemplateVM();
		Optional<User> user = userRepository.findById(userId);
		// Store store = restTemplate.getForObject("http://localhost:8072/api/stores/" +
		// user.get().getId().toString(),
		// Store.class);
		Store store = restTemplate.getForObject("http://STORE-SERVICE/api/stores/" + user.get().getId().toString(),
				Store.class);
		vm.setStore(store);
		vm.setUser(user.get());
		return vm;
	}

}
