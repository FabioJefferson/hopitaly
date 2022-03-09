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
public class Localisation {
    @Id
    private long localisation;
    private int numero_etage;
    private int numero_salle;

    public Localisation() {
    }

    public long getLocalisation() {
        return localisation;
    }

    public void setLocalisation(long localisation) {
        this.localisation = localisation;
    }

    public int getNumero_etage() {
        return numero_etage;
    }

    public void setNumero_etage(int numero_etage) {
        this.numero_etage = numero_etage;
    }

    public int getNumero_salle() {
        return numero_salle;
    }

    public void setNumero_salle(int numero_salle) {
        this.numero_salle = numero_salle;
    }
    
    
}
