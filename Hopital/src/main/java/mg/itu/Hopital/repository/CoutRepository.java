/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.repository;

import mg.itu.Hopital.model.Cout_sejour;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ASUS
 */
public interface CoutRepository extends CrudRepository<Cout_sejour,Long>{
    
}
