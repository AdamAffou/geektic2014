package com.ninja_squad.geektic.config.services;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja_squad.geektic.config.dao.GeekDao;
import com.ninja_squad.geektic.config.modele.Geek;

@RestController
@Transactional
@RequestMapping("/GeeksById")
public class GeekByIdService {
    @Autowired
    private GeekDao lesGeeks;
    
    @RequestMapping(method = GET,value = "/{id}")
    public Geek getGeek(@PathVariable int id)
    {
       return lesGeeks.getGeekById(id);
    }
}
