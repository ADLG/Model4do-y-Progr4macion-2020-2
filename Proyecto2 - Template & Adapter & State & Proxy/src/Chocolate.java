/**
 * Clase abstracta Chocolate.
 */
public abstract class Chocolate implements ProcesoDePreparacion
{
	/* Entero que guarda la cantidad de leche. */
	int leche;
	/* Entero que guarda la cantidad de cacao. */
	int cacao;
	/* Entero que guarda la cantidad de la manteca de cacao. */
	int mantecacc;
	/* Entero que guarda las piezas de almendra que hay. */
	int almendras;

	/* String que guarda la informacion del chocolate. */
	String info;

	/* String que guarda el molde del Chocolate. */
	String molde;
	/* String que guarda el Ingrediente extra del Chocolate. */
	String ingredienteEx;

	/**
	 * Metodo que contiene los pasos para crear un Chocolate.
     * @param i el tipo de mezcla que se imprimira.
     * @param j los ingredientes que seran usados del almacen.
     */
	@Override
	public final void prepararDulce(int i, int j)
	{
		usarAlmacen(j);
		mezcla(i);
		elegirMolde();
		agregarIngredientesEx();
	}

	/**
     * Regresa el ingrediente leche.
     * @return el ingrediente leche.
     */
	public int getIngrediente1()
	{
		return leche;
	}
	/**
     * Regresa el ingrediente cacao.
     * @return el ingrediente cacao.
     */
	public int getIngrediente2()
	{
		return cacao;
	}
	/**
     * Regresa el ingrediente manteca de cacao.
     * @return el ingrediente manteca de cacao.
     */
	public int getIngrediente3()
	{
		return mantecacc;
	}
	/**
     * Regresa el ingrediente almendras.
     * @return el ingrediente almendras.
     */
	public int getIngrediente4()
	{
		return almendras;
	}

	/**
     * Regresa el molde en un String.
     * @return el molde.
     */
	public String getMolde()
	{
		return molde;
	}

	/**
     * Regresa el Ingrediente extra en un String.
     * @return el Ingrediente extra.
     */
	public String getIngredienteEx()
	{
		return ingredienteEx;
	}

	/**
     * Muestra la informacion del chocolate.
     */
	public void informacion()
	{
		System.out.println("Ingredientes:");
		info = Integer.toString(leche)+"ml de Leche\n";
		System.out.println(leche+"ml de Leche");
		info += Integer.toString(cacao)+"gr de Cacao\n";
		System.out.println(cacao+"gr de Cacao");
		info += Integer.toString(mantecacc)+"gr de Manteca de Cacao\n";
		System.out.println(mantecacc+"gr de Manteca de Cacao");
		info += Integer.toString(almendras)+"pz de Almendras\n";
		System.out.println(almendras+"pz de Almendras");
	}

	/**
     * Regresa la informacion del chocolate en un String.
     * @return la informacion del chocolate.
     */
	public String info()
	{
		return info;
	}

	/**
	 * Metodo que contiene establece los ingredientes para crear un Chocolate.
     * @param ingrediente1 el ingrediente al que se le establecera la medida.
     * @param ingrediente2 el ingrediente al que se le establecera la medida.
     * @param ingrediente3 el ingrediente al que se le establecera la medida.
     */
	public void establecerUnidades3(int ingrediente1, int ingrediente2, int ingrediente3)
	{
		leche = ingrediente1;
		cacao = ingrediente2;
		mantecacc = ingrediente3;
	}

	/**
	 * Metodo que contiene establece los ingredientes para crear un Chocolate.
     * @param ingrediente1 el ingrediente al que se le establecera la medida.
     * @param ingrediente2 el ingrediente al que se le establecera la medida.
     * @param ingrediente3 el ingrediente al que se le establecera la medida.
     * @param ingrediente4 el ingrediente al que se le establecera la medida.
     */
	public void establecerUnidades4(int ingrediente1, int ingrediente2, int ingrediente3, int ingrediente4)
	{
		leche = ingrediente1;
		cacao = ingrediente2;
		mantecacc = ingrediente3;
		almendras = ingrediente4;
	}

	/**
	 * Se usan los ingredientes necesarios para crear el chocolate.
     * @param i el entero que sirve para el caso de las almandras.
     */
	public void usarAlmacen(int i)
	{
		Almacen almacen = new Almacen();
		almacen.almacenC();
		System.out.println("\nIngredientes usados para el Chocolate:");
		if (i==1)
		almacen.usarAlmendras(almendras);
		almacen.usarCacaoPolvo(cacao);
		almacen.usarLeche(leche);
		almacen.usarMantecaC(mantecacc);
	}

	/**
	 * Se imprime acorde al parametro dado la mezcla que se realizara.
     * @param i el entero que sirve para saber que mezcla debe realizarse.
     */
	public void mezcla(int i)
	{
		System.out.println("\nMEZCLA:\nSe realizara la mezcla para preparar los Chocolates:\n");
		if (i==1)
		{
			System.out.println("Agregando 200ml de Leche...				Listo.");
			System.out.println("Agregando 100gr de Cacao en Polvo...			Listo.");
			System.out.println("Agregando 200gr de Manteca de Cacao...			Listo.");
			System.out.println("Agregando Ingrediente Extra: 10pz de Almendras...	Listo.\n*Ingrediente Extra Agregado: 10pz de Almendras\n");
			molde = "Molde: En Barras 2x6";
			ingredienteEx = "Ingrediente Ex: 10pz de Almendras";
		}
		else if (i==2)
		{
			System.out.println("Agregando 100ml de Leche...				Listo.");
			System.out.println("Agregando 200gr de Cacao en Polvo...			Listo.");
			System.out.println("Agregando 300gr de Manteca de Cacao...			Listo.");
			System.out.println("Agregando Ingrediente Extra 200gr de Cacao en Polvo...	Listo.");
			System.out.println("*Ingrediente Extra Agregado: 200gr de Cacao en Polvo\n");
			molde = "Molde: En Barra";
			ingredienteEx = "Ingrediente Ex: 200gr de Cacao en Polvo";
		}
		else
		{
			System.out.println("Agregando 100ml de Leche...				Listo.");
			System.out.println("Agregando 100gr de Cacao en Polvo...			Listo.");
			System.out.println("Agregando 200gr de Manteca de Cacao...			Listo.");
			System.out.println("Agregando Ingrediente Extra 300ml de Leche...		Listo.");
			System.out.println("*Ingrediente Extra Agregado: 300ml de Leche\n");
			molde = "Molde: En barras 2x4";
			ingredienteEx = "Ingrediente Ex: 300ml de Leche";
		}

		System.out.println("Mezcla\n...\n..\n.\nListo.\n");
	}

	/**
	 * Metodos abstractos para implementar en las clases Almendras, Leche y Oscuro.
	 */
	abstract void elegirMolde();
	abstract void agregarIngredientesEx();
}