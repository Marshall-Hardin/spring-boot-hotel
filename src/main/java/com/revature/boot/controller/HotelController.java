package com.revature.boot.controller;

import java.util.List;

import javax.validation.Valid;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.boot.beans.Hotel;
import com.revature.boot.service.HotelService;

@RestController
@RequestMapping(value = "/api/v1/rooms/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class HotelController {
	
	private static final Logger log = Logger.getLogger(HotelController.class);
	
	@Autowired
	private HotelService service;
	
	@PostMapping("/room")
	public Hotel save(@Valid @RequestBody Hotel room) {
		return service.save(room);
	}
	
	@GetMapping("/room/{id}")
	public Hotel findById(@PathVariable int id) {
		return service.findById(id);
	}
			
	@GetMapping("/")
	public List<Hotel> findAll(){
		return service.findAll();
	}
	
	@DeleteMapping("/room/{id}")
	public void delete(@PathVariable int id) {
		service.delete(id);
	}
	
	@GetMapping("/price")
	public List<Hotel> findByPriceRange(@RequestParam("lo")double low, @RequestParam("hi")double high){
		return service.findByPriceRange(low,high);
	}

}












