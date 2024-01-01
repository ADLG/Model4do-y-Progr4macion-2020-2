package com.proyecto1.decorator;

import com.proyecto1.*;
import com.proyecto1.composite.*;

/**
 * Clase abstracta que implementa la interfaz AlumnoInterfaz.
 */
public class AlumnoDecorado implements AlumnoInterfaz{

	/* Alumno al que se le va a agregar la opcion tecnica*/
	private Alumno alumnoConOpcion;

	/* Objeto Opcion Tecnica*/
	private OpcionTecnica opcionTecnica;

	/**
	 * Opcion tecnica seleccionada por el alumno
	 * <code>"ninguna"</code> por defecto
	 */
	private String opcion;

	/**
	 * Constructor AlumnoDecorado();
	 */
	public AlumnoDecorado(Alumno alumno){
		this.alumnoConOpcion = alumno;
		this.opcionTecnica = new OpcionTecnica();
	}

	/**
	 * Metodo eligeOpcionTecnica: este metodo nos ayuda a elegir 
	 * la opcion tecnica para el alumno.
	 */
	public void eligeOpcionTecnica(){
		this.opcionTecnica.agregarOpcionTecnica();
		this.opcion = opcionTecnica.getOpcionTecnica();
	}

	/**
	 * Metodo getOpcionTecnica: este metodo nos devuelve la opcion 
	 * tecnica que tenga inscrita el alumno, <code>"ninguna"</code>
	 * en caso de que no tenga inscrita una opcion tecnica.
	 */
	public String getOpcionTecnica(){
		return this.opcion;
	}
	
}