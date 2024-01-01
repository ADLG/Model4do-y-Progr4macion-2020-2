/**
 * Clase de ingrediente Pepperoni.
 * @author Licona Gomez Aldo Daniel.
 */
public class Pepperoni extends Ingrediente
{
	/* Referencia del Baguette. */
	Baguette baguette;
	/* Costo del ingrediente. */
	int costo = 4;

	public Pepperoni(Baguette baguette)
	{
		this.baguette = baguette;
	}

	/* Regresa la descripcion del Baguette con el ingrediente. */
	public String getDescripcion()
	{
		return baguette.getDescripcion() + "\nPepperoni         $4";
	}

	/* Regresa el costo del Baguette con el ingrediente. */
	public int costo()
	{
		return costo + baguette.costo();
	}
}