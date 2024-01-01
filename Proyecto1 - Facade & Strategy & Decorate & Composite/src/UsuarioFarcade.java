package com.proyecto1;

import com.proyecto1.decorator.*;
import com.proyecto1.composite.*;
import com.proyecto1.stategy.*;

import java.util.Scanner;
import java.util.InputMismatchException;

public class UsuarioFarcade{

	/* El alumno que va a interactuar*/
	private Alumno alumno;
	/* El profesor que va a interactuar*/
	private Profesor profesor;
	/* El administrador que va a interactuar*/
	private Administrador administrador = new Administrador();
	/* Clave unica para poder accesar al sistema como administrador*/
	private final int claveAdministrador = 2247;
	/* Clave unica para poder accesar al sistema como profesor*/
	private final int claveProfesor = 7489;
	/* Clave unica para poder accesar al sistema como alumno*/
	private final int claveAlumno = 1234;
	/* Scanner para ingresar opciones*/
	Scanner sc = new Scanner(System.in);


	/**
	 * Metodo menu: este metodo lo que hace basicamente es checar
	 * con que perfil el usuario usara el sistema, para ello el sistema
	 * 
	 */
	public void menu(){
		System.out.println("\n\nBienvenidos al Sistema de la Escuela\n"+
			"Por favor elige como deseas ingresar al sistema\n"+
			"Recuerda que despues de seleccionar la opcion\n"+
			"el sistema te pedira que ingreses la clave unica\n"+
			"para verificar que tengas permiso de acceder al sistema escolar\n\n");
		

		System.out.print("1.- Ingresar como administrad@r\n"+
						 "2.- Ingresar como profes@r\n"+
						 "3.- Ingresar como alumn@\n"+
						 "4.- Salir\n\n"+

						 "Ingrese la opcion: ");
		try{
			int i = sc.nextInt();
			switch (i) {
				case 1 : 
					menuAdministrador();
					break;
				case 2 :
					menuProfesor();
					break;
				case 3 :
					menuAlumno();
					break;
				default:
					System.out.println("No ingreso un numero valido");
					System.exit(1);
					break;
			}
		}catch (InputMismatchException e) {
			System.out.println("No ingreso un numero, abortando.....");
			System.exit(1);
		}

	}

	/**
	 * Metodo menuAdministrador: este metodo se dedica a aplicar las acciones
	 * de un adminstrador (consultar informacion, inscribir alumnos, inscribir
	 * profesores, asi como tambien despedir a los profesores, dar de baja a los alumnos)
	 */
	public void menuAdministrador(){
		System.out.print("\n\nEsta iniciando como administrad@r\n"+
						 "Ingrese la clave unica para verificar su inicio\n"+
						 "de equivocarse se abortara el programa\n"+

						 "\n\nIngrese clave: ");
		
		try{
			int i = sc.nextInt();
			if (i!=claveAdministrador) {
				System.err.println("Clave incorrecta, abortando......");
				System.exit(1);
			}
		}catch (InputMismatchException e){
			System.out.println("No ingreso un numero, abortando.....");
			System.exit(1);
		}
		System.out.println("Verificando............\n"+
						   "Fue verificado y es valido, bienvenid@");

		System.out.println("\n\nSeleccione una opcion a continuacion\n");

		System.out.print("1.- Quiero consultar datos de la escuela\n"+
						 "2.- Quiero inscribir a un alumn@ o a un profesor/a\n"+
						 "3.- Quiero dar de baja a un alumn@ o despedir a un profesor/a\n"+
						 "4.- Quiero generar el certificado de un Alumn@\n"+
						 "5.- Regrasar al menu principal \n\n"+

						 "Ingrese la opcion: ");
		try{
			int i = sc.nextInt();
			switch (i) {
				case 1 : 
					administrador.consultar();
					menuAdministrador();
					break;
				case 2 :
					administrador.inscribir();
					menuAdministrador();
					break;
				case 3 :
					auxDarDeBajaAlumnoODespedirProfesor();
					menuAdministrador();
					break;
				case 4 :
					generarCertificado();
					menuAdministrador();
					break;
				case 5 : 
					menu();
					break;
				default:
					System.out.println("No ingreso un numero valido");
					System.exit(1);
					break;
			}
		}catch (InputMismatchException e) {
			System.out.println("No ingreso un numero, abortando.....");
			System.exit(1);
		}
	}
	
	/**
	 * Metodo auxiliar auxDarDeBajaAlumnoODespedirProfesor : un simple metodo auxiliar
	 * para programar mas facil los menus
	 */
	private void auxDarDeBajaAlumnoODespedirProfesor(){
		System.out.println("\n\nSeleccione a continuacion una accion\n\n");
		System.out.print("1.- Dar de baja a un alumn@ (debe de conocer su ID registrada en el sistema)\n"+
						 "2.- Despedir a un profes@r (Debe de conocer el ID registrado)\n"+
						 "3.- Regresar al menu principal.\n\n"+
						 "Ingrese la opcion: ");
		try{
			int i = sc.nextInt();
			switch (i) {
				case 1 : 
					auxDarDeBajaAlumno();
					menuAdministrador();
					break;
				case 2 :
					auxDespedirProfesor();
					menuAdministrador();
					break;
				case 3 :
					menu();
					break;
				default:
					System.out.println("No ingreso un numero valido");
					System.exit(1);
					break;
			}
		}catch (InputMismatchException e) {
			System.out.println("No ingreso un numero, abortando.....");
			System.exit(1);
		}
	}

	/**
	 * Metodo auxiliar auxDarDeBajaAlumno() un simple metodo auxiliar
	 * para programar mas facil los menus
	 */
	private void auxDarDeBajaAlumno(){
		System.out.println("\n\nSelecciono dar de baja a un alumn@\n\n");

		System.out.print("Ingrese el ID del alumn@ a dar de baja: ");
		try{
			int idUnico = sc.nextInt();
			Alumno alumno = null;
			for (Profesor profesor: administrador.getArregloProfesores()) {
				alumno = profesor.buscarAlumno(idUnico);
			}
			if (alumno == null) {
				System.out.println("Error, el alumn@ no se encontro en el sistema, abortando operacion.....");
				System.exit(1);
			}
			administrador.darDeBajaAlumno(idUnico,alumno);
		}catch (InputMismatchException e) {
			System.out.println("No ingreso un numero, abortando.....");
			System.exit(1);
		}
	}

	/**
	 * Metodo auxiliar auxDespedirProfesor() un simple metodo auxiliar
	 * para programar mas facil los menus
	 */
	private void auxDespedirProfesor(){
		System.out.println("\n\nSelecciono despedir a un profesor/a\n\n");
		System.out.print("Ingrese el ID del profesor/a a despedir: ");
		try{
			long idUnico = sc.nextLong();
			for (Profesor profesor: administrador.getArregloProfesores()) {
				if (profesor.getID()==idUnico) {
					administrador.despedirProfesor(profesor);
				}
			}
			System.out.println("Se despidio al profesor/a correctamente");
		}catch (InputMismatchException e) {
			System.out.println("No ingreso un numero, abortando.....");
			System.exit(1);
		}
	}

