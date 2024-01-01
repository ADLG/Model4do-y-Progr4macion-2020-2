/**
 * Clase abstracta para la descripcion y costo de los ingredientes del Baguette.
 * @author Licona Gomez Aldo Daniel.
 */
public abstract class Ingrediente implements Baguette
{
	/* Metodos abstractos que se implementaran en las clases de los ingredientes. */
	public abstract String getDescripcion();
	public abstract int costo();
}