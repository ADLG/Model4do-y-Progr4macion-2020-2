/**
 * Interfaz para los Estados del robot. Un metodo puede cambiar automaticamente
 * el estado del robot, dependiendo del estado en que se encuentre el robot (State).
 * @author Licona Gomez Aldo Daniel
 */
public interface EstadoRobot
{
	/**
	 * Activa al robot o envia un mensaje de que se encuentra Activado
	 * dependiendo del estado del robot.
	 */
	void activar();

	/**
	 * Suspende al robot o envia un mensaje de que se encuentra Suspendido
	 * dependiendo del estado del robot.
	 */
	void suspender();

	/**
	 * Hace Caminar al robot o envia un mensaje de que se encuentra Caminando
	 * dependiendo del estado del robot.
	 */
	void camina();

	/**
	 * Hace Construir al robot o envia un mensaje de que se encuentra Construyendo
	 * dependiendo del estado del robot.
	 */
	void construye();

	/**
	 * Hace que el robot reciba una orden o envia un mensaje de que se encuentra
	 * recibiendo una orden dependiendo del estado del robot.
	 */
	void recibeOrden();

	/**
	 * Reabastece al robot o envia un mensaje de que se encuentra Reabasteciendo
	 * dependiendo del estado del robot.
	 */
	void reabastece();


	/**
     * Establece el estado del robot.
     * @param robot es la refecrencia que guarda el robot de tipo privado de la clase
     * en la que se encuentre.
     */
	void setRobot(Robot robot);

	/**
	 *	Imprime un mensaje del estado en el que se encuentra el robot.
	 */
	void getRobot();
}