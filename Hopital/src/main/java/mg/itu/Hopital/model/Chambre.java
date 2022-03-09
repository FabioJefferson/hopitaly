/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 *
 * @author ASUS
 */
@Entity
public class Chambre {
    @Id
    private long numero_chambre;
    @OneToOne
    @JoinColumn(name = "id_categorie_chambre")
    private Categorie_chambre categorie_chambre;
    @OneToOne
    @JoinColumn(name = "localisation")
    private Localisation localisation;
    private int lit_disponible;

    public Chambre() {
    }

    public long getNumero_chambre() {
        return numero_chambre;
    }

    public void setNumero_chambre(long numero_chambre) {
        this.numero_chambre = numero_chambre;
    }

    public Categorie_chambre getCategorie_chambre() {
        return categorie_chambre;
    }

    public void setCategorie_chambre(Categorie_chambre categorie_chambre) {
        this.categorie_chambre = categorie_chambre;
    }

    public Localisation getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }

    public int getLit_disponible() {
        return lit_disponible;
    }

    public void setLit_disponible(int lit_disponible) {
        this.lit_disponible = lit_disponible;
    }
    
    
    
    
}
