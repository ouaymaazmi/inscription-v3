/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service;

import com.fstg.inscription.bean.Etudiant;
import java.util.List;

/**
 *
 * @author Imane
 */
public interface EtudiantService {
    public void save(Etudiant etudiant);
    public List<Etudiant> findAll();
    public Etudiant findByCne(String cne);

    

}
