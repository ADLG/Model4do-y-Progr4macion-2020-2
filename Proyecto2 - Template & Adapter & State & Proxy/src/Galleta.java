/**
 * Clase Abstracta Galleta.
 */
public abstract class Galleta
{
	/**
     * Imprime el procedimiento para cocinar la masa.
     */
	public abstract void cocinarMasa();
	/**
     * Imprime el procedimiento de la mezcla.
     */
	public abstract void mezcla();

	/**
     * Prepara la masa de las galletas
     * @param i leche usada para la masa.
     * @param j harina usada para la masa.
     * @param k huevos usados para la masa.
     */
	public abstract void prepararMasa(int i, int j, int k);

	/**
     * Usa elementos del almacen para crear las Galletas.
     * @param i ayuda a saber que ingredientes usar.
     */
	public abstract void usarAlmacen(int i);
}