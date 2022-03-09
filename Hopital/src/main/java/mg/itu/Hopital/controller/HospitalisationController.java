/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.controller;

import java.util.Date;
import mg.itu.Hopital.model.Hospitalisation;
import mg.itu.Hopital.repository.PatientRepository;
import mg.itu.Hopital.service.HospitalisationService;
import mg.itu.Hopital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author ASUS
 */
@Controller
public class HospitalisationController {
    @Autowired
    private HospitalisationService hospitalisationService;
    @Autowired
    private PatientService patientService;
    
    @GetMapping(value="/info_patient/{num}")
    public String info_patient_per_numero(Model model,@PathVariable long num){
        //model.addAttribute("date_de_naissance",patientService.get_by_id(num).getDate_de_naissance_patient());
        model.addAttribute("hospitalisation",hospitalisationService.get_info_patient_hospitalisation(num));
        return "info_patient";
    }
    
    @GetMapping(value = "attribution")
    public String showFormAttribution(Hospitalisation hospitalisation,Model model){
        model.addAttribute("patients",patientService.getAllPatient());
        return "attribution";
    }
}
