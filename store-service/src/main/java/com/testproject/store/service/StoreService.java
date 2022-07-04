package com.testproject.store.service;

import java.util.List;
import java.util.Optional;

import com.testproject.store.domain.Store;
import com.testproject.store.repository.StoreRepository;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * StoreService
 */
@Service
@Slf4j
public class StoreService {

	private final StoreRepository storeRepository;

	public StoreService(StoreRepository storeRepository) {
		this.storeRepository = storeRepository;
	}

	public Store save(Store store) {
		log.info("Guardar tienda");
		store = this.storeRepository.save(store);
		return store;
	}

	public Optional<Store> findOneById(Long id) {
		Optional<Store> store = this.storeRepository.findById(id);
		return store;
	}

	public List<Store> findALl() {
		log.info("Listar tiendas");
		List<Store> response = this.storeRepository.findAll();
		return response;
	}

}
