/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muninyx.Proyecto.Final.Service;

import com.muninyx.Proyecto.Final.Entity.Persona;
import com.muninyx.Proyecto.Final.Interface.IPersonaService;
import com.muninyx.Proyecto.Final.Repository.IPersonaRep;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author Samsung
 */
public class ImpPersonaService implements IPersonaService{
    
    @Autowired IPersonaRep ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona>persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
