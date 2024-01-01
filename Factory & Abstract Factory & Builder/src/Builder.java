import java.util.List;
import java.util.ArrayList;
/**
 * Clase Builder que se encargara de crear al Auto con las opciones que elija el Usuario.
 * @author Licona Gomez Aldo Daniel
 */
public class Builder
{
	/* El Auto. */
	private Auto auto;

	/* La lista de Opciones. */
	private List<Integer> opciones;

	private Llantas llantas = new Llantas();
	private Motor motor = new Motor();
	private Carroceria carroceria = new Carroceria();
	private Blindaje blindaje = new Blindaje();
	private Armas armas = new Armas();

	/* Construcutor que cuando se llama a un nuevo Builder, se inicializa la lista a vacia. */
	public Builder()
	{
		opciones = new ArrayList<Integer>();
	}

	/**
     * Se crea el auto dependiendo de que haya elegido el Usuario.
     * @param opcion opcion que eligio el Usuario.
     */
	public void setAuto(int opcion)
	{
		switch (opcion)
		{
			case 1:	auto = new AutoCreado();
			break;
			case 2:	auto = new AutoSimple();
			break;
			case 3:	auto = new AutoDeportivo();
			break;
			case 4:	auto = new AutoPesado();
			break;
			default: System.out.println("Opcion no encontrada");
		}
	}

	/**
     * Metodo que agrega a la lisa de opciones, la opcion que eligio el Usuario .
     * @param opcion opcion que eligio el Usuario.
     */
	public void agregarLlantas(int opcion)
	{
		llantas.mensajeEleccionLlantas(opcion);
		opciones.add(opcion);
	}

	/**
     * Metodo que agrega a la lisa de opciones, la opcion que eligio el Usuario .
     * @param opcion opcion que eligio el Usuario.
     */
	public void agregarMotor(int opcion)
	{
		motor.mensajeEleccionMotor(opcion);
		opciones.add(opcion);
	}

	/**
     * Metodo que agrega a la lisa de opciones, la opcion que eligio el Usuario .
     * @param opcion opcion que eligio el Usuario.
     */
	public void agregarCarroceria(int opcion)
	{
		carroceria.mensajeEleccionCarroceria(opcion);
		opciones.add(opcion);
	}

	/**
     * Metodo que agrega a la lisa de opciones, la opcion que eligio el Usuario .
     * @param opcion opcion que eligio el Usuario.
     */
	public void agregarBlindaje(int opcion)
	{
		blindaje.mensajeEleccionBlindaje(opcion);
		opciones.add(opcion);
	}

	/**
     * Metodo que agrega a la lisa de opciones, la opcion que eligio el Usuario .
     * @param opcion opcion que eligio el Usuario.
     */
	public void agregarArmas(int opcion)
	{
		armas.mensajeEleccionArmas(opcion);
		opciones.add(opcion);
	}

	/**
     * Metodo que agrega a la lisa de opciones, las opciones para crear un Auto Simple .
     */
	public void autoSimple()
	{
		opciones.add(1);
		opciones.add(1);
		opciones.add(1);
		opciones.add(1);
		opciones.add(1);
	}

	/**
     * Metodo que agrega a la lisa de opciones, las opciones para crear un Auto Deportivo .
     */
	public void autoDeportivo()
	{
		opciones.add(2);
		opciones.add(3);
		opciones.add(3);
		opciones.add(2);
		opciones.add(5);
	}

	/**
     * Metodo que agrega a la lisa de opciones, las opciones para crear un Auto Pesado .
     */
	public void autoPesado()
	{
		opciones.add(4);
		opciones.add(2);
		opciones.add(2);
		opciones.add(3);
		opciones.add(2);
	}

	/**
     * Metodo que devuelve al Auto ya construido.
     */
	public Auto getAuto()
	{
		auto.listaPartes(opciones);
		return auto;
	}
}