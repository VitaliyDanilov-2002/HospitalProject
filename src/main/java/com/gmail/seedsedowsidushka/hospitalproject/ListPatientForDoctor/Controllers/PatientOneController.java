package com.gmail.seedsedowsidushka.hospitalproject.ListPatientForDoctor.Controllers;


import com.gmail.seedsedowsidushka.hospitalproject.ListPatientForDoctor.Service.PatientOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientOneController {

    @Autowired
    private PatientOneService patientOneService;

    @GetMapping("/listpatient")
    public String viewListPatientPage(Model model){

        model.addAttribute("listPatient",patientOneService.getAllPatient());
        return "listpatient";
    }
}
