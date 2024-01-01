/**
 * Clase del estado Activado del robot.
 * @author Licona Gomez Aldo Daniel
 */
public class Activado implements EstadoRobot
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
	 * El robot Cambia de estado a Caminando.
	 */
	@Override
	public void camina()
	{
		System.out.println("El robot Camina.");
		robot.setState(new Caminando());
	}

	/**
	 * Imprime que el robot no Construira una Casa porque no ha recibido una Orden.
	 */
	@Override
	public void construye()
	{
		System.out.println("El robot no Construira una Casa porque no ha recibido una Orden.");
	}

	/**
	 * El robot Cambia de estado a RecibiendoOrden.
	 */
	@Override
	public void recibeOrden()
	{
		System.out.println("El robot recibe una Orden.");
		robot.setState(new RecibiendoOrden());
	}

	/**
	 * Imprime que el robot no se Reabastecera porque no ha recibido una Orden.
	 */
	@Override
	public void reabastece()
	{
		System.out.println("El robot no se Reabastecera porque no ha recibido una Orden.");
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
		System.out.println("Estado del robot: [*Activado*]\n");
	}
}