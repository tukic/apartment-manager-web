package hr.apartmentmanager.web.web;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import hr.apartmentmanager.enumerations.ReservationStatus;
import hr.apartmentmanager.web.model.Apartment;
import hr.apartmentmanager.web.model.Reservation;
import hr.apartmentmanager.web.model.Tourists;





// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

	/*
	@Transactional
	long addToReservations(
			  Tourists tourists
			, Apartment apartment
			, LocalDate checkInDate
			, LocalDate checkOutDate
			, BigDecimal pricePerNight
			, BigDecimal totalPrice
			, ReservationStatus status
			, BigDecimal advancedPaymentAmount
			, String advancedPaymentCurrency);
			
			*/
}
