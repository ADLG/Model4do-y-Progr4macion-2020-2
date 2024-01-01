/**
 * Clase de un tipo de Pizza combinada con Queso:Chedar, Carne:Salchicha y Masa:Gruesa.
 * @author Licona Gomez Aldo Daniel.
 */
public class PizzaChedarSalchichaGruesa extends Pizza
{
	/* Metodo que regresa informacion acerca del tipo de queso usado. */
	public String getQueso()
	{
		return "Tipo de Queso: Chedar 	    $5";
	}

	/* Metodo que regresa informacion acerca del tipo de carne usada. */
	public String getCarne()
	{
		return "Tipo de Carne: Salchicha    $8";
	}

	/* Metodo que regresa informacion acerca del tipo de masa usada. */
	public String getMasa()
	{
		return "Tipo de Masa: Gruesa        $9";
	}

	/* Metodo que regresa el costo total de la pizza. */
	public int getCosto()
	{
		return 5+8+9;
	}
}