/**
 * Interfaz para el proceso de preparacion de las clases que implementen esta interfaz.
 */
public interface ProcesoDePreparacion
{
	/**
     * Metodo que se implementara en los tipos de Dulces.
     * @param i ayuda a escoger el tipo de mezcla.
     * @param j ayuda a saber que ingredientes decrementaran en la clase Almacen.
     */
	void prepararDulce(int i, int j);
}