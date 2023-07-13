package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Tour;
import com.example.repositories.IUserRepository;

@Service
public class TourServiceImpl implements ITourService 
{
	@Autowired
	IUserRepository userRepo;
	
	@Override
	public void addTour(Tour tour) 
	{
		userRepo.save(tour);
	}

	@Override
	public List<Tour> getTours() {
		
		return userRepo.findAll();
	}

	@Override
	public void updateTour(Tour tour, long id) 
	{
		userRepo.updateTour(tour.getName(), tour.getDuration(), tour.getType(), id);
		
	}

	@Override
	public List<Tour> getByName(String name) {
		return userRepo.findByName(name);
	}
	
	
	

}
