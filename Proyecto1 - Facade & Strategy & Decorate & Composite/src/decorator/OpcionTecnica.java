package com.proyecto1.decorator;

import com.proyecto1.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;


/**
 * Clase OpcionTecnica: esta clase sera la encargada de emular 
 * a la opcion tecnica, por lo tanto su comportamiento sera algo
 * basico 
 */
public class OpcionTecnica{

	/* La opcion tecnica para el alumno decorado*/
	private String opcion;

	/* Scanner*/
	private Scanner sc = new Scanner(System.in);

	/**
	 * Metodos para elegir la opcion tecnica a agregar con ayuda de un Switch.
	 *
	 */
	public void agregarOpcionTecnica(){
		System.out.print("Las carreras que puede seleccionar son las siguiente:\n"+
			"1.- Agente de Viajes\n"+
			"2.- Hoteleria\n"+
			"3.- Fotografo\n"+
			"4.- Laboratorista\n"+
			"5.- Prensa\n"+
			"6.- Nutriologo\n"+
			"7.- Laboratorista Quimico\n\n"+

			"A continuacion ingrese la opcion correspondiente: ");
		try{
			int i = sc.nextInt();
			switch (i){
			case 1:
				this.opcion = "Agente de Viajes";
				break;
			case 2:
				this.opcion = "Hoteleria";
				break;
			case 3:
				this.opcion = "Fotografo";
				break;
			case 4:
				this.opcion = "Laboratorista";
				break;
			case 5:
				this.opcion = "Prensa";
				break;
			case 6:
				this.opcion = "Nutriologo";
				break;
			case 7:
				this.opcion = "Laboratorista Quimico";
				break;
			default: System.out.println("No selecciono ninguna opcion tecnica");
		}
		}catch(InputMismatchException e){
			System.err.println("No introdujo un numero");
		}catch (NoSuchElementException e){
			System.err.println("No se encontro esa opcion");
		}catch (IllegalStateException e){
			System.err.println("error de sistema");
		}
		
	}

	/**
	 * Metodo getOpcionTecnica: este metodo nos regresa la opcion tecnica que se tenga
	 * en la cadena opcion.
	 */
	public String getOpcionTecnica(){
		return this.opcion;
	}
}