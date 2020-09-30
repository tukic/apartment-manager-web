package hr.apartmentmanager.web.service.impl;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.apartmentmanager.web.model.Reservation;
import hr.apartmentmanager.web.service.ReservationService;
import hr.apartmentmanager.web.web.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService{

	@Autowired
	ReservationRepository reservationRepository;
	
	@Override
	public Reservation save(Reservation reservation) {
		reservationRepository.save(reservation); 
		return reservation;
	}

	@Override
	public void deleteById(long id) throws IllegalArgumentException {
		reservationRepository.deleteById(id);
	}

	@Override
	public Optional<Reservation> findById(long reservationId) {
		return reservationRepository.findById(reservationId);
	}

	@Override
	public Collection<Reservation> findAll() {
		return reservationRepository.findAll();
	}

}
