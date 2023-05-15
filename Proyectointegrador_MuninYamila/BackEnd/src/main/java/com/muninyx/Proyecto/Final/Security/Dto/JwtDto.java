/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muninyx.Proyecto.Final.Security.Dto;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author Samsung
 */
public class JwtDto {
    private String token;
    private String bearer = "Bearer";
    private String nombreUsuario;
    private Collection<? extends GrantedAuthority> autorithies;

    public JwtDto(String token, String nombreUsuario, Collection<? extends GrantedAuthority> autorithies) {
        this.token = token;
        this.nombreUsuario = nombreUsuario;
        this.autorithies = autorithies;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Collection<? extends GrantedAuthority> getAutorithies() {
        return autorithies;
    }

    public void setAutorithies(Collection<? extends GrantedAuthority> autorithies) {
        this.autorithies = autorithies;
    }
    
    
}
