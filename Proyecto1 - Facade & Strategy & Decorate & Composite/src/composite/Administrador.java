package com.proyecto1.composite;

import java.util.ArrayList;
import java.util.Scanner;
import com.proyecto1.*;
import com.proyecto1.decorator.*;
import com.proyecto1.strategy.*;


/**
 * Clase Administrador: Esta clase es una de las mas importantes
 * ya que en nuestro sistema que modela una escuela  el administrador 
 * es la persona que tiene mas funciones para usar y decidir 
 * sobre los demas objetos.
 */

public class Administrador implements Escuela{

	/* Scanner para la lectura de datos de usuario*/
	Scanner sc = new Scanner(System.in);
	
	/* Lista de profesores de la escuela */
	private ArrayList<Profesor> arregloProfesores = new ArrayList<Profesor>();

	/* Certificado que genera a los estudiantes con opcion tecnica*/
	CertificadoConOpcionTecnica certificadoOT = new CertificadoConOpcionTecnica();

	/* Certificado que genera a los estudiantes sin opcion tecnica*/
	CertificadoSinOpcionTecnica certificadoSin = new CertificadoSinOpcionTecnica();

	/* metodo getArregloProfesores*/
	public ArrayList<Profesor> getArregloProfesores(){
		return this.arregloProfesores;
	}

	/**
	 * Metodo generaCertificadoOT: este metodo genera un certificado
	 * para el alumno que tiene una opcion tecnica
	 */

	public void generaCertificadoOT(Alumno alumno){
		certificadoOT.generarCertificado(alumno,arregloProfesores);
	}

	/**
	 * Metodo generaCertificadoSinOT: este metodo genera un certificado
	 * para el alumno que no tiene una opcion tecnica
	 */
	public void generaCertificadoSinOT(Alumno alumno){
		certificadoSin.generarCertificado(alumno,arregloProfesores);
	}

	/**
	 * Metodo Consultar: Este metodo es el principal de la clase y
	 * y dependiendo de lo que el usuario quiera consultar es lo que
	 * manejara.
	 */
	public void consultar(){
		System.out.println("Esta llamando al metodo de consultas del Administrador\n"+
			"a continuacion puede seleccionar la accion que le interese\n\n");
		System.out.println("1.- Ver lista de alumnos de todas las opciones tecnicas");
		System.out.println("2.- Ver lista de alumnos de todas las materias");
		System.out.println("3.- Ver lista de todos los profesores (de materias y opciones tecnicas)");
		System.out.print("Ingrese un numero valido: ");
		int i = sc.nextInt();
		switch(i){
			case 1:
				getListaAlumnosOpcionTec();
				break;
			case 2:
				getListaAlumnosMaterias();
				break;
			case 3:
				getListaProfesores();
				break;
			default : System.err.println("Usuario, se le dijo que ingresara un numero valido");
				break;
		}	
	}

	/**
	 * Metodo Inscribir: Este metodo lo que hace es simplificar y 
	 * unir los metodos relacionados con la inscripcion de profesores
	 * por el usuario
	 */
	public void inscribir(){
		System.out.println("Esta llamando al metodo de inscribir del Administrador\n"+
			"a continuacion puede seleccionar la accion que le interese\n\n");
		System.out.println("1.- Inscribir un Alumno");
		System.out.println("2.- Contratar un Profesor");
		System.out.print("Ingrese un numero valido: ");
		int i = sc.nextInt();
		switch(i){
			case 1:
				auxInscribirAlumno();
				break;
			case 2:
				auxContratarProfesor();
				break;
			default : System.err.println("Usuario, se le dijo que ingresara un numero valido");
				break;
		}		
	}

	/**
	 * Metodo auxInscribirAlumno: este metodo solo es para poder manejar mejor el menu
	 * del metodo inscribe del administrador.
	 */
	private void auxInscribirAlumno(){
		System.out.println("\nSelecciono Inscribir Alumno");

		System.out.print("\nIngrese el Nombre del Alumno: ");
		String nombre = sc.next();

		System.out.print("\nIngrese el Area del Alumno: ");
		String area = sc.next();

		System.out.print("\nIngrese el Grupo 1 del Alumno: ");
		int grupo1 = sc.nextInt();

		System.out.print("\nIngrese el Grupo 2 del Alumno: ");
		int grupo2 = sc.nextInt();

		System.out.print("\nIngrese un ID unico para el Alumno: ");
		int idUnico = sc.nextInt();

		Alumno nuevoAlumno = new Alumno(nombre,area,grupo1,grupo2);
		inscribirAlumno(idUnico,nuevoAlumno);

		System.out.println("El alumno: "+nombre+" fue agregado exitosamente\n"+
							"que accion desea realizar\n");
		System.out.println("1.- Inscribir otro Alumno");
		System.out.println("2.- Ya acabe de inscribir, gracias");
		System.out.print("Ingrese un numero valido: ");
		int i = sc.nextInt();
		switch(i){
			case 1:
				auxInscribirAlumno();
				break;
			case 2:
				break;
			default : 
				System.err.println("Usuario, se le dijo que ingresara un numero valido");
				break;
		}	

	}

