/**
 * Clase del estado Caminando del robot.
 * @author Licona Gomez Aldo Daniel
 */
public class Caminando implements EstadoRobot
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
	 * El robot Cambia de estado a Suspendido.
	 */
	@Override
	public void suspender()
	{
		System.out.println("El robot se Suspendera.");
		robot.setState(new Suspendido());
	}

	/**
	 * Imprime que el robot ya esta Caminando.
	 */
	@Override
	public void camina()
	{
		System.out.println("EL robot ya esta Caminando.");
	}

	/**
	 * Imprime que el robot no Construira una Casa porque esta Caminando.
	 */
	@Override
	public void construye()
	{
		System.out.println("EL robot no Construira una Casa porque esta Caminando.");
	}

	/**
	 *  El robot Cambia de estado a RecibiendoOrden.
	 */
	@Override
	public void recibeOrden()
	{
		System.out.println("El robot ha recibido una Orden.");
		robot.setState(new RecibiendoOrden());
	}

	/**
	 * Imprime que el robot no se Reabastecera hasta recibir una Orden.
	 */
	@Override
	public void reabastece()
	{
		System.out.println("El robot no se Reabastecera hasta recibir una Orden.");
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
		System.out.println("Estado del robot: [*Caminando....*]\n");
	}
}