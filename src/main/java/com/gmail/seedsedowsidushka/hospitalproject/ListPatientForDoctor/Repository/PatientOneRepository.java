package com.gmail.seedsedowsidushka.hospitalproject.ListPatientForDoctor.Repository;

import com.gmail.seedsedowsidushka.hospitalproject.ListPatientForDoctor.Model.PatientOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientOneRepository extends JpaRepository<PatientOne,Long> {
    
}
