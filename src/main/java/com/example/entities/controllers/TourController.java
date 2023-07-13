package com.example.entities.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Tour;
import com.example.services.ITourService;

@RestController
public class TourController 
{
	@Autowired
	ITourService tourService;
	
	@PostMapping("/api/addtour")
	public void addTour(@RequestBody Tour tour)
	{
		System.out.println(tour);
		tourService.addTour(tour);
		
	}
	
	
	@GetMapping("/api/gettour")
	public List<Tour> allTours()
	{
		return tourService.getTours();
	}
	
	
	@PutMapping("/api/updatetour/{id}")
	public void updateTour(@RequestBody Tour tour ,@PathVariable long id)
	{
		tourService.updateTour(tour, id);
	}
	
	
	@GetMapping("/api/getByName/{name}")
	public List<Tour> getByName(@PathVariable String name)
	{
		return tourService.getByName(name);
	}
	
}
