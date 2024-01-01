/**
 * Clase de ingrediente Mostaza.
 * @author Licona Gomez Aldo Daniel.
 */
public class Mostaza extends Ingrediente
{
	/* Referencia del Baguette. */
	Baguette baguette;
	/* Costo del ingrediente. */
	int costo = 3;

	public Mostaza(Baguette baguette)
	{
		this.baguette = baguette;
	}

	/* Regresa la descripcion del Baguette con el ingrediente. */
	public String getDescripcion()
	{
		return baguette.getDescripcion() + "\nMostaza           $3";
	}

	/* Regresa el costo del Baguette con el ingrediente. */
	public int costo()
	{
		return costo + baguette.costo();
	}
}