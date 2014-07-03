package com.ninja_squad.geektic.config.services;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja_squad.geektic.config.dao.InteretDao;
import com.ninja_squad.geektic.config.modele.Interet;

@RestController
@Transactional
@RequestMapping("/Interets")
public class InteretService {
	
	 @Autowired
     private InteretDao lesInterets;
     
     @RequestMapping(method = GET)
     public List<Interet> getInterets()
     {
         List<Interet> MesInterets = lesInterets.getAllInteret();
         return MesInterets;
     }

}
