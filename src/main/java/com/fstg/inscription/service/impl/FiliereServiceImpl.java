/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.service.impl;

import com.fstg.inscription.bean.Filiere;
import com.fstg.inscription.dao.FiliereDao;
import com.fstg.inscription.service.FiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author momo
 */
@Service
public class FiliereServiceImpl implements FiliereService{
    @Autowired
    private FiliereDao filiereDao;

    @Override
    public void save(Filiere filiere) {
         filiereDao.save(filiere);
        
    }

    @Override
    public Filiere findBylibelle(String libelle) {
        return filiereDao.findBylibelle(libelle);
    }
    
    
}