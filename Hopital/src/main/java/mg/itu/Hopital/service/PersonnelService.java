/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.service;

import java.util.List;
import mg.itu.Hopital.model.Personnel;
import mg.itu.Hopital.repository.PersonnelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class PersonnelService {
    @Autowired
    private PersonnelRepository personnelRepository;
    
    public List<Personnel> findAllPersonnel(){
        return (List<Personnel>) personnelRepository.findAll();
    }
}
