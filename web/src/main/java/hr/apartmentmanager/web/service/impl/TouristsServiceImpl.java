package hr.apartmentmanager.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.apartmentmanager.web.model.Tourists;
import hr.apartmentmanager.web.service.TouristsService;
import hr.apartmentmanager.web.web.TouristsRepository;

@Service
public class TouristsServiceImpl implements TouristsService {

	@Autowired
	TouristsRepository touristsRepository;
	
	@Override
	public Tourists save(Tourists tourists) {
		touristsRepository.save(tourists);
		return tourists;
	}

}
