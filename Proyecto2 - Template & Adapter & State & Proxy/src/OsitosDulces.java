/**
 * Clase OsitosDulces para las Gomitas.
 */
public class OsitosDulces extends Gomitas
{
	/**
	 * Imprime que el Molde elegido para las Gomitas de Ositos Dulces.
	 */
	@Override
	public void elegirMolde()
	{
		System.out.println("Informacion de Gomita:");
		System.out.println("\nMOLDE: Ositos Dulces");
	}

	/**
	 * Imprime el Ingrediente extra para las Gomitas de Ositos Dulces.
	 */
	@Override
	public void agregarIngredientesEx()
	{
		System.out.println("INGREDIENTE EX: +200gr de Azucar\n");
	}
}