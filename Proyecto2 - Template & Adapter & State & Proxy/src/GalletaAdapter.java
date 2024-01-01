/**
 * Clase que funcionara como Adaptador de la clase Galleta.
 */
public class GalletaAdapter implements ProcesoDePreparacion
{
	/* Referencia de Galleta para usar sus metodos. */
	Galleta galleta;

	/* Entero que guarda la cantidad de harina. */
	int harina;
	/* Entero que guarda las piezas de huevos. */
	int huevo;
	/* Entero que guarda la cantidad de leche. */
	int leche;

	/* Entero que guarda la cantidad de masa. */
	int masa;

	/* Entero que guarda la cantidad de sal. */
	int sal;
	/* Entero que guarda la cantidad de chispas de chocolate. */
	int chispas;
	/* Entero que guarda la cantidad de mermelada. */
	int mermelada;
	/* Entero que guarda la cantidad de un ingrediente auxiliar. */
	int ingredienteAux;

	/* String que guarda la informacion de las Galletas. */
	String info;

	/* String que guarda el molde de las Galletas. */
	String molde;
	/* String que guarda el Ingrediente extra de las Galletas. */
	String ingredienteEx;

	public GalletaAdapter(Galleta galleta)
	{
		this.galleta = galleta;
	}

	/**
     * Regresa el ingrediente harina.
     * @return el ingrediente harina.
     */
	public int getIngrediente1()
	{
		return harina;
	}

	/**
     * Regresa el ingrediente huevo.
     * @return el ingrediente huevo.
     */
	public int getIngrediente2()
	{
		return huevo;
	}

	/**
     * Regresa el ingrediente leche.
     * @return el ingrediente leche.
     */
	public int getIngrediente3()
	{
		return leche;
	}

	/**
     * Regresa el ingrediente sal.
     * @return el ingrediente sal.
     */
	public int getIngrediente4()
	{
		return sal;
	}

	/**
     * Regresa el ingrediente chispas.
     * @return el ingrediente chispas.
     */
	public int getIngrediente5()
	{
		return chispas;
	}

	/**
     * Regresa el ingrediente mermelada.
     * @return el ingrediente mermelada.
     */
	public int getIngrediente6()
	{
		return mermelada;
	}

	/**
	 * Metodo que contiene los pasos para crear una Galleta al igual que con la maquina Wonka3000.
     * @param i no son usados, pero se ponen por la interfaz usada.
     * @param j no son usados, pero se ponen por la interfaz usada.
     */
	@Override
	public final void prepararDulce(int i, int j)
	{
		galleta.prepararMasa(leche,harina,huevo);
		galleta.cocinarMasa();
		galleta.usarAlmacen(ingredienteAux);
		galleta.mezcla();
		molde();
		ingredienteEx();
	}

	/**
	 * Metodo que contiene establece los ingredientes para crear Galletas.
     * @param ingrediente1 el ingrediente al que se le establecera la medida.
     * @param ingrediente2 el ingrediente al que se le establecera la medida.
     * @param ingrediente3 el ingrediente al que se le establecera la medida.
     * @param ingrediente4 el ingrediente al que se le establecera la medida.
     * @param opc el ingrediente extra al que le establecera la medida
     */
	public void establecerUnidadesGalleta(int ingrediente1, int ingrediente2, int ingrediente3, int ingrediente4, int opc)
	{
		harina = ingrediente1;
		huevo = ingrediente2;
		leche = ingrediente3;
		if (opc==1)
			{ingredienteAux = ingrediente4;
			sal = ingrediente4;}
		else if (opc==2)
			{ingredienteAux = ingrediente4;
			chispas = ingrediente4;}
		else
			{ingredienteAux = ingrediente4;
			mermelada = ingrediente4;}
	}

	/**
     * Muestra la informacion las Galletas.
     * @param i informacion del tipo de Galletas.
     */
	public void informacion(int i)
	{
		System.out.println("Ingredientes:");
		info = Integer.toString(harina)+"gr de Harina\n";
		System.out.println(harina+"gr de Harina");
		info += Integer.toString(huevo)+"pz de Huevos\n";
		System.out.println(huevo+"pz de Huevos");
		info += Integer.toString(leche)+"ml de Leche\n";
		System.out.println(leche+"ml de Leche");
		if (i==1)
		{
			info += Integer.toString(sal)+"gr de Sal\n";
			System.out.println(sal+"gr de Sal");
		}
		else if (i==2)
		{
			info += Integer.toString(chispas)+"gr de Chispas de Chocolate\n";
			System.out.println(chispas+"gr de Chispas de Chocolate");
		}
		else
		{
			info += Integer.toString(mermelada)+"gr de Mermelada\n";
			System.out.println(mermelada+"gr de Mermelada");
		}
	}

	/**
     * Regresa la informacion de las Galletas en un String.
     * @return la informacion de las Galletas.
     */
	public String info()
	{
		return info;
	}

	/**
     * Establece el molde de las Galletas.
     */
	public void molde()
	{
		molde = "MOLDE: Galletas Redondas";
	}

	/**
     * Establece el Ingrediente Extra de las Galletas.
     */
	public void ingredienteEx()
	{
		ingredienteEx = "Las Galletas no tienen un Ingrediente Extra";
	}

	/**
     * Regresa el Molde de las Galletas en un String.
     * @return el Molde de las Galletas.
     */
	public String getMolde()
	{
		return molde;
	}

	/**
     * Regresa el Ingrediente Extra de las Galletas en un String.
     * @return el Ingrediente Extra de las Galletas.
     */
	public String getIngredienteEx()
	{
		return ingredienteEx;
	}
}