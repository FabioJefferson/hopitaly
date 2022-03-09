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

/**
 *
 * @author ASUS
 */
@Entity
public class Patient_archive {
    @Id
    private int id_patient_archive;
    @OneToOne 
    @JoinColumn(name="numero_patient")
    private Patient patient;
}
