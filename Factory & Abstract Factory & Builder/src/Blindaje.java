/**
 * Clase para el tipo de blindaje disponibles junto con sus valores.
 * @author Licona Gomez Aldo Daniel
 */
public class Blindaje
{
	/* Valores de la llanta. */
	int ataque=0;
	int defensa=0;
	int velocidad=0;
	int costo=0;

	/**
     * Da valores a el blindaje elegido.
     * @param opcion la opcion de blindaje elegido.
     */
	public void tipoDeBlindaje(int opcion)
	{
		switch (opcion)
		{
			case 1:
			ataque = 5;
			defensa = 30;
			velocidad = 0;
			costo = 1000;
			break;
			case 2:
			ataque = 10;
			defensa = 40;
			velocidad = 0;
			costo = 2500;
			break;
			case 3:
			ataque = 15;
			defensa = 55;
			velocidad = 0;
			costo = 6000;
			break;
			default:System.out.println("Opcion no encontrada");
		}
	}

	/**
     * Imprime un mensaje con el tipo de blindaje elegido.
     * @param eleccion el tipo de blindaje elegido.
     */
	public void mensajeEleccionBlindaje(int eleccion)
	{
		switch (eleccion)
		{
			case 1: 
			System.out.println("\nElegiste Blindaje de tipo SIMPLE");
			break;
			case 2:
			System.out.println("\nElegiste Blindaje de tipo REFORZADO");
			break;
			case 3:
			System.out.println("\nElegiste Blindaje de tipo TANQUE");
			break;
			default:System.out.println("Opcion no encontrada");
		}
	}

	/**
     * Regresa el ataque del blindaje.
     * @return el ataque del blindaje.
     */
	public int getAtaque()
	{
		return ataque;
	}

	/**
     * Regresa la defensa del blindaje.
     * @return la defensa del blindaje.
     */
	public int getDefensa()
	{
		return defensa;
	}

	/**
     * Regresa la velocidad del blindaje.
     * @return la velocidad del blindaje.
     */
	public int getVelocidad()
	{
		return velocidad;
	}

	/**
     * Regresa el costo del blindaje.
     * @return el costo del blindaje.
     */
	public int getCosto()
	{
		return costo;
	}
}