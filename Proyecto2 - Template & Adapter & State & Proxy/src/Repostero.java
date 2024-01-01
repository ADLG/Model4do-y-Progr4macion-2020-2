import java.util.ArrayList;
import java.util.List;
/**
 * Clase Repostero que usa las maquinas Wonka3000 y Galleneitor5000.
 */
public class Repostero
{
	/* Referencia de Wonka3000 para crear Chocolates y Gomitas. */
	Wonka3000 w = new Wonka3000(); 
	/* Referencia de Galleneitor5000 para crear Galletas. */
	Galleneitor5000 g = new Galleneitor5000();
	/* Referencia de almacen para rellenarlo en un inicio de la simulacion. */
	Almacen al = new Almacen();
	/* Lista de tipo Lote que guardara los lotes que creen las maquinas. */
	List<Lote> lotes = new ArrayList<Lote>();

	/* Lote 1. */
	Lote l1;
	/* Lote 2. */
	Lote l2;
	/* Lote 3. */
	Lote l3;
	/* Lote 4. */
	Lote l4;
	/* Lote 5. */
	Lote l5;
	/* Lote 6. */
	Lote l6;
	/* Lote 7. */
	Lote l7;

	/**
     * Solicita dulces a las maquinas.
     * @param i el tipo de Dulce del cual se crearan Lotes.
     */
	public void solicitarDulces(int i)
	{
			switch (i)
			{
				case 11:w.crearChocolatesAlmendra(1);
				w.crearLoteCho(w.getDulce1(),w.getDulce2(),w.getDulce3(),w.getDulce4(),w.getDulce5(),w.getDulce6(),w.getDulce7());
				lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());
				break;
				case 12:w.crearChocolatesOscuro(2);
				w.crearLoteCho(w.getDulce1(),w.getDulce2(),w.getDulce3(),w.getDulce4(),w.getDulce5(),w.getDulce6(),w.getDulce7());
				lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());
				break;
				case 13:w.crearChocolatesLeche(3);
				w.crearLoteCho(w.getDulce1(),w.getDulce2(),w.getDulce3(),w.getDulce4(),w.getDulce5(),w.getDulce6(),w.getDulce7());
				lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());
				break;
				case 21:w.crearGomitaOsosDulces(1,1);
				w.crearLoteGom(w.getDulce1(),w.getDulce2(),w.getDulce3(),w.getDulce4(),w.getDulce5(),w.getDulce6(),w.getDulce7());
				lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());
				break;
				case 22:w.crearGomitaGusanosAcidos(2,2);
				w.crearLoteGom(w.getDulce1(),w.getDulce2(),w.getDulce3(),w.getDulce4(),w.getDulce5(),w.getDulce6(),w.getDulce7());
				lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());
				break;
				case 23:w.crearGomitaFrutasChamoy(3,3);
				w.crearLoteGom(w.getDulce1(),w.getDulce2(),w.getDulce3(),w.getDulce4(),w.getDulce5(),w.getDulce6(),w.getDulce7());
				lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());lotes.add(w.getLote());
				break;
				case 31:g.crearGalletaSaladas(1);
				g.crearLoteGall(g.getDulce1(),g.getDulce2(),g.getDulce3(),g.getDulce4(),g.getDulce5(),g.getDulce6(),g.getDulce7());
				lotes.add(g.getLote());lotes.add(g.getLote());lotes.add(g.getLote());lotes.add(g.getLote());lotes.add(g.getLote());lotes.add(g.getLote());lotes.add(g.getLote());
				break;
				case 32:g.crearGalletaChispas(2);
				g.crearLoteGall(g.getDulce1(),g.getDulce2(),g.getDulce3(),g.getDulce4(),g.getDulce5(),g.getDulce6(),g.getDulce7());
				lotes.add(g.getLote());lotes.add(g.getLote());lotes.add(g.getLote());lotes.add(g.getLote());lotes.add(g.getLote());lotes.add(g.getLote());lotes.add(g.getLote());
				break;
				case 33:g.crearGalletaMermelada(3);
				g.crearLoteGall(g.getDulce1(),g.getDulce2(),g.getDulce3(),g.getDulce4(),g.getDulce5(),g.getDulce6(),g.getDulce7());
				lotes.add(g.getLote());lotes.add(g.getLote());lotes.add(g.getLote());lotes.add(g.getLote());lotes.add(g.getLote());lotes.add(g.getLote());lotes.add(g.getLote());
				break;
				default:System.out.println("No deberia");
			}
	}

	/**
     * Rellena todos los ingredientes del Almacen.
     */
	public void iniciarAlmacen()
	{
		al.rellenar();
	}

	/**
     * Organiza los lotes para ser entregados a los repartidores, eliminandolos tambien de la lista lotes.
     */
	public void origanizaLotes()
	{
		l1 = lotes.get(0);
		l2 = lotes.get(1);
		l3 = lotes.get(2);
		l4 = lotes.get(3);
		l5 = lotes.get(4);
		l6 = lotes.get(5);
		l7 = lotes.get(6);
		lotes.remove(0);
		lotes.remove(0);
		lotes.remove(0);
		lotes.remove(0);
		lotes.remove(0);
		lotes.remove(0);
		lotes.remove(0);
	}

	/**
     * Regresa el Lote 1.
     * @return el lote 1.
     */
	public Lote getLote1()
	{
		return l1;
	}
	/**
     * Regresa el Lote 2.
     * @return el lote 2.
     */
	public Lote getLote2()
	{
		return l2;
	}
	/**
     * Regresa el Lote 3.
     * @return el lote 3.
     */
	public Lote getLote3()
	{
		return l3;
	}
	/**
     * Regresa el Lote 4.
     * @return el lote 4.
     */
	public Lote getLote4()
	{
		return l4;
	}
	/**
     * Regresa el Lote 5.
     * @return el lote 5.
     */
	public Lote getLote5()
	{
		return l5;
	}
	/**
     * Regresa el Lote 6.
     * @return el lote 6.
     */
	public Lote getLote6()
	{
		return l6;
	}
	/**
     * Regresa el Lote 7.
     * @return el lote 7.
     */
	public Lote getLote7()
	{
		return l7;
	}

}