package com.testproject.store.repository;

import com.testproject.store.domain.Store;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * StoreRepository
 */
public interface StoreRepository extends JpaRepository<Store, Long> {

}
