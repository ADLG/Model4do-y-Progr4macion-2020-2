/**
 * Clase que contiene los metodos que serviran para definir en que estado
 * se encuentra la Maquina y para cambiarla de estado.
 */
public class Maquina
{
	/* Variable privada para guardar la refencia que se le pasa. */
	private EstadoMaquina state;

	/**
     * Constructor que inicia el estado del Maquina en Encendida.
     */
	public Maquina()
	{
		setState(new Encendida());
	}

	/**
     * Establece el estado de la Maquina, state guarda la referencia de la Maquina.
     * @param state el estado que se almacena en la variable privada state.
     */
	public void setState(EstadoMaquina state)
	{
		this.state = state;
		this.state.setMaquina(this);
	}

	/**
     * Imprime el estado en el que se encuentra la Maquina.
     */
	public void getMaquina()
	{
		this.state.getMaquina();
	}

	/**
	 * Imprime informacion acerca de lo que se puede hacer con la Maquina
	 * dependiendo del estado en el que se encuentre o cambia de estado a la Maquina.
	 */
	public void activar()
	{
		this.state.activar();
	}


	/**
	 * Imprime informacion acerca de lo que se puede hacer con la Maquina
	 * dependiendo del estado en el que se encuentre o cambia de estado a la Maquina.
	 */
	public void apagar()
	{
		this.state.apagar();
	}

	/**
	 * Imprime informacion acerca de lo que se puede hacer con la Maquina
	 * dependiendo del estado en el que se encuentre o cambia de estado a la Maquina.
	 */
	public void preparandodulce()
	{
		this.state.preparandodulce();
	}

	/**
	 * Imprime informacion acerca de lo que se puede hacer con la Maquina
	 * dependiendo del estado en el que se encuentre o cambia de estado a la Maquina.
	 */
	public void empacando()
	{
		this.state.empacando();
	}

	/**
	 * Imprime informacion acerca de lo que se puede hacer con la Maquina
	 * dependiendo del estado en el que se encuentre o cambia de estado a la Maquina.
	 */
	public void enEspera()
	{
		this.state.enEspera();
	}
}