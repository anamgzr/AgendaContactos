package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Contacto;

public interface GestionAgendaDao {
	
	boolean altaContacto (Contacto contacto);
	boolean eliminarContacto (Contacto contacto);
	boolean eliminarContacto (String nombre);
	boolean cambiarContacto (Contacto contacto);
	Contacto buscarUno (String nombre);
	Contacto buscarTelefono (String telefono);
	Contacto buscarEmail (String email);
	ArrayList<Contacto> buscarContactosPorTresPrimeros(String cadena);
	
	
	
}
