/**
 * Clase Leche para los Chocolates.
 */
public class Leche extends Chocolate
{
	/**
	 * Imprime que el Molde elegido para los Chocolates con Leche.
	 */
	@Override
	public void elegirMolde()
	{
		System.out.println("Informacion del Chocolate:");
		System.out.println("\nMOLDE: En Barras 2x4");
	}

	/**
	 * Imprime el Ingrediente extra para los Chocolates con Leche.
	 */
	@Override
	public void agregarIngredientesEx()
	{
		System.out.println("INGREDIENTE EX: +300ml de Leche\n");
	}
}