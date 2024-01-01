/**
 * Clase GusanosAcidos para las Gomitas.
 */
public class GusanosAcidos extends Gomitas
{
	/**
	 * Imprime que el Molde elegido para las Gomitas de Gusanos Acidos.
	 */
	@Override
	public void elegirMolde()
	{
		System.out.println("Informacion de Gomita:");
		System.out.println("\nMOLDE: Gusanos Acidos");
	}

	/**
	 * Imprime el Ingrediente extra para las Gomitas de Gusanos Acidos.
	 */
	@Override
	public void agregarIngredientesEx()
	{
		System.out.println("INGREDIENTE Ex: +100gr de Saborizante Acido\n");
	}
}