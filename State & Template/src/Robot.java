/**
 * Clase que contiene los metodos que serviran para definir en que estado se encuentra
 * el robot y para cambiarlo de estado.
 * @author Licona Gomez Aldo Daniel
 */
public class Robot
{
	/* Variable privada para guardar la refencia que se le pasa. */
	private EstadoRobot state;

	/**
     * Constructor que inicia el estado del robot en Activado.
     */
	public Robot()
	{
		setState(new Activado());
	}

	/**
     * Imprime instrucciones y un saludo para el operador.
     */
	public void saludo()
	{
		System.out.println("****Esta es una simulacion de un Robot (propiedad de la empresa MI HOGARCITO) que construye casas****\nHola Operador, espero tus instrucciones.");
		System.out.println("Las ordenes que debe llevar a cabo el robot para construir una casa son:\n\n1-Recibir una orden\n2-Reabastecer\n3-Ordenar que termine de reabastecerse\n4-Construir\n");
		System.out.println("(El robot se encuentra encendido en todo momento).\nLa construccion tendra un costo inicial de $1,000,000\n\nEl menu de interaccion es el siguiente:\n");
	}

	/**
     * Establece el estado del robot, state guarda la referencia del robot.
     * @param state el estado que se almacena en la variable privada state.
     */
	public void setState(EstadoRobot state)
	{
		this.state = state;
		this.state.setRobot(this);
	}

	/**
     * Imprime el estado en el que se encuentra el robot.
     */
	public void getRobot()
	{
		this.state.getRobot();
	}

	/**
	 * Imprime informacion acerca de lo que se puede hacer con el robot
	 * dependiendo del estado en el que se encuentre o cambia de estado al robot.
	 */
	public void activar()
	{
		this.state.activar();
	}

	/**
	 * Imprime informacion acerca de lo que se puede hacer con el robot
	 * dependiendo del estado en el que se encuentre o cambia de estado al robot.
	 */
	public void suspender()
	{
		this.state.suspender();
	}

	/**
	 * Imprime informacion acerca de lo que se puede hacer con el robot
	 * dependiendo del estado en el que se encuentre o cambia de estado al robot.
	 */
	public void camina()
	{
		this.state.camina();
	}

	/**
	 * Imprime informacion acerca de lo que se puede hacer con el robot
	 * dependiendo del estado en el que se encuentre o cambia de estado al robot.
	 */
	public void construye()
	{
		this.state.construye();
	}

	/**
	 * Imprime informacion acerca de lo que se puede hacer con el robot
	 * dependiendo del estado en el que se encuentre o cambia de estado al robot.
	 */
	public void recibeOrden()
	{
		this.state.recibeOrden();
	}

	/**
	 * Imprime informacion acerca de lo que se puede hacer con el robot
	 * dependiendo del estado en el que se encuentre o cambia de estado al robot.
	 */
	public void reabastece()
	{
		this.state.reabastece();
	}
}