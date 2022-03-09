/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.service;

import java.util.List;
import mg.itu.Hopital.model.Chambre;
import mg.itu.Hopital.repository.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class ChambreService {
    @Autowired
    private ChambreRepository chambreRepository;
    
    public List<Chambre> get_list_chambres(){
        return (List<Chambre>) chambreRepository.findAll();
    }
}
