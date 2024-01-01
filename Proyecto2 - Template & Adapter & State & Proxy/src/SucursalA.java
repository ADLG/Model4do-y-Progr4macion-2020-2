import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
/**
 * Clase SucursalA par establecer sus lotes y su inventario.
 */
public class SucursalA implements Sucursal
{
	/* Lista de tipo Lote para guardar los Lotes. */
	static List<Lote> inventario = new ArrayList<Lote>();
	/* Lista de tipo Integer para guardar el tipo de dulce que hay. */
	static List<Integer> tipoDulce = new ArrayList<Integer>();
	/* Lista de tipo String que contiene el inventario de la Sucursal. */
	List<String> inventarioCompleto = new ArrayList<String>();
	/* Iterador para recorrer el inventario. */
	Iterator<Lote> itera = inventario.iterator();

	/* Variable de tipo String para añadir elementos a la lista inventarioCompleto. */
	String auxInventario;
	/* Entero para guardar el tamaño de la lista. */
	int aux=0;

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

	/* Booleano para comprobar si le hace falta o no Dulces a la Sucursal. */
	boolean suficiente = false;

	/* String que guarda el nombre de la sucursal. */
	String nombre = "Sucursal A";
	/* Entero para guardar el id la Sucursal. */
	int id = 170;
	/* String que guarda la direccion de la sucursal. */
	String direccion = "Universidad";

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
		for (Integer i: tipoDulce)
		{
			switch (i)
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
		if ((contadorChoA > 3) && (contadorChoO > 3) && (contadorChoL > 3) && (contadorGomO > 3) && (contadorGomA > 3) && (contadorGomC > 3) && (contadorGallS > 3) && (contadorGallM > 3) && (contadorGallC > 3))
			suficiente = true;
	}

	/**
     * Metodo para recibir un lote.
     * @param l el lote recibido.
     */
	public void recibirLote(Lote l)
	{
		inventario.add(l);
		tipoDulce.add(l.tipoNoLote());
	}

	/**
     * Metodo para ver el inventario de la Sucursal.
     */
	public void inventarioSucursal()
	{
		aux = inventarioCompleto.size();
		for (int i=0; i<aux; i++)
			inventarioCompleto.remove(0);
		System.out.println("\nINVENTARIO SUCURSAL A");
		auxInventario = "Lote de Chocolates Almendra:       "+Integer.toString(contadorChoA);
		inventarioCompleto.add(auxInventario);
		auxInventario = "Lote de Chocolates Oscuros:        "+Integer.toString(contadorChoO);
		inventarioCompleto.add(auxInventario);
		auxInventario = "Lote de Chocolates Leche:          "+Integer.toString(contadorChoL);
		inventarioCompleto.add(auxInventario);
		auxInventario = "Lote de Gomitas Ositos dulces:     "+Integer.toString(contadorGomO);
		inventarioCompleto.add(auxInventario);
		auxInventario = "Lote de Gomitas Gusanos Acidos:    "+Integer.toString(contadorGomA);
		inventarioCompleto.add(auxInventario);
		auxInventario = "Lote de Gomitas Frutas con Chamoy: "+Integer.toString(contadorGomC);
		inventarioCompleto.add(auxInventario);
		auxInventario = "Lote de Galletas Saladas:          "+Integer.toString(contadorGallS);
		inventarioCompleto.add(auxInventario);
		auxInventario = "Lote de Galletas Mermelada:        "+Integer.toString(contadorGallM);
		inventarioCompleto.add(auxInventario);
		auxInventario = "Lote de Galletas Chispas:          "+Integer.toString(contadorGallC);
		inventarioCompleto.add(auxInventario);
		for (String i: inventarioCompleto)
			System.out.println(i);
	}

	/**
     * Metodo para vender todos los Lotes de la Sucursal.
     */
	public void venderLotes()
	{
		while (itera.hasNext())
		{
			inventario.remove(0);
			tipoDulce.remove(0);
		}
		aux = inventarioCompleto.size();
		for (int i=0; i<aux; i++)
		{
			inventarioCompleto.remove(0);
		}
		System.out.println("\nVendidos todos los Lotes de Dulces de la Sucursal A "+inventario.size()+" "+tipoDulce.size());
		contadorChoA=0; contadorChoO=0; contadorChoL=0;
		contadorGomO=0; contadorGomA=0;contadorGomC=0;
		contadorGallS=0; contadorGallM=0; contadorGallC=0;
	}
}