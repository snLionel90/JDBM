package consultas;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

import clases.Usuarios;


public class insertar_datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creamos los datos de los usuarios para almacenarlos en memoria
		Usuarios u1 = new Usuarios ("Lionel", "Sanchez", 28, "correo@gmail.com");
		Usuarios u2 = new Usuarios ("Pato", "Lucaz", 200, "soynunpato@gmail.com");
		Usuarios u3 = new Usuarios ("Python", "maniaac", 18, "picorreo@gmail.com");
		Usuarios u4 = new Usuarios ("Java", "Scris", 12, "sfsf@gmail.com");
		Usuarios u5 = new Usuarios ("Uwuveve", "osas", 15, "uususucorreo@gmail.com");
		
		//Creamos la conexon odb con neodatis y almacenamos los datos 
		ODB odb = ODBFactory.open("Datos_usuario.db"); //con esto lo guardamos en un fichero interno
		odb.store(u1); //almacenmos las variables de usuario
		odb.store(u2);
		odb.store(u3);
		odb.store(u4);
		odb.store(u5);
		//por ultimo cerramo el flujo de la db
		odb.close();
		System.out.println("Mi base de datos se ha creado correctamente");
		

	}

}
