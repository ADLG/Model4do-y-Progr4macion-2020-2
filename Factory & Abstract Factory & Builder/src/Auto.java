import java.util.List;
/**
 * Interfaz para un Auto perzonalizado o Autos ya predefinidos.
 * @author Licona Gomez Aldo Daniel
 */
public interface Auto
{
	/**
     * Crear el Auto con las partes elegidas por el Usuario.
     */
	public void crear();

	/**
     * Recibe las opciones del Usuario en forma de lista.
     * @param opciones las opciones elegidas por el usuario.
     */
	public void listaPartes(List<Integer> opciones);

	/**
     * Imprime las caracteristicas del Auto.
     */
	public void informacionAuto();

	/**
     * Imprime el tipo de partes elegidas por el Usuario.
     */
	public void partes();
}