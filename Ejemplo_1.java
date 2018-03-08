/* 
	Ejemplo 1
    =========

  OBS 1 : importamos el paquete 'java.io', el asterisco al final indica que lo 
  ------- importaremos completo. Este paquete contiene la clase 'DataInputStream'.

  OBS 2 : Creamos el objeto 'dis' de la clase 'DataInputStream' y le pasamos al  
  ------- constructor el parámetro 'System.in'.

  OBS 3 : Creamos la variable 's' de tipo String dándole como valor el resultado
  ------- del método 'readLine' del objeto 'dis' (de la clase ya mencionada).

  OBS 4 : Imprimimos por pantalla la concatenación de este objeto con una cadena
  ------- previamente definida.
  
*/


import java.io.*;

class Ejemplo_1{
	
	public static void main(String[] args) throws Exception {

		DataInputStream dis = new DataInputStream(System.in);
		String s = dis.readLine();
		System.out.println("Has escrito: " + s);
	}
}

