/**
 * Clase del material Reforzado.
 * @author Licona Gomez Aldo Daniel
 */
public class Reforzado extends Construccion
{
	/**
	 * Imprime que el Esqueleto sera Reforzado.
	 */
	@Override
	void construccionEsqueleto()
	{
		System.out.println("El esqueleto Reforzado de la casa se esta construyendo....			Listo.");
	}
	
	/**
	 * Imprime que el Aislamiento sera Reforzado.
	 */
	@Override
	void aislamiento()
	{
		System.out.println("El aislamiento Reforzado de la casa se esta construyendo....			Listo.");	
	}

	/**
	 * El metodo no se implementa ya que si hay esqueleto Reforzado.
	 * @param n la opcion de material que eliga el operador, pero como no se usa en este caso no se le a elegir
	 * al operador que digite una opcion.
	 */
	@Override
	void tipoEsqueleto(int n)
	{}
}