	/**
	 * Metodo auxiliar generarCertificado() es solo un metodo para 
	 * hacer mas modular el menu y que fuera mas facil programar
	 */
	private void generarCertificado(){
		System.out.println("\n\nSelecciono generar certificado\n\n");
		System.out.print("Ingrese el ID del alumn@ para generar el certificado: ");
		try{
			int i = sc.nextInt();
			Alumno alumnoAGraduar = null;
			for (Profesor profesor:administrador.getArregloProfesores()) {
				alumnoAGraduar=profesor.buscarAlumno(i);
			}
			if (alumnoAGraduar == null) {
				System.err.println("no se encontro el estudiante, abortando operacion...");
				System.exit(1);
			}
			if (alumnoAGraduar.getOpcionTecnica().equals("ninguna")) {
				administrador.generaCertificadoSinOT(alumnoAGraduar);
				
			}else{
				administrador.generaCertificadoOT(alumnoAGraduar);
			}
			System.out.printf("\nSe genero el certifcado del alumn@ %s correctamente\n",alumnoAGraduar.getNombre());
		}catch (InputMismatchException e) {
			System.out.println("No ingreso un numero, abortando.....");
			System.exit(1);
		} 
	}

	/**
	 * metodo menuProfesor(): este metodo se dedica a aplicar las acciones
	 * de un profesor
	 */
	public void menuProfesor(){
		System.out.print("\n\nEsta iniciando como profesor/a\n"+
						 "Ingrese la clave unica para verificar su inicio\n"+
						 "de equivocarse se abortara el programa\n"+

						 "\n\nIngrese clave: ");
		
		try{
			int i = sc.nextInt();
			if (i!=claveProfesor) {
				System.err.println("Clave incorrecta, abortando......");
				System.exit(1);
			}
		}catch (InputMismatchException e){
			System.out.println("No ingreso un numero, abortando.....");
			System.exit(1);
		}
		System.out.println("Verificando............\n"+
						   "Fue verificado y es valido, bienvenid@");

		System.out.print("\n\nIngrese su ID de profesor/a para poder continuar\n"+
						   "Ingrese ID: ");
		try{
			long i = sc.nextLong();
			for (Profesor perfilSistema: administrador.getArregloProfesores()){
				if (perfilSistema.getID()==i){
					profesor=perfilSistema;
				}
			}
			if (profesor==null){
				System.err.println("No existe el profesor/a en el sistema, abortando......");
				System.exit(1);
			}
		}catch (InputMismatchException e){
			System.out.println("No ingreso un numero, abortando.....");
			System.exit(1);
		}

		System.out.printf("\n\n bienvenido profesor/a: %s\n"+
						   "Seleccione una opcion a continuacion\n",profesor.getNombre());

		System.out.print("1.- Quiero consultar la informacion general del grupo\n"+
						 "2.- Quiero asignar calificacion a un alumn@\n"+
						 "3.- Regresar al menu principal \n\n"+

						 "Ingrese la opcion: ");
		try{
			int i = sc.nextInt();
			switch (i) {
				case 1 : 
					profesor.consultar();
					menuProfesor();
					break;
				case 2 :
					auxAsignarCalificacion();
					menuProfesor();
					break;
				case 3 :
					menu();
					break;
				default:
					System.out.println("No ingreso un numero valido");
					System.exit(1);
					break;
			}
		}catch (InputMismatchException e) {
			System.out.println("No ingreso un numero, abortando.....");
			System.exit(1);
		}
	}

	/**
	 * Metodo auxiliar auxAsignarCalificacion();es solo un metodo para 
	 * hacer mas modular el menu y que fuera mas facil programar
	 */

	private void auxAsignarCalificacion(){
		System.out.println("\n\nSelecciono asignar calificacion a un alumn@\n\n");

		System.out.print("Ingrese el ID del alumn@: ");
		try{
			int idUnico = sc.nextInt();
			Alumno alumnoAModificar = profesor.getListaDeInscritos().get(idUnico);
			if (alumnoAModificar == null) {
				System.out.println("Error, el alumn@ no se encontro en el sistema, abortando operacion.....");
				System.exit(1);
			}
			System.out.print("ingrese la calificacion: ");
			double calificacion = sc.nextDouble();
			profesor.asignarCalificacion(alumnoAModificar,profesor.getMateria(),calificacion);
			System.out.printf("Se modifico la calificacion del alumn@: %s con la "+
				"calificacion: %2.2f en la materia: %s\n\n",alumnoAModificar.getNombre(),
				calificacion,profesor.getMateria());

		}catch (InputMismatchException e) {
			System.out.println("No ingreso un numero, abortando.....");
			System.exit(1);
		}
	}

	/**
	 * metodo menuAlumno: este metodo se dedica a aplicar las acciones
	 * de un alumno
	 */

	public void menuAlumno(){
		System.out.print("\n\nEsta iniciando como Alumn@\n"+
						 "Ingrese la clave unica para verificar su inicio\n"+
						 "de equivocarse se abortara el programa\n"+

						 "\n\nIngrese clave: ");
		
		try{
			int i = sc.nextInt();
			if (i!=claveAlumno) {
				System.err.println("Clave incorrecta, abortando......");
				System.exit(1);
			}
		}catch (InputMismatchException e){
			System.out.println("No ingreso un numero, abortando.....");
			System.exit(1);
		}
		System.out.println("Verificando............\n"+
						   "Fue verificado y es valido, bienvenid@");

		System.out.print("\n\nIngrese su ID de alumn@ para poder continuar\n"+
						   "Ingrese ID: ");
		int id = 0;
		try{
			int idUnico = sc.nextInt();
			for (Profesor profesor: administrador.getArregloProfesores()){
				alumno = profesor.buscarAlumno(idUnico);
			}
			if (alumno==null){
				System.err.println("No existe el alumn@ en el sistema, abortando......");
				System.exit(1);
			}
			id=idUnico;
		}catch (InputMismatchException e){
			System.out.println("No ingreso un numero, abortando.....");
			System.exit(1);
		}

		System.out.printf("\n\nBienvenid@ alumn@: %s\n"+
						   "Seleccione una opcion a continuacion\n",alumno.getNombre());

		System.out.print("1.- Quiero consultar calificacion de una materia\n"+
						 "2.- Quiero consultar el promedio general\n"+
						 "3.- Quiero elegir opcion tecnica\n"+
						 "4.- Regresar al menu principal \n\n"+

						 "Ingrese la opcion: ");
		try{
			int i = sc.nextInt();
			switch (i) {
				case 1 : 
					auxCalificacionMateria();
					menuAlumno();
					break;
				case 2 :
					alumno.consultaPromedio();
					menuAlumno();
					break;
				case 3 :
					auxElegirOpcionTecnica(id);
					menuAlumno();
					break;
				case 4 :
					menu();
					break;
				default:
					System.out.println("No ingreso un numero valido");
					System.exit(1);
					break;
			}
		}catch (InputMismatchException e) {
			System.out.println("No ingreso un numero, abortando.....");
			System.exit(1);
		}
	}

