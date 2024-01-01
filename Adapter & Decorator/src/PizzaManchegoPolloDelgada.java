/**
 * Clase de un tipo de Pizza combinada con Queso:Manchego, Carne:Pollo y Masa:Delgada.
 * @author Licona Gomez Aldo Daniel.
 */
public class PizzaManchegoPolloDelgada extends Pizza
{
	/* Metodo que regresa informacion acerca del tipo de queso usado. */
	public String getQueso()
	{
		return "Tipo de Queso: Manchego     $7";
	}

	/* Metodo que regresa informacion acerca del tipo de carne usada. */
	public String getCarne()
	{
		return "Tipo de Carne: Pollo        $4";
	}

	/* Metodo que regresa informacion acerca del tipo de masa usada. */
	public String getMasa()
	{
		return "Tipo de Masa: Delgada       $5";
	}

	/* Metodo que regresa el costo total de la pizza. */
	public int getCosto()
	{
		return 7+4+5;
	}
}