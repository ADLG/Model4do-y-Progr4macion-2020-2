/**
 * Clase de la Maquina Wonka3000.
 */
public class Wonka3000
{
	/* Ingrediente 1 de los Dulces. */
	int ingrediente1;
	/* Ingrediente 2 de los Dulces. */
	int ingrediente2;
	/* Ingrediente 3 de los Dulces. */
	int ingrediente3;
	/* Ingrediente 4 de los Dulces. */
	int ingrediente4;

	/* Referencia de Chocolate 1 para crear los Chocolates. */
	Chocolate chocolate1;
	/* Referencia de Chocolate 2 para crear los Chocolates. */
	Chocolate chocolate2;
	/* Referencia de Chocolate 3 para crear los Chocolates. */
	Chocolate chocolate3;
	/* Referencia de Chocolate 4 para crear los Chocolates. */
	Chocolate chocolate4;
	/* Referencia de Chocolate 5 para crear los Chocolates. */
	Chocolate chocolate5;
	/* Referencia de Chocolate 6 para crear los Chocolates. */
	Chocolate chocolate6;
	/* Referencia de Chocolate 7 para crear los Chocolates. */
	Chocolate chocolate7;

	/* Referencia de Gomita 1 para crear las Gomitas. */
	Gomitas gomita1;
	/* Referencia de Gomita 2 para crear las Gomitas. */
	Gomitas gomita2;
	/* Referencia de Gomita 3 para crear las Gomitas. */
	Gomitas gomita3;
	/* Referencia de Gomita 4 para crear las Gomitas. */
	Gomitas gomita4;
	/* Referencia de Gomita 5 para crear las Gomitas. */
	Gomitas gomita5;
	/* Referencia de Gomita 6 para crear las Gomitas. */
	Gomitas gomita6;
	/* Referencia de Gomita 7 para crear las Gomitas. */
	Gomitas gomita7;

	/* Entero auxiliar para imprimir ingredientes. */
	int auxlotegomita;


	/* Dulce 1 creado. */
	Dulce dulce1 = new Dulce();
	/* Dulce 2 creado. */
	Dulce dulce2 = new Dulce();
	/* Dulce 3 creado. */
	Dulce dulce3 = new Dulce();
	/* Dulce 4 creado. */
	Dulce dulce4 = new Dulce();
	/* Dulce 5 creado. */
	Dulce dulce5 = new Dulce();
	/* Dulce 6 creado. */
	Dulce dulce6 = new Dulce();
	/* Dulce 7 creado. */
	Dulce dulce7 = new Dulce();

	/* Lote creado. */
	Lote lote;

	/* Informacion del lote creado. */
	String infolote;

	/* Variable entera para identificar un lote. */
	int tipolote=0;

	/**
	 * Regresa el Lote.
     * @return el Lote.
     */
	public Lote getLote()
	{
		return lote;
	}

	/**
	 * Regresa el Dulce 1.
     * @return el Dulce 1.
     */
	public Dulce getDulce1()
	{
		return dulce1;
	}

	/**
	 * Regresa el Dulce 2.
     * @return el Dulce 2.
     */
	public Dulce getDulce2()
	{
		return dulce2;
	}

	/**
	 * Regresa el Dulce 3.
     * @return el Dulce 3.
     */
	public Dulce getDulce3()
	{
		return dulce3;
	}

	/**
	 * Regresa el Dulce 4.
     * @return el Dulce 4.
     */
	public Dulce getDulce4()
	{
		return dulce4;
	}

	/**
	 * Regresa el Dulce 5.
     * @return el Dulce 5.
     */
	public Dulce getDulce5()
	{
		return dulce5;
	}

	/**
	 * Regresa el Dulce 6.
     * @return el Dulce 6.
     */
	public Dulce getDulce6()
	{
		return dulce6;
	}

	/**
	 * Regresa el Dulce 7.
     * @return el Dulce 7.
     */
	public Dulce getDulce7()
	{
		return dulce7;
	}

