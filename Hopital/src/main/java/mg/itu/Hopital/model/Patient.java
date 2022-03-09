/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author ASUS
 */
@Entity
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "patient_numero_patient_seq") @SequenceGenerator(name = "patient_numero_patient_seq" , allocationSize = 1)
    @Column(name = "numero_patient")
    private long numeroPatient;
    private String nom_patient;
    @OneToOne
    @JoinColumn(name = "id_sexe")
    private Sexe sexe;
    private String prenoms_patient;
    private String adresse_patient;
    private String telephone_patient;
    private String email_patient;
    private long poids_patient;
    private String profession_patient;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dates_de_naissance_patient;
    private String image_patient;

    public Patient() {
    }

    public long getNumero_patient() {
        return numeroPatient;
    }

    public void setNumero_patient(long numero_patient) {
        this.numeroPatient = numero_patient;
    }

    public String getNom_patient() {
        return nom_patient;
    }

    public void setNom_patient(String nom_patient) {
        this.nom_patient = nom_patient;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public String getPrenoms_patient() {
        return prenoms_patient;
    }

    public void setPrenoms_patient(String prenoms_patient) {
        this.prenoms_patient = prenoms_patient;
    }

    public String getAdresse_patient() {
        return adresse_patient;
    }

    public void setAdresse_patient(String adresse_patient) {
        this.adresse_patient = adresse_patient;
    }

    public String getTelephone_patient() {
        return telephone_patient;
    }

    public void setTelephone_patient(String telephone_patient) {
        this.telephone_patient = telephone_patient;
    }

    public String getEmail_patient() {
        return email_patient;
    }

    public void setEmail_patient(String email_patient) {
        this.email_patient = email_patient;
    }

    public long getPoids_patient() {
        return poids_patient;
    }

    public void setPoids_patient(long poids_patient) {
        this.poids_patient = poids_patient;
    }

    public String getProfession_patient() {
        return profession_patient;
    }

    public void setProfession_patient(String profession_patient) {
        this.profession_patient = profession_patient;
    }

    public Date getDates_de_naissance_patient() {
        return dates_de_naissance_patient;
    }

    public void setDates_de_naissance_patient(Date date_de_naissance_patient) {
        this.dates_de_naissance_patient = date_de_naissance_patient;
    }

    public String getImage_patient() {
        return image_patient;
    }

    public void setImage_patient(String image_patient) {
        this.image_patient = image_patient;
    }
    
    
}


