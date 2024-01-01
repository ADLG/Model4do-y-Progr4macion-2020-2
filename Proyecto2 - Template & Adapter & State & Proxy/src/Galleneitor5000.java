/**
 * Clase de la Maquina Galleneitor5000.
 */
public class Galleneitor5000
{
	/* Ingrediente 1 de los Dulces. */
	int ingrediente1;
	/* Ingrediente 2 de los Dulces. */
	int ingrediente2;
	/* Ingrediente 3 de los Dulces. */
	int ingrediente3;
	/* Ingrediente 4 de los Dulces. */
	int ingrediente4;


	/* Referencia de Galleta 1 para crear las Galletas. */
	Galleta galleta1;
	/* Referencia de Galleta 2 para crear las Galletas. */
	Galleta galleta2;
	/* Referencia de Galleta 3 para crear las Galletas. */
	Galleta galleta3;
	/* Referencia de Galleta 4 para crear las Galletas. */
	Galleta galleta4;
	/* Referencia de Galleta 5 para crear las Galletas. */
	Galleta galleta5;
	/* Referencia de Galleta 6 para crear las Galletas. */
	Galleta galleta6;
	/* Referencia de Galleta 7 para crear las Galletas. */
	Galleta galleta7;

	/* Entero auxiliar para imprimir ingredientes. */
	int auxlotegalleta=0;


	/* Dulce 1 Creado. */
	Dulce dulce1 = new Dulce();
	/* Dulce 2 Creado. */
	Dulce dulce2 = new Dulce();
	/* Dulce 3 Creado. */
	Dulce dulce3 = new Dulce();
	/* Dulce 4 Creado. */
	Dulce dulce4 = new Dulce();
	/* Dulce 5 Creado. */
	Dulce dulce5 = new Dulce();
	/* Dulce 6 Creado. */
	Dulce dulce6 = new Dulce();
	/* Dulce 7 Creado. */
	Dulce dulce7 = new Dulce();

	/* Lote creado. */
	Lote lote;
	/* Informacion del lote creado. */
	String infolote;
	/* Variable entera para identificar un lote. */
	int tipolote=0;


	/* Regresa un lote. */
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
     * Metodo que hace las Operaciones necesarias para crear Galletas Saladas.
     * @param i entero que ayuda a saber que mezcla e informacion se imprimira.
     */
	public void crearGalletaSaladas(int i)
	{
		tipolote=31;
		auxlotegalleta=i;
		System.out.println("---Inicio de la creacion de Galletas Salada");
		recetaGalletaSalada();
		System.out.println("\n[Galletas Saladas 1]");
		galleta1 = new GalletaSaladas();
		GalletaAdapter galleta1A = new GalletaAdapter(galleta1);
		galleta1A.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta1A.prepararDulce(i,i);
		dulce1.crearDulceGalleta(galleta1A,i);
		dulce1.mostrarInfoGalleta(i);
		System.out.println("\n[Galletas Saladas 2]");
		galleta2 = new GalletaSaladas();
		GalletaAdapter galleta2A = new GalletaAdapter(galleta2);
		galleta2A.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta2A.prepararDulce(i,i);
		dulce2.crearDulceGalleta(galleta2A,i);
		dulce2.mostrarInfoGalleta(i);
		System.out.println("\n[Galletas Saladas 3]");
		galleta3 = new GalletaSaladas();
		GalletaAdapter galleta3A = new GalletaAdapter(galleta3);
		galleta3A.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta3A.prepararDulce(i,i);
		dulce3.crearDulceGalleta(galleta3A,i);
		dulce3.mostrarInfoGalleta(i);
		System.out.println("\n[Galletas Saladas 4]");
		galleta4 = new GalletaSaladas();
		GalletaAdapter galleta4A = new GalletaAdapter(galleta4);
		galleta4A.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta4A.prepararDulce(i,i);
		dulce4.crearDulceGalleta(galleta4A,i);
		dulce4.mostrarInfoGalleta(i);
		System.out.println("\n[Galletas Saladas 5]");
		galleta5 = new GalletaSaladas();
		GalletaAdapter galleta5A = new GalletaAdapter(galleta5);
		galleta5A.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta5A.prepararDulce(i,i);
		dulce5.crearDulceGalleta(galleta5A,i);
		dulce5.mostrarInfoGalleta(i);
		System.out.println("\n[Galletas Saladas 6]");
		galleta6 = new GalletaSaladas();
		GalletaAdapter galleta6A = new GalletaAdapter(galleta6);
		galleta6A.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta6A.prepararDulce(i,i);
		dulce6.crearDulceGalleta(galleta6A,i);
		dulce6.mostrarInfoGalleta(i);
		System.out.println("\n[Galletas Saladas 7]");
		galleta7 = new GalletaSaladas();
		GalletaAdapter galleta7A = new GalletaAdapter(galleta7);
		galleta7A.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta7A.prepararDulce(i,i);
		dulce7.crearDulceGalleta(galleta7A,i);
		dulce7.mostrarInfoGalleta(i);

		System.out.println("---Fin de la creacion de Galletas Salada");
	}

