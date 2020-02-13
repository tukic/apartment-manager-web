package hr.apartmentmanager.web.web;

import org.springframework.data.repository.CrudRepository;

import hr.apartmentmanager.web.model.Apartment;





// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ApartmentRepository extends CrudRepository<Apartment, Integer> {

}
