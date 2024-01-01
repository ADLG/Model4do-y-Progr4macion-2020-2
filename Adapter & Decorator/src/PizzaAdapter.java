/**
 * Clase que funcionara como Adaptador de la clase Pizza.
 * @author Licona Gomez Aldo Daniel.
 */
public class PizzaAdapter implements Baguette
{
	/* Referencia de la clase Pizza para el uso de los metodos de dicha clase. */
	Pizza pizza;

	public PizzaAdapter(Pizza pizza)
	{
		this.pizza = pizza;
	}

	/* Regresa la descripcion de la Pizza. */
	public String getDescripcion()
	{
		return pizza.getQueso()+"\n"+pizza.getCarne()+"\n"+pizza.getMasa()+"\n";
	}

	/* Regresa el costo de la Pizza. */
	public int costo()
	{
		return pizza.getCosto();
	}
}