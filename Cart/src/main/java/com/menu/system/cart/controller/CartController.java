package com.menu.system.cart.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.menu.system.cart.model.Item;
import com.menu.system.cart.service.CartService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CartController {
		
	private final CartService cartService;
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void createNewItem(@RequestBody Item item) {
		this.cartService.addItem(item);
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void deleteItem(@PathVariable Integer id) {
		this.cartService.deleteItem(id);
	}
	
	@GetMapping("/")
	@ResponseStatus(HttpStatus.OK)
	public List<Item> showAll(){
		return this.cartService.getAll();
	}
	
}
