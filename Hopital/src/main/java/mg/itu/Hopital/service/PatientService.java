/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.service;

import java.util.List;
import mg.itu.Hopital.model.Patient;
import mg.itu.Hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    
    public void insert(Patient p){
        patientRepository.save(p);
    }
    
    public List<Patient> getAllPatient(){
        return (List<Patient>) patientRepository.findAll();
    }
}
