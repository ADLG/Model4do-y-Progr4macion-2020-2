/**
 * Clase para pan de la Baguette Blanco.
 * @author Licona Gomez Aldo Daniel.
 */
public class BaguetteBlanco implements Baguette
{
	/* Descripcion del Baguette. */
	String descripcion = "Baguette Blanco   $10";
	/* Costo del Baguette. */
	int costo = 10;

	/* Regresa la descripcion del Baguette. */
	public String getDescripcion()
	{
		return descripcion;
	}

	/* Regresa el costo del Baguette. */
	public int costo()
	{
		return costo;
	}
}