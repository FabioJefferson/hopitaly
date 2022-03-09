/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.controller;

import mg.itu.Hopital.service.ChambreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ASUS
 */
@Controller
public class ChambreController {
    @Autowired
    private ChambreService chambreService;
    
    @GetMapping("/listChambre")
    public String showListChambre(Model model){
        model.addAttribute("chambres",chambreService.get_list_chambres());
        return "listChambre";
    }
}
