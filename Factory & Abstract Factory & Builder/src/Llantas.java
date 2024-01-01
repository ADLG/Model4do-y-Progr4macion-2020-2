/**
 * Clase para el tipo de llantas disponibles junto con sus valores.
 * @author Licona Gomez Aldo Daniel
 */
public class Llantas
{
	/* Valores de la llanta. */
	int ataque=0;
	int defensa=0;
	int velocidad=0;
	int costo=0;

	/**
     * Da valores a las llantas elegidas.
     * @param opcion la opcion de llantas elegida.
     */
	public void tipoDeLlantas(int opcion)
	{
		switch (opcion)
		{
			case 1:
			ataque = 0;
			defensa = 1;
			velocidad = 5;
			costo = 1000;
			break;
			case 2:
			ataque = 0;
			defensa = 0;
			velocidad = 25;
			costo = 5000;
			break;
			case 3:
			ataque = 0;
			defensa = 3;
			velocidad = 15;
			costo = 3000;
			break;
			case 4:
			ataque = 0;
			defensa = 15;
			velocidad = 10;
			costo = 4500;
			break;
			default:System.out.println("Opcion no encontrada");
		}
	}

	/**
     * Imprime un mensaje con el tipo de llantas elegidas.
     * @param eleccion el tipo de llantas elegidas.
     */
	public void mensajeEleccionLlantas(int eleccion)
	{
		switch (eleccion)
		{
			case 1: 
			System.out.println("\nElegiste Llantas de tipo SIMPLE");
			break;
			case 2:
			System.out.println("\nElegiste Llantas de tipo DEPORTIVAS");
			break;
			case 3:
			System.out.println("\nElegiste Llantas de tipo OFF-ROAD");
			break;
			case 4:
			System.out.println("\nElegiste Llantas de tipo ORUGA DE TANQUE");
			break;
			default:System.out.println("Opcion no encontrada");
		}
	}

	/**
     * Regresa el ataque de las llantas.
     * @return el ataque de las llantas.
     */
	public int getAtaque()
	{
		return ataque;
	}

	/**
     * Regresa la defensa de las llantas.
     * @return la defensa de las llantas.
     */
	public int getDefensa()
	{
		return defensa;
	}

	/**
     * Regresa la velocidad de las llantas.
     * @return la velocidad de las llantas.
     */
	public int getVelocidad()
	{
		return velocidad;
	}

	/**
     * Regresa el costo de las llantas.
     * @return el costo de las llantas.
     */
	public int getCosto()
	{
		return costo;
	}
}