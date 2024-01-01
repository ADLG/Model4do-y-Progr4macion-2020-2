/**
 * Clase FrutasConChamoy para las Gomitas.
 */
public class FrutasConChamoy extends Gomitas
{	
	/**
	 * Imprime que el Molde elegido para las Gomitas de Frutas con Chamoy.
	 */
	@Override
	public void elegirMolde()
	{
		System.out.println("Informacion de Gomita:");
		System.out.println("\nMOLDE: Frutas con Chamoy");
	}

	/**
	 * Imprime el Ingrediente extra para las Gomitas de Frutas con Chamoy.
	 */
	@Override
	public void agregarIngredientesEx()
	{
		System.out.println("INGREDIENTE EX: +200ml de Chamoy\n");
	}
}