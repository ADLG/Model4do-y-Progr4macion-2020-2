/**
 * Clase abstracta para los materiales de los cuales dispone el robot para construir la casa (Template).
 * @author Licona Gomez Aldo Daniel
 */
public abstract class Construccion
{
	/**
	 * Metodo que contiene los pasos para una construccion analoga de una casa.
	 */
	public final void pasosDeConstruccion()
	{
		preparacionTerreno();
		colocacionCimientos();
		construccionEsqueleto();
		electricidadPlomeria();
		aislamiento();
		acabados();
	}

	/**
	 * Metodo que contiene los pasos para una construccion analoga de una casa.
	 * En dado caso de que el operador eliga una casa de Madera o de Vidrio, como no existe
	 * un esqueleto de Madera y de Vidrio, se le dara a escoger entre el material de Concreto o Reforzado.
	 * @param n la opcion de material que eliga el operador.
	 */
	public final void pasosDeConstruccion(int n)
	{	
		preparacionTerreno();
		colocacionCimientos();
		tipoEsqueleto(n);
		electricidadPlomeria();
		aislamiento();
		acabados();
	}

	/**
	 * Metodos abstractos para implementar en las 4 Clases de los materiales.
	 */
	abstract void construccionEsqueleto();
	abstract void aislamiento();

	/**
	 * Metodo abstractos para implementar en las 4 Clases de los materiales, pero servira para las Clases de Madera y Vidrio.
	 * @param n la opcion de material que eliga el operador.
	 */
	abstract void tipoEsqueleto(int n);

	/**
	 * Imprime la preparacion del terreno para Construir.
	 */
	void preparacionTerreno()
	{
		System.out.println("\nPreparando el terreno para construir la casa....				Listo.");
	}

	/**
	 * Imprime la colocacion de cimientos de la casa.
	 */
	void colocacionCimientos()
	{
		System.out.println("Colocando los cimientos de la casa....						Listo.");
	}

	/**
	 * Imprime la instalacion electria y plomeria de la casa.
	 */
	void electricidadPlomeria()
	{
		System.out.println("Realizando instalacion electrica y plomeria....					Listo.");
	}

	/**
	 * Imprime los acabados de la casa.
	 */
	void acabados()
	{
		System.out.println("Realizando acabados....								Terminados.\n");
	}
}