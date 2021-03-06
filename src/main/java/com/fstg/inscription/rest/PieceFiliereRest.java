/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.inscription.rest;

import com.fstg.inscription.bean.Filiere;
import com.fstg.inscription.bean.PieceFiliere;
import com.fstg.inscription.service.PieceFiliereService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Imane
 */
@RestController
@RequestMapping("/inscription-api/pieceFiliere") // pour dire : acceder a cette classe par ce lien
public class PieceFiliereRest {

    @Autowired
    private PieceFiliereService pieceFiliereService;

    @GetMapping("/filiere")
    public List<PieceFiliere> findByFilier(@RequestBody Filiere filiere) {
        return pieceFiliereService.findByFilier(filiere);
    }

    @PostMapping("/")
    public void save(@RequestBody PieceFiliere pieceFiliere) {
        pieceFiliereService.save(pieceFiliere);
    }

    @GetMapping("/")
    public List<PieceFiliere> findAll() {
        return pieceFiliereService.findAll();
    }

}
