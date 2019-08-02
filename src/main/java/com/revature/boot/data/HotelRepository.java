package com.revature.boot.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.boot.beans.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

	
	public List<Hotel> findByPriceBetween(double low, double high);
	
}
