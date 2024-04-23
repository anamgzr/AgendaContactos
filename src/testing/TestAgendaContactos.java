package testing;

import modelo.dao.AgendaContactosImplList;
import modelo.javabean.Contacto;

public class TestAgendaContactos {

	private static AgendaContactosImplList adao;
	
	static {
		adao = new AgendaContactosImplList();
	}
	
	public static void main(String[] args) {
		// alta();
		// todos();
		// uno();
		// telefono();
		// email();
		// tresCar();
		// eliminar();
		// modificar();

	}
	public static void modificar() {
		Contacto contacto = adao.buscarUno("eva");
		if (contacto != null) {			
		
		contacto.setApellidos("gomez");
		contacto.setEmpresa("SIEMENS");
		System.out.println(adao.cambiarContacto(contacto));
		todos();
		}else
			System.out.println("CONTACTO NO EXISTE");
	}
	
	public static void eliminar() {
		System.out.println(adao.eliminarContacto("carlota"));
		System.out.println(adao.eliminarContacto("pepe"));
		System.out.println(adao.eliminarContacto(adao.buscarUno("tomas")));
		System.out.println(adao.eliminarContacto(adao.buscarUno("sara")));
		todos();
	}
	
	public static void alta () {
		Contacto contacto = new Contacto("maria", "jimeno", "609900100","mjimeno@unir.com", "ICM");
		Contacto contacto2 = new Contacto("carlota", "jimeno", "609800100","cjimeno@unir.com", "IDAE");
		
		System.out.println(adao.altaContacto(contacto));
		System.out.println(adao.altaContacto(contacto2));
		todos();
	}
	
	public static void tresCar () {
		for (Contacto contacto: adao.buscarContactosPorTresPrimeros("ca"))
			System.out.println(contacto);
		
		System.out.println("TERMINADO");
	}
	
	public static void email () {
		System.out.println(adao.buscarEmail("s@fp.com"));
		System.out.println(adao.buscarEmail("sa@fp.com"));
	}
	
	public static void telefono () {
		System.out.println(adao.buscarTelefono("659500400"));
	}
	
	public static void todos() {
		for (Contacto contacto : adao.getLista())
			System.out.println(contacto);
	}
}
