package com.ePages.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ePages.entities.FoodItem;

@Repository
public interface ItemRepository extends JpaRepository<FoodItem, Integer> {
	FoodItem findByName(String name);
}
