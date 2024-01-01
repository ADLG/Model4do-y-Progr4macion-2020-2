/**
 * Clase del estado Encendido de la Maquina.
 */
public class Encendida implements EstadoMaquina
{
	/* Variable privada para guardar la refencia que se le pasa. */
	private Maquina maquina;

	/**
	 * Imprime que la Maquina ya esta Encendida.
	 */
	@Override
	public void activar()
	{
		System.out.println("[La Maquina ya esta Encendida.]");
	}

	/**
	 * La Maquina Cambia de estado a Apagada.
	 */
	@Override
	public void apagar()
	{
		System.out.println("La Maquina se Apagara.");
		maquina.setState(new Apagada());
	}

	/**
	 * La Maquina Cambia de estado a PreparaDulce.
	 */
	@Override
	public void preparandodulce()
	{
		System.out.println("La Maquina Preparara Dulces.");
		maquina.setState(new PreparaDulce());
	}

	/**
	 * Imprime que La Maquina no tiene Dulces para Empacar.
	 */
	@Override
	public void empacando()
	{
		System.out.println("La Maquina no tiene Dulces para Empacar.");
	}

	/**
	 * Imprime que La Maquina no estara en Espera.
	 */
	@Override
	public void enEspera()
	{
		System.out.println("La Maquina no estara en Espera");
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
		System.out.println("Estado de la Maquina: [*Encendida*]\n");
	}
}