package com.proyecto1.decorator;

import java.util.LinkedList;

/**
 * Clase Alumno: Esta clase modela a un Alumno el cual tiene los
 * atributos nombre, grupo, area, materias 1 y 2, asi como sus
 * respectivas calificaciones y el promedio, la opcion tecnica
 * es opcional por si cada alumno decide inscribir una opcion.
 */

public class Alumno implements AlumnoInterfaz{

	/* Nombre del alumno*/
	private String nombre;

	/* Area a la cual pertenece la materia inscrita */
	private String area;

	/* Grupo 1 del alumno*/
	private int grupo1;

	/* Grupo 2 del alumno*/
	private int grupo2;

	/* Materia 1 que tiene inscrita el alumno*/
	private String materia1;

	/* Materia 2 que tiene inscrita el alumno*/
	private String materia2;

	/* Calificacion de la materia 1 */
	private double calificacion1;

	/* Calificacion de la materia 2 */
	private double calificacion2;

	/* Promedio de todas las calificaciones*/
	private double promedio;

	/* Opcion tecnica a la cual esta inscrito, "ninguna" en caso de que no*/
	private String opcionTecnica = "ninguna";

	/* Calificacion de la opcion tecnica*/
	public double calificacionOpcionTecnica;

	public Alumno (String n,String a,int g1,int g2){
		this.nombre = n;
		this.grupo1 = g1;
		this.grupo2 = g2;
		this.area = a;
		this.calificacion1 = 0.0;
		this.calificacion2 = 0.0;
		this.promedio = 0.0;
		this.calificacionOpcionTecnica = 0.0;
		try{
			switch (a) {
					case "Fisico-Matematicas" :
						materia1 = "Física";
						materia2 = "Matemáticas";
					break;
					case "Ciencias Biológicas y de la Salud":
						materia1 = "Biología";
						materia2 = "Química";
					break;
					case "Ciencias Sociales" :
						materia1 = "Historia";
						materia2 = "Ciencias sociales";
					break;
					case "Humanidades y Artes" :
						materia1 = "Filosofía";
						materia2 = "Artes plásticas";
					break;
					default :
						materia1 = "";
						materia2 = "";
					break;
				}
		}catch(Exception e){
			System.err.println("Hubo un error al leer los datos");
		}
	}

	/* Metodo getNombre*/
	public String getNombre(){
		return this.nombre;
	}

	/* Metodo setNombre*/
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	/* Metodo getGrupo1*/
	public int getGrupo1(){
		return this.grupo1;
	}

	/* Metodo setGrupo1*/
	public void setGrupo1(int grupo1){
		this.grupo1 = grupo1;
	}

	/* Metodo getGrupo2*/
	public int getGrupo2(){
		return this.grupo2;
	}

	/* Metodo setGrupo2*/
	public void setGrupo2(int grupo2){
		this.grupo2 = grupo2;
	}

	/* Metodo getArea*/
	public String getArea(){
		return this.area;
	}

	/* Metodo setArea*/
	public void setArea(String area){
		this.area = area;
	}

	/* Metodo getMateria1*/
	public String getMateria1(){
		return this.materia1;
	}

	/* Metodo setMateria1*/
	public void setMateria1(String materia1){
		this.materia1 = materia1;
	}

	/* Metodo getMateria2*/
	public String getMateria2(){
		return this.materia2;
	}

	/* Metodo setMateria2*/
	public void setMateria2(String materia2){
		this.materia2 = materia2;
	}

	/* Metodo getCalificacion1*/
	public double getCalificacion1(){
		return this.calificacion1;
	}

	/* Metodo setCalificacion1*/
	public void setCalificacion1(double calificacion1){
		this.calificacion1 = calificacion1;
	}

	/* Metodo getCalificacion2*/
	public double getCalificacion2(){
		return this.calificacion2;
	}

	/* Metodo setCalificacion2*/
	public void setCalificacion2(double calificacion2){
		this.calificacion2 = calificacion2;
	}

	/* Metodo getPromedio*/
	public double getPromedio(){
		return this.promedio;
	}

	/* Metodo setPromedio*/
	public void setPromedio(double promedio){
		this.promedio = promedio;
	}

	/* Metodo setOpcionTecnica*/
	public void setOpcionTecnica(String opcionTecnica){
		this.opcionTecnica = opcionTecnica;
	}

	/* Metodo setCalificacionOpcionTecnica*/
	public void setCalificacionOpcionTecnica(double calificacionOpcionTecnica){
		this.calificacionOpcionTecnica = calificacionOpcionTecnica;
	}

	/* Metodo setCalificacionOpcionTecnica*/
	public void defineOpcion(String opcion){
		this.opcionTecnica = opcion;
	}

	/**
	 * Metodo consultaCalificacionParcial: Este metodo nos devuele
	 * la calificacion de la materia que se le pase como argumento
	 */
	public double consultaCalificacionParcial(String materia){
		return materia.equals(materia1)?calificacion1:calificacion2;
	}

	/**
	 * Metodo consultaCalificacionParcial: Este metodo nos devuele
	 * la calificacion de la materia que se le pase como argumento
	 */
	public double consultaCalificacionCarreraTecnica(){
		return this.calificacionOpcionTecnica;
	}

	/**
	 * Metodo consultaPromedio: este metodo nos devuelve el promedio
	 * del alumno.
	 */
	public double consultaPromedio(){
		if(opcionTecnica.equals("ninguna")){
			this.promedio = (calificacion1+calificacion2)/2;
			return this.promedio;
		}else{
			this.promedio = (calificacion1+calificacion2+calificacionOpcionTecnica)/3;
			return this.promedio;
		}
	}


	/**
	 * Metodo eligeOpcionTecnica: este metodo nos ayuda a elegir
	 * la opcion tecnica para el alumno.
	 */
	public void eligeOpcionTecnica(){
		AlumnoDecorado alumno = new AlumnoDecorado(this);
		alumno.eligeOpcionTecnica();
		this.opcionTecnica = alumno.getOpcionTecnica();
	}

	/**
	 * Metodo getOpcionTecnica: este metodo nos devuelve la opcion
	 * tecnica que tenga inscrita el alumno, <code>"ninguna"</code>
	 * en caso de que no tenga inscrita una opcion tecnica.
	 */
	public String getOpcionTecnica(){
		return this.opcionTecnica;
	}



}
