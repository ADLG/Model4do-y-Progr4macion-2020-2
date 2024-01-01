/**
 * Clase del material Madera.
 * @author Licona Gomez Aldo Daniel
 */
public class Madera extends Construccion
{
	/**
	 * Imprime que el Esqueleto de Madera no esta disponible.
	 */
	@Override
	void construccionEsqueleto()
	{
		System.out.println("\nEl esqueleto de Madera no esta disponible en estos momentos.");
		System.out.println("Elige de que material quieres que sea el Esqueleto de la casa:\n1.Concreto - $500,000\n2.Reforzado - $1,000,000\n");
	}

	/**
	 * Imprime que el Aislamiento sera de Madera.
	 */
	@Override
	void aislamiento()
	{
		System.out.println("El aislamiento de Madera de la casa se esta construyendo....			Listo.");	
	}

	/**
	 * Da a elegir al operador entre el material de Concreto o Reforzado para el Esqueleto de la casa.
	 * @param n la opcion de material que eliga el operador.
	 */
	@Override
	void tipoEsqueleto(int n)
	{
		if (n == 1)
		{
			System.out.println("El esqueleto de Concreto de la casa se esta construyendo....			Listo.");
		}
		else if (n == 2)
		{
			System.out.println("El esqueleto Reforzado de la casa se esta construyendo....			Listo.");
		}
	}
}