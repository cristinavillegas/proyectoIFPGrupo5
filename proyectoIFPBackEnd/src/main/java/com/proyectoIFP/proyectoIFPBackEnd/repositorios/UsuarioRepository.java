package com.proyectoIFP.proyectoIFPBackEnd.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoIFP.proyectoIFPBackEnd.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Usuario findByUsername(String username);

}
