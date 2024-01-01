/**
 * Clase Dulce para mostrar la informacion de los dulces Chocolate, Galleta y Gomita.
 */
public class Dulce
{
	/* Referencia de Chocolate para usar sus metodos. */
	Chocolate chocolate;
	/* Referencia de Gomita para usar sus metodos. */
	Gomitas gomita;

	/* Referencia de Galleta. */
	Galleta galleta;
	/* Referencia de Galleta Salada para usar sus metodos. */
	GalletaAdapter galletaAS;
	/* Referencia de Galleta Con Chispas para usar sus metodos. */
	GalletaAdapter galletaAC;
	/* Referencia de Galleta Mermelada para usar sus metodos. */
	GalletaAdapter galletaAM;

	/* Variable de tipo String para mostrar datos de los Dulces. */
	String info;

	/* Variable de tipo String para mostrar el Molde del dulce. */
	String molde;
	/* Variable de tipo String para mostrar el Ingrediente Extra del dulce. */
	String ingredienteEx;

	/* Enteros para hacer referencia a los ingredientes de los dulces. */
	int ingrediente1,ingrediente2,ingrediente3,ingrediente4,ingrediente5,ingrediente6;

	/**
     * Metodo para que Chocolate sea de tipo Dulce
     * @param chocolate referencia que pasara a ser de tipo Dulce.
     */
	public void crearDulceChocolate(Chocolate chocolate)
	{
		this.chocolate = chocolate;
		ingrediente1 = (chocolate.getIngrediente1());
		ingrediente2 = (chocolate.getIngrediente2());
		ingrediente3 = (chocolate.getIngrediente3());
		ingrediente4 = (chocolate.getIngrediente4());
	}

	/**
	 * Muestra la informacion del Chocolate.
     */
	public void mostrarInfoChocolate()
	{
		chocolate.informacion();
		info = chocolate.info();
		molde = chocolate.getMolde();
		ingredienteEx = chocolate.getIngredienteEx();
	}

	/**
     * Metodo para que Gomita sea de tipo Dulce
     * @param gomita referencia que pasara a ser de tipo Dulce.
     */
	public void crearDulceGomita(Gomitas gomita)
	{
		this.gomita = gomita;
		ingrediente1 = (gomita.getIngrediente1());
		ingrediente2 = (gomita.getIngrediente2());
		ingrediente3 = (gomita.getIngrediente3());
		ingrediente4 = (gomita.getIngrediente4());
		ingrediente5 = (gomita.getIngrediente5());
		ingrediente6 = (gomita.getIngrediente6());
	}

	/**
	 * Muestra la informacion de la gomita.
	 * @param i define la informacion que mostrara gomita.
     */
	public void mostrarInfoGomita(int i)
	{
		gomita.informacion(i);
		info = gomita.info();
		molde = gomita.getMolde();
		ingredienteEx = gomita.getIngredienteEx();
	}

	/**
     * Metodo para que las Galletas sean de tipo Dulce
     * @param galletaAdap referencia que pasara a ser de tipo Dulce.
     * @param i entero que sirve para identificar que tipo de galletas instanciara galletaAdap.
     */
	public void crearDulceGalleta(GalletaAdapter galletaAdap, int i)
	{
		if (i==1)
		{
		this.galleta = new GalletaSaladas();
		this.galletaAS = new GalletaAdapter(galleta);
		this.galletaAS = galletaAdap;
		ingrediente1 = (galletaAS.getIngrediente1());
		ingrediente2 = (galletaAS.getIngrediente2());
		ingrediente3 = (galletaAS.getIngrediente3());
		ingrediente4 = (galletaAS.getIngrediente4());
		}
		else if (i==2)
		{
		this.galleta = new GalletaConChispas();
		this.galletaAC = new GalletaAdapter(galleta);
		this.galletaAC = galletaAdap;
		ingrediente1 = (galletaAC.getIngrediente1());
		ingrediente2 = (galletaAC.getIngrediente2());
		ingrediente3 = (galletaAC.getIngrediente3());
		ingrediente4 = (galletaAC.getIngrediente5());
		}
		else
		{
		this.galleta = new GalletaRellenasMermelada();
		this.galletaAM = new GalletaAdapter(galleta);
		this.galletaAM = galletaAdap;
		ingrediente1 = (galletaAM.getIngrediente1());
		ingrediente2 = (galletaAM.getIngrediente2());
		ingrediente3 = (galletaAM.getIngrediente3());
		ingrediente4 = (galletaAM.getIngrediente5());
		}
	}

	/**
	 * Muestra la informacion de las Galletas.
	 * @param i define la informacion que mostraran las galletas.
     */
	public void mostrarInfoGalleta(int i)
	{
		if (i==1)
		{
			galletaAS.informacion(i);
			info = galletaAS.info();
			molde = galletaAS.getMolde();
			ingredienteEx = galletaAS.getIngredienteEx();
		}
		else if (i==2)
		{
			galletaAC.informacion(i);
			info = galletaAC.info();
			molde = galletaAC.getMolde();
			ingredienteEx = galletaAC.getIngredienteEx();
		}
		else
		{
			galletaAM.informacion(i);
			info = galletaAM.info();
			molde = galletaAM.getMolde();
			ingredienteEx = galletaAM.getIngredienteEx();
		}
	}

    /**
     * Regresa la informacion del dulce.
     * @return la informacion de tipo String del dulce.
     */
	public String informacionDulce()
	{
		return info;
	}

    /**
     * Regresa el ingrediente 1 del dulce.
     * @return el ingrediente 1 del dulce.
     */
	public int getIngrediente1()
	{
		return ingrediente1;
	}

    /**
     * Regresa el ingrediente 2 del dulce.
     * @return el ingrediente 2 del dulce.
     */
	public int getIngrediente2()
	{
		return ingrediente2;
	}

    /**
     * Regresa el ingrediente 3 del dulce.
     * @return el ingrediente 3 del dulce.
     */
	public int getIngrediente3()
	{
		return ingrediente3;
	}

    /**
     * Regresa el ingrediente 4 del dulce.
     * @return el ingrediente 4 del dulce.
     */
	public int getIngrediente4()
	{
		return ingrediente4;
	}

    /**
     * Regresa el ingrediente 5 del dulce.
     * @return el ingrediente 5 del dulce.
     */
	public int getIngrediente5()
	{
		return ingrediente5;
	}

    /**
     * Regresa el ingrediente 6 del dulce.
     * @return el ingrediente 6 del dulce.
     */
	public int getIngrediente6()
	{
		return ingrediente6;
	}

    /**
     * Regresa el Molde del dulce.
     * @return el Molde del dulce.
     */
	public String getMolde()
	{
		return molde;
	}

	/**
     * Regresa el Ingrediente extra del dulce.
     * @return el Ingrediente extra del dulce.
     */
	public String getIngredienteEx()
	{
		return ingredienteEx;
	}
}