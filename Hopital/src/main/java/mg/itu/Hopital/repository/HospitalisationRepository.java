/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.repository;

import java.util.Collection;
import java.util.List;
import mg.itu.Hopital.model.Hospitalisation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ASUS
 */
public interface HospitalisationRepository extends CrudRepository<Hospitalisation,Long> {
    
    @Query(value="select * from hospitalisation where date_d_arrive = (select max(date_d_arrive) from hospitalisation where numero_patient=2)",nativeQuery = true)
    public Hospitalisation findByPatientNumeroPatient(long id_hospitalisation);
    
    
}
