/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.repository;

import mg.itu.Hopital.model.Personnel;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ASUS
 */
public interface PersonnelRepository extends CrudRepository<Personnel,Long>{
    
}
