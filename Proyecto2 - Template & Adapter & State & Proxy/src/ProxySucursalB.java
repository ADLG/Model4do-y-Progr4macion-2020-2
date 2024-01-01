/**
 * Clase ProxySucursalB.
 */
public class ProxySucursalB implements Sucursal
{
	/* Referencia de SucursalB. */
	Sucursal b = new SucursalB();

	/**
     * Metodo para recibir un lote.
     * @param l el lote recibido.
     */
	@Override
	public void recibirLote(Lote l)
	{
		b.recibirLote(l);
	}

	/**
     * Metodo con el cual se puede ver el inventario de la Sucursal.
     */
	@Override
	public void inventarioSucursal()
	{
		b.inventarioSucursal();
	}

	/**
     * Metodo con el cual se venden todos los lotes de la Sucursal.
     */
	@Override
	public void venderLotes()
	{
		b.venderLotes();
	}

	/**
     * Metodo que actualiza el inventario de la Sucursal.
     */
	@Override
	public void actualizarInventario()
	{
		b.actualizarInventario();
	}

	/**
     * Metodo muestra los datos de la Sucursal.
     */
	@Override
	public String datos()
	{
		return b.datos();
	}

	/**
     * Metodo que obtiene el estado de una sucursal para comprobar si esta puede pedir mas Dulces.
     */
	@Override
	public boolean getEstadoI()
	{
		return b.getEstadoI();
	}
}