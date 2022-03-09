/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.controller;

import mg.itu.Hopital.model.Personnel;
import mg.itu.Hopital.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ASUS
 */
@Controller
public class PersonnelController {
    @Autowired
    private PersonnelService personnelService;
    
    @GetMapping("/listPersonnel")
    public String listPersonnel(Model model){
        model.addAttribute("personnels",personnelService.findAllPersonnel());
        return "listPersonnel";
    }
}
