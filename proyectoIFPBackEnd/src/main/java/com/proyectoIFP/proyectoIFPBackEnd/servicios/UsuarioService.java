package com.proyectoIFP.proyectoIFPBackEnd.servicios;

import java.util.Set;

import com.proyectoIFP.proyectoIFPBackEnd.entidades.Usuario;
import com.proyectoIFP.proyectoIFPBackEnd.entidades.UsuarioRol;

public interface UsuarioService {
	
	public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;
	
	public Usuario obtenerUsuario(String username);
	
	public void eliminarUsuario(Long usuarioId);

}
