package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.Tour;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface IUserRepository extends JpaRepository<Tour, Long> 
{
	 @Modifying
	    @Query(value = "UPDATE tour SET name = :name, duration = :duration, type = :type WHERE t_id = :id", nativeQuery = true)
	    void updateTour(@Param("name") String name, @Param("duration") int duration, @Param("type") String type, @Param("id") long id);
	 
	 
	 List<Tour>findByName(String name);
	 
}

//
//@Modifying
//@Query( value = "update tour set name = :name , duration = : duration , type=:type where t_id = :id;" , nativeQuery = true  )
//void updateTour(@Param("name") String  name , @Param("duration") int duration , @Param("type") String type , @Param("id") long id );
