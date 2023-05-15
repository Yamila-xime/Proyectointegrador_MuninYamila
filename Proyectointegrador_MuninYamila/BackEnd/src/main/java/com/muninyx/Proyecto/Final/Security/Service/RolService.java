/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muninyx.Proyecto.Final.Security.Service;


import com.muninyx.Proyecto.Final.Security.Enums.RolNombre;
import com.muninyx.Proyecto.Final.Security.Repository.iRolRepository;
import com.muninyx.Proyecto.Final.Security.Entity.Rol;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol>getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    public void save (Rol rol){
        irolRepository.save(rol);
    }
}
