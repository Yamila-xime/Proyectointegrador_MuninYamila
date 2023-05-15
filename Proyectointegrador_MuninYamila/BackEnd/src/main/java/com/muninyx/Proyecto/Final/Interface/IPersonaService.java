/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muninyx.Proyecto.Final.Interface;

import com.muninyx.Proyecto.Final.Entity.Persona;
import java.util.List;

/**
 *
 * @author Samsung
 */
public interface IPersonaService {
    public List <Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    //eliminar usuario
    public void deletePersona(Long id);
    
    //buscar persona
    public Persona findPersona(Long id);
}
