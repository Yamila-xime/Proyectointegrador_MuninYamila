/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muninyx.Proyecto.Final.Security.Service;

import com.muninyx.Proyecto.Final.Security.Repository.iUsuarioRepository;
import com.muninyx.Proyecto.Final.Security.Entity.Usuario;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario (String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    public boolean existsByEmail (String Email){
        return iusuarioRepository.existsByEmail(Email);
    }
    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }
}
