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
public class Categorie_chambre {
    @Id
    private long id_categorie_chambre;
    private String valeur;
    private double prix;
    private int nombre_lit;

    public Categorie_chambre() {
    }

    public long getId_categorie_chambre() {
        return id_categorie_chambre;
    }

    public void setId_categorie_chambre(long id_categorie_chambre) {
        this.id_categorie_chambre = id_categorie_chambre;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getNombre_lit() {
        return nombre_lit;
    }

    public void setNombre_lit(int nombre_lit) {
        this.nombre_lit = nombre_lit;
    }
    
    
}