	/**
     * Metodo que hace las Operaciones necesarias para crear Chocolates de Almendras.
     * @param i entero que ayuda a saber que mezcla se imprimira.
     */
	public void crearChocolatesAlmendra(int i)
	{
		tipolote=11;
		System.out.println("---Inicio de la creacion de los Chocolates de Almendras");
		recetaChocoAlmendras();
		System.out.println("\n[Chocolate de Almendras 1]");
		chocolate1 = new Almendras();
		chocolate1.establecerUnidades4(ingrediente1,ingrediente2,ingrediente3,ingrediente4);
		chocolate1.prepararDulce(i,1);
		dulce1.crearDulceChocolate(chocolate1);
		dulce1.mostrarInfoChocolate();
		System.out.println("\n[Chocolate de Almendras 2]");
		chocolate2 = new Almendras();
		chocolate2.establecerUnidades4(ingrediente1,ingrediente2,ingrediente3,ingrediente4);
		chocolate2.prepararDulce(i,1);
		dulce2.crearDulceChocolate(chocolate2);
		dulce2.mostrarInfoChocolate();
		System.out.println("\n[Chocolate de Almendras 3]");
		chocolate3 = new Almendras();
		chocolate3.establecerUnidades4(ingrediente1,ingrediente2,ingrediente3,ingrediente4);
		chocolate3.prepararDulce(i,1);
		dulce3.crearDulceChocolate(chocolate3);
		dulce3.mostrarInfoChocolate();
		System.out.println("\n[Chocolate de Almendras 4]");
		chocolate4 = new Almendras();
		chocolate4.establecerUnidades4(ingrediente1,ingrediente2,ingrediente3,ingrediente4);
		chocolate4.prepararDulce(i,1);
		dulce4.crearDulceChocolate(chocolate4);
		dulce4.mostrarInfoChocolate();
		System.out.println("\n[Chocolate de Almendras 5]");
		chocolate5 = new Almendras();
		chocolate5.establecerUnidades4(ingrediente1,ingrediente2,ingrediente3,ingrediente4);
		chocolate5.prepararDulce(i,1);
		dulce5.crearDulceChocolate(chocolate5);
		dulce5.mostrarInfoChocolate();
		System.out.println("\n[Chocolate de Almendras 6]");
		chocolate6 = new Almendras();
		chocolate6.establecerUnidades4(ingrediente1,ingrediente2,ingrediente3,ingrediente4);
		chocolate6.prepararDulce(i,1);
		dulce6.crearDulceChocolate(chocolate6);
		dulce6.mostrarInfoChocolate();
		System.out.println("\n[Chocolate de Almendras 7]");
		chocolate7 = new Almendras();
		chocolate7.establecerUnidades4(ingrediente1,ingrediente2,ingrediente3,ingrediente4);
		chocolate7.prepararDulce(i,1);
		dulce7.crearDulceChocolate(chocolate7);
		dulce7.mostrarInfoChocolate();
		System.out.println("---Fin de la creacion de los Chocolates de Almendras");
	}

	/**
     * Metodo que hace las Operaciones necesarias para crear Chocolates Oscuros.
     * @param i entero que ayuda a saber que mezcla se imprimira.
     */
	public void crearChocolatesOscuro(int i)
	{
		tipolote=12;
		System.out.println("---Inicio de la creacion de los Chocolates Oscuros");
		recetaChocoOscuro();
		System.out.println("\n[Chocolate Oscuro 1]");
		chocolate1 = new Oscuro();
		chocolate1.establecerUnidades3(ingrediente1,ingrediente2,ingrediente3);
		chocolate1.prepararDulce(i,0);
		dulce1.crearDulceChocolate(chocolate1);
		dulce1.mostrarInfoChocolate();
		System.out.println("\n[Chocolate Oscuro 2]");
		chocolate2 = new Oscuro();
		chocolate2.establecerUnidades3(ingrediente1,ingrediente2,ingrediente3);
		chocolate2.prepararDulce(i,0);
		dulce2.crearDulceChocolate(chocolate2);
		dulce2.mostrarInfoChocolate();
		System.out.println("\n[Chocolate Oscuro 3]");
		chocolate3 = new Oscuro();
		chocolate3.establecerUnidades3(ingrediente1,ingrediente2,ingrediente3);
		chocolate3.prepararDulce(i,0);
		dulce3.crearDulceChocolate(chocolate3);
		dulce3.mostrarInfoChocolate();
		System.out.println("\n[Chocolate Oscuro 4]");
		chocolate4 = new Oscuro();
		chocolate4.establecerUnidades3(ingrediente1,ingrediente2,ingrediente3);
		chocolate4.prepararDulce(i,0);
		dulce4.crearDulceChocolate(chocolate4);
		dulce4.mostrarInfoChocolate();
		System.out.println("\n[Chocolate Oscuro 5]");
		chocolate5 = new Oscuro();
		chocolate5.establecerUnidades3(ingrediente1,ingrediente2,ingrediente3);
		chocolate5.prepararDulce(i,0);
		dulce5.crearDulceChocolate(chocolate5);
		dulce5.mostrarInfoChocolate();
		System.out.println("\n[Chocolate Oscuro 6]");
		chocolate6 = new Oscuro();
		chocolate6.establecerUnidades3(ingrediente1,ingrediente2,ingrediente3);
		chocolate6.prepararDulce(i,0);
		dulce6.crearDulceChocolate(chocolate6);
		dulce6.mostrarInfoChocolate();
		System.out.println("\n[Chocolate Oscuro 7]");
		chocolate7 = new Oscuro();
		chocolate7.establecerUnidades3(ingrediente1,ingrediente2,ingrediente3);
		chocolate7.prepararDulce(i,0);
		dulce7.crearDulceChocolate(chocolate7);
		dulce7.mostrarInfoChocolate();
		System.out.println("---Fin de la creacion de los Chocolates Oscuros");
	}

