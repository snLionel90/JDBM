package consultas;

import clases.Usuarios; //primero importamos los modulos y paquetes
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;

public class Connsulta_revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Extreamos los datos desde el fichero creado
		ODB odb = ODBFactory.open("Datos_usuario.db"); //abre el ficehro
		System.out.println("-----CONSULTA GENERAL-----");
		Objects<Usuarios>objects = odb.getObjects(Usuarios.class); //metemos en una lista todo el contenido de la clase
		System.out.println(" En la lista hay: " +objects.size() +" registros "); //comprobamos la cantidad de registros
		System.out.println("Nombre_usuario, Apellido, EDAD , Correo" ); //tabla de contenido
		
		//mientras existan objetos en el array los mostrara en pantalla
		while (objects.hasNext()) {
			Usuarios us = objects.next(); // obtiene las variables de la clase
			System.out.println(us.getNombre_usuario()+" "+us.getApellido()+" "+us.getEdad()+" "+us.getE_mail()); //muestra finalmente los datos en pantalla del terminal			
		}
	}
}
