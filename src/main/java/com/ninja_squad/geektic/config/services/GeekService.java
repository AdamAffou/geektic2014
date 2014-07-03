package com.ninja_squad.geektic.config.services;

import java.util.List;

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
@RequestMapping("/Geeks")
public class GeekService {

        @Autowired
        private GeekDao lesGeeks;
        
        @RequestMapping(method = GET,value = "/{sexe}")
        public List<Geek> getGeeks(@PathVariable char sexe)
        {
            List<Geek> MesGeeks = lesGeeks.getAllGeek(sexe);
            return MesGeeks;
        }
}
