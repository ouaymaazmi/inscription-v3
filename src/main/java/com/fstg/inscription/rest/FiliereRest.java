/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.rest;

import com.fstg.inscription.bean.Filiere;
import com.fstg.inscription.service.FiliereService;

import antlr.collections.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hiba
 */
@RestController
@RequestMapping("/inscription-api/filiere")

public class FiliereRest {
    @Autowired
    private FiliereService filiereService;
   
    @PostMapping("/")
    public void save( @RequestBody Filiere filiere) {
        filiereService.save(filiere);
    }
    @GetMapping("/")
    public java.util.List<Filiere> findAll(){
    	return filiereService.findAll();
    }
    
    
    
    @GetMapping("/libelle/{libelle}")
    public Filiere findBylibelle(@PathVariable String libelle) {
        return filiereService.findBylibelle(libelle);
    }
    
    @GetMapping("/libelleDep/{libelle}")
    public java.util.List<Filiere> findByDepartementLibelle(@PathVariable String libelle){
    	return filiereService.findByDepartementLibelle(libelle);
    }
    
    
}
