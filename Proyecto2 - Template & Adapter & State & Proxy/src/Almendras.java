/**
 * Clase Almendras para los Chocolates.
 */
public class Almendras extends Chocolate
{
	/**
	 * Imprime que el Molde elegido para los Chocolates con Almendras.
	 */
	@Override
	public void elegirMolde()
	{
		System.out.println("Informacion del Chocolate:");
		System.out.println("\nMOLDE: En Barras 2x6");
	}

	/**
	 * Imprime el Ingrediente extra para los Chocolates con Almendras.
	 */
	@Override
	public void agregarIngredientesEx()
	{
		System.out.println("INGREDIENTE EX: +10pz de Almendras\n");
	}
}