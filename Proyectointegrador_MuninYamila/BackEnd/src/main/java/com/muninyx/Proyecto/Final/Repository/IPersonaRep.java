/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muninyx.Proyecto.Final.Repository;

import com.muninyx.Proyecto.Final.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

/**
 *
 * @author Samsung
 */
public interface IPersonaRep extends JpaRepository<Persona, Long> {
    
}
