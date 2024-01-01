import java.util.List;
import java.util.ArrayList;
/**
 * Clase que creara el Auto dependiendo de los valores dados por el Usuario.
 * @author Licona Gomez Aldo Daniel
 */
public class AutoCreado implements Auto
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
     * Metodo que suma valor al ataque, defensa, velocidad y costo dependiendo
     * de la opcion elegida por el Usuario ademas de agregar a una lista la informacion
     * del tipo de llantas que se eligio para el auto.
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
			case 2: 
					llantasstr ="Llantas de tipo: DEPORTIVO";
					info.add(llantasstr);
					llantas.tipoDeLlantas(2);

					defensa = llantas.getDefensa();
					velocidad = llantas.getVelocidad();
					costo = llantas.getCosto();
					defensafinal+=defensa;
					velocidadfinal+=velocidad;
					costofinal+=costo;
			break;
			case 3:
					llantasstr ="Llantas de tipo: OFF-ROAD";
					info.add(llantasstr);
					llantas.tipoDeLlantas(3);

					defensa = llantas.getDefensa();
					velocidad = llantas.getVelocidad();
					costo = llantas.getCosto();
					defensafinal+=defensa;
					velocidadfinal+=velocidad;
					costofinal+=costo;
			break;
			case 4:
					llantasstr ="Llantas de tipo: ORUGA DE TANQUE";
					info.add(llantasstr);
					llantas.tipoDeLlantas(4);

					defensa = llantas.getDefensa();
					velocidad = llantas.getVelocidad();
					costo = llantas.getCosto();
					defensafinal+=defensa;
					velocidadfinal+=velocidad;
					costofinal+=costo;
			break;
			default: System.out.println("Opcion no encontrada");
		}
	}

	/**
     * Metodo que suma valor al ataque, defensa, velocidad y costo dependiendo
     * de la opcion elegida por el Usuario ademas de agregar a una lista la informacion
     * del tipo de motor que se eligio para el auto.
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
			case 2:
					motorstr = "Motor de tipo: DIESEL";
					info.add(motorstr);
					motor.tipoDeMotor(2);

					defensa = motor.getDefensa();
					velocidad = motor.getVelocidad();
					costo = motor.getCosto();
					defensafinal+=defensa;
					velocidadfinal+=velocidad;
					costofinal+=costo;
			break;
			case 3:
					motorstr = "Motor de tipo: DEPORTIVO";
					info.add(motorstr);
					motor.tipoDeMotor(3);

					defensa = motor.getDefensa();
					velocidad = motor.getVelocidad();
					costo = motor.getCosto();
					defensafinal+=defensa;
					velocidadfinal+=velocidad;
					costofinal+=costo;
			break;
			default:System.out.println("Opcion no encontrada");
		}
	}

	/**
     * Metodo que suma valor al ataque, defensa, velocidad y costo dependiendo
     * de la opcion elegida por el Usuario ademas de agregar a una lista la informacion
     * del tipo de carroceria que se eligio para el auto.
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
			case 2:
					carroceriastr = "Carroceria de tipo: CAMION";
					info.add(carroceriastr);
					carroceria.tipoDeCarroceria(2);

					ataque = carroceria.getAtaque();
					defensa = carroceria.getDefensa();
					velocidad = carroceria.getVelocidad();
					costo = carroceria.getCosto();
					ataquefinal+=ataque;
					defensafinal+=defensa;
					velocidadfinal+=velocidad;
					costofinal+=costo;
			break;
			case 3:
					carroceriastr = "Carroceria de tipo: DEPORTIVA";
					info.add(carroceriastr);
					carroceria.tipoDeCarroceria(3);

					ataque = carroceria.getAtaque();
					defensa = carroceria.getDefensa();
					velocidad = carroceria.getVelocidad();
					costo = carroceria.getCosto();
					ataquefinal+=ataque;
					defensafinal+=defensa;
					velocidadfinal+=velocidad;
					costofinal+=costo;
			break;
			default:System.out.println("Opcion no encontrada");
		}
	}

	/**
     * Metodo que suma valor al ataque, defensa, velocidad y costo dependiendo
     * de la opcion elegida por el Usuario ademas de agregar a una lista la informacion
     * del tipo de blindaje que se eligio para el auto.
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
			case 2:
					blindajestr = "Blindaje de tipo: REFORZADO";
					info.add(blindajestr);
					blindaje.tipoDeBlindaje(2);

					ataque = blindaje.getAtaque();
					defensa = blindaje.getDefensa();
					velocidad = blindaje.getVelocidad();
					costo = blindaje.getCosto();
					ataquefinal+=ataque;
					defensafinal+=defensa;
					velocidadfinal+=velocidad;
					costofinal+=costo;
			break;
			case 3:
					blindajestr = "Blindaje de tipo: TANQUE";
					info.add(blindajestr);
					blindaje.tipoDeBlindaje(3);

					ataque = blindaje.getAtaque();
					defensa = blindaje.getDefensa();
					velocidad = blindaje.getVelocidad();
					costo = blindaje.getCosto();
					ataquefinal+=ataque;
					defensafinal+=defensa;
					velocidadfinal+=velocidad;
					costofinal+=costo;
			break;
			default:System.out.println("Opcion no encontrada");
		}
	}

	/**
     * Metodo que suma valor al ataque, defensa, velocidad y costo dependiendo
     * de la opcion elegida por el Usuario ademas de agregar a una lista la informacion
     * del tipo de arma que se eligio para el auto.
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
			case 2: armasstr = "Armas de tipo: LANZALLAMAS";
					info.add(armasstr);
					armas.tipoDeArmas(2);

					ataque = armas.getAtaque();
					defensa = armas.getDefensa();
					velocidad = armas.getVelocidad();
					costo = armas.getCosto();
					ataquefinal+=ataque;
					defensafinal+=defensa;
					velocidadfinal+=velocidad;
					costofinal+=costo;
			break;
			case 3: armasstr = "Armas de tipo: LANZA";
					info.add(armasstr);
					armas.tipoDeArmas(3);

					ataque = armas.getAtaque();
					defensa = armas.getDefensa();
					velocidad = armas.getVelocidad();
					costo = armas.getCosto();
					ataquefinal+=ataque;
					defensafinal+=defensa;
					velocidadfinal+=velocidad;
					costofinal+=costo;
			break;
			case 4: armasstr = "Armas de tipo: SIERRA";
					info.add(armasstr);
					armas.tipoDeArmas(4);

					ataque = armas.getAtaque();
					defensa = armas.getDefensa();
					velocidad = armas.getVelocidad();
					costo = armas.getCosto();
					ataquefinal+=ataque;
					defensafinal+=defensa;
					velocidadfinal+=velocidad;
					costofinal+=costo;
			break;
			case 5: armasstr = "Armas de tipo: METRALLETA";
					info.add(armasstr);
					armas.tipoDeArmas(5);

					ataque = armas.getAtaque();
					defensa = armas.getDefensa();
					velocidad = armas.getVelocidad();
					costo = armas.getCosto();
					ataquefinal+=ataque;
					defensafinal+=defensa;
					velocidadfinal+=velocidad;
					costofinal+=costo;
			break;
			default: System.out.println("Opcion no encontrada");
		}
	}
	
	/**
     * Imprime las caracteristicas del Auto.
     */
	@Override
	public void informacionAuto()
	{
		System.out.println("\nLas caracteristicas de tu coche son las siguientes:");
		System.out.println("Ataque:    "+ataquefinal+"\nDefensa:   "+defensafinal+"\nVelocidad: "+velocidadfinal+"\nCosto:     "+costofinal+"\n");
	}

	/**
     * Imprime el tipo de partes elegidas por el Usuario.
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
     * Recibe las opciones del Usuario en forma de lista.
     * @param opciones las opciones elegidas por el usuario.
     */
	@Override
	public void listaPartes(List<Integer> opciones)
	{
		this.opciones = opciones;
	}

	/**
     * Crea el Auto con las partes elegidas por el Usuario.
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