package com.proyectoIFP.proyectoIFPBackEnd;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proyectoIFP.proyectoIFPBackEnd.entidades.Rol;
import com.proyectoIFP.proyectoIFPBackEnd.entidades.Usuario;
import com.proyectoIFP.proyectoIFPBackEnd.entidades.UsuarioRol;
import com.proyectoIFP.proyectoIFPBackEnd.servicios.UsuarioService;

@SpringBootApplication
public class ProyectoIfpBackEndApplication implements CommandLineRunner{
	
	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoIfpBackEndApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*Usuario usuario=new Usuario();
		
		usuario.setNombre("Quetzal");
		usuario.setApellido("Omayra Zirgu");
		usuario.setUsername("quetzal");
		usuario.setPassword("quetzal");
		usuario.setEmail("quetzal@gmail.com");
		usuario.setTelefono("648309835");
		usuario.setPerfil("foto.png");
		usuario.setCif("64728956P");
		usuario.setPais("Francia");
		usuario.setCiudad("París");
		usuario.setDireccion("Rue de la bagette s/n");
		usuario.setEmpresa("BiscoFoam S.A");
		
		Rol rol=new Rol();
		rol.setRolId(1L);
		rol.setNombre("ADMIN");
		
		Set<UsuarioRol> usuarioRoles=new HashSet<>();
		UsuarioRol usuarioRol=new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);
		usuarioRoles.add(usuarioRol);
		
		Usuario usuarioGuardado=usuarioService.guardarUsuario(usuario, usuarioRoles);
		
		System.out.println(usuarioGuardado.getUsername());*/
		
	}

}
