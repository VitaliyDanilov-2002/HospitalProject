package com.gmail.seedsedowsidushka.hospitalproject.Controllers.Patient;


import com.gmail.seedsedowsidushka.hospitalproject.Model.Patient.StatementForm;
import com.gmail.seedsedowsidushka.hospitalproject.Repository.Patient.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/statement")
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @GetMapping
    public String statement() {
        return "statement";
    }


    @PostMapping
    public String userStatement(StatementForm form) {
        patientRepository.save(form.toPatient());
        return "redirect:/cabinet";
    }
}
