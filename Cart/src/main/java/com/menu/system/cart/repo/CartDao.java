package com.menu.system.cart.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.menu.system.cart.model.Item;

@Repository
public interface CartDao extends JpaRepository<Item, Integer>{

}
