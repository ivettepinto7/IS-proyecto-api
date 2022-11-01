package com.grupo25.hospital.services;


import java.util.List;

import com.grupo25.hospital.models.dtos.CreatePrescriptionDTO;
import com.grupo25.hospital.models.dtos.PrescriptionInfoDTO;
import com.grupo25.hospital.models.entities.Appointment;
import com.grupo25.hospital.models.entities.Drug;
import com.grupo25.hospital.models.entities.Person;
import com.grupo25.hospital.models.entities.Prescription;

public interface PrescriptionService {
	void insert(Person person,Appointment appointment,Drug drug, PrescriptionInfoDTO prescription) throws Exception;
	List<Prescription> getPatientPrescriptions(Long id) throws Exception;

}
