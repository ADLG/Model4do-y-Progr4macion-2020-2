/**
 * Clase del estado Reabasteciendo del robot.
 * @author Licona Gomez Aldo Daniel
 */
public class Reabasteciendo implements EstadoRobot
{
	/* Variable privada para guardar la refencia que se le pasa. */
	private Robot robot;

	/**
	 * Imprime que el robot ya esta Activado.
	 */	
	@Override
	public void activar()
	{
		System.out.println("EL robot ya esta Activado.");
	}

	/**
	 * Imprime que el robot no se Suspendera, porque se esta Reabasteciendo.
	 */	
	@Override
	public void suspender()
	{
		System.out.println("El robot no se Suspendera, porque se esta Reabasteciendo.\n*Ordena al robot que termine de Reabastecerse con la opcion 6.Reabastecer");
	}

	/**
	 * Imprime que el robot no Caminara, porque se esta Reabasteciendo.
	 */	
	@Override
	public void camina()
	{
		System.out.println("El robot no Caminara, porque se esta Reabasteciendo.\n*Ordena al robot que termine de Reabastecerse con la opcion 6.Reabastecer");
	}

	/**
	 * Imprime que el robot no Construira, porque se esta Reabasteciendo.
	 */	
	@Override
	public void construye()
	{
		System.out.println("El robot no Construira, porque se esta Reabasteciendo.\n*Ordena al robot que termine de Reabastecerse con la opcion 6.Reabastecer");
	}

	/**
	 * Imprime que el robot ya recibio una Orden.
	 */	
	@Override
	public void recibeOrden()
	{
		System.out.println("El robot ya recibio una Orden.");
	}

	/**
	 * El robot Cambia de estado a Construyendo ya que se ha Reabastecido.
	 */
	@Override
	public void reabastece()
	{
		System.out.println("Reabasteciendo....			El robot ha terminado de Reabastecerse.");
		System.out.println("(El robot se dirige al terreno para comenzar a Construir.)");
		robot.setState(new Construyendo());
	}


	/**
	 * Metodo para cambiar el estado del robot.
	 * @param robot referencia a guardar por la variable privada robot de la clase.
	 */
	@Override
	public void setRobot(Robot robot)
	{
		this.robot = robot;
	}

	/**
	 * Metodo para imprimir un mensaje del estado en el que se encuentra el robot.
	 */
	@Override
	public void getRobot()
	{
		System.out.println("Estado del robot: [*Reabasteciendo....*]\n");
	}
}