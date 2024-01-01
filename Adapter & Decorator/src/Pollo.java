/**
 * Clase de ingrediente Pollo.
 * @author Licona Gomez Aldo Daniel.
 */
public class Pollo extends Ingrediente
{
	/* Referencia del Baguette. */
	Baguette baguette;
	/* Costo del ingrediente. */
	int costo = 6;

	public Pollo(Baguette baguette)
	{
		this.baguette = baguette;
	}

	/* Regresa la descripcion del Baguette con el ingrediente. */
	public String getDescripcion()
	{
		return baguette.getDescripcion() + "\nPollo             $6";
	}

	/* Regresa el costo del Baguette con el ingrediente. */
	public int costo()
	{
		return costo + baguette.costo();
	}
}