/**
 * Clase del estado Apagada de la Maquina.
 */
public class Apagada implements EstadoMaquina
{
	/* Variable privada para guardar la refencia que se le pasa. */
	private Maquina maquina;

	/**
	 * La Maquina cambia de estado a Encendida.
	 */
	@Override
	public void activar()
	{
		System.out.println("La Maquina se Encendera.");
		maquina.setState(new Encendida());
	}

	/**
	 * Imprime que la Maquina ya esta Apagada.
	 */
	@Override
	public void apagar()
	{
		System.out.println("La Maquina ya esta Apagada.");
	}

	/**
	 * Imprime que la Maquina no preparara Dulces porque esta Apagada.
	 */
	@Override
	public void preparandodulce()
	{
		System.out.println("La Maquina no preparara Dulces porque esta Apagada.");
	}

	/**
	 * Imprime que la Maquina no puede Empacar porque esta Apagada.
	 */
	@Override
	public void empacando()
	{
		System.out.println("La Maquina no puede Empacar porque esta Apagada");
	}

	/**
	 * Imprime que la Maquina no estara en Modo de Espera porque esta Apagada.
	 */
	@Override
	public void enEspera()
	{
		System.out.println("La Maquina no estara en Modo de Espera porque esta Apagada");
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
		System.out.println("Estado de la Maquina: [*Apagada*]\n");
	}
}