/**
 * Clase del estado Construyendo del robot.
 * @author Licona Gomez Aldo Daniel
 */
public class Construyendo implements EstadoRobot
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
	 * Imprime que el robot no se Suspendera, porque esta Construyendo una Casa.
	 */	
	@Override
	public void suspender()
	{
		System.out.println("El robot no se Suspendera, porque esta Construyendo una Casa.");
	}

	/**
	 * Imprime que el robot no Caminara, porque esta Construyendo una Casa.
	 */	
	@Override
	public void camina()
	{
		System.out.println("El robot no Caminara, porque esta Construyendo una Casa.");
	}

	/**
	 * El robot Cambia de estado a Suspendido despues de terminar de construir la casa.
	 */
	@Override
	public void construye()
	{
		System.out.println("El robot comenzara a Construir la Casa :)");
		System.out.println("Construyendo....\nConstruyendo...\nConstruyendo..\nConstruyendo.\n");
		System.out.println("**************************************************");
		System.out.println("*                                                *");
		System.out.println("*   El robot ha terminado de Construir la Casa   *");
		System.out.println("*                                                *");
		System.out.println("**************************************************");
		System.out.println("\nEl robot se dirige al area de descanso....			El robot ha llegado al area de descanso.");
		System.out.println("El robot se Suspendera....					El robot se ha Suspendido.\n");
		robot.setState(new Suspendido());
	}

	/**
	 * Imprime que el robot ya ha recibido una Orden, no podra recibir otra Orden hasta terminar de Construir la Casa.
	 */	
	@Override
	public void recibeOrden()
	{
		System.out.println("El robot ya ha recibido una Orden, no podra recibir otra Orden hasta terminar de Construir la Casa.");
	}

	/**
	 * Imprime que el robot ya se ha reabastecido con los materiales necesarios para terminar de Construir la Casa.
	 */	
	@Override
	public void reabastece()
	{
		System.out.println("El robot ya se ha reabastecido con los materiales necesarios para terminar de Construir la Casa.");
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
		System.out.println("Estado del robot: [*Construyendo....*]\n");
	}
}