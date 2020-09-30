package hr.apartmentmanager.web.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;

import hr.apartmentmanager.web.model.Apartment;

public interface ApartmentService {

	/**
	 * Finds apartment with given id, if exists.  
	 * @param apartmentId given apartment id
	 * @return Optional with value of Apartment associated with given id in the system, 
	 * or no value if one does not exist 
	 */
	Optional<Apartment> findById(int apartmentId);

	/**
	 * Finds all apartments in the system
	 * @return Collection of the apartments in the system
	 */
	Collection<Apartment> findAll();
	
}
