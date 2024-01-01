/**
 * Clase ProxySucursalC.
 */
public class ProxySucursalC implements Sucursal
{
	/* Referencia de SucursalC. */
	Sucursal c = new SucursalC();

	/**
     * Metodo para recibir un lote.
     * @param l el lote recibido.
     */
	@Override
	public void recibirLote(Lote l)
	{
		c.recibirLote(l);
	}
	
	/**
     * Metodo con el cual se puede ver el inventario de la Sucursal.
     */
	@Override
	public void inventarioSucursal()
	{
		c.inventarioSucursal();
	}

	/**
     * Metodo con el cual se venden todos los lotes de la Sucursal.
     */
	@Override
	public void venderLotes()
	{
		c.venderLotes();
	}

	/**
     * Metodo que actualiza el inventario de la Sucursal.
     */
	@Override
	public void actualizarInventario()
	{
		c.actualizarInventario();
	}

	/**
     * Metodo muestra los datos de la Sucursal.
     */
	@Override
	public String datos()
	{
		return c.datos();
	}

	/**
     * Metodo que obtiene el estado de una sucursal para comprobar si esta puede pedir mas Dulces.
     */
	@Override
	public boolean getEstadoI()
	{
		return c.getEstadoI();
	}
}