	/**
     * Metodo que hace las Operaciones necesarias para crear Chocolates con Leche.
     * @param i entero que ayuda a saber que mezcla se imprimira.
     */
	public void crearChocolatesLeche(int i)
	{
		tipolote=13;
		System.out.println("---Inicio de la creacion de los Chocolates con Leche");
		recetaChocoLeche();
		System.out.println("\n[Chocolate con Leche 2]");
		chocolate1 = new Leche();
		chocolate1.establecerUnidades3(ingrediente1,ingrediente2,ingrediente3);
		chocolate1.prepararDulce(i,0);
		dulce1.crearDulceChocolate(chocolate1);
		dulce1.mostrarInfoChocolate();
		System.out.println("\n[Chocolate con Leche 2]");
		chocolate2 = new Leche();
		chocolate2.establecerUnidades3(ingrediente1,ingrediente2,ingrediente3);
		chocolate2.prepararDulce(i,0);
		dulce2.crearDulceChocolate(chocolate2);
		dulce2.mostrarInfoChocolate();
		System.out.println("\n[Chocolate con Leche 3]");
		chocolate3 = new Leche();
		chocolate3.establecerUnidades3(ingrediente1,ingrediente2,ingrediente3);
		chocolate3.prepararDulce(i,0);
		dulce3.crearDulceChocolate(chocolate3);
		dulce3.mostrarInfoChocolate();
		System.out.println("\n[Chocolate con Leche 4]");
		chocolate4 = new Leche();
		chocolate4.establecerUnidades3(ingrediente1,ingrediente2,ingrediente3);
		chocolate4.prepararDulce(i,0);
		dulce4.crearDulceChocolate(chocolate4);
		dulce4.mostrarInfoChocolate();
		System.out.println("\n[Chocolate con Leche 5]");
		chocolate5 = new Leche();
		chocolate5.establecerUnidades3(ingrediente1,ingrediente2,ingrediente3);
		chocolate5.prepararDulce(i,0);
		dulce5.crearDulceChocolate(chocolate5);
		dulce5.mostrarInfoChocolate();
		System.out.println("\n[Chocolate con Leche 6]");
		chocolate6 = new Leche();
		chocolate6.establecerUnidades3(ingrediente1,ingrediente2,ingrediente3);
		chocolate6.prepararDulce(i,0);
		dulce6.crearDulceChocolate(chocolate6);
		dulce6.mostrarInfoChocolate();
		System.out.println("\n[Chocolate con Leche 7]");
		chocolate7 = new Leche();
		chocolate7.establecerUnidades3(ingrediente1,ingrediente2,ingrediente3);
		chocolate7.prepararDulce(i,0);
		dulce7.crearDulceChocolate(chocolate7);
		dulce7.mostrarInfoChocolate();
		System.out.println("---Fin de la creacion de los Chocolates con Leche");
	}

