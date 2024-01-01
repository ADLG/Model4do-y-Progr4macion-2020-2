import java.util.List;
import java.util.ArrayList;
/**
 * Clase que creara el Auto Simple predefinido.
 * @author Licona Gomez Aldo Daniel
 */
public class AutoSimple implements Auto
{
	/* Lista de las opciones elegidas por el Usuario. */
	private List<Integer> opciones;
	/* Lista para guardar la informacion del Usuario. */
	private List<String> info = new ArrayList<String>();

	/* Variable para guardar valor final para el ataque. */
	private int ataquefinal = 0;
	/* Variable para guardar valor final para la defensa. */
	private int defensafinal = 0;
	/* Variable para guardar valor final para la velocidad. */
	private int velocidadfinal = 0;
	/* Variable para guardar valor final para el costo. */
	private int costofinal = 0;

	/* Variable auxiliar para asignar valor al ataque. */
	private int ataque = 0;
	/* Variable auxiliar para asignar valor a la defensa. */
	private int defensa = 0;
	/* Variable auxiliar para asignar valor a la velocidad. */
	private int velocidad = 0;
	/* Variable auxiliar para asignar valor al costo. */
	private int costo = 0;

	/* Objeto de tipo Llanta para usar los metodos de la clase. */
	private Llantas llantas = new Llantas();
	/* Objeto de tipo Motor para usar los metodos de la clase. */
	private Motor motor = new Motor();
	/* Objeto de tipo Carroceria para usar los metodos de la clase. */
	private Carroceria carroceria = new Carroceria();
	/* Objeto de tipo Blindaje para usar los metodos de la clase. */
	private Blindaje blindaje = new Blindaje();
	/* Objeto de tipo Armas para usar los metodos de la clase. */
	private Armas armas = new Armas();

	/* El string que guarda info de la llanta. */
	private String llantasstr;
	/* El string que guarda info del motor. */
	private String motorstr;
	/* El string que guarda info de la carroceria. */
	private String carroceriastr;
	/* El string que guarda info del blindaje. */
	private String blindajestr;
	/* El string que guarda info del arma. */
	private String armasstr;

	/**
     * Metodo que suma valor al ataque, defensa, velocidad y costo 
     * de un Auto Simple junto con su informacion.
     */
	private void personalizaLlantas()
	{
		switch (opciones.get(0))
		{
		case 1:
		llantasstr ="Llantas de tipo: SIMPLE";
		info.add(llantasstr);
		llantas.tipoDeLlantas(1);

		defensa = llantas.getDefensa();
		velocidad = llantas.getVelocidad();
		costo = llantas.getCosto();
		defensafinal+=defensa;
		velocidadfinal+=velocidad;
		costofinal+=costo;
		break;
		default:System.out.println();
		}
	}

	/**
     * Metodo que suma valor al ataque, defensa, velocidad y costo 
     * de un Auto Simple junto con su informacion.
     */
	private void personalizaMotor()
	{
		switch (opciones.get(1))
		{
		case 1:
		motorstr = "Motor de tipo: SIMPLE";
		info.add(motorstr);
		motor.tipoDeMotor(1);

		defensa = motor.getDefensa();
		velocidad = motor.getVelocidad();
		costo = motor.getCosto();
		defensafinal+=defensa;
		velocidadfinal+=velocidad;
		costofinal+=costo;
		break;
		default:System.out.println();
		}
	}

	/**
     * Metodo que suma valor al ataque, defensa, velocidad y costo 
     * de un Auto Simple junto con su informacion.
     */
	private void personalizaCarroceria()
	{
		switch (opciones.get(2))
		{
		case 1:
		carroceriastr = "Carroceria de tipo: CASUAL";
		info.add(carroceriastr);
		carroceria.tipoDeCarroceria(1);

		ataque = carroceria.getAtaque();
		defensa = carroceria.getDefensa();
		velocidad = carroceria.getVelocidad();
		costo = carroceria.getCosto();
		ataquefinal+=ataque;
		defensafinal+=defensa;
		velocidadfinal+=velocidad;
		costofinal+=costo;
		break;
		default:System.out.println();
		}
	}

	/**
     * Metodo que suma valor al ataque, defensa, velocidad y costo 
     * de un Auto Simple junto con su informacion.
     */
	private void personalizaBlindaje()
	{
		switch (opciones.get(3))
		{
		case 1:
		blindajestr = "Blindaje de tipo: SIMPLE";
		info.add(blindajestr);
		blindaje.tipoDeBlindaje(1);

		ataque = blindaje.getAtaque();
		defensa = blindaje.getDefensa();
		velocidad = blindaje.getVelocidad();
		costo = blindaje.getCosto();
		ataquefinal+=ataque;
		defensafinal+=defensa;
		velocidadfinal+=velocidad;
		costofinal+=costo;
		break;
		default:System.out.println();
		}
	}

	/**
     * Metodo que suma valor al ataque, defensa, velocidad y costo 
     * de un Auto Simple junto con su informacion.
     */
	private void personalizaArmas()
	{
		switch (opciones.get(4))
		{
		case 1:
		armasstr = "Armas de tipo: ARPON";
		info.add(armasstr);
		armas.tipoDeArmas(1);

		ataque = armas.getAtaque();
		defensa = armas.getDefensa();
		velocidad = armas.getVelocidad();
		costo = armas.getCosto();
		ataquefinal+=ataque;
		defensafinal+=defensa;
		velocidadfinal+=velocidad;
		costofinal+=costo;
		break;
		default:System.out.println();
		}
	}

	/**
     * Imprime las caracteristicas del Auto Simple.
     */
	@Override
	public void informacionAuto()
	{
		System.out.println("\nLas caracteristicas de tu coche son las siguientes:");
		System.out.println("Ataque:    "+ataquefinal+"\nDefensa:   "+defensafinal+"\nVelocidad: "+velocidadfinal+"\nCosto:     "+costofinal+"\n");
	}

	/**
     * Imprime el tipo de partes elegidas para un Auto Simple.
     */
	public void partes()
	{
		System.out.println("\nInformacion del Auto creado");
		for (String i: info)
		{
			System.out.println(i);
		}
	}

	/**
     * Recibe las opciones para un Auto Simple.
     * @param opciones las opciones elegidas para un Auto Simple.
     */
	@Override
	public void listaPartes(List<Integer> opciones)
	{
		this.opciones = opciones;
	}

	/**
     * Crea el Auto con las partes para un Auto Simple.
     */
	@Override
	public void crear()
	{
		personalizaLlantas();
		personalizaMotor();
		personalizaCarroceria();
		personalizaBlindaje();
		personalizaArmas();
	}

}
