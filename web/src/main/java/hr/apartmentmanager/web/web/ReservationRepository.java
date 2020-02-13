package hr.apartmentmanager.web.web;

import org.springframework.data.repository.CrudRepository;

import hr.apartmentmanager.web.model.Reservation;





// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ReservationRepository extends CrudRepository<Reservation, Long> {

}