	/**
     * Metodo que hace las Operaciones necesarias para crear Gomitas de Osos Dulces.
     * @param i entero que ayuda a saber que mezcla se imprimira.
     * @param j entero que ayuda a saber que ingredientes se usaran.
     */
	public void crearGomitaOsosDulces(int i, int j)
	{
		tipolote=21;
		auxlotegomita=j;
		System.out.println("\n---Inicio de la creacion de las Gomitas de Osos Dulces");
		recetaGomitasOsosDulces();
		System.out.println("\n[Gomitas Osos Dulces 1]");
		gomita1 = new OsitosDulces();
		gomita1.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita1.prepararDulce(i,i);
		dulce1.crearDulceGomita(gomita1);
		dulce1.mostrarInfoGomita(j);
		System.out.println("\n[Gomitas Osos Dulces 2]");
		gomita2 = new OsitosDulces();
		gomita2.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita2.prepararDulce(i,i);
		dulce2.crearDulceGomita(gomita2);
		dulce2.mostrarInfoGomita(j);
		System.out.println("\n[Gomitas Osos Dulces 3]");
		gomita3 = new OsitosDulces();
		gomita3.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita3.prepararDulce(i,i);
		dulce3.crearDulceGomita(gomita3);
		dulce3.mostrarInfoGomita(j);
		System.out.println("\n[Gomitas Osos Dulces 4]");
		gomita4 = new OsitosDulces();
		gomita4.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita4.prepararDulce(i,i);
		dulce4.crearDulceGomita(gomita4);
		dulce4.mostrarInfoGomita(j);
		System.out.println("\n[Gomitas Osos Dulces 5]");
		gomita5 = new OsitosDulces();
		gomita5.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita5.prepararDulce(i,i);
		dulce5.crearDulceGomita(gomita5);
		dulce5.mostrarInfoGomita(j);
		System.out.println("\n[Gomitas Osos Dulces 6]");
		gomita6 = new OsitosDulces();
		gomita6.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita6.prepararDulce(i,i);
		dulce6.crearDulceGomita(gomita6);
		dulce6.mostrarInfoGomita(j);
		System.out.println("\n[Gomitas Osos Dulces 7]");
		gomita7 = new OsitosDulces();
		gomita7.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita7.prepararDulce(i,i);
		dulce7.crearDulceGomita(gomita7);
		dulce7.mostrarInfoGomita(j);

		System.out.println("---Fin de la creacion de las Gomitas de Osos Dulces");
	}

	/**
     * Metodo que hace las Operaciones necesarias para crear Gomitas de Gusanos Acidos.
     * @param i entero que ayuda a saber que mezcla se imprimira.
     * @param j entero que ayuda a saber que ingredientes se usaran.
     */
	public void crearGomitaGusanosAcidos(int i, int j)
	{
		tipolote=22;
		auxlotegomita=j;
		System.out.println("\n---Inicio de la creacion de las Gomitas de Gusanos Acidos");
		recetaGomitasGusanosAcidos();
		System.out.println("\n[Gomitas Gusanos Acidos 1]");
		gomita1 = new GusanosAcidos();
		gomita1.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita1.prepararDulce(i,i);
		dulce1.crearDulceGomita(gomita1);
		dulce1.mostrarInfoGomita(j);
		System.out.println("\n[Gomitas Gusanos Acidos 2]");
		gomita2 = new GusanosAcidos();
		gomita2.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita2.prepararDulce(i,i);
		dulce2.crearDulceGomita(gomita2);
		dulce2.mostrarInfoGomita(j);
		System.out.println("\n[Gomitas Gusanos Acidos 3]");
		gomita3 = new GusanosAcidos();
		gomita3.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita3.prepararDulce(i,i);
		dulce3.crearDulceGomita(gomita3);
		dulce3.mostrarInfoGomita(j);
		System.out.println("\n[Gomitas Gusanos Acidos 4]");
		gomita4 = new GusanosAcidos();
		gomita4.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita4.prepararDulce(i,i);
		dulce4.crearDulceGomita(gomita4);
		dulce4.mostrarInfoGomita(j);
		System.out.println("\n[Gomitas Gusanos Acidos 5]");
		gomita5 = new GusanosAcidos();
		gomita5.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita5.prepararDulce(i,i);
		dulce1.crearDulceGomita(gomita5);
		dulce1.mostrarInfoGomita(j);
		System.out.println("\n[Gomitas Gusanos Acidos 6]");
		gomita6 = new GusanosAcidos();
		gomita6.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita6.prepararDulce(i,i);
		dulce6.crearDulceGomita(gomita6);
		dulce6.mostrarInfoGomita(j);
		System.out.println("\n[Gomitas Gusanos Acidos 7]");
		gomita6 = new GusanosAcidos();
		gomita6.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita6.prepararDulce(i,i);
		dulce6.crearDulceGomita(gomita6);
		dulce6.mostrarInfoGomita(j);

		System.out.println("---Fin de la creacion de las Gomitas de Gusanos Acidos");
	}

