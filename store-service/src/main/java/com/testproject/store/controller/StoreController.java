package com.testproject.store.controller;

import java.util.List;
import java.util.Optional;

import com.testproject.store.domain.Store;
import com.testproject.store.service.StoreService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * StoreController
 */
@RestController
@RequestMapping("api")
public class StoreController {

	private final StoreService storeService;

	public StoreController(StoreService storeService) {
		this.storeService = storeService;
	}

	@PostMapping("/stores")
	public ResponseEntity<Store> createStore(@RequestBody Store store) {
		store = this.storeService.save(store);
		return ResponseEntity.ok(store);
	}

	@GetMapping("/stores/{id}")
	public ResponseEntity<Store> findOneById(@PathVariable Long id) {
		Optional<Store> store = this.storeService.findOneById(id);
		return ResponseEntity.ok(store.get());
	}

	@GetMapping("/stores")
	public ResponseEntity<List<Store>> findAll() {
		List<Store> response = this.storeService.findALl();
		return ResponseEntity.ok(response);
	}

}
