/**
 * Clase del estado PreparaDulce de la Maquina.
 */
public class PreparaDulce implements EstadoMaquina
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
	 * Imprime que la Maquina esta Preparando Dulces, no se Apagara nada hasta terminar.
	 */
	@Override
	public void apagar()
	{
		System.out.println("La Maquina esta Preparando Dulces, no se Apagara nada hasta terminar.");
	}

	/**
	 * Imprime que la Maquina Maquina ya esta Preparando Dulces.
	 */
	@Override
	public void preparandodulce()
	{
		System.out.println("La Maquina ya esta Preparando Dulces.");
	}

	/**
	 * La Maquina cambia de estado a Empaca.
	 */
	@Override
	public void empacando()
	{
		System.out.println("La Maquina esta Preparando Dulces, no podra Empacar hasta terminar.");
		System.out.println("Terminando\n...\n..\n.\nListo.");
		maquina.setState(new Empaca());
		System.out.println("La Maquina comenzara a Empacar\n");
	}

	/**
	 * Imprime que la Maquina esta Preparando Dulces, no se pondra en Espera hasta terminar.
	 */
	@Override
	public void enEspera()
	{
		System.out.println("La Maquina esta Preparando Dulces, no se pondra en Espera hasta terminar.");
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
		System.out.println("Estado de la Maquina: [*Preparando Dulce*]\n");
	}
}