package com.soft.practice.propias_excepciones.modulo5;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Servicio {

	public static void miMetodo() throws Exception {
		File f;
		try {
			f = new File("E://Autoestudio//ArquitecturaJava//ARQJava_ManejoDeExepciones//fichero//hola.txt");
			f.createNewFile();
			DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
			Date mifecha = df.parse("03/03-2017");
			System.out.println(mifecha);
			
		} catch (ParseException | IOException e) {
			System.out.println("Log fichero");
			throw new MyException("Nuestro servicio ha fallado",e);
		}finally {
			System.out.println("Cierre de objetos");				
		}
	}
	
}
