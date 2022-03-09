/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.repository;

import java.util.Collection;
import mg.itu.Hopital.model.Patient;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ASUS
 */
public interface PatientRepository extends CrudRepository<Patient,Long>{
    
}
