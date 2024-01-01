package com.proyecto1.composite;

import com.proyecto1.*;
import com.proyecto1.decorator.*;
import java.util.Scanner;


/**
 * Clase Composite: Implementa la interfaz Escuela para desarrollar los metodos consultar e inscribir
 * ademas de declarar objetos de tipo Administrador y Profesor para hacer uso de los metodos
 * correspondientes a cada clase.
 */

public class Composite implements Escuela{
	
	/* Administrador el cual actuara como director de la Escuela*/
	Administrador director;
	
	/* Profesor de la Escuela*/
	Profesor profesor;

	/* Scanner para ingresar datos al sistema*/
	Scanner sc = new Scanner(System.in);

	/**
	 * Metodo consultar: En este metodo se consultara dependiendo 
	 * del tipo de usuario que sea Administrador o Profesor.
	 */
	public void consultar(){
		System.out.println("Estas llamando al metodo consultar global\n"+
			"como quieres consultar las cosas:\n"+
			"1.- Como Administrador\n"+
			"2.- Como Profesor\n");
		int i = sc.nextInt();
		switch(i){
			case 1:
				director.consultar();
				break;
			case 2:
				profesor.consultar();
				break;
			default : System.err.println("Usuario, se le dijo que ingresara un numero valido");
				break;
		}
	}

	/**
	 * Metodo inscribir: En este metodo el Administrador consultara lo que desee y
	 * el profesor no podra hacerlo ya que no puede hacer uso de la funcion inscribir.
	 */
	public void inscribir(){
		System.out.println("Estas llamando al metodo inscribir global\n"+
			"como quieres Inscribir las cosas:\n"+
			"1.- Como Administrador\n"+
			"2.- Como Profesor\n");
		int i = sc.nextInt();
		switch(i){
			case 1:
				director.inscribir();
				break;
			case 2:
				profesor.inscribir();
				break;
			default : System.err.println("Usuario, se le dijo que ingresara un numero valido");
				break;
		}
	}
}