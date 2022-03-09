/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.model;

import java.util.Date;
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
public class Intervention {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "intervention_paye_id_intervention_paye_seq")
    @SequenceGenerator(name = "intervention_paye_id_intervention_paye_seq" , allocationSize = 1)
    private long id_intervation;
    @ManyToOne
    @JoinColumn(name = "numero_patient")
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "numero_personnel")
    private Personnel personnel;
    private Date date_d_intervention;

    public Intervention() {
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Personnel getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }
    
    public Date getDate_d_intervention() {
        return date_d_intervention;
    }

    public void setDate_d_intervention(Date date_d_intervention) {
        this.date_d_intervention = date_d_intervention;
    }
    
    
}
