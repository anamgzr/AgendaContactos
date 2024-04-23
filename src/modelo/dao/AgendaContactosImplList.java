package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Contacto;

public class AgendaContactosImplList implements GestionAgendaDao{
	
	private String nombreAgenda;
	private ArrayList<Contacto> lista;
	
	public AgendaContactosImplList(String nombreAgenda, ArrayList<Contacto> lista) {
		super();
		this.nombreAgenda = nombreAgenda;
		this.lista = lista;
	}

	public AgendaContactosImplList() {
		super();
	}
	
	private void cargarDatos() {
		lista.add(new Contacto("tomas", "lopez", "659500400", "t@fp.com", "unir"));
		lista.add(new Contacto("eva", "perez", "659500300", "e@fp.com", "unir"));
		lista.add(new Contacto("carlos", "sanchez", "659500200", "c@fp.com", "ICM"));
		lista.add(new Contacto("Carlota", "garcia", "659500100", "s@fp.com", "ICM"));
	}

		
	public String getNombreAgenda() {
		return nombreAgenda;
	}

	public void setNombreAgenda(String nombreAgenda) {
		this.nombreAgenda = nombreAgenda;
	}

	public ArrayList<Contacto> getLista() {
		return lista;
	}

	@Override
	public boolean altaContacto(Contacto contacto) {
		if (lista.contains(contacto))
			return false;
		else
			return lista.add(contacto);
	}

	@Override
	public boolean eliminarContacto(Contacto contacto) {
		
		return lista.remove(contacto);
	}

	@Override
	public boolean eliminarContacto(String nombre) {
		Contacto contacto = buscarUno(nombre);
		if (contacto != null)
			return eliminarContacto(contacto);
		else
			return false;
	}

	@Override
	public boolean cambiarContacto(Contacto contacto) {
		int pos = lista.indexOf(contacto);
		if(pos != -1) {
			lista.set(pos, contacto);
			return true;
		}else 
			return false;
	}

	@Override
	public Contacto buscarUno(String nombre) {
		for (Contacto con: lista) {
			if(con.getNombre().equals(nombre))
				return con;
		}
		return null;
	}

	@Override
	public Contacto buscarTelefono(String telefono) {
		for (Contacto contacto: lista)
			if (contacto.getTelefono().equals(telefono))
				return contacto;
	
		return null;
			}

	@Override
	public Contacto buscarEmail(String email) {
		for (Contacto contacto: lista)
			if (contacto.getEmail().equals(email))
				return contacto;
	
		
		return null;
	}

	@Override
	public ArrayList<Contacto> buscarContactosPorTresPrimeros(String cadena) {
		ArrayList<Contacto> aux = new ArrayList<Contacto> ();
		
		if (cadena.length()< 3)
			return aux;
			
		for (Contacto contacto: lista)
			if (contacto.getNombre().substring(0, 3).equalsIgnoreCase(cadena.substring(0, 3)))
				aux.add(contacto);
	
		return aux;
		
		
	}
	
	

}
