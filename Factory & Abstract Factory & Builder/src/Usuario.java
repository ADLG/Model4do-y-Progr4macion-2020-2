/**
 * Clase para un Usuario.
 * @author Licona Gomez Aldo Daniel
 */
public class Usuario
{
	/* Variable que guardara el nombre del Usuario. */
	private String nombre;
	/* Variable que guardara el dinero del Usuario. */
	private int dinero;

	/**
     * Constructor de la clase.
     * @param nombre nombre del Usuario.
     * @param dinero dinero del Usuario.
     */
	public Usuario(String nombre, int dinero)
	{
		this.nombre = nombre;
		this.dinero = dinero;
	}

	/**
     * Metodo que muestra los datos del Usuario.
     */
	public void mostrarDatosUser()
	{
		System.out.println("Usuario: "+nombre+"\nDinero Dispobible: $"+dinero+"\n");
	}
}