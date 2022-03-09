/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.Hopital.repository;

import java.util.Collection;
import mg.itu.Hopital.model.Chambre;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ASUS
 */
public interface ChambreRepository extends CrudRepository<Chambre,Long>{
    
    @Query(value="select ch.* , cat.nombre_lit - get_lit_prise(ch.numero_chambre) as lit_disponible from chambre ch join categorie_chambre cat on ch.id_categorie_chambre = cat.id_categorie_chambre ",nativeQuery = true)
    public Collection<Chambre> findAll();
}