	/**
	 * Metodo auxContratarProfesor: este metodo solo es para poder manejar mejor el menu
	 * del metodo inscribe del administrador.
	 */
	private void auxContratarProfesor(){
		System.out.println("\nSelecciono Contratar profesor\n");

		System.out.print("\nIngrese el Nombre del Profesor: ");
		String nombre = sc.next();

		System.out.print("\nIngrese el ID del Profesor: ");
		long id = sc.nextLong();

		System.out.print("\nIngrese la materia o opcion tecnica del Profesor: ");
		String materia = sc.next();

		System.out.print("\nIngrese el Grupo del Profesor: ");
		int grupo = sc.nextInt();

		contratarProfesor(nombre,id,materia,grupo);

		System.out.println("El Profesor: "+nombre+" fue agregado exitosamente\n"+
							"que accion desea realizar\n");
		System.out.println("1.- Inscribir otro Profesor");
		System.out.println("2.- Ya acabe de inscribir, gracias");
		System.out.print("Ingrese un numero valido: ");
		int i = sc.nextInt();
		switch(i){
			case 1:
				auxContratarProfesor();
				break;
			case 2:
				break;
			default : System.err.println("Usuario, se le dijo que ingresara un numero valido");
				break;
		}
	}

	/**
	 * Metodo getListaAlumnosOpcionTec: este metodo nos imprime en pantalla la lista
	 * de los alumnos que estan inscritos en las opciones tecnicas solamente.
	 */
	public void getListaAlumnosOpcionTec(){
		for (Profesor profesor: arregloProfesores) {
			if (!profesor.getOpcionTecnica().equals("ninguna")){
				profesor.consultarInfoGrupo();	
			}
		}
	}

	/**
	 * Metodo getListaAlumnosMaterias: este metodo nos imprime en pantalla la lista
	 * de los alumnos que estan inscritos en las materias solamente
	 */
	public void getListaAlumnosMaterias(){
		for (Profesor profesor: arregloProfesores) {
			if (!profesor.getMateria().equals("ninguna")){
				profesor.consultarInfoGrupo();			
			}
		}
	}

	/**
	 * Metodo getListaProfesores: este metodo nos da todas las listas de los profesores
	 * esto incluye a todos los profesores tanto de materias ocmo de opciones tecnicas 
	 */
	public void getListaProfesores(){
		System.out.println("A continuacion se mostraran a los profesores en el sistema");
		for (Profesor profesor :arregloProfesores) {
			System.out.printf("Profesor: %s con grupo: %d\n",profesor.getNombre(),profesor.getGrupo());
		}
	}

	/**
	 * Metodo inscribirAlumno: este metodo nos ayuda a inscribir un alumno al grupo que le corresponda
	 * con el profesor, para la inscripcion necesitamos un id unico y al alumno ya definido a inscribir
	 */
	public void inscribirAlumno(int idUnico, Alumno alumno){
		for (Profesor profesor: arregloProfesores) {
			if(profesor.getGrupo() == alumno.getGrupo1()||
			   profesor.getGrupo() == alumno.getGrupo2());
			profesor.agregarAlGrupo(idUnico,alumno);
		}
	}

	/**
	 * Metodo darDeBajaAlumno: este metodo nos ayuda a dar de baja el alumno de la lista del grupo del profesor,
	 * en dado caso de que este el alumno en mas grupos se daria de baja tambien de esos grupos
	 */
	public void darDeBajaAlumno(int idUnico, Alumno alumno){
		for (Profesor profesor: arregloProfesores) {
			if(profesor.getGrupo() == alumno.getGrupo1()||
			   profesor.getGrupo() == alumno.getGrupo2());
			profesor.eliminarDelGrupo(idUnico,alumno);
		}
	}

	/**
	 * Metodo contratarProfesor: este metodo nos ayuda a contratar un nuevo profesor
	 * y registrarlo en el sistema
	 */
	public void contratarProfesor(String nombre, long id, String materia, int grupo){
		Profesor nuevoProfesor = new Profesor(nombre,id,materia,grupo);
		arregloProfesores.add(nuevoProfesor);
	}

	public void agregarProfesor(Profesor profesor){
		arregloProfesores.add(profesor);
	}	

	/**
	 * Metodo despedirProfesor: este metodo nos ayuda a despedir un profesor y 
	 * retirarlo del sistema
	 */
	public void despedirProfesor(Profesor profesor){
		System.out.printf("Se despidio el profesor: %s, con ID: %d\n",profesor.getNombre(),profesor.getID());
		arregloProfesores.remove(profesor);
	}
}
