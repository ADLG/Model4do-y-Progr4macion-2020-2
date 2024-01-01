import java.util.Hashtable;
import java.util.Enumeration;
/**
 * Clase SucursalC par establecer sus lotes y su inventario.
 */
public class SucursalC implements Sucursal
{
	/* Hashtable de tipo Lote para guardar los Lotes, con identificador de tipo Integer. */
	static Hashtable<Integer,Lote> inventario = new Hashtable<Integer,Lote>();
	/* Hashtable de tipo Integer para guardar el tipo de dulce que hay, con identificador de tipo Integer. */
	static Hashtable<Integer,Integer> tipoDulce = new Hashtable<Integer,Integer>();
	/* Hashtable de tipo String que contiene el inventario de la Sucursal, con identificador de tipo Integer. */
	Hashtable<Integer,String> inventarioCompleto = new Hashtable<Integer,String>();
	/* Variable de tipo String para añadir elementos a la lista inventarioCompleto. */
	String auxInventario;
	/* Entero para guardar el tamaño de la lista. */
	int aux=0;
	/* Entero para ayudar a actualizar los Lotes que hay. */
	int actualizar;
	/* Booleano para comprobar si le hace falta o no Dulces a la Sucursal. */
	boolean suficiente = false;

	/* Entero para guardar cuantos Chocolates con Almendras hay en la Sucursal. */
	int contadorChoA=0;
	/* Entero para guardar cuantos Chocolates Oscuros hay en la Sucursal. */
	int contadorChoO=0;
	/* Entero para guardar cuantos Chocolates con Leche hay en la Sucursal. */
	int contadorChoL=0;
	/* Entero para guardar cuantas Gomitas de Ositos Dulces hay en la Sucursal. */
	int contadorGomO=0;
	/* Entero para guardar cuantas Gomitas de Gusanos Acidos hay en la Sucursal. */
	int contadorGomA=0;
	/* Entero para guardar cuantas Gomitas de Frutas con Chamoy hay en la Sucursal. */
	int contadorGomC=0;
	/* Entero para guardar cuantas Galletas Saladas hay en la Sucursal. */
	int contadorGallS=0;
	/* Entero para guardar cuantas Galletas De Mermelada hay en la Sucursal. */
	int contadorGallM=0;
	/* Entero para guardar cuantas Galletas Chamoy hay en la Sucursal. */
	int contadorGallC=0;

	/* String que guarda el nombre de la sucursal. */
	String nombre = "Sucursal C";
	/* Entero para guardar el id la Sucursal. */
	int id = 370;
	/* String que guarda la direccion de la sucursal. */
	String direccion = "Acatitla";
	/* Entero para ayudar a identificar el tipo de Dulce. */
	static int i=0;
	/* Entero que ayuda a ser variable para guardar el tamaño de una Hashtable. */
	int j=0;

	/**
     * Metodo que regresa los datos de la Sucursal como String.
     * @return los datos de la Sucursal.
     */
	public String datos()
	{
		return "Datos de la Sucursal\nNombre: "+nombre+"\nId: "+id+"\nDireccion: "+direccion;
	}

	/**
     * Metodo que regresa el estado del inventario de la Sucursal.
     * @return el estado del inventario de la Sucursal.
     */
	public boolean getEstadoI()
	{
		return suficiente;
	}

	/**
     * Metodo que actualiza el inventario de la Sucursal.
     */
	public void actualizarInventario()
	{
		Enumeration e = tipoDulce.elements();
		while (e.hasMoreElements())
		{	
			actualizar = (Integer)e.nextElement();
			switch (actualizar)
			{
				case 0:
				break;
				case 11:contadorChoA++;
				break;
				case 12:contadorChoO++;
				break;
				case 13:contadorChoL++;
				break;
				case 21:contadorGomO++;
				break;
				case 22:contadorGomA++;
				break;
				case 23:contadorGomC++;
				break;
				case 31:contadorGallS++;
				break;
				case 32:contadorGallM++;
				break;
				case 33:contadorGallC++;
				break;
				default:System.out.println("No deberia");
			}
		}
	}

	/**
     * Metodo para recibir un lote.
     * @param l el lote recibido.
     */
	public void recibirLote(Lote l)
	{
		inventario.put(i,l);
		tipoDulce.put(i,l.tipoNoLote());
		i++;
	}

	/**
     * Metodo para ver el inventario de la Sucursal.
     */
	public void inventarioSucursal()
	{
		System.out.println("\nINVENTARIO SUCURSAL C");
		auxInventario = "Lote de Chocolates Almendra:       "+Integer.toString(contadorChoA);
		inventarioCompleto.put(0,auxInventario);
		auxInventario = "Lote de Chocolates Oscuros:        "+Integer.toString(contadorChoO);
		inventarioCompleto.put(1,auxInventario);
		auxInventario = "Lote de Chocolates Leche:          "+Integer.toString(contadorChoL);
		inventarioCompleto.put(2,auxInventario);
		auxInventario = "Lote de Gomitas Ositos dulces:     "+Integer.toString(contadorGomO);
		inventarioCompleto.put(3,auxInventario);
		auxInventario = "Lote de Gomitas Gusanos Acidos:    "+Integer.toString(contadorGomA);
		inventarioCompleto.put(4,auxInventario);
		auxInventario = "Lote de Gomitas Frutas con Chamoy: "+Integer.toString(contadorGomC);
		inventarioCompleto.put(5,auxInventario);
		auxInventario = "Lote de Galletas Saladas:          "+Integer.toString(contadorGallS);
		inventarioCompleto.put(6,auxInventario);
		auxInventario = "Lote de Galletas Mermelada:        "+Integer.toString(contadorGallM);
		inventarioCompleto.put(7,auxInventario);
		auxInventario = "Lote de Galletas Chispas:          "+Integer.toString(contadorGallC);
		inventarioCompleto.put(8,auxInventario);
		aux = inventarioCompleto.size();
		for (int i=0; i<aux; i++)
		{
			System.out.println(inventarioCompleto.get(i));
		}
	}

	/**
     * Metodo para vender todos los Lotes de la Sucursal.
     */
	public void venderLotes()
	{
		j = tipoDulce.size();
		for (int k=0; k<j; k++)
		{	
			inventario.remove(k);
			tipoDulce.remove(k);
		}
		aux = inventarioCompleto.size();
		for (int i=0; i<aux; i++)
		{
			inventarioCompleto.remove(0);
		}
		System.out.println("Vendidos todos los Lotes de Dulces de la Sucursal C "+inventario.size()+" "+tipoDulce.size());
		contadorChoA=0; contadorChoO=0; contadorChoL=0;
		contadorGomO=0; contadorGomA=0;contadorGomC=0;
		contadorGallS=0; contadorGallM=0; contadorGallC=0;
	}
}