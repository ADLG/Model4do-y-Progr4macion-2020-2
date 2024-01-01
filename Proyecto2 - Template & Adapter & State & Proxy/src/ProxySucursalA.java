/**
 * Clase ProxySucursalA.
 */
public class ProxySucursalA implements Sucursal
{
	/* Referencia de SucursalA. */
	Sucursal a = new SucursalA();

	/**
     * Metodo para recibir un lote.
     * @param l el lote recibido.
     */
	@Override
	public void recibirLote(Lote l)
	{
		a.recibirLote(l);
	}

	/**
     * Metodo con el cual se puede ver el inventario de la Sucursal.
     */
	@Override
	public void inventarioSucursal()
	{
		a.inventarioSucursal();
	}

	/**
     * Metodo con el cual se venden todos los lotes de la Sucursal.
     */
	@Override
	public void venderLotes()
	{
		a.venderLotes();
	}

	/**
     * Metodo que actualiza el inventario de la Sucursal.
     */
	@Override
	public void actualizarInventario()
	{
		a.actualizarInventario();
	}

	/**
     * Metodo muestra los datos de la Sucursal.
     */
	@Override
	public String datos()
	{
		return a.datos();
	}
	
	/**
     * Metodo que obtiene el estado de una sucursal para comprobar si esta puede pedir mas Dulces.
     */
	@Override
	public boolean getEstadoI()
	{
		return a.getEstadoI();
	}
}