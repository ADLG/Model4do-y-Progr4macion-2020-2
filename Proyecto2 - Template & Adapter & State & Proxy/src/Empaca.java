/**
 * Clase del estado Empaca de la Maquina.
 */
public class Empaca implements EstadoMaquina
{
	/* Variable privada para guardar la refencia que se le pasa. */
	private Maquina maquina;

	/**
	 * Imprime que la Maquina ya esta Encendida.
	 */
	@Override
	public void activar()
	{
		System.out.println("La Maquina ya esta Encendida.");
	}

	/**
	 * Imprime que la Maquina no se Apagara porque esta Empacando.
	 */
	@Override
	public void apagar()
	{
		System.out.println("La Maquina no se Apagara porque esta Empacando.");
	}

	/**
	 * Imprime que la Maquina ya preparo Dulces para empacar.
	 */
	@Override
	public void preparandodulce()
	{
		System.out.println("La Maquina ya preparo Dulces para empacar.");
	}

	/**
	 * Imprime que la Maquina ya esta Empacando los dulces.
	 */
	@Override
	public void empacando()
	{
		System.out.println("La Maquina ya esta Empacando los dulces.");
	}

	/**
	 * La Maquina Cambia de Estado a ModoEspera.
	 */
	@Override
	public void enEspera()
	{
		System.out.println("La Maquina ya Empaco los dulces, Se quedara en Modo de Espera.\n");
		maquina.setState(new ModoEspera());
	}

	/**
	 * Metodo para cambiar el estado de la Maquina.
	 * @param maquina referencia a guardar por la variable privada Maquina de la clase.
	 */
	@Override
	public void setMaquina(Maquina maquina)
	{
		this.maquina = maquina;
	}

	/**
	 * Metodo para imprimir un mensaje del estado en el que se encuentra la Maquina.
	 */
	@Override
	public void getMaquina()
	{
		System.out.println("Estado de la Maquina: [*Empacando*]\n");
	}
}