/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.dao;

import com.fstg.inscription.bean.Filiere;
import com.fstg.inscription.bean.PieceFiliere;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Imane
 */
@Repository 
public interface PieceFiliereDao extends JpaRepository<PieceFiliere, Long>{
        public List<PieceFiliere> findByFiliere(Filiere filiere);
        
       // public List<PieceFiliere> findByFiliereLibelleAndTypeFiliereLibelle (String libelleFiliere ,String libelleTypeFiliere);

}
