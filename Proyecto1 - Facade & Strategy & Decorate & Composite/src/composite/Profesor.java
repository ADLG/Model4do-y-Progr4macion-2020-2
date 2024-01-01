package com.proyecto1.composite;

import java.util.Hashtable;
import java.util.Enumeration;
import java.util.LinkedList;
import com.proyecto1.*;
import com.proyecto1.decorator.*;


public class Profesor implements Escuela{

	/* Nombre del profesor*/
	private String nombre;

	/* ID del profesor*/
	private long id;

	/** 
	 * Materia que imparte el profesor,
	 * "" en caso de que imparta opcion tecnica
	 */
	private String materia;

	/* Opcion tecnica que imparte*/
	private String opcionTecnica;

	/* Grupo al que imparte la materia*/
	private int grupo;

	/* lista de alumnos en donde estan cada uno con una id unica */
	private Hashtable<Integer,Alumno> listaDeInscritos;

	public Profesor(String nombre, long id, 
					String materia, int grupo){
		this.nombre = nombre;
		this.id = id;
		this.grupo = grupo;
		this.listaDeInscritos = new Hashtable<>();
		if (materia.equals("Física")|| materia.equals("Matemáticas")||
			materia.equals("Biología")||materia.equals("Química")||
			materia.equals("Historia")||materia.equals("Ciencias sociales")||
			materia.equals("Filosofía")||materia.equals("Artes plásticas")){
			this.materia = materia;
			this.opcionTecnica = "ninguna";
		}else{
			this.materia = "ninguna";
			this.opcionTecnica = materia;
		}
	}

	/* metodo getNombre: devuelve el nombre del profesor*/
	public String getNombre(){
		return this.nombre;
	}

	/* metodo getID: devuelve el id del profesor*/
	public long getID(){
		return this.id;
	}

	/* metodo getMateria: devuelve la materia del profesor*/
	public String getMateria(){
		return this.materia;
	}

	/* metodo getOpcionTecnica: devuelve la opcion tecnica del profesor*/
	public String getOpcionTecnica(){
		return this.opcionTecnica;
	}

	/* metodo getGrupo: devuelve el grupo del profesor*/
	public long getGrupo(){
		return this.grupo;
	}

	/* metodo getListaDeInscritos: devuelve la lista de inscritos del profesor*/
	public Hashtable<Integer,Alumno> getListaDeInscritos(){
		return this.listaDeInscritos;
	}

	
	/**
	 * Metodo consultar: este metodo lo que hace es dar toda la informacion del 
	 * profesor que lo llama, es la misma implementacion que el metodo consultaInfoGrupo
	 * por eso solo llama al otro metodo.
	 */
	public void consultar(){
		System.out.println("A continuacion se le presentara la informacion general");
		consultarInfoGrupo();
	}

	/**
	 * Metodo inscribir: este metodo queda inutilizado como tal ya que el profesor no puede
	 * como tal hacer inscripciones, solo el adiminstrador.
	 */
	public void inscribir(){
		throw new UnsupportedOperationException("Error, el profesor no puede inscribir");
	}


	/**
	 * Metodo consultarInfoGrupo: este metodo muestra la lista 
	 * de alumnos, el grupo, la materia u opción técnica.
	 */
	public void consultarInfoGrupo(){
		System.out.printf("El profesor: %s tiene asignado el grupo:"+
			" %d para la materia/opcion tecnica de: %s\n\n",
			this.nombre,this.grupo,this.materia);
		System.out.printf("Lista de inscritos para el grupo: %d\n",
			this.grupo);
		listaDeInscritos.forEach((k, v) -> {
			Alumno alumno = (Alumno) v;
			System.out.println("ID: " + k + ", Alumno: " + alumno.getNombre());});
	}

	/**
	 * Metodo getListaAlumnosDeArea: este metodo nos regresa una lista de
	 * de los alumnos que esten registrados en el area que le pasan como 
	 * parametro al metodo.
	 */
	public LinkedList<Alumno> getListaAlumnosDeArea(String area){
		LinkedList<Alumno> lista = new LinkedList<>();
		Enumeration enumeration = listaDeInscritos.elements();
		while (enumeration.hasMoreElements()) {
		  Alumno alumno = (Alumno)enumeration.nextElement();
		  lista.add(alumno);
		}
		LinkedList<Alumno> listaArea = new LinkedList<>();
		for (Alumno alumno : lista) {
			if(alumno.getArea().equals(area)){
				listaArea.add(alumno);
			}
		}
		return listaArea;
	}

	/**
	 * Metodo getListaAlumno: este metodo lo que hace es sacar los valores
	 * de la tabla hash del profesor y los guarda en una lista la cual devuelve.
	 */
	public LinkedList<Alumno> getListaAlumnos(){
		LinkedList<Alumno> lista = new LinkedList<>();
		Enumeration enumeration = listaDeInscritos.elements();
		while (enumeration.hasMoreElements()) {
		  Alumno n = (Alumno)enumeration.nextElement();
		  lista.add(n);
		}
		return lista;
	}

	/**
	 * Metodo agregarAlGrupo: este metodo es esencial para poder agregar alumnos a 
	 * la tabla hash del profesor, este metodo solo debera de usarlo el administrador
	 * ya que el puede inscribir alumnos, por comodidad este metodo se puso aqui.
	 */
	public void agregarAlGrupo(int idUnico,Alumno alumno){
		listaDeInscritos.put(idUnico,alumno);
		System.out.printf("El Alumn@: %s, fue inscrito al grupo %d y materia %s del"+
			" profesor %s\n",alumno.getNombre(),this.grupo,this.materia,this.nombre);
	}

	/**
	 * Metodo eliminarDelGrupo: este metodo es esencial para poder eliminar alumnos a 
	 * la tabla hash del profesor, este metodo solo debera de usarlo el administrador
	 * ya que el puede eliminar alumnos, por comodidad este metodo se puso aqui.
	 */
	public void eliminarDelGrupo(int idUnico,Alumno alumno){
		listaDeInscritos.remove(idUnico);
		System.out.printf("Alumn@: %s, removido con exito del grupo: %d del profesor: %s\n",
			alumno.getNombre(),this.grupo,this.nombre);

	}

	/**
	 * metodo asignarCalificacion: este metodo asigna la calificacion al alumno que se
	 * le pasa como parametros
	 */
	public void asignarCalificacion(Alumno alumno,String materia,double calificacion){
			if (alumno.getMateria1().equals(materia)){
				alumno.setCalificacion1(calificacion);
			}
			if (alumno.getMateria2().equals(materia)){
				alumno.setCalificacion2(calificacion);
			}
			if (alumno.getOpcionTecnica().equals(materia)){
				alumno.calificacionOpcionTecnica = calificacion;
			}
	}

	/**
	 * Metodo buscarAlumno: este metodo nos devuelve la referencia a un Alumno 
	 * en las tablas hash
	 */
	public Alumno buscarAlumno(int idUnico){
		return this.listaDeInscritos.get(idUnico);
	}

	/**
	 * metodo reemplazarAlumno: nos ayuda a remplazar los valores de la tabla hash
	 * del profesor con algun otro valor que se le pase por parametro
	 */
	public void reemplazarAlumno(int idUnico, Alumno valorViejo, Alumno valorNuevo){
		this.listaDeInscritos.replace(idUnico, valorViejo, valorNuevo);
	}


}