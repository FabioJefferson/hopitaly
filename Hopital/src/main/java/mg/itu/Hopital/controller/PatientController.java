/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.controller;

import mg.itu.Hopital.model.Patient;
import mg.itu.Hopital.repository.PatientRepository;
import mg.itu.Hopital.repository.SexeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author ASUS
 */
@Controller
public class PatientController {
    @Autowired
    private SexeRepository sexeRepository;
    @Autowired
    private PatientRepository patientRepository;
    
    @GetMapping("/signUpPatient")
    public String showSignUpForm(Patient p,Model model){
        model.addAttribute("sexes",sexeRepository.findAll());
        return "add_patient";
    }
    
    @PostMapping("/addPatient")
    public String addPatient(Patient patient){
        patientRepository.save(patient);
        return "hospitalisation";
    }
}