	/**
     * Metodo que hace las Operaciones necesarias para crear Galletas Con Chispas.
     * @param i entero que ayuda a saber que mezcla e informacion se imprimira.
     */
	public void crearGalletaChispas(int i)
	{
		tipolote=32;
		auxlotegalleta=i;
		System.out.println("---Inicio de la creacion de Galletas Con Chispas");
		recetaGalletaChispas();
		System.out.println("\n[Galletas Con chispas 1]");
		galleta1 = new GalletaConChispas();
		GalletaAdapter galleta1B = new GalletaAdapter(galleta1);
		galleta1B.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta1B.prepararDulce(i,i);
		dulce1.crearDulceGalleta(galleta1B,i);
		dulce1.mostrarInfoGalleta(i);
		System.out.println("\n[Galletas Con chispas 2]");
		galleta2 = new GalletaConChispas();
		GalletaAdapter galleta2B = new GalletaAdapter(galleta2);
		galleta2B.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta2B.prepararDulce(i,i);
		dulce2.crearDulceGalleta(galleta2B,i);
		dulce2.mostrarInfoGalleta(i);
		System.out.println("\n[Galletas Con chispas 3]");
		galleta3 = new GalletaConChispas();
		GalletaAdapter galleta3B = new GalletaAdapter(galleta3);
		galleta3B.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta3B.prepararDulce(i,i);
		dulce3.crearDulceGalleta(galleta3B,i);
		dulce3.mostrarInfoGalleta(i);
		System.out.println("\n[Galletas Con chispas 4]");
		galleta4 = new GalletaConChispas();
		GalletaAdapter galleta4B = new GalletaAdapter(galleta4);
		galleta4B.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta4B.prepararDulce(i,i);
		dulce4.crearDulceGalleta(galleta4B,i);
		dulce4.mostrarInfoGalleta(i);
		System.out.println("\n[Galletas Con chispas 5]");
		galleta5 = new GalletaConChispas();
		GalletaAdapter galleta5B = new GalletaAdapter(galleta5);
		galleta5B.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta5B.prepararDulce(i,i);
		dulce5.crearDulceGalleta(galleta5B,i);
		dulce5.mostrarInfoGalleta(i);
		System.out.println("\n[Galletas Con chispas 6]");
		galleta6 = new GalletaConChispas();
		GalletaAdapter galleta6B = new GalletaAdapter(galleta6);
		galleta6B.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta6B.prepararDulce(i,i);
		dulce6.crearDulceGalleta(galleta6B,i);
		dulce6.mostrarInfoGalleta(i);
		System.out.println("\n[Galletas Con chispas 7]");
		galleta7 = new GalletaConChispas();
		GalletaAdapter galleta7B = new GalletaAdapter(galleta7);
		galleta7B.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta7B.prepararDulce(i,i);
		dulce7.crearDulceGalleta(galleta7B,i);
		dulce7.mostrarInfoGalleta(i);

		System.out.println("---Fin de la creacion de Galletas Salada");
	}

