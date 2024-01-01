/**
 * Clase de ingrediente Cebolla.
 * @author Licona Gomez Aldo Daniel.
 */
public class Cebolla extends Ingrediente
{
	/* Referencia del Baguette. */
	Baguette baguette;
	/* Costo del ingrediente. */
	int costo = 1;

	public Cebolla(Baguette baguette)
	{
		this.baguette = baguette;
	}

	/* Regresa la descripcion del Baguette con el ingrediente. */
	public String getDescripcion()
	{
		return baguette.getDescripcion() + "\nCebolla           $1";
	}

	/* Regresa el costo del Baguette con el ingrediente. */
	public int costo()
	{
		return costo + baguette.costo();
	}
}