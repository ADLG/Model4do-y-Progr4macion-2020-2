/**
 * Clase de ingrediente Jamon.
 * @author Licona Gomez Aldo Daniel.
 */
public class Jamon extends Ingrediente
{
	/* Referencia del Baguette. */
	Baguette baguette;
	/* Costo del ingrediente. */
	int costo = 2;

	public Jamon(Baguette baguette)
	{
		this.baguette = baguette;
	}

	/* Regresa la descripcion del Baguette con el ingrediente. */
	public String getDescripcion()
	{
		return baguette.getDescripcion() + "\nJamon             $2";
	}

	/* Regresa el costo del Baguette con el ingrediente. */
	public int costo()
	{
		return costo + baguette.costo();
	}
}