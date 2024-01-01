/**
 * Clase del estado ModoEspera de la Maquina.
 */
public class ModoEspera implements EstadoMaquina
{
	/* Variable privada para guardar la refencia que se le pasa. */
	private Maquina maquina;

	/**
	 * Imprime que la Maquina Maquina ya esta Encendida.
	 */
	@Override
	public void activar()
	{
		System.out.println("La Maquina ya esta Encendida.");
	}

	/**
	 * El robot Cambia de estado a Caminando.
	 */
	@Override
	public void apagar()
	{
		System.out.println("\nLa Maquina se Apagara...		");
		System.out.println("*La Maquina se Apago.");
		maquina.setState(new Apagada());
	}

	/**
	 * Imprime que el robot no Construira una Casa porque no ha recibido una Orden.
	 */
	@Override
	public void preparandodulce()
	{
		System.out.println("La Maquina Preparara Dulces.");
		maquina.setState(new PreparaDulce());
	}

	/**
	 * Imprime que la Maquina no Empacara porque esta en Espera.
	 */
	@Override
	public void empacando()
	{
		System.out.println("La Maquina no Empacara porque esta en Espera");
	}

	/**
	 * Imprime que la Maquina ya esta en Espera.
	 */
	@Override
	public void enEspera()
	{
		System.out.println("La Maquina ya esta en Espera");
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
		System.out.println("Estado de la Maquina: [*Modo de Espera*]\n");
	}
}