/**
 * Clase Lote para guardar los dulces y mostrar su informacion.
 */
public class Lote
{
	/* Dulce 1 al que sera el que este en un Lote. */
	Dulce dulce1 = new Dulce();
	/* Dulce 2 al que sera el que este en un Lote. */
	Dulce dulce2 = new Dulce();
	/* Dulce 3 al que sera el que este en un Lote. */
	Dulce dulce3 = new Dulce();
	/* Dulce 4 al que sera el que este en un Lote. */
	Dulce dulce4 = new Dulce();
	/* Dulce 5 al que sera el que este en un Lote. */
	Dulce dulce5 = new Dulce();
	/* Dulce 6 al que sera el que este en un Lote. */
	Dulce dulce6 = new Dulce();
	/* Dulce 7 al que sera el que este en un Lote. */
	Dulce dulce7 = new Dulce();

	/* Variable que guarda la informacion de un Lote. */
	String lote;

	/* Entero que sirve para identificar que tipo de Dulce tiene el lote. */
	int tipolote=0;

	public Lote(Dulce dulce1, Dulce dulce2, Dulce dulce3, Dulce dulce4, Dulce dulce5, Dulce dulce6, Dulce dulce7, String lote)
	{
		this.dulce1 = dulce1;
		this.dulce2 = dulce2;
		this.dulce3 = dulce3;
		this.dulce4 = dulce4;
		this.dulce5 = dulce5;
		this.dulce6 = dulce6;
		this.dulce7 = dulce7;
		this.lote = lote;
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
     * Muestra la informacion del Lote.
     */
	public void info()
	{
		System.out.println(lote);
	}

	/**
     * Regresa el tipo de lote.
     * @return entero para identificar un tipo de lote.
     */
	public int tipoNoLote()
	{
		return tipolote;
	}

	/**
     * Establece el tipo de lote.
     */
	public void tipoLote(int i)
	{
		if (i==1)
			tipolote=i;
		else if (i==2)
			tipolote=i;
		else
			tipolote=i;
	}
}