	/**
	 * metodo auxiliar auxCalificacionMateria():es solo un metodo para 
	 * hacer mas modular el menu y que fuera mas facil programar
	 */
	private void auxCalificacionMateria(){
		System.out.println("\n\nSecciono consultar calificacion de una materia\n"+
						   "Seleccione a continuacion una accion\n\n");
		System.out.printf("1.- Consultar la calificacion de la materia: %s\n"+
						  "2.- Consultar la calificacion de la materia: %s\n",alumno.getMateria1()
						  ,alumno.getMateria2());
		System.out.print("3.- Regresar al menu principal.\n\n"+
						 "Ingrese la opcion: ");
		try{
			int i = sc.nextInt();
			switch (i) {
				case 1 : 
					double calificacion1 = alumno.consultaCalificacionParcial(alumno.getMateria1());
					System.out.printf("La calificacion del Alumn@: %s en la materia %s es: %2.2f\n",
						alumno.getNombre(),alumno.getMateria1(),calificacion1);
					menuAlumno();
					break;
				case 2 :
					double calificacion2 = alumno.consultaCalificacionParcial(alumno.getMateria2());
					System.out.printf("La calificacion del Alumn@: %s en la materia %s es: %2.2f\n",
						alumno.getNombre(),alumno.getMateria2(),calificacion2);
					menuAlumno();
					break;
				case 3 :
					menu();
					break;
				default:
					System.out.println("No ingreso un numero valido");
					System.exit(1);
					break;
			}
		}catch (InputMismatchException e) {
			System.out.println("No ingreso un numero, abortando.....");
			System.exit(1);
		}
	}

	/**
	 * metodo auxiliar auxElegirOpcionTecnica(): es solo un metodo para 
	 * hacer mas modular el menu y que fuera mas facil programar
	 */
	private void auxElegirOpcionTecnica(int idUnico){
		System.out.println("\n\nSecciono elegir opcion tecnica\n\n");
		Alumno alumnoAntes = alumno;
		alumno.eligeOpcionTecnica();
		for (Profesor profesor: administrador.getArregloProfesores()){
			if (profesor.getOpcionTecnica().equals(alumno.getOpcionTecnica())){
				profesor.agregarAlGrupo(idUnico,alumno);
			}
			if (profesor.getGrupo()==alumno.getGrupo1()){
				profesor.reemplazarAlumno(idUnico,alumnoAntes,alumno);
			}
			if (profesor.getGrupo()==alumno.getGrupo2()){
				profesor.reemplazarAlumno(idUnico,alumnoAntes,alumno);
			}
		}
		System.out.printf("Se selecciono la opcion tecnica: %s para el alumn@: %s\n",
							alumno.getOpcionTecnica(),alumno.getNombre());
	}
	
	/**
	 * metodo cargaDeDatosDePrueba: este metodo es el que carga los datos de prueba
	 */

	public void cargaDeDatosDePrueba(){
		System.out.println("--------------------- Agregando datos para probar funcionalidad ---------------------");
		Profesor james = new Profesor("James",549435,"Física", 101);
		Profesor miguel = new Profesor("Miguel",45423,"Matemáticas", 102);

		Alumno emma = new Alumno("Emma","Fisico-Matematicas",101,102);
		emma.setCalificacion1(8.5);
		emma.setCalificacion2(7.5);
		james.agregarAlGrupo(20201,emma);
		miguel.agregarAlGrupo(20201,emma);

		Alumno alexander = new Alumno("Alexander","Fisico-Matematicas",101,102);
		alexander.setCalificacion1(6.5);
		alexander.setCalificacion2(9.5);
		james.agregarAlGrupo(20202,alexander);
		miguel.agregarAlGrupo(20202,alexander);

		Alumno anastasia = new Alumno("Anastasia","Fisico-Matematicas",101,102);
		anastasia.setCalificacion1(9.5);
		anastasia.setCalificacion2(6.5);
		james.agregarAlGrupo(20203,anastasia);
		miguel.agregarAlGrupo(20203,anastasia);

		Alumno wei = new Alumno("Wei","Fisico-Matematicas",101,102);
		wei.setCalificacion1(7.0);
		wei.setCalificacion2(9.0);
		james.agregarAlGrupo(20204,wei);
		miguel.agregarAlGrupo(20204,wei);

		Alumno fang = new Alumno("Fang","Fisico-Matematicas",101,102);
		fang.setCalificacion1(9.5);
		fang.setCalificacion2(8.5);
		james.agregarAlGrupo(20205,fang);
		miguel.agregarAlGrupo(20205,fang);

		Alumno ben = new Alumno("Ben","Fisico-Matematicas",101,102);
		ben.setCalificacion1(7.0);
		ben.setCalificacion2(9.0);
		james.agregarAlGrupo(20206,ben);
		miguel.agregarAlGrupo(20206,ben);

		Alumno minato = new Alumno("Minato","Fisico-Matematicas",101,102);
		minato.setCalificacion1(9.5);
		minato.setCalificacion2(9.0);
		james.agregarAlGrupo(20207,minato);
		miguel.agregarAlGrupo(20207,minato);

		Alumno sakura = new Alumno("Sakura","Fisico-Matematicas",101,102);
		sakura.setCalificacion1(8.5);
		sakura.setCalificacion2(6.5);
		james.agregarAlGrupo(20208,sakura);
		miguel.agregarAlGrupo(20208,sakura);

		System.out.println("--------------------- Agregando datos para probar funcionalidad ---------------------");

		Profesor alicia = new Profesor("Alicia",341008,"Biología", 103);
		Profesor maria = new Profesor("Maria",42546,"Química", 104);

		Alumno eduarda = new Alumno("Eduarda","Ciencias Biológicas y de la Salud",103,104);
		eduarda.setCalificacion1(8.5);
		eduarda.setCalificacion2(7.5);
		alicia.agregarAlGrupo(20209,eduarda);
		maria.agregarAlGrupo(20209,eduarda);

		Alumno junior = new Alumno("Junior","Ciencias Biológicas y de la Salud",103,104);
		junior.setCalificacion1(6.5);
		junior.setCalificacion2(9.5);
		alicia.agregarAlGrupo(202010,junior);
		maria.agregarAlGrupo(202010,junior);

		Alumno imanati = new Alumno("Imanati","Ciencias Biológicas y de la Salud",103,104);
		imanati.setCalificacion1(9.5);
		imanati.setCalificacion2(6.5);
		alicia.agregarAlGrupo(202011,imanati);
		maria.agregarAlGrupo(202011,imanati);

		Alumno bless = new Alumno("Bless","Ciencias Biológicas y de la Salud",103,104);
		bless.setCalificacion1(7.0);
		bless.setCalificacion2(9.0);
		alicia.agregarAlGrupo(202012,bless);
		maria.agregarAlGrupo(202012,bless);

		Alumno gift = new Alumno("Gift","Ciencias Biológicas y de la Salud",103,104);
		gift.setCalificacion1(9.5);
		gift.setCalificacion2(8.5);
		alicia.agregarAlGrupo(202013,gift);
		maria.agregarAlGrupo(202013,gift);

		Alumno precious = new Alumno("Precious","Ciencias Biológicas y de la Salud",103,104);
		precious.setCalificacion1(7.0);
		precious.setCalificacion2(9.0);
		alicia.agregarAlGrupo(202014,precious);
		maria.agregarAlGrupo(202014,precious);

		Alumno mateusz = new Alumno("Mateusz","Ciencias Biológicas y de la Salud",103,104);
		mateusz.setCalificacion1(9.5);
		mateusz.setCalificacion2(9.0);
		alicia.agregarAlGrupo(202015,mateusz);
		maria.agregarAlGrupo(202015,mateusz);

		Alumno devi = new Alumno("Devi","Ciencias Biológicas y de la Salud",103,104);
		devi.setCalificacion1(8.5);
		devi.setCalificacion2(6.5);
		alicia.agregarAlGrupo(202016,devi);
		maria.agregarAlGrupo(202016,devi);

		System.out.println("--------------------- Agregando datos para probar funcionalidad ---------------------");
	
		Profesor singh = new Profesor("Singh",55416,"Historia", 105);
		Profesor khan = new Profesor("Khan",507367,"Ciencias sociales", 106);

		Alumno adia = new Alumno("Adia","Ciencias Sociales",105,106);
		adia.setCalificacion1(8.5);
		adia.setCalificacion2(7.5);
		singh.agregarAlGrupo(202017,adia);
		khan.agregarAlGrupo(202017,adia);

		Alumno arav = new Alumno("Arav","Ciencias Sociales",105,106);
		arav.setCalificacion1(6.5);
		arav.setCalificacion2(9.5);
		singh.agregarAlGrupo(202018,arav);
		khan.agregarAlGrupo(202018,arav);

		Alumno karl = new Alumno("Karl","Ciencias Sociales",105,106);
		karl.setCalificacion1(9.5);
		karl.setCalificacion2(6.5);
		singh.agregarAlGrupo(202019,karl);
		khan.agregarAlGrupo(202019,karl);

		Alumno francesco = new Alumno("Francesco","Ciencias Sociales",105,106);
		francesco.setCalificacion1(7.0);
		francesco.setCalificacion2(9.0);
		singh.agregarAlGrupo(202020,francesco);
		khan.agregarAlGrupo(202020,francesco);

		Alumno sofia = new Alumno("Sofia","Ciencias Sociales",105,106);
		sofia.setCalificacion1(9.5);
		sofia.setCalificacion2(8.5);
		singh.agregarAlGrupo(202021,sofia);
		khan.agregarAlGrupo(202021,sofia);

		Alumno alexandra = new Alumno("Alexandra","Ciencias Sociales",105,106);
		alexandra.setCalificacion1(7.0);
		alexandra.setCalificacion2(9.0);
		singh.agregarAlGrupo(202022,alexandra);
		khan.agregarAlGrupo(202022,alexandra);

		Alumno juan = new Alumno("Juan","Ciencias Sociales",105,106);
		juan.setCalificacion1(9.5);
		juan.setCalificacion2(9.0);
		singh.agregarAlGrupo(202023,juan);
		khan.agregarAlGrupo(202023,juan);

		Alumno jose = new Alumno("jose","Ciencias Sociales",105,106);
		jose.setCalificacion1(8.5);
		jose.setCalificacion2(6.5);
		singh.agregarAlGrupo(202024,jose);
		khan.agregarAlGrupo(202024,jose);

		System.out.println("--------------------- Agregando datos para probar funcionalidad ---------------------");

		Profesor francisco = new Profesor("Francisco",542232,"Filosofía", 107);
		Profesor guadalupe = new Profesor("Guadalupe",64809,"Artes plásticas", 108);

		Alumno adia1 = new Alumno("Adia","Humanidades y Artes",107,108);
		adia1.setCalificacion1(8.5);
		adia1.setCalificacion2(7.5);
		guadalupe.agregarAlGrupo(202025,adia1);
		francisco.agregarAlGrupo(202025,adia1);

		Alumno arav1 = new Alumno("Arav","Humanidades y Artes",107,108);
		arav1.setCalificacion1(6.5);
		arav1.setCalificacion2(9.5);
		francisco.agregarAlGrupo(202026,arav1);
		guadalupe.agregarAlGrupo(202026,arav1);

		Alumno karl1 = new Alumno("Karl","Humanidades y Artes",107,108);
		karl1.setCalificacion1(9.5);
		karl1.setCalificacion2(6.5);
		francisco.agregarAlGrupo(202027,karl1);
		guadalupe.agregarAlGrupo(202027,karl1);

		Alumno francesco1 = new Alumno("Francesco","Humanidades y Artes",107,108);
		francesco1.setCalificacion1(7.0);
		francesco1.setCalificacion2(9.0);
		francisco.agregarAlGrupo(202028,francesco1);
		guadalupe.agregarAlGrupo(202028,francesco1);

		Alumno sofia1 = new Alumno("Sofia","Humanidades y Artes",107,108);
		sofia1.setCalificacion1(9.5);
		sofia1.setCalificacion2(8.5);
		francisco.agregarAlGrupo(202029,sofia1);
		guadalupe.agregarAlGrupo(202029,sofia1);

		Alumno alexandra1 = new Alumno("Alexandra","Humanidades y Artes",107,108);
		alexandra1.setCalificacion1(7.0);
		alexandra1.setCalificacion2(9.0);
		guadalupe.agregarAlGrupo(202030,alexandra1);
		francisco.agregarAlGrupo(202030,alexandra1);

		Alumno juan1 = new Alumno("Juan","Humanidades y Artes",107,108);
		juan1.setCalificacion1(9.5);
		juan1.setCalificacion2(9.0);
		francisco.agregarAlGrupo(202031,juan1);
		guadalupe.agregarAlGrupo(202031,juan1);

		Alumno jose1 = new Alumno("jose","Humanidades y Artes",107,108);
		jose1.setCalificacion1(8.5);
		jose1.setCalificacion2(6.5);
		francisco.agregarAlGrupo(202032,jose1);
		guadalupe.agregarAlGrupo(202032,jose1);

		System.out.println("--------------------- Agregando datos para probar funcionalidad ---------------------");

		Profesor juana = new Profesor("Juana",228708,"Agente de Viajes",201);
		
		Alumno emma1 = new Alumno("Emma","Fisico-Matematicas",101,102);
		emma1.setCalificacion1(8.5);
		emma1.setCalificacion2(7.5);
		emma1.defineOpcion("Agente de Viajes");
		emma1.setCalificacionOpcionTecnica(9.0);
		james.agregarAlGrupo(202033,emma1);
		miguel.agregarAlGrupo(202033,emma1);
		juana.agregarAlGrupo(202033,emma1);

		Alumno alexander1 = new Alumno("Alexander","Fisico-Matematicas",101,102);
		alexander1.setCalificacion1(6.5);
		alexander1.setCalificacion2(9.5);
		alexander1.defineOpcion("Agente de Viajes");
		alexander1.setCalificacionOpcionTecnica(9.0);
		james.agregarAlGrupo(202034,alexander1);
		miguel.agregarAlGrupo(202034,alexander1);
		juana.agregarAlGrupo(202034,alexander1);

		Alumno anastasia1 = new Alumno("Anastasia","Fisico-Matematicas",101,102);
		anastasia1.setCalificacion1(9.5);
		anastasia1.setCalificacion2(6.5);
		anastasia1.defineOpcion("Agente de Viajes");
		anastasia1.setCalificacionOpcionTecnica(9.0);
		james.agregarAlGrupo(202035,anastasia1);
		miguel.agregarAlGrupo(202035,anastasia1);
		juana.agregarAlGrupo(202035,anastasia1);

		Alumno wei1 = new Alumno("Wei","Fisico-Matematicas",101,102);
		wei1.setCalificacion1(7.0);
		wei1.setCalificacion2(9.0);
		wei1.defineOpcion("Agente de Viajes");
		wei1.setCalificacionOpcionTecnica(9.0);
		james.agregarAlGrupo(202034,wei1);
		miguel.agregarAlGrupo(202034,wei1);
		juana.agregarAlGrupo(202034,wei1);

		Alumno fang1 = new Alumno("Fang","Fisico-Matematicas",101,102);
		fang1.setCalificacion1(9.5);
		fang1.setCalificacion2(8.5);
		fang1.defineOpcion("Agente de Viajes");
		fang1.setCalificacionOpcionTecnica(9.0);
		james.agregarAlGrupo(202035,fang1);
		miguel.agregarAlGrupo(202035,fang1);
		juana.agregarAlGrupo(202035,fang1);

		Alumno ben1 = new Alumno("Ben","Fisico-Matematicas",101,102);
		ben1.setCalificacion1(7.0);
		ben1.setCalificacion2(9.0);
		ben1.defineOpcion("Agente de Viajes");
		ben1.setCalificacionOpcionTecnica(9.0);
		james.agregarAlGrupo(202036,ben1);
		miguel.agregarAlGrupo(202036,ben1);
		juana.agregarAlGrupo(202036,ben1);

		Alumno minato1 = new Alumno("Minato","Fisico-Matematicas",101,102);
		minato1.setCalificacion1(9.5);
		minato1.setCalificacion2(9.0);
		minato1.defineOpcion("Agente de Viajes");
		minato1.setCalificacionOpcionTecnica(9.0);
		james.agregarAlGrupo(202037,minato1);
		miguel.agregarAlGrupo(202037,minato1);
		juana.agregarAlGrupo(202037,minato1);

		Alumno sakura1 = new Alumno("Sakura","Fisico-Matematicas",101,102);
		sakura1.setCalificacion1(8.5);
		sakura1.setCalificacion2(6.5);
		sakura1.defineOpcion("Agente de Viajes");
		sakura1.setCalificacionOpcionTecnica(9.0);
		james.agregarAlGrupo(202038,sakura1);
		miguel.agregarAlGrupo(202038,sakura1);
		juana.agregarAlGrupo(202038,sakura1);

		System.out.println("--------------------- Agregando datos para probar funcionalidad ---------------------");

		Profesor antonio = new Profesor("Antonio",5058,"Hoteleria", 202);

		Alumno eduarda1 = new Alumno("Eduarda","Ciencias Biológicas y de la Salud",103,104);
		eduarda1.setCalificacion1(8.5);
		eduarda1.setCalificacion2(7.5);
		eduarda1.defineOpcion("Hoteleria");
		eduarda1.setCalificacionOpcionTecnica(7.0);
		alicia.agregarAlGrupo(202039,eduarda1);
		maria.agregarAlGrupo(202039,eduarda1);
		antonio.agregarAlGrupo(202039,eduarda1);

		Alumno junior1 = new Alumno("Junior","Ciencias Biológicas y de la Salud",103,104);
		junior1.setCalificacion1(6.5);
		junior1.setCalificacion2(9.5);
		junior1.defineOpcion("Hoteleria");
		junior1.setCalificacionOpcionTecnica(7.0);
		alicia.agregarAlGrupo(202040,junior1);
		maria.agregarAlGrupo(202040,junior1);
		antonio.agregarAlGrupo(202040,junior1);

		Alumno imanati1 = new Alumno("Imanati","Ciencias Biológicas y de la Salud",103,104);
		imanati1.setCalificacion1(9.5);
		imanati1.setCalificacion2(6.5);
		imanati1.defineOpcion("Hoteleria");
		imanati1.setCalificacionOpcionTecnica(7.0);
		alicia.agregarAlGrupo(202041,imanati1);
		maria.agregarAlGrupo(202041,imanati1);
		antonio.agregarAlGrupo(202041,imanati1);

		Alumno bless1 = new Alumno("Bless","Ciencias Biológicas y de la Salud",103,104);
		bless1.setCalificacion1(7.0);
		bless1.setCalificacion2(9.0);
		bless1.defineOpcion("Hoteleria");
		bless1.setCalificacionOpcionTecnica(7.0);
		alicia.agregarAlGrupo(202042,bless1);
		maria.agregarAlGrupo(202042,bless1);
		antonio.agregarAlGrupo(202042,bless1);

		Alumno gift1 = new Alumno("Gift","Ciencias Biológicas y de la Salud",103,104);
		gift1.setCalificacion1(9.5);
		gift1.setCalificacion2(8.5);
		gift1.defineOpcion("Hoteleria");
		gift1.setCalificacionOpcionTecnica(7.0);
		alicia.agregarAlGrupo(202043,gift1);
		maria.agregarAlGrupo(202043,gift1);
		antonio.agregarAlGrupo(202043,gift1);

		Alumno precious1 = new Alumno("Precious","Ciencias Biológicas y de la Salud",103,104);
		precious1.setCalificacion1(7.0);
		precious1.setCalificacion2(9.0);
		precious1.defineOpcion("Hoteleria");
		precious1.setCalificacionOpcionTecnica(7.0);
		alicia.agregarAlGrupo(202044,precious1);
		maria.agregarAlGrupo(202044,precious1);
		antonio.agregarAlGrupo(202044,precious1);

		Alumno mateusz1 = new Alumno("Mateusz","Ciencias Biológicas y de la Salud",103,104);
		mateusz1.setCalificacion1(9.5);
		mateusz1.setCalificacion2(9.0);
		mateusz1.defineOpcion("Hoteleria");
		mateusz1.setCalificacionOpcionTecnica(7.0);
		alicia.agregarAlGrupo(202045,mateusz1);
		maria.agregarAlGrupo(202045,mateusz1);
		antonio.agregarAlGrupo(202045,mateusz1);

		Alumno devi1 = new Alumno("Devi","Ciencias Biológicas y de la Salud",103,104);
		devi1.setCalificacion1(8.5);
		devi1.setCalificacion2(6.5);
		devi1.defineOpcion("Hoteleria");
		devi1.setCalificacionOpcionTecnica(7.0);
		alicia.agregarAlGrupo(202046,devi1);
		maria.agregarAlGrupo(202046,devi1);
		antonio.agregarAlGrupo(202046,devi1);

		System.out.println("--------------------- Agregando datos para probar funcionalidad ---------------------");

		Profesor jesus = new Profesor("Jesus",190972,"Fotografo", 203);

		Alumno adia5 = new Alumno("Adia","Ciencias Sociales",105,106);
		adia5.setCalificacion1(8.5);
		adia5.setCalificacion2(7.5);
		adia5.defineOpcion("Fotografo");
		adia5.setCalificacionOpcionTecnica(10.0);
		singh.agregarAlGrupo(202047,adia5);
		khan.agregarAlGrupo(202047,adia5);
		jesus.agregarAlGrupo(202047,adia5);

		Alumno arav5 = new Alumno("Arav","Ciencias Sociales",105,106);
		arav5.setCalificacion1(6.5);
		arav5.setCalificacion2(9.5);
		arav5.defineOpcion("Fotografo");
		arav5.setCalificacionOpcionTecnica(10.0);
		singh.agregarAlGrupo(202048,arav5);
		khan.agregarAlGrupo(202048,arav5);
		jesus.agregarAlGrupo(202048,arav5);

		Alumno karl5 = new Alumno("Karl","Ciencias Sociales",105,106);
		karl5.setCalificacion1(9.5);
		karl5.setCalificacion2(6.5);
		karl5.defineOpcion("Fotografo");
		karl5.setCalificacionOpcionTecnica(10.0);
		singh.agregarAlGrupo(202049,karl5);
		khan.agregarAlGrupo(202049,karl5);
		jesus.agregarAlGrupo(202049,karl5);

		Alumno francesco5 = new Alumno("Francesco","Ciencias Sociales",105,106);
		francesco5.setCalificacion1(7.0);
		francesco5.setCalificacion2(9.0);
		francesco5.defineOpcion("Fotografo");
		francesco5.setCalificacionOpcionTecnica(10.0);
		singh.agregarAlGrupo(202050,francesco5);
		khan.agregarAlGrupo(202050,francesco5);
		jesus.agregarAlGrupo(202050,francesco5);

		Alumno sofia5 = new Alumno("Sofia","Ciencias Sociales",105,106);
		sofia5.setCalificacion1(9.5);
		sofia5.setCalificacion2(8.5);
		sofia5.defineOpcion("Fotografo");
		sofia5.setCalificacionOpcionTecnica(10.0);
		singh.agregarAlGrupo(202051,sofia5);
		khan.agregarAlGrupo(202051,sofia5);
		jesus.agregarAlGrupo(202051,sofia5);

		Alumno alexandra5 = new Alumno("Alexandra","Ciencias Sociales",105,106);
		alexandra5.setCalificacion1(7.0);
		alexandra5.setCalificacion2(9.0);
		alexandra5.defineOpcion("Fotografo");
		alexandra5.setCalificacionOpcionTecnica(10.0);
		singh.agregarAlGrupo(202052,alexandra5);
		khan.agregarAlGrupo(202052,alexandra5);
		jesus.agregarAlGrupo(202052,alexandra5);

		Alumno juan5 = new Alumno("Juan","Ciencias Sociales",105,106);
		juan5.setCalificacion1(9.5);
		juan5.setCalificacion2(9.0);
		juan5.defineOpcion("Fotografo");
		juan5.setCalificacionOpcionTecnica(10.0);
		singh.agregarAlGrupo(202053,juan5);
		khan.agregarAlGrupo(202053,juan5);
		jesus.agregarAlGrupo(202053,juan5);

		Alumno jose5 = new Alumno("jose","Ciencias Sociales",105,106);
		jose5.setCalificacion1(8.5);
		jose5.setCalificacion2(6.5);
		jose5.defineOpcion("Fotografo");
		jose5.setCalificacionOpcionTecnica(10.0);
		singh.agregarAlGrupo(202054,jose5);
		khan.agregarAlGrupo(202054,jose5);
		jesus.agregarAlGrupo(202054,jose5);

		System.out.println("--------------------- Agregando datos para probar funcionalidad ---------------------");

		Profesor angel = new Profesor("Angel",109280,"Laboratorista", 204);
		Alumno adia2 = new Alumno("Adia","Humanidades y Artes",107,108);
		adia2.setCalificacion1(8.5);
		adia2.setCalificacion2(7.5);
		adia2.defineOpcion("Laboratorista");
		adia2.setCalificacionOpcionTecnica(9.0);
		francisco.agregarAlGrupo(202055,adia2);
		guadalupe.agregarAlGrupo(202055,adia2);
		angel.agregarAlGrupo(202055,adia2);


		Alumno arav2 = new Alumno("Arav","Humanidades y Artes",107,108);
		arav2.setCalificacion1(6.5);
		arav2.setCalificacion2(9.5);
		arav2.defineOpcion("Laboratorista");
		arav2.setCalificacionOpcionTecnica(9.0);
		francisco.agregarAlGrupo(202056,arav2);
		guadalupe.agregarAlGrupo(202056,arav2);
		angel.agregarAlGrupo(202056,arav2);

		Alumno karl2 = new Alumno("Karl","Humanidades y Artes",107,108);
		karl2.setCalificacion1(9.5);
		karl2.setCalificacion2(6.5);
		karl2.defineOpcion("Laboratorista");
		karl2.setCalificacionOpcionTecnica(9.0);
		francisco.agregarAlGrupo(202057,karl2);
		guadalupe.agregarAlGrupo(202057,karl2);
		angel.agregarAlGrupo(202057,karl2);

		Alumno francesco2 = new Alumno("Francesco","Humanidades y Artes",107,108);
		francesco2.setCalificacion1(7.0);
		francesco2.setCalificacion2(9.0);
		francesco2.defineOpcion("Laboratorista");
		francesco2.setCalificacionOpcionTecnica(9.0);
		francisco.agregarAlGrupo(202058,francesco2);
		guadalupe.agregarAlGrupo(202058,francesco2);
		angel.agregarAlGrupo(202058,francesco2);

		Alumno sofia2 = new Alumno("Sofia","Humanidades y Artes",107,108);
		sofia2.setCalificacion1(9.5);
		sofia2.setCalificacion2(8.5);
		sofia2.defineOpcion("Laboratorista");
		sofia2.setCalificacionOpcionTecnica(9.0);
		francisco.agregarAlGrupo(202059,sofia2);
		guadalupe.agregarAlGrupo(202059,sofia2);
		angel.agregarAlGrupo(202059,sofia2);

		Alumno alexandra2 = new Alumno("Alexandra","Humanidades y Artes",107,108);
		alexandra2.setCalificacion1(7.0);
		alexandra2.setCalificacion2(9.0);
		alexandra2.defineOpcion("Laboratorista");
		alexandra2.setCalificacionOpcionTecnica(9.0);
		guadalupe.agregarAlGrupo(202060,alexandra2);
		francisco.agregarAlGrupo(202060,alexandra2);
		angel.agregarAlGrupo(202060,alexandra2);

		Alumno juan2 = new Alumno("Juan","Humanidades y Artes",107,108);
		juan2.setCalificacion1(9.5);
		juan2.setCalificacion2(9.0);
		juan2.defineOpcion("Laboratorista");
		juan2.setCalificacionOpcionTecnica(9.0);
		francisco.agregarAlGrupo(202061,juan2);
		guadalupe.agregarAlGrupo(202061,juan2);
		angel.agregarAlGrupo(202061,juan2);

		Alumno jose6 = new Alumno("jose","Humanidades y Artes",107,108);
		jose6.setCalificacion1(8.5);
		jose6.setCalificacion2(6.5);
		jose6.defineOpcion("Laboratorista");
		jose6.setCalificacionOpcionTecnica(9.0);
		francisco.agregarAlGrupo(202062,jose6);
		guadalupe.agregarAlGrupo(202062,jose6);
		angel.agregarAlGrupo(202062,jose6);

		System.out.println("--------------------- Agregando datos para probar funcionalidad ---------------------");

		Profesor pedro = new Profesor("Pedro",143176,"Prensa", 205);

		Alumno emma3 = new Alumno("Emma","Fisico-Matematicas",101,102);

		emma3.setCalificacion1(8.5);
		emma3.setCalificacion2(7.5);
		emma3.defineOpcion("Prensa");
		emma3.setCalificacionOpcionTecnica(9.0);
		james.agregarAlGrupo(202063,emma3);
		miguel.agregarAlGrupo(202063,emma3);
		pedro.agregarAlGrupo(202063,emma3);

		Alumno alexander3 = new Alumno("Alexander","Fisico-Matematicas",101,102);
		alexander3.setCalificacion1(6.5);
		alexander3.setCalificacion2(9.5);
		alexander3.defineOpcion("Prensa");
		alexander3.setCalificacionOpcionTecnica(9.0);
		james.agregarAlGrupo(202064,alexander3);
		miguel.agregarAlGrupo(202064,alexander3);
		pedro.agregarAlGrupo(202064,alexander3);

		Alumno anastasia3 = new Alumno("Anastasia","Fisico-Matematicas",101,102);
		anastasia3.setCalificacion1(9.5);
		anastasia3.setCalificacion2(6.5);
		anastasia3.defineOpcion("Prensa");
		anastasia3.setCalificacionOpcionTecnica(9.0);
		james.agregarAlGrupo(202065,anastasia3);
		miguel.agregarAlGrupo(202065,anastasia3);
		pedro.agregarAlGrupo(202065,anastasia3);

		Alumno wei3 = new Alumno("Wei","Fisico-Matematicas",101,102);
		wei3.setCalificacion1(7.0);
		wei3.setCalificacion2(9.0);
		wei3.defineOpcion("Prensa");
		wei3.setCalificacionOpcionTecnica(9.0);
		james.agregarAlGrupo(202066,wei3);
		miguel.agregarAlGrupo(202066,wei3);
		pedro.agregarAlGrupo(202066,wei3);

		Alumno fang3 = new Alumno("Fang","Fisico-Matematicas",101,102);
		fang3.setCalificacion1(9.5);
		fang3.setCalificacion2(8.5);
		fang3.defineOpcion("Prensa");
		fang3.setCalificacionOpcionTecnica(9.0);
		james.agregarAlGrupo(202067,fang3);
		miguel.agregarAlGrupo(202067,fang3);
		pedro.agregarAlGrupo(202067,fang3);

		Alumno ben3 = new Alumno("Ben","Fisico-Matematicas",101,102);
		ben3.setCalificacion1(7.0);
		ben3.setCalificacion2(9.0);
		ben3.defineOpcion("Prensa");
		ben3.setCalificacionOpcionTecnica(9.0);
		james.agregarAlGrupo(202068,ben3);
		miguel.agregarAlGrupo(202068,ben3);
		pedro.agregarAlGrupo(202068,ben3);

		Alumno minato3 = new Alumno("Minato","Fisico-Matematicas",101,102);
		minato3.setCalificacion1(9.5);
		minato3.setCalificacion2(9.0);
		minato3.defineOpcion("Prensa");
		minato3.setCalificacionOpcionTecnica(9.0);
		james.agregarAlGrupo(202069,minato3);
		miguel.agregarAlGrupo(202069,minato3);
		pedro.agregarAlGrupo(202069,minato3);

		Alumno sakura3 = new Alumno("Sakura","Fisico-Matematicas",101,102);
		sakura3.setCalificacion1(8.5);
		sakura3.setCalificacion2(6.5);
		sakura3.defineOpcion("Prensa");
		sakura3.setCalificacionOpcionTecnica(9.0);
		james.agregarAlGrupo(202070,sakura3);
		miguel.agregarAlGrupo(202070,sakura3);
		pedro.agregarAlGrupo(202070,sakura3);

		System.out.println("--------------------- Agregando datos para probar funcionalidad ---------------------");

		Profesor alejandro = new Profesor("Alejandro",403795,"Nutriologo", 206);

		Alumno eduarda3 = new Alumno("Eduarda","Ciencias Biológicas y de la Salud",103,104);
		eduarda3.setCalificacion1(8.5);
		eduarda3.setCalificacion2(7.5);
		eduarda3.defineOpcion("Nutriologo");
		eduarda3.setCalificacionOpcionTecnica(7.0);
		alicia.agregarAlGrupo(202071,eduarda3);
		maria.agregarAlGrupo(202039,eduarda3);
		alejandro.agregarAlGrupo(202039,eduarda3);

		Alumno junior3 = new Alumno("Junior","Ciencias Biológicas y de la Salud",103,104);
		junior3.setCalificacion1(6.5);
		junior3.setCalificacion2(9.5);
		junior3.defineOpcion("Nutriologo");
		junior3.setCalificacionOpcionTecnica(7.0);
		alicia.agregarAlGrupo(202072,junior3);
		maria.agregarAlGrupo(202072,junior3);
		alejandro.agregarAlGrupo(202072,junior3);

		Alumno imanati3 = new Alumno("Imanati","Ciencias Biológicas y de la Salud",103,104);
		imanati3.setCalificacion1(9.5);
		imanati3.setCalificacion2(6.5);
		imanati3.defineOpcion("Nutriologo");
		imanati3.setCalificacionOpcionTecnica(7.0);
		alicia.agregarAlGrupo(202073,imanati3);
		maria.agregarAlGrupo(202073,imanati3);
		alejandro.agregarAlGrupo(202073,imanati3);

		Alumno bless3 = new Alumno("Bless","Ciencias Biológicas y de la Salud",103,104);
		bless3.setCalificacion1(7.0);
		bless3.setCalificacion2(9.0);
		bless3.defineOpcion("Nutriologo");
		bless3.setCalificacionOpcionTecnica(7.0);
		alicia.agregarAlGrupo(202074,bless3);
		maria.agregarAlGrupo(202074,bless3);
		alejandro.agregarAlGrupo(202074,bless3);

		Alumno gift3 = new Alumno("Gift","Ciencias Biológicas y de la Salud",103,104);
		gift3.setCalificacion1(9.5);
		gift3.setCalificacion2(8.5);
		gift3.defineOpcion("Nutriologo");
		gift3.setCalificacionOpcionTecnica(7.0);
		alicia.agregarAlGrupo(202075,gift3);
		maria.agregarAlGrupo(202075,gift3);
		alejandro.agregarAlGrupo(202075,gift3);

		Alumno precious3 = new Alumno("Precious","Ciencias Biológicas y de la Salud",103,104);
		precious3.setCalificacion1(7.0);
		precious3.setCalificacion2(9.0);
		precious3.defineOpcion("Nutriologo");
		precious3.setCalificacionOpcionTecnica(7.0);
		alicia.agregarAlGrupo(202076,precious3);
		maria.agregarAlGrupo(202076,precious3);
		alejandro.agregarAlGrupo(202076,precious3);

		Alumno mateusz3 = new Alumno("Mateusz","Ciencias Biológicas y de la Salud",103,104);
		mateusz3.setCalificacion1(9.5);
		mateusz3.setCalificacion2(9.0);
		mateusz3.defineOpcion("Nutriologo");
		mateusz3.setCalificacionOpcionTecnica(7.0);
		alicia.agregarAlGrupo(202077,mateusz3);
		maria.agregarAlGrupo(202077,mateusz3);
		alejandro.agregarAlGrupo(202077,mateusz3);

		Alumno devi3 = new Alumno("Devi","Ciencias Biológicas y de la Salud",103,104);
		devi3.setCalificacion1(8.5);
		devi3.setCalificacion2(6.5);
		devi3.defineOpcion("Nutriologo");
		devi3.setCalificacionOpcionTecnica(7.0);
		alicia.agregarAlGrupo(202078,devi3);
		maria.agregarAlGrupo(202078,devi3);
		alejandro.agregarAlGrupo(202078,devi3);

		System.out.println("--------------------- Agregando datos para probar funcionalidad ---------------------");

		Profesor manuel = new Profesor("Manuel",52134,"Laboratorista Quimico", 207);

		Alumno adia4 = new Alumno("Adia","Ciencias Sociales",105,106);
		adia4.setCalificacion1(8.5);
		adia4.setCalificacion2(7.5);
		adia4.defineOpcion("Laboratorista Quimico");
		adia4.setCalificacionOpcionTecnica(7.0);
		singh.agregarAlGrupo(202079,adia4);
		khan.agregarAlGrupo(202079,adia4);
		manuel.agregarAlGrupo(202079,adia4);

		Alumno arav4 = new Alumno("Arav","Ciencias Sociales",105,106);
		arav4.setCalificacion1(6.5);
		arav4.setCalificacion2(9.5);
		arav4.defineOpcion("Laboratorista Quimico");
		arav4.setCalificacionOpcionTecnica(7.0);
		singh.agregarAlGrupo(202080,arav4);
		khan.agregarAlGrupo(202080,arav4);
		manuel.agregarAlGrupo(202080,arav4);

		Alumno karl4 = new Alumno("Karl","Ciencias Sociales",105,106);
		karl4.setCalificacion1(9.5);
		karl4.setCalificacion2(6.5);
		karl4.defineOpcion("Laboratorista Quimico");
		karl4.setCalificacionOpcionTecnica(7.0);
		singh.agregarAlGrupo(202081,karl4);
		khan.agregarAlGrupo(202081,karl4);
		manuel.agregarAlGrupo(202081,karl4);

		Alumno francesco4 = new Alumno("Francesco","Ciencias Sociales",105,106);
		francesco4.setCalificacion1(7.0);
		francesco4.setCalificacion2(9.0);
		francesco4.defineOpcion("Laboratorista Quimico");
		francesco4.setCalificacionOpcionTecnica(7.0);
		singh.agregarAlGrupo(202082,francesco4);
		khan.agregarAlGrupo(202082,francesco4);
		manuel.agregarAlGrupo(202082,francesco4);

		Alumno sofia4 = new Alumno("Sofia","Ciencias Sociales",105,106);
		sofia4.setCalificacion1(9.5);
		sofia4.setCalificacion2(8.5);
		sofia4.defineOpcion("Laboratorista Quimico");
		sofia4.setCalificacionOpcionTecnica(7.0);
		singh.agregarAlGrupo(202083,sofia4);
		khan.agregarAlGrupo(202083,sofia4);
		manuel.agregarAlGrupo(202083,sofia4);

		Alumno alexandra4 = new Alumno("Alexandra","Ciencias Sociales",105,106);
		alexandra4.setCalificacion1(7.0);
		alexandra4.setCalificacion2(9.0);
		alexandra4.defineOpcion("Laboratorista Quimico");
		alexandra4.setCalificacionOpcionTecnica(7.0);
		singh.agregarAlGrupo(202084,alexandra4);
		khan.agregarAlGrupo(202084,alexandra4);
		manuel.agregarAlGrupo(202084,alexandra4);

		Alumno juan4 = new Alumno("Juan","Ciencias Sociales",105,106);
		juan4.setCalificacion1(9.5);
		juan4.setCalificacion2(9.0);
		juan4.defineOpcion("Laboratorista Quimico");
		juan4.setCalificacionOpcionTecnica(7.0);
		singh.agregarAlGrupo(202085,juan4);
		khan.agregarAlGrupo(202085,juan4);
		manuel.agregarAlGrupo(202085,juan4);

		Alumno jose4 = new Alumno("jose","Ciencias Sociales",105,106);
		jose4.setCalificacion1(8.5);
		jose4.setCalificacion2(6.5);
		jose4.defineOpcion("Laboratorista Quimico");
		jose4.setCalificacionOpcionTecnica(7.0);
		singh.agregarAlGrupo(202086,jose4);
		khan.agregarAlGrupo(202086,jose4);
		manuel.agregarAlGrupo(202086,jose4);

		administrador.agregarProfesor(james);
		administrador.agregarProfesor(miguel);
		administrador.agregarProfesor(alicia);
		administrador.agregarProfesor(maria);
		administrador.agregarProfesor(singh);
		administrador.agregarProfesor(khan);
		administrador.agregarProfesor(francisco);
		administrador.agregarProfesor(guadalupe);
		administrador.agregarProfesor(juana);
		administrador.agregarProfesor(antonio);
		administrador.agregarProfesor(jesus);
		administrador.agregarProfesor(angel);
		administrador.agregarProfesor(pedro);
		administrador.agregarProfesor(alejandro);
		administrador.agregarProfesor(manuel);
		System.out.println("--------------------- Agregando datos para probar funcionalidad ---------------------");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("--------------------- Agregando datos para probar funcionalidad ---------------------");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("--------------------- Agregando datos para probar funcionalidad ---------------------");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("--------------------- Agregando datos ......................... ---------------------");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("--------------------- Datos cargados correctamente, iniciando...---------------------");
	}
}