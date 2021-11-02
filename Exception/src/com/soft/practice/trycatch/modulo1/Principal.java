package com.soft.practice.trycatch.modulo1;

import java.io.File;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {		
		
		//Unidad F no existe saltara un error
		try {
			File f = new File("E://Autoestudio//ArquitecturaJava//ARQJava_ManejoDeExepciones//ficheros//hola.txt");
			f.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