	/**
     * Metodo que hace las Operaciones necesarias para crear Galletas Con Mermelada.
     * @param i entero que ayuda a saber que mezcla e informacion se imprimira.
     */
	public void crearGalletaMermelada(int i)
	{
		tipolote=33;
		auxlotegalleta=i;
		System.out.println("---Inicio de la creacion de Galletas Salada");
		recetaGalletaMermelada();
		System.out.println("\n[Galletas Mermelada 1]");
		galleta1 = new GalletaRellenasMermelada();
		GalletaAdapter galleta1C = new GalletaAdapter(galleta1);
		galleta1C.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta1C.prepararDulce(i,i);
		dulce1.crearDulceGalleta(galleta1C,i);
		dulce1.mostrarInfoGalleta(i);
		System.out.println("\n[Galletas Mermelada 2]");
		galleta2 = new GalletaRellenasMermelada();
		GalletaAdapter galleta2C = new GalletaAdapter(galleta2);
		galleta2C.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta2C.prepararDulce(i,i);
		dulce2.crearDulceGalleta(galleta2C,i);
		dulce2.mostrarInfoGalleta(i);
		System.out.println("\n[Galletas Mermelada 3]");
		galleta3 = new GalletaRellenasMermelada();
		GalletaAdapter galleta3C = new GalletaAdapter(galleta3);
		galleta3C.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta3C.prepararDulce(i,i);
		dulce3.crearDulceGalleta(galleta3C,i);
		dulce3.mostrarInfoGalleta(i);
		System.out.println("\n[Galletas Mermelada 4]");
		galleta4 = new GalletaRellenasMermelada();
		GalletaAdapter galleta4C = new GalletaAdapter(galleta4);
		galleta4C.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta4C.prepararDulce(i,i);
		dulce4.crearDulceGalleta(galleta4C,i);
		dulce4.mostrarInfoGalleta(i);
		System.out.println("\n[Galletas Mermelada 5]");
		galleta5 = new GalletaRellenasMermelada();
		GalletaAdapter galleta5C = new GalletaAdapter(galleta5);
		galleta5C.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta5C.prepararDulce(i,i);
		dulce5.crearDulceGalleta(galleta5C,i);
		dulce5.mostrarInfoGalleta(i);
		System.out.println("\n[Galletas Mermelada 6]");
		galleta6 = new GalletaRellenasMermelada();
		GalletaAdapter galleta6C = new GalletaAdapter(galleta6);
		galleta6C.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta6C.prepararDulce(i,i);
		dulce6.crearDulceGalleta(galleta6C,i);
		dulce6.mostrarInfoGalleta(i);
		System.out.println("\n[Galletas Mermelada 7]");
		galleta7 = new GalletaRellenasMermelada();
		GalletaAdapter galleta7C = new GalletaAdapter(galleta7);
		galleta7C.establecerUnidadesGalleta(ingrediente1,ingrediente2,ingrediente3,ingrediente4,i);
		galleta7C.prepararDulce(i,i);
		dulce7.crearDulceGalleta(galleta7C,i);
		dulce7.mostrarInfoGalleta(i);
		System.out.println("---Fin de la creacion de Galletas Salada");

	}

	/**
     * Establece los ingredientes necesarios para crear Galltas Saladas.
     */
	public void recetaGalletaSalada()
	{
		ingrediente1 = 200;
		ingrediente2 = 5;
		ingrediente3 = 100;
		ingrediente4 = 60;
	}

	/**
     * Establece los ingredientes necesarios para crear Galltas Con Chispas.
     */
	public void recetaGalletaChispas()
	{
		ingrediente1 = 300;
		ingrediente2 = 10;
		ingrediente3 = 200;
		ingrediente4 = 100;
	}

	/**
     * Establece los ingredientes necesarios para crear Galltas Con Mermelada.
     */
	public void recetaGalletaMermelada()
	{
		ingrediente1 = 200;
		ingrediente2 = 10;
		ingrediente3 = 200;
		ingrediente4 = 100;
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
	public void crearLoteGall(Dulce dulce1, Dulce dulce2, Dulce dulce3, Dulce dulce4, Dulce dulce5, Dulce dulce6, Dulce dulce7)
	{
		System.out.println("\nSe Creara un Lote de Galletas...	 Listo.\n");
		infolote = "7 bolsas de Galletas\nInformacion de bolsa individual:\n"+dulce1.getMolde()+"\n"+dulce1.getIngredienteEx()+"\n"+dulce1.getIngrediente1()+"gr de Harina\n"+dulce1.getIngrediente2()+"pz de Huevo\n"+dulce1.getIngrediente3()+"ml de Leche\n";

		if (auxlotegalleta == 1)
			infolote += +dulce1.getIngrediente4()+"gr de Sal";
		else if (auxlotegalleta == 2)
			infolote += +dulce1.getIngrediente5()+"gr de Chispas de Chocolate";
		else
			infolote += +dulce1.getIngrediente6()+"gr de Mermelada";

		lote = new Lote(dulce1,dulce2,dulce3,dulce4,dulce5,dulce6,dulce7,infolote);
		lote.info();
		lote.tipoLote(tipolote);
	}
}
