/**
 * Clase que simula las propiedades y el costo de la casa que construya el robot.
 * @author Licona Gomez Aldo Daniel
 */
public class Casa
{
	/* Variable privada para guardar el costo de la casa. */
	private int costo;

	/* Variables privadas para guardar la refencia de los materiales que pidio el operador para la construccion. */
	private int numero1;
	private int numero2;

	/**
	 * Metodo que imprime las caracteristicas de la casa dependiendo de los materiales pedidos
	 * @param n el tipo de esqueleto que haya escogido el operador.
	 * @param m el tipo de aislamiento que haya escogido el operador.
	 */
	public void caracteristcas(int n, int m)
	{
		System.out.println("Caracteristcas de la casa:\n");
		System.out.println("<<Construida en un terreno libre>>");
		System.out.println("<<Cimientos en buen estado>>");
		esqueleto(n);
		System.out.println("<<Instalaciones Electricas y de Plomeria>>");
		aislamiento(m);
		System.out.println("<<Acabados en buen estado>>");
	}

	/**
	 * Metodo que toma los materiales que eligio el operador para usarlos mas adelante.
	 */
	public void numeros(int numero1, int numero2)
	{
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	/**
	 * Metodo que regresa un numero que representara el tipo de material para el esqueleto de la casa.
	 * @return el numero que representa un material.
	 */
	public int getNumero1()
	{
		return numero1;
	}
	/**
	 * Metodo que regresa un numero que representara el tipo de material para el aislamiento de la casa.
	 * @return el numero que representa un material.
	 */
	public int getNumero2()
	{
		return numero2;
	}

	/**
	 * Metodo que elige el material para el esqueleto de la casa.
	 * @param n el material que eligio el operador.
	 */
	public void esqueleto(int n)
	{
		if (n==1)
		{
			System.out.println("<<El esqueleto de Concreto>>");
		}
		else if (n==2)
		{
			System.out.println("<<El esqueleto Reforzado>>");
		}
	}

	/**
	 * Metodo que elige el material para el aislamiento de la casa.
	 * @param n el material que eligio el operador.
	 */
	public void aislamiento(int n)
	{
		if (n==1)
		{
			System.out.println("<<Aislamiento de Concreto>>");
		}
		else if (n==2)
		{
			System.out.println("<<Aislamiento Reforzado>>");
		}
		else if (n==3)
		{
			System.out.println("<<Aislamiento de Madera>>");
		}
		else if (n==4)
		{
			System.out.println("<<Aislamiento de Vidrio>>");
		}
	}

	/**
	 * Metodo que establece el costo inicial de la Construccion.
	 * @param costo el costo de la Construccion.
	 */
	public void setCosto(int costo)
	{
		this.costo = costo;
	}

	/**
	 * Metodo que suma la cantidad de dinero de la Construccion.
	 * @param costo el dinero que se le aumenta a la construccion.
	 */
	public void acumularDinero(int costo)
	{
		this.costo+=costo;
	}

	/**
	 * Metodo que regresa el costo de la Construccion.
	 * @return el costo de la Construccion.
	 */
	public int getCosto()
	{
		return costo;
	}
}