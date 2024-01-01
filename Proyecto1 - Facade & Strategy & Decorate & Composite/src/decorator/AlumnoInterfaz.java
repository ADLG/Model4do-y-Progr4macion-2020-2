package com.proyecto1.decorator;

import com.proyecto1.*;

/**
 * Interfaz para los metodos eligeOpcionTecnica y getOpcionTecnica
 * de los cuales van a hacer uso la clase Alumno y AlumnoDecorado.
 */
public interface AlumnoInterfaz{

	/**
	 * Metodo eligeOpcionTecnica: este metodo nos ayuda a elegir 
	 * la opcion tecnica para el alumno.
	 */
	public void eligeOpcionTecnica();

	/**
	 * Metodo getOpcionTecnica: este metodo nos devuelve la opcion 
	 * tecnica que tenga inscrita el alumno, <code>"ninguna"</code>
	 * en caso de que no tenga inscrita una opcion tecnica.
	 */
	public String getOpcionTecnica();
}