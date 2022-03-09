/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author ASUS
 */
@Entity
public class Sexe {
    @Id
    private Long id_sexe;
    private String valeur_sexe;

    public Sexe() {
    }

    public Long getId_sexe() {
        return id_sexe;
    }

    public void setId_sexe(Long id_sexe) {
        this.id_sexe = id_sexe;
    }

    public String getValeur_sexe() {
        return valeur_sexe;
    }

    public void setValeur_sexe(String valeur_sexe) {
        this.valeur_sexe = valeur_sexe;
    }
    
    
}
