package com.rms.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rms.model.Address;
import com.rms.model.Product;
import com.rms.model.User;
import com.rms.service.AddressServiceImpl;
import com.rms.service.ProductSeriveImpl;
import com.rms.service.UserServiceI;
import com.rms.service.UserServiceImpl;

@RestController
@CrossOrigin(origins = "*")
public class HomeController {

	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Autowired
	private AddressServiceImpl addressServiceImpl;
//	
	@Autowired
	private ProductSeriveImpl productSeriveImpl;
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user)
	{
		return userServiceImpl.addUser(user);
	}
	
	@GetMapping("/user")
	public Iterable<User> getAllUser()
	{
		return userServiceImpl.getAllUser();
	}
	
	@GetMapping("/user/{userId}")
	public Optional<User> getSingleUser(@PathVariable int userId)
	{
		return userServiceImpl.getSingleUser(userId);
	}
	
	@PutMapping("/user/{userId}")
	public User editUser(@RequestBody User user, @PathVariable int userId)
	{
		return userServiceImpl.editUser(user, userId);
	}
	
	@DeleteMapping("user/{userId}")
	public void deleteUser(@PathVariable int userId)
	{
	    userServiceImpl.deleteUser(userId);
	}
	
	 //addreess controller
	
	@PostMapping("/address")
	public Address addAddress(@RequestBody Address address)
	{
		return addressServiceImpl.addAddress(address);
	}
	
	@GetMapping("/address")
	public Iterable<Address> getAddress()
	{
		return addressServiceImpl.getAllAddress();
	}
	
	@GetMapping("address/{laneNo}")
	public Optional<Address> getSingleAddress(@PathVariable int laneNo)
	{
		return addressServiceImpl.getSingleAddress(laneNo);
	}
	
	@PutMapping("/address/{laneNo}")
	public Address editAddress(@RequestBody Address address, @PathVariable int laneNo)
	{
		return addressServiceImpl.editAddress(address, laneNo);
	}
	
	@DeleteMapping("/address/{laneNo}")
	public void deleteAddress(@PathVariable int laneNo)
	{
		addressServiceImpl.deleteAddress(laneNo);
	}
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product)
	{
		return productSeriveImpl.addProduct(product);
	}
	
	@GetMapping("/product")
	public Iterable<Product> getAllProduct()
	{
		return productSeriveImpl.getAllProduct();
	}
	
	@GetMapping("/product/{productId}")
	public Optional<Product> getSingleProduct(@PathVariable int productId)
	{
		return productSeriveImpl.getSingleProduct(productId);
	}
	
	@PutMapping("/product/{productId}")
	public Product editProduct(@RequestBody Product product, @PathVariable int productId)
	{
		return productSeriveImpl.editProduct(product, productId);
	}
	
	@DeleteMapping("/product/{productId}")
	public void deleteProduct(@PathVariable int productId)
	{
		productSeriveImpl.deleteProduct(productId);
	}

}

