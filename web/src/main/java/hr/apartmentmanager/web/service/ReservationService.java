package hr.apartmentmanager.web.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;

import hr.apartmentmanager.web.model.Reservation;

public interface ReservationService {

	/**
	 * Finds reservation in the system, if exists.
	 * @param reservationId given reservation id
	 * @return Optional with value of reservation associated with given ID in the system,
	 * or no value if one does not exist 
	 */
	Optional<Reservation> findById(long reservationId);
	
	/**
	 * Finds all reservations in the system
	 * @return Collection consisting of all reservations in the system
	 */
	Collection<Reservation> findAll();
	
	/**
	 * Saves reservation in the system
	 * @param reservation to be saved in the system
	 * @return reservation saved
	 */
	Reservation save(Reservation reservation);

	/**
	 * Deletes reservation from the system associated with given id
	 * @param reservationId associated with reservation to be deleted
	 * @throws IllegalArgumentException if reservation with that id is not found
	 */
	void deleteById(long id);

}
