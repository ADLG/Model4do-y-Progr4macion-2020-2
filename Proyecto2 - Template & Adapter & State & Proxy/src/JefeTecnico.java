import java.util.ArrayList;
import java.util.List;
/**
 * Clase Repostero que usa las maquinas Wonka3000 y Galleneitor5000.
 */
public class JefeTecnico
{
	/* Referencia de EmpresaDulcesRosa para usar sus metodos. */
	EmpresaDulcesRosa e = new EmpresaDulcesRosa();
	/* Lista de tipo Repartidor para tener a los Repartidores. */
	List<Repartidor> repartidoresJT = new ArrayList<Repartidor>();

	/* Referencia de Repartidor para usarlo en los metodos. */
	Repartidor re;

	/* Referencia de SucuralA para usar sus metodos. */
	Sucursal a = new ProxySucursalA();
	/* Referencia de SucuralB para usar sus metodos. */
	Sucursal b = new ProxySucursalB();
	/* Referencia de SucuralC para usar sus metodos. */
	Sucursal c = new ProxySucursalC();

	/* Entero para obtener el numero de una Sucursal. */
	int numeroSucursal;
	/* Entero que sirve como contador. */
	int contador = 0;

	/**
     * Relaciona las sucursales con los Repartidores de forma aleatoria .
     */
	public void relacionSucursales()
	{
		repartidoresJT = e.getLista();
		System.out.println();
		System.out.println("Relacion de los Repartidores y las Sucursales:\n");
		for (Repartidor r: repartidoresJT)
		{
			re = repartidoresJT.get(contador);
			numeroSucursal = (int)(Math.random()*3+1);
			re.setNoSucursal(numeroSucursal);
			contador++;
			if (numeroSucursal==1)
				System.out.println("El Repartidor: "+re.nombre()+" ya se le Asigno una Sucursal\n"+a.datos()+"\n");
			else if (numeroSucursal==2)
				System.out.println("El Repartidor: "+re.nombre()+" ya se le Asigno una Sucursal\n"+b.datos()+"\n");
			else
				System.out.println("El Repartidor: "+re.nombre()+" ya se le Asigno una Sucursal\n"+c.datos()+"\n");
		}
		System.out.println();
	}

	/**
     * Relacion a los Repartidores con una Sucursal en especifico.
     * @param i la Sucursal a asignar a los repartidores.
     */
	public void relacionSucursal(int numeroSucursal)
	{
		repartidoresJT = e.getLista();
		System.out.println();
		System.out.println("Relacion de los Repartidores y las Sucursales:\n");
		for (Repartidor r: repartidoresJT)
		{
			re = repartidoresJT.get(contador);
			this.numeroSucursal = numeroSucursal;
			re.setNoSucursal(numeroSucursal);
			contador++;
			if (numeroSucursal==1)
				System.out.println("El Repartidor: "+re.nombre()+" ya se le Asigno una Sucursal\n"+a.datos()+"\n");
			else if (numeroSucursal==2)
				System.out.println("El Repartidor: "+re.nombre()+" ya se le Asigno una Sucursal\n"+b.datos()+"\n");
			else
				System.out.println("El Repartidor: "+re.nombre()+" ya se le Asigno una Sucursal\n"+c.datos()+"\n");
		}
		System.out.println();
	}

	/**
     * Entrega lotes a los repartidores.
     * @param l1 lote a entregar a un repartidor.
	 * @param l2 lote a entregar a un repartidor.
     * @param l3 lote a entregar a un repartidor.
     * @param l4 lote a entregar a un repartidor.
     * @param l5 lote a entregar a un repartidor.
	 * @param l6 lote a entregar a un repartidor.
	 * @param l7 lote a entregar a un repartidor.
     */
	public void entregarLotesRepartidores(Lote l1, Lote l2, Lote l3, Lote l4, Lote l5, Lote l6, Lote l7)
	{
		repartidoresJT.get(0).recibeLote(l1);
		repartidoresJT.get(1).recibeLote(l2);
		repartidoresJT.get(2).recibeLote(l3);
		repartidoresJT.get(3).recibeLote(l4);
		repartidoresJT.get(4).recibeLote(l5);
		repartidoresJT.get(5).recibeLote(l6);
		repartidoresJT.get(6).recibeLote(l7);
		for (Repartidor r: repartidoresJT)
			r.enviarLote();
	}

	/**
     * Norifica a los repartidores para que entregen sus lotes.
     */
	public void notificarRepartidores()
	{
		System.out.println("Notificaciones:\n");
		for (Repartidor r: repartidoresJT)
			r.recibirNotificacion();
		System.out.println("Estado de entregas:\n");
		for (Repartidor r: repartidoresJT)
			System.out.println("El Repartidor "+r.nombre()+ " esta entregando su lote...");
		System.out.println("\nLos repartidores terminaron de entregar los lotes de Dulces.");
	}

	/**
     * Imprime el inventario de cada sucursal.
     */
	public void reporteSucursales()
	{
		a.actualizarInventario();
		b.actualizarInventario();
		c.actualizarInventario();

		a.inventarioSucursal();
		b.inventarioSucursal();
		c.inventarioSucursal();
	}

	/**
     * Imprime el inventario de la sucursal A y lo actualiza.
     */
	public void reporteSucursal()
	{
		a.actualizarInventario();
		a.inventarioSucursal();
	}

	/**
     * Imprime el inventario de la sucursal A.
     */
	public void reporteSucursalA()
	{
		a.inventarioSucursal();
	}

	/**
     * Vende los lotes de todas las Sucursales.
     */
	public void vender()
	{
		a.venderLotes();
		b.venderLotes();
		c.venderLotes();
	}

	/**
     * Vende los lotes de la Sucursal A.
     */
	public void venderA()
	{
		a.venderLotes();
	}

	/**
     * Obtiene el estado de la Sucursal A.
     */
	public boolean getEstadoSA()
	{
		return a.getEstadoI();
	}
}