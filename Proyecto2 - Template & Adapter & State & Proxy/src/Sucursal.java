/**
 * Interfaz para las Sucursales.
 */
public interface Sucursal
{
	/**
     * Metodo para recibir un lote.
     * @param l el lote recibido.
     */
	void recibirLote(Lote l);

	/**
     * Metodo con el cual se puede ver el inventario de la Sucursal.
     */
	void inventarioSucursal();
	/**
     * Metodo con el cual se venden todos los lotes de la Sucursal.
     */
	void venderLotes();
	/**
     * Metodo que actualiza el inventario de la Sucursal.
     */
	void actualizarInventario();
	/**
     * Metodo muestra los datos de la Sucursal.
     */
	String datos();
	/**
     * Metodo que obtiene el estado de una sucursal para comprobar si esta puede pedir mas Dulces.
     */
	boolean getEstadoI();
}