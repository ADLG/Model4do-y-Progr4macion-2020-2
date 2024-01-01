/**
 * Clase del estado Suspendido del robot.
 * @author Licona Gomez Aldo Daniel
 */
public class Suspendido implements EstadoRobot
{
	/* Variable privada para guardar la refencia que se le pasa. */
	private Robot robot;

	/**
	 * El robot Cambia de estado a Activado.
	 */
	@Override
	public void activar()
	{
		System.out.println("El robot se ha Activado.");
		robot.setState(new Activado());
	}

	/**
	 * Imprime que el robot ya esta Suspendido.
	 */
	@Override
	public void suspender()
	{
		System.out.println("El robot ya esta Suspendido.");
	}

	/**
	 * Imprime que el robot no puede Caminar porque esta Suspendido.
	 */
	@Override
	public void camina()
	{
		System.out.println("El robot no puede Caminar porque esta Suspendido.");
	}

	/**
	 * Imprime que el robot no puede Construir una Casa porque esta Suspendido.
	 */
	@Override
	public void construye()
	{
		System.out.println("El robot no puede Construir una Casa porque esta Suspendido.");
	}

	/**
	 * Imprime que el robot no puede recibir una Orden porque esta Suspendido.
	 */
	@Override
	public void recibeOrden()
	{
		System.out.println("El robot no puede recibir una Orden porque esta Suspendido.");
	}

	/**
	 * Imprime que el robot no puede Reabastecerse porque esta Suspendido.
	 */
	@Override
	public void reabastece()
	{
		System.out.println("El robot no puede Reabastecerse porque esta Suspendido.");
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
		System.out.println("Estado del robot: [*Suspendido*]\n");
	}
}