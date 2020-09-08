package com.menu.system.cart.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.menu.system.cart.model.Item;
import com.menu.system.cart.repo.CartDao;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CartService {
	
	private final CartDao cartDao;
	

	@Transactional
	public void addItem(Item item) {
		item.setDateCreated(new Date());
		this.cartDao.save(item);
	}
	
	@Transactional
	public void deleteItem(int itemId) {
		Optional<Item> item = this.cartDao.findById(itemId);
		
		if(!item.isPresent()) {
			return;
		}
		this.cartDao.deleteById(itemId);
	}

	@Transactional(readOnly = true)
	@Cacheable(value= "allItems")
	public List<Item> getAll() {
		return this.cartDao.findAll();
	}
	
	@CacheEvict(value="allItems")
	public void deleteAll() {
		 this.cartDao.deleteAll();
	}

}
