/**
 * Clase de ingrediente Catsup.
 * @author Licona Gomez Aldo Daniel.
 */
public class Catsup extends Ingrediente
{
	/* Referencia del Baguette. */  
	Baguette baguette;
	/* Costo del ingrediente. */
	int costo = 3;

	public Catsup(Baguette baguette)
	{
		this.baguette = baguette;
	}

	/* Regresa la descripcion del Baguette con el ingrediente. */
	public String getDescripcion()
	{
		return baguette.getDescripcion() + "\nCatsup            $3";
	}

	/* Regresa el costo del Baguette con el ingrediente. */
	public int costo()
	{
		return costo + baguette.costo();
	}
}