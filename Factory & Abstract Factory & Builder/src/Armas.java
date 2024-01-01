/**
 * Clase para el tipo de armas disponibles junto con sus valores.
 * @author Licona Gomez Aldo Daniel
 */
public class Armas
{
	/* Valores del arma. */
	int ataque=0;
	int defensa=0;
	int velocidad=0;
	int costo=0;

	/**
     * Da valores a las armas elegidas.
     * @param opcion la opcion de armas elegida.
     */
	public void tipoDeArmas(int opcion)
	{
		switch (opcion)
		{
			case 1:
			ataque = 5;
			defensa = 0;
			velocidad = 5;
			costo = 1000;
			break;
			case 2:
			ataque = 15;
			defensa = 0;
			velocidad = 10;
			costo = 2500;
			break;
			case 3:
			ataque = 10;
			defensa = 0;
			velocidad = 5;
			costo = 1500;
			break;
			case 4:
			ataque = 5;
			defensa = 0;
			velocidad = 10;
			costo = 2000;
			break;
			case 5:
			ataque = 25;
			defensa = 0;
			velocidad = 15;
			costo = 4000;
			break;
			default:System.out.println("Opcion no encontrada");
		}
	}

	/**
     * Imprime un mensaje con el tipo de armas elegida.
     * @param eleccion el tipo de armas elegida.
     */
	public void mensajeEleccionArmas(int eleccion)
	{
		switch (eleccion)
		{
			case 1: 
			System.out.println("\nElegiste ARMA de tipo ARPON");
			break;
			case 2:
			System.out.println("\nElegiste ARMA de tipo LANZALLAMAS");
			break;
			case 3:
			System.out.println("\nElegiste ARMA de tipo LANZA");
			break;
			case 4:
			System.out.println("\nElegiste ARMA de tipo SIERRA");
			break;
			case 5:
			System.out.println("\nElegiste ARMA de tipo METRALLETA");
			break;
			default:System.out.println("Opcion no encontrada");
		}
	}

	/**
     * Regresa el ataque de las armas.
     * @return el ataque de las armas.
     */
	public int getAtaque()
	{
		return ataque;
	}

	/**
     * Regresa la defensa de las armas.
     * @return la defensa de las armas.
     */
	public int getDefensa()
	{
		return defensa;
	}

	/**
     * Regresa la velocidad de las armas.
     * @return la velocidad de las armas.
     */
	public int getVelocidad()
	{
		return velocidad;
	}

	/**
     * Regresa el costo de las armas.
     * @return el costo de las armas.
     */
	public int getCosto()
	{
		return costo;
	}
}