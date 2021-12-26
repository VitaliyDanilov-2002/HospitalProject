package com.gmail.seedsedowsidushka.hospitalproject.Repository.Patient;

import com.gmail.seedsedowsidushka.hospitalproject.Model.Patient.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient,Long> {
    Patient findByUsername(String name);

}
