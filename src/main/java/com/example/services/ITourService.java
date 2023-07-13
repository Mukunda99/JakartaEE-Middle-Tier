package com.example.services;

import java.util.List;

import com.example.entities.Tour;

//@Repository
//@Transactional
public interface ITourService 
{

	public void addTour(Tour tour);
	
	public List<Tour> getTours();
	
	public void updateTour(Tour tour , long id);
	
	public List<Tour> getByName(String name);
}