	/**
     * Metodo que hace las Operaciones necesarias para crear Gomitas de Frutas con Chamoy.
     * @param i entero que ayuda a saber que mezcla se imprimira.
     * @param j entero que ayuda a saber que ingredientes se usaran.
     */
	public void crearGomitaFrutasChamoy(int i, int j)
	{
		tipolote=23;
		auxlotegomita=j;
		System.out.println("\n---Inicio de la creacion de las Gomitas de Frutas Con Chamoy");
		recetaGomitasFrutasChamoy();
		System.out.println("\n[Gomitas Frutas con Chamoy 1]");
		gomita1 = new FrutasConChamoy();
		gomita1.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita1.prepararDulce(i,i);
		dulce1.crearDulceGomita(gomita1);
		dulce1.mostrarInfoGomita(j);
		System.out.println("\n[Gomitas Frutas con Chamoy 2]");
		gomita2 = new FrutasConChamoy();
		gomita2.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita2.prepararDulce(i,i);
		dulce2.crearDulceGomita(gomita2);
		dulce2.mostrarInfoGomita(j);
		System.out.println("\n[Gomitas Frutas con Chamoy 3]");
		gomita3 = new FrutasConChamoy();
		gomita3.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita3.prepararDulce(i,i);
		dulce3.crearDulceGomita(gomita3);
		dulce3.mostrarInfoGomita(j);
		System.out.println("\n[Gomitas Frutas con Chamoy 4]");
		gomita4 = new FrutasConChamoy();
		gomita4.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita4.prepararDulce(i,i);
		dulce4.crearDulceGomita(gomita4);
		dulce4.mostrarInfoGomita(j);
		System.out.println("\n[Gomitas Frutas con Chamoy 5]");
		gomita5 = new FrutasConChamoy();
		gomita5.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita5.prepararDulce(i,i);
		dulce1.crearDulceGomita(gomita5);
		dulce1.mostrarInfoGomita(j);
		System.out.println("\n[Gomitas Frutas con Chamoy 6]");
		gomita6 = new FrutasConChamoy();
		gomita6.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita6.prepararDulce(i,i);
		dulce6.crearDulceGomita(gomita6);
		dulce6.mostrarInfoGomita(j);
		System.out.println("\n[Gomitas Frutas con Chamoy 7]");
		gomita7 = new FrutasConChamoy();
		gomita7.establecerUnidadesG(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		gomita7.prepararDulce(i,i);
		dulce7.crearDulceGomita(gomita7);
		dulce7.mostrarInfoGomita(j);

		System.out.println("---Fin de la creacion de las Gomitas de Frutas Con Chamoy");
	}

	/**
     * Establece los ingredientes necesarios para crear Chocolates con Almendras.
     */
	public void recetaChocoAlmendras()
	{
		ingrediente1 = 200;
		ingrediente2 = 100;
		ingrediente3 = 200;
		ingrediente4 = 10;
	}

	/**
     * Establece los ingredientes necesarios para crear Chocolates Oscuros.
     */
	public void recetaChocoOscuro()
	{
		ingrediente1 = 100;
		ingrediente2 = 400;
		ingrediente3 = 300;
	}

	/**
     * Establece los ingredientes necesarios para crear Chocolates con Leche.
     */
	public void recetaChocoLeche()
	{
		ingrediente1 = 400;
		ingrediente2 = 100;
		ingrediente3 = 200;
	}

	/**
     * Establece los ingredientes necesarios para crear Gomitas de Ositos Dulces.
     */
	public void recetaGomitasOsosDulces()
	{
		ingrediente1 = 30;
		ingrediente2 = 50;
		ingrediente3 = 200;
		ingrediente4 = 200;
	}

	/**
     * Establece los ingredientes necesarios para crear Gomitas de Gusanos Acidos.
     */
	public void recetaGomitasGusanosAcidos()
	{
		ingrediente1 = 20;
		ingrediente2 = 50;
		ingrediente3 = 100;
		ingrediente4 = 100;
	}

	/**
     * Establece los ingredientes necesarios para crear Gomitas de Frutas con Chamoy.
     */
	public void recetaGomitasFrutasChamoy()
	{
		ingrediente1 = 30;
		ingrediente2 = 100;
		ingrediente3 = 50;
		ingrediente4 = 200;
	}

	/**
     * Metodo que se encarga de hacer los Lotes con los dulces creados.
     * @param dulce1 dulce que sera empaquetado en Lotes;
     * @param dulce2 dulce que sera empaquetado en Lotes;
     * @param dulce3 dulce que sera empaquetado en Lotes;
     * @param dulce4 dulce que sera empaquetado en Lotes;
     * @param dulce5 dulce que sera empaquetado en Lotes;
     * @param dulce6 dulce que sera empaquetado en Lotes;
     * @param dulce7 dulce que sera empaquetado en Lotes;
     */	
	public void crearLoteCho(Dulce dulce1, Dulce dulce2, Dulce dulce3, Dulce dulce4, Dulce dulce5, Dulce dulce6, Dulce dulce7)
	{
		System.out.println("\n***Se Creara un Lote de Chocolates...	 Listo.\n");
		infolote = "7 bolsas de Chocolates\nInformacion de bolsa individual:\n"+dulce1.getMolde()+"\n"+dulce1.getIngredienteEx()+"\n"+dulce1.getIngrediente1()+"ml de Leche\n"+dulce1.getIngrediente2()+"gr de Cacao\n"+dulce1.getIngrediente3()+"gr de Manteca de Cacao\n"+dulce1.getIngrediente4()+"pz de Almendras\n";
		lote = new Lote(dulce1,dulce2,dulce3,dulce4,dulce5,dulce6,dulce7,infolote);
		lote.info();
		lote.tipoLote(tipolote);
	}

	/**
     * Metodo que se encarga de hacer los Lotes con los dulces creados.
     * @param dulce1 dulce que sera empaquetado en Lotes;
     * @param dulce2 dulce que sera empaquetado en Lotes;
     * @param dulce3 dulce que sera empaquetado en Lotes;
     * @param dulce4 dulce que sera empaquetado en Lotes;
     * @param dulce5 dulce que sera empaquetado en Lotes;
     * @param dulce6 dulce que sera empaquetado en Lotes;
     * @param dulce7 dulce que sera empaquetado en Lotes;
     */	
	public void crearLoteGom(Dulce dulce1, Dulce dulce2, Dulce dulce3, Dulce dulce4, Dulce dulce5, Dulce dulce6, Dulce dulce7)
	{
		System.out.println("\nSe Creara un Lote de Gomitas...	 Listo.\n");
		infolote = "7 bolsas de Gomitas\nInformacion de bolsa individual:\n"+dulce1.getMolde()+"\n"+dulce1.getIngredienteEx()+"\n"+dulce1.getIngrediente1()+"gr de Grenetina\n"+dulce1.getIngrediente2()+"ml de Agua\n"+dulce1.getIngrediente3()+"ml de Miel de Maiz\n";
		
		if (auxlotegomita == 1)
			infolote += +dulce1.getIngrediente4()+"gr de Azucar";
		else if (auxlotegomita == 2)
			infolote += +dulce1.getIngrediente5()+"gr de Saborizante Acido";
		else
			infolote += +dulce1.getIngrediente6()+"ml de Chamoy";

		lote = new Lote(dulce1,dulce2,dulce3,dulce4,dulce5,dulce6,dulce7,infolote);
		lote.info();
		lote.tipoLote(tipolote);
	}
}