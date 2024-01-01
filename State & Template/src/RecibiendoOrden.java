/**
 * Clase del estado RecibiendoOrden del robot.
 * @author Licona Gomez Aldo Daniel
 */
public class RecibiendoOrden implements EstadoRobot
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
	 * Imprime que el robot no se Suspendera porque esta Recibiendo una Orden.
	 */	
	@Override
	public void suspender()
	{
		System.out.println("El robot no se Suspendera porque esta Recibiendo una Orden.");
	}

	/**
	 * Imprime que el robot no Caminara, porque esta Recibiendo una Orden.
	 */	
	@Override
	public void camina()
	{
		System.out.println("El robot no Caminara, porque esta Recibiendo una Orden.");
	}

	/**
	 * Imprime que el robot no Construira porque no se ha Reabastecido con los materiales necesarios para construir la casa.
	 */	
	@Override
	public void construye()
	{
		System.out.println("El robot no Construira porque no se ha Reabastecido con los materiales necesarios para construir la casa.");
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
	 * El robot Cambia de estado a Reabasteciendo despues de dirigirse al area de materiales.
	 */
	@Override
	public void reabastece()
	{
		System.out.println("El robot se dirige al area de materiales para Reabastecerse");
		robot.setState(new Reabasteciendo());
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
		System.out.println("Estado del robot: [*Recibiendo una Orden....*]\n");
	}
}