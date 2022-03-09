/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 *
 * @author ASUS
 */
@Entity
public class Hospitalisation {
    @Id
    private long id_hospitalisation;
    @ManyToOne
    @JoinColumn(name = "numero_patient")
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "numero_chambre")
    private Chambre chambre;
    private Date date_d_arrive;
    private Date date_de_sortie;
    
    @OneToOne
    @JoinColumn(name = "id_hospitalisation")
    private Cout_sejour sejour;
    
    @Transient
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    

    public Cout_sejour getSejour() {
        return sejour;
    }

    public void setSejour(Cout_sejour sejour) {
        this.sejour = sejour;
    }

    public Hospitalisation() {
    }

    public long getId_hospitalisation() {
        return id_hospitalisation;
    }

    public void setId_hospitalisation(long id_hospitalisation) {
        this.id_hospitalisation = id_hospitalisation;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public Date getDate_d_arrivee() {
        return date_d_arrive;
    }

    public void setDate_d_arrivee(Date date_d_arrivee) {
        this.date_d_arrive = date_d_arrivee;
    }

    public Date getDate_de_sortie() {
        return date_de_sortie;
    }

    public void setDate_de_sortie(Date date_de_sortie) {
        this.date_de_sortie = date_de_sortie;
    }
    
    
}
