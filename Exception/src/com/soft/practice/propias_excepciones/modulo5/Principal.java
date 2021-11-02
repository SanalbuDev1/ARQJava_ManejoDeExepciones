package com.soft.practice.propias_excepciones.modulo5;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {		
		
		try {
			Servicio.miMetodo();
		} catch (Exception e) {
			System.out.println("Ventana emergente en pag web " +e.getMessage());
			System.out.println("Ventana de alerta2 " + e.getCause().getMessage());
		}

	}

}
