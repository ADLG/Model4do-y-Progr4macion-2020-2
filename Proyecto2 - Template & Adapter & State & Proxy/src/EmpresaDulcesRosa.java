import java.util.ArrayList;
import java.util.List;
/**
 * Clase EmpresaDulcesRosa que guardara la informacion de los repartidores y camiones.
 */
public class EmpresaDulcesRosa
{
	/* Lista de tipo Repartidor que guardara a los repartidores. */
	static List<Repartidor> repartidores = new ArrayList<Repartidor>();

	/* Repartidor 1. */
	Repartidor repartidor1 = new Repartidor("Benjamin",1525,"SAPB8705221A0");
	/* Repartidor 2. */
	Repartidor repartidor2 = new Repartidor("Alfredo",6876,"MECA9504061B0");
	/* Repartidor 3. */
	Repartidor repartidor3 = new Repartidor("Javier",1905,"TAMJ8012011C0");
	/* Repartidor 4. */
	Repartidor repartidor4 = new Repartidor("Juan",6536,"HEPJ9703171D0");
	/* Repartidor 5. */
	Repartidor repartidor5 = new Repartidor("Pablo",3963,"TAEP8907151E0");
	/* Repartidor 6. */
	Repartidor repartidor6 = new Repartidor("Sergio",1815,"LODS8611198F0");
	/* Repartidor 7. */
	Repartidor repartidor7 = new Repartidor("Julio",3025,"MOTJ9909201G0");

	/* Entero que sirve de contador. */
	int contador=1;

	/* Repartidor repartidor8 = new Repartidor("Nombre del Repartidor Nuevo",0,"RFC para el Repartidor Nuevo"); (Repartidores extra)*/
	/* Repartidor repartidor9 = new Repartidor("Nombre del Repartidor Nuevo",0,"RFC para el Repartidor Nuevo"); (Repartidores extra)*/
	/* Repartidor repartidor10 = new Repartidor("Nombre del Repartidor Nuevo",0,"RFC para el Repartidor Nuevo"); (Repartidores extra)*/

	/* Lista de tipo String que guardara a los Camiones. */
	static List<String> camiones = new ArrayList<String>();


	String camion1 = "kenworth1000";
	String camion2 = "kenworth2000";
	String camion3 = "kenworth3000";
	String camion4 = "kenworth4000";
	String camion5 = "kenworth5000";
	String camion6 = "kenworth6000";
	String camion7 = "kenworth7000";

	/**
     * Llena la Lista de Repartidores y tambien se llena la lista de Camiones.
     */
	public void iniciarEmpresa()
	{
		System.out.println("\nRepartidores de la Empresa:");
		repartidores.add(repartidor1);
		repartidores.add(repartidor2);
		repartidores.add(repartidor3);
		repartidores.add(repartidor4);
		repartidores.add(repartidor5);
		repartidores.add(repartidor6);
		repartidores.add(repartidor7);

		for (Repartidor r: repartidores)
		{
			System.out.println("Repartidor "+contador);
			r.mostrarDatos();
			contador++;
		}

		camiones.add(camion1);
		camiones.add(camion2);
		camiones.add(camion3);
		camiones.add(camion4);
		camiones.add(camion5);
		camiones.add(camion6);
		camiones.add(camion7);
		contador=1;
	}

	/**
     * Asigna camiones a los repartidores
     */
	public void asignarCamiones()
	{
		repartidor1.setCamion(camion1);
		repartidor2.setCamion(camion2);
		repartidor3.setCamion(camion3);
		repartidor4.setCamion(camion4);
		repartidor5.setCamion(camion5);
		repartidor6.setCamion(camion6);
		repartidor7.setCamion(camion7);
		System.out.println("\nCamiones Asignados:");
		for (Repartidor r: repartidores)
		{
			System.out.println("Camion del Repartidor "+contador+" "+r.getCamion());
			contador++;
		}
		contador=1;
		System.out.println();
	}

    /**
     * Regresa la lista de los Repartidores.
     * @return regresa la lista de los Repartidores.
     */
	public List<Repartidor> getLista()
	{
		return repartidores;
	}

	/**
     * Imprime Anotaciones y un letrero de la Empresa.
     */
	public void inicio()
	{
		System.out.println("****************************************************");
		System.out.println("*                                                  *");
		System.out.println("*              Empresa De Dulces Rosa              *");
		System.out.println("*                                                  *");
		System.out.println("****************************************************");
		System.out.println("[Anotaciones: Como en la terminal se imprime mucha informacion para evitar\n"+
		"estar haciendo scroll y scroll con el mouse, se pedira cada cierto tiempo\n"+
		"ingresar alguna letra del abecedario o algun numero para poder continuar\n"+
		"con el Proceso.]\n");
		System.out.println("Menu de Administrador\n");
	}
}