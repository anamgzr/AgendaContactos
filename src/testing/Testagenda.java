package testing;

import modelo.dao.AgendaContactosImplList;
import modelo.javabean.Contacto;

public class Testagenda {

	public static void main(String[] args) {
		AgendaContactosImplList miagenda = new AgendaContactosImplList();
		
		System.out.println(miagenda.getNombreAgenda());
		for (Contacto con: miagenda.getLista())
			System.out.println(con);
		
		Contacto con1 = miagenda.buscarUno("eva");
		if (con1 != null)
			System.out.println(con1);
		else
			System.out.println("este contacto no existe");
			

	}

}
