/**
 * Clase abstracta Gomitas.
 */
public abstract class Gomitas implements ProcesoDePreparacion
{
	/* Entero que guarda la cantidad de azucar. */
	int azucar;
	/* Entero que guarda la cantidad de saborizante acido. */
	int saborizanteAcido;
	/* Entero que guarda la cantidad de chamoy. */
	int chamoy;

	/* Entero que guarda la cantidad de grenetina. */
	int grenetina;
	/* Entero que guarda la cantidad de agua. */
	int agua;
	/* Entero que guarda la cantidad de miel de maiz. */
	int mielMaiz;

	/* String que guarda la informacion de las Gomitas. */
	String info;

	/* String que guarda el molde de las Gomitas. */
	String molde;
	/* String que guarda el Ingrediente extra de las Gomitas. */
	String ingredienteEx;

	/**
	 * Metodo que contiene los pasos para crear Gomitas.
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
     * Regresa el ingrediente grenetina.
     * @return el ingrediente grenetina.
     */
	public int getIngrediente1()
	{
		return grenetina;
	}

	/**
     * Regresa el ingrediente agua.
     * @return el ingrediente agua.
     */
	public int getIngrediente2()
	{
		return agua;
	}

	/**
     * Regresa el ingrediente mielMaiz.
     * @return el ingrediente mielMaiz.
     */
	public int getIngrediente3()
	{
		return mielMaiz;
	}

	/**
     * Regresa el ingrediente azucar.
     * @return el ingrediente azucar.
     */
	public int getIngrediente4()
	{
		return azucar;
	}

	/**
     * Regresa el ingrediente saborizanteAcido.
     * @return el ingrediente saborizanteAcido.
     */
	public int getIngrediente5()
	{
		return saborizanteAcido;
	}

	/**
     * Regresa el ingrediente chamoy.
     * @return el ingrediente chamoy.
     */
	public int getIngrediente6()
	{
		return chamoy;
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
     * Muestra la informacion de las Gomitas.
     * @param i entero que muestra dependiendo de su valor informacion del ingrediente extra.
     */
	public void informacion(int i)
	{
		System.out.println("Ingredientes:");
		info = Integer.toString(grenetina)+"gr de Grenetina\n";
		System.out.println(grenetina+"gr de Grenetina");
		info += Integer.toString(agua)+"ml de Agua\n";
		System.out.println(agua+"ml de Agua");
		info += Integer.toString(mielMaiz)+"ml de Miel de Maiz\n";
		System.out.println(mielMaiz+"ml de Miel de Maiz");
		if (i==1)
			{info += Integer.toString(azucar)+"gr de Azucar\n";
			System.out.println(azucar+"gr de Azucar");}
		else if (i==2)
			{info += Integer.toString(saborizanteAcido)+"gr de Saborizante Acido\n";
			System.out.println(saborizanteAcido+"gr de Saborizante Acido");}
		else
			{info += Integer.toString(chamoy)+"ml de Chamoy\n";
			System.out.println(chamoy+"ml de Chamoy");}
	}

	/**
     * Regresa la informacion de las Gomitas en un String.
     * @return la informacion de las Gomitas.
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
     * @param ingrediente4 el ingrediente al que se le establecera la medida.
     * @param opc entero para ver que otro ingrediente sera usado del almacen.
     */
	public void establecerUnidadesG(int ingrediente1, int ingrediente2, int ingrediente3, int ingrediente4, int opc)
	{
		grenetina = ingrediente1;
		agua = ingrediente2;
		mielMaiz = ingrediente3;
		if (opc==1)
		azucar = ingrediente4;
		else if (opc==2)
		saborizanteAcido = ingrediente4;
		else
		chamoy = ingrediente4;
	}

	/**
	 * Se usan los ingredientes necesarios para crear las Gomitas.
     * @param i el entero que sirve para el caso de los ingredientes extras.
     */
	public void usarAlmacen(int i)
	{
		Almacen almacen = new Almacen();
		almacen.almacenG();
		System.out.println("\nIngredientes usados para el Chocolate:");
		almacen.usarGrenetina(grenetina);
		almacen.usarAgua(agua);
		almacen.usarMielDeMaiz(mielMaiz);
		if (i==1)
		almacen.usarAzucar(azucar);
		else if (i==2)
		almacen.usarAcido(saborizanteAcido);
		else
		almacen.usarChamoy(chamoy);
	}

	/**
	 * Se imprime acorde al parametro dado la mezcla que se realizara.
     * @param i el entero que sirve para saber que mezcla debe realizarse.
     */
	public void mezcla(int i)
	{
		System.out.println("\nMEZCLA:\nSe realizara la mezcla para preparar las Gomitas:\n");
		if (i==1)
		{
			System.out.println("Agregando 30gr de Grenetina...					Listo.");
			System.out.println("Agregando 50ml de Agua...					Listo.");
			System.out.println("Agregando 200ml de Miel de Maiz...				Listo.");
			System.out.println("Agregando Ingrediente Extra: 200gr de Azucar...			Listo.\n");
			molde = "Molde: Ositos Dulces";
			ingredienteEx = "Ingrediente Ex: 200gr de Azucar";
		}
		else if (i==2)
		{
			System.out.println("Agregando 20gr de Grenetina...					Listo.");
			System.out.println("Agregando 50ml de Agua...					Listo.");
			System.out.println("Agregando 100ml de Miel de Maiz...				Listo.");
			System.out.println("Agregando Ingrediente Extra: 100gr de Saborizante Acido...	Listo.\n");
			molde = "Molde: Gusanos Acidos";
			ingredienteEx = "Ingrediente Ex: 100gr de Saborizante Acido";
		}
		else
		{
			System.out.println("Agregando 30gr de Grenetina...					Listo.");
			System.out.println("Agregando 100ml de Agua...					Listo.");
			System.out.println("Agregando 50ml de Miel de Maiz...				Listo.");
			System.out.println("Agregando Ingrediente Extra: 200ml de Chamoy...			Listo.\n");
			molde = "Molde: Frutas con Chamoy";
			ingredienteEx = "Ingrediente Ex: 200ml de Chamoy";
		}

		System.out.println("Mezcla\n...\n..\n.\nListo.\n");
	}

	/**
	 * Metodos abstractos para implementar en las clases OsitosDulces, GusanosAcidos y FrutasConChamoy.
	 */
	abstract void elegirMolde();
	abstract void agregarIngredientesEx();
}