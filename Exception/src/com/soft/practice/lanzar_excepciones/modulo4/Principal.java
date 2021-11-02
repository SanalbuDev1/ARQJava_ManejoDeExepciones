package com.soft.practice.lanzar_excepciones.modulo4;

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
			System.out.println("Ventana emergente en pag web s " +e.getMessage());
		}

	}

}
