package com.proyecto1.strategy;

import com.proyecto1.*;
import com.proyecto1.composite.*;
import com.proyecto1.decorator.*;

import java.util.ArrayList;

/**
 * Interface: Esta interface define el unico comportamiento
 * para poder generar un certificado
 */


public interface Certificados{

	/**
	 * Metodo generarCertificado: metodo que genera un certificado, dependera del
	 * tipo de estudiante que genere el certificado, ya que pueden o no tener 
	 * opcion tecnica
	 */
	public void generarCertificado(Alumno alumno, ArrayList<Profesor> arregloProfesores);
	
}