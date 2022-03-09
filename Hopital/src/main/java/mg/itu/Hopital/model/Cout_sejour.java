/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import jdk.nashorn.internal.ir.annotations.Immutable;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "view_cout_sejour")
@Immutable
public class Cout_sejour {
    @Id
    private long id_hospitalisation;
    private long cout;

    public Cout_sejour() {
        
    }

    public long getId_hospitalisation() {
        return id_hospitalisation;
    }

    public void setId_hospitalisation(long id_hospitalisation) {
        this.id_hospitalisation = id_hospitalisation;
    }

    public long getCout() {
        return cout;
    }

    public void setCout(long cout) {
        this.cout = cout;
    }
    
    
    
    
}
