/**
 * Interfaz para los Estados de la Maquina. Un metodo puede cambiar automaticamente
 * el estado de la Maquina, dependiendo del estado en que se encuentre la Maquina.
 */
public interface EstadoMaquina
{
	/**
	 * Enciende la Maquina o envia un mensaje de que se encuentra Encendida
	 * dependiendo del estado de la Maquina
	 */
	void activar();

	/**
	 * Hace Caminar a la Maquina o envia un mensaje de que se encuentra Apagada
	 * dependiendo del estado de la Maquina.
	 */
	void apagar();

	/**
	 * Hace Preparar un dulce a la Maquina o envia un mensaje de que se encuentra Preparando un dulce
	 * dependiendo del estado de la Maquina.
	 */
	void preparandodulce();

	/**
	 * Hace que la Maquina empaque o envia un mensaje de que se encuentra
	 * empaquetando una orden dependiendo del estado del Maquina.
	 */
	void empacando();

	/**
	 * Pone en espera a la Maquina o envia un mensaje de que se encuentra en espera
	 * dependiendo del estado de la Maquina.
	 */
	void enEspera();

	/**
     * Establece el estado de la Maquina.
     * @param maquina es la refecrencia que guarda la Maquina de tipo privado de la clase
     * en la que se encuentre.
     */
	void setMaquina(Maquina maquina);

	/**
	 *	Imprime un mensaje del estado en el que se encuentra la Maquina.
	 */
	void getMaquina();
}