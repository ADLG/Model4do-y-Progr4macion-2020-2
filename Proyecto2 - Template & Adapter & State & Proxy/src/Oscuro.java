/**
 * Clase Oscuro para los Chocolates.
 */
public class Oscuro extends Chocolate
{
	/**
	 * Imprime que el Molde elegido para los Chocolates Oscuros.
	 */
	@Override
	public void elegirMolde()
	{
		System.out.println("Informacion del Chocolate:");
		System.out.println("\nMOLDE: En Barra");
	}

	/**
	 * Imprime el Ingrediente extra para los Chocolates Oscuros.
	 */
	@Override
	public void agregarIngredientesEx()
	{
		System.out.println("INGREDIENTE EX: +200gr de Cacao\n");
	}
}