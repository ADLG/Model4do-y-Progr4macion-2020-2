/**
 * Clase del material Concreto.
 * @author Licona Gomez Aldo Daniel
 */
public class Concreto extends Construccion
{
	/**
	 * Imprime que el Esqueleto sera de Concreto.
	 */
	@Override
	void construccionEsqueleto()
	{
		System.out.println("El esqueleto de Concreto de la casa se esta construyendo....			Listo.");
	}

	/**
	 * Imprime que el Aislamiento sera de Concreto.
	 */
	@Override
	void aislamiento()
	{
		System.out.println("El aislamiento de Concreto de la casa se esta construyendo....			Listo.");	
	}

	/**
	 * El metodo no se implementa ya que si hay esqueleto de Concreto.
	 * @param n la opcion de material que eliga el operador, pero como no se usa en este caso no se le a elegir
	 * al operador que digite una opcion.
	 */
	@Override
	void tipoEsqueleto(int n)
	{}
}