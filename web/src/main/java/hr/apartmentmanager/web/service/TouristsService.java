package hr.apartmentmanager.web.service;

import hr.apartmentmanager.web.model.Tourists;

public interface TouristsService {
	
	/**
	 * Saves tourists in the system
	 * @param tourists to be saved in the system
	 * @return tourists saved
	 */
	Tourists save(Tourists tourists);

}
