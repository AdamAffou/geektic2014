package com.ninja_squad.geektic.config.services;

import static org.springframework.web.bind.annotation.RequestMethod.GET;






import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.ninja_squad.geektic.config.dao.ConsultationDao;
import com.ninja_squad.geektic.config.dao.GeekDao;
import com.ninja_squad.geektic.config.modele.Geek;

@RestController
@Transactional
@RequestMapping("/GeeksById")
public class GeekByIdService {
    @Autowired
    private GeekDao lesGeeks;
    @Autowired
    private ConsultationDao maCons;

    
    @RequestMapping(method = GET,value = "/{id}")
    public Geek getGeek(@PathVariable int id,HttpServletRequest request)
    {

    	maCons.insertConsultation(id,request.getRemoteAddr());
    
       return lesGeeks.getGeekById(id);
    }
}
