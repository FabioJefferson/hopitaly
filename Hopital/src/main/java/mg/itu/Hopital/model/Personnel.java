/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author ASUS
 */
@Entity
public class Personnel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "personnel_numero_du_personnel_seq")
    @SequenceGenerator(name = "personnel_numero_du_personnel_seq" , allocationSize = 1)
    private long numero_du_personnel;
    private String nom;
    @ManyToOne
    @JoinColumn(name="grade")
    private Grade grade;

    public Personnel() {
    }

    public long getNumero_du_personnel() {
        return numero_du_personnel;
    }

    public void setNumero_du_personnel(long numero_du_personnel) {
        this.numero_du_personnel = numero_du_personnel;
    }

 
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    
    
    
}
