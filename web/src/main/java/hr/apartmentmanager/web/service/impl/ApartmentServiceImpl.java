package hr.apartmentmanager.web.service.impl;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.apartmentmanager.web.model.Apartment;
import hr.apartmentmanager.web.service.ApartmentService;
import hr.apartmentmanager.web.web.ApartmentRepository;

@Service
public class ApartmentServiceImpl implements ApartmentService{

	@Autowired
	ApartmentRepository apartmentRepository;
	
	@Override
	public Optional<Apartment> findById(int apartmentId) {
		return apartmentRepository.findById(apartmentId);
	}

	@Override
	public Collection<Apartment> findAll() {
		return apartmentRepository.findAll();
	}

}
