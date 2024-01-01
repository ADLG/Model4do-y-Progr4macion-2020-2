/**
 * Clase para pan de la Baguette Integral.
 * @author Licona Gomez Aldo Daniel.
 */
public class BaguetteIntegral implements Baguette
{
	/* Descripcion del Baguette. */
	String descripcion = "Baguette Integral $5";
	/* Costo del Baguette. */
	int costo = 5;

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