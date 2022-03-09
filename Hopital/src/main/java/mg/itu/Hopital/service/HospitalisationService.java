/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.service;

import java.util.List;
import mg.itu.Hopital.model.Hospitalisation;
import mg.itu.Hopital.model.Patient;
import mg.itu.Hopital.repository.CoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.Query;
import mg.itu.Hopital.repository.HospitalisationRepository;

/**
 *
 * @author ASUS
 */
@Service
public class HospitalisationService {
    @Autowired
    private HospitalisationRepository repository;
    @Autowired
    private CoutRepository coutRepository;
    
    public Hospitalisation get_info_patient_hospitalisation(long numero_patient){
        return repository.findByPatientNumeroPatient(numero_patient);
    }
    
    public List<Hospitalisation> getAll(){
        List<Hospitalisation> hospitalisations = (List<Hospitalisation>) repository.findAll();
        hospitalisations.forEach(h->h.setSejour(null));
        return hospitalisations;
    }
    
    public void attribuer(Patient p){
        
    }
    
}
