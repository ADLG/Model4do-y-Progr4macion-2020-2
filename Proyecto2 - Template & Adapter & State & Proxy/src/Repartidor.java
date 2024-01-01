/**
 * Clase Repartidor.
 */
public class Repartidor
{
	/* Entero que guarda el id del Repartidor. */
	int id;
	/* String que guarda el rfc del Repartidor. */
	String rfc;
	/* String que guarda el nombre del Repartidor. */
	String nombre;

	/* Referencia de lote para usar sus metodos. */
	Lote lote;
	/* Referencia de Sucursal para usar sus metodos. */
	Sucursal sucursal;
	/* String que guarda el camion del Repartidor. */
	String camion;
	/* String que guarda la notificacion del Repartidor. */
	String notificacion;
	/* Entero que guarda el numero de Sucursal que se le asigno al Repartidor. */
	int numeroSucursal;

	public Repartidor(String nombre, int id, String rfc)
	{
		this.id = id;
		this.rfc = rfc;
		this.nombre = nombre;
	}

	/**
     * Regresa el id del Repartidor.
     * @return el id del Repartidor.
     */
	public int id()
	{
		return id;
	}

	/**
     * Regresa el rfc del Repartidor.
     * @return el rfc del Repartidor.
     */
	public String rfc()
	{
		return rfc;
	}

	/**
     * Regresa el nombre del Repartidor.
     * @return el nombre del Repartidor.
     */
	public String nombre()
	{
		return nombre;
	}

	/**
     * Recibe el lote.
     * @param lote recibido.
     */
	public void recibeLote(Lote lote)
	{
		this.lote = lote;
	}

	/**
     * Envia el lote a la Sucursal asignada.
     */
	public void enviarLote()
	{
		if (numeroSucursal==1)
			{sucursal = new SucursalA();
			sucursal.recibirLote(this.lote);}
		else if (numeroSucursal==2)
			{sucursal = new SucursalB();
			sucursal.recibirLote(this.lote);}
		else
			{sucursal = new SucursalC();
			sucursal.recibirLote(this.lote);}
	}

	/**
     * Se le asigna una sucursal.
     * @param i la sucursal asignada.
     */
	public void setNoSucursal(int i)
	{
		this.numeroSucursal = i;
		if (i==1)
			sucursal = new SucursalA();
		else if (i==2)
			sucursal = new SucursalB();
		else
			sucursal = new SucursalC();
	}

	/**
     * Regresa el numero de sucursal asignada.
     * @return el numero de sucursal asignada.
     */
	public int getNoSucursal()
	{
		return numeroSucursal;
	}

	/**
     * Se le asigna un camion al Repartidor.
     * @param camion camion asignado.
     */
	public void setCamion(String camion)
	{
		this.camion = camion;
	}

	/**
     * Regresa el camion asignado.
     * @return el camion asignado.
     */
	public String getCamion()
	{
		return camion;
	}

	/**
     * Muestra los datos del Repartidor.
     */
	public void mostrarDatos()
	{
		System.out.println("Nombre: "+nombre+"\nrfc: "+rfc+"\nid: "+id+"\n");
	}

	/**
     * El Repartidor Recibe una Notificacion.
     */
	public void recibirNotificacion()
	{
		System.out.println("*Notificacion para el Repartidor "+nombre());
		notificacion = nombre()+" ya hay lotes disponibles para entregar.";
		System.out.println(notificacion+"\n");
	}
}