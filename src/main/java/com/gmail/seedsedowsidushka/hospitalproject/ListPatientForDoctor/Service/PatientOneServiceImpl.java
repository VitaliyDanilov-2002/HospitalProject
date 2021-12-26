package com.gmail.seedsedowsidushka.hospitalproject.ListPatientForDoctor.Service;

import com.gmail.seedsedowsidushka.hospitalproject.ListPatientForDoctor.Model.PatientOne;
import com.gmail.seedsedowsidushka.hospitalproject.ListPatientForDoctor.Repository.PatientOneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientOneServiceImpl implements PatientOneService {

    @Autowired
    private PatientOneRepository patientOneRepository;


    @Override
    public List<PatientOne> getAllPatient() {

        return patientOneRepository.findAll();
    }
}
