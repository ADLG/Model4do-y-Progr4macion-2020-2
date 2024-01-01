package com.proyecto1.strategy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import com.proyecto1.*;
import com.proyecto1.composite.*;
import com.proyecto1.decorator.*;

/**
 * Clase: CertificadoConOpcionTecnica: esta clase tiene un unico
 * metodo el cual solo genera el certificado del alumno que se le 
 * pasa como argumento, ademas de generar un certificado este lo 
 * guarda en la salida estandar con una terminacion .txt, cabe 
 * destacar que este metodo solo genera para alumnos con opcion tecnica.
 */

public class CertificadoConOpcionTecnica implements Certificados{

	/**
	 * Metodo generarCertificado: este metodo genera un certificado para
	 * el alumno que se le pasa como argumentos, y lo guarda en un archivo
	 * .txt el cual se llama CertificadoConOpcionTecnica-NombreDelAlumno.txt
	 */
	public void generarCertificado(Alumno alumno, ArrayList<Profesor> arregloProfesores){
		String profesor1 = "xxx-xxx";
		String profesor2 = "xxx-xxx";
		for (Profesor profesor: arregloProfesores){
			if(profesor.getMateria().equals(alumno.getMateria1())){
				profesor1=profesor.getNombre();
			}
			if(profesor.getMateria().equals(alumno.getMateria2())){
				profesor2=profesor.getNombre();
			}
		}

		System.out.printf("Se esta procediendo a generar el Certificado del alumno: %s\n",alumno.getNombre());
		String certificado = String.format("*-------------------------------------------------------*\n"
										  +"                                                         \n"
										  +" Nombre del alumno: [%s]							     \n"
										  +" Materias que llevo: [%s,%s]							 \n"
										  +" Calificaciones: [%2.2f,%2.2f]							 \n"
										  +" Profesores de materias: [%s,%s]						 \n"
										  +" Promedio general: [%2.2f]								 \n"
										  +" Opcion tecnica: [%s]									 \n"
										  +"                                                         \n"
										  +"*-------------------------------------------------------*\n",
										  alumno.getNombre(),alumno.getMateria1(),alumno.getMateria2(),
										  alumno.getCalificacion1(),alumno.getCalificacion2(),
										  profesor1,profesor2,alumno.consultaPromedio(),alumno.getOpcionTecnica());
		String nombreArchivo = String.format("CertificadoConOpcionTecnica-%s.txt",alumno.getNombre());

		try {
			File file = new File(nombreArchivo);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(certificado);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}