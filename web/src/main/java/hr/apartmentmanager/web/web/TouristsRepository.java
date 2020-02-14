package hr.apartmentmanager.web.web;

import org.springframework.data.repository.CrudRepository;

import hr.apartmentmanager.web.model.Tourists;





// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TouristsRepository extends CrudRepository<Tourists, Long> {

}
