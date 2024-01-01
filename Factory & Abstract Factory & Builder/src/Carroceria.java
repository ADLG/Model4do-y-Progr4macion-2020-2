/**
 * Clase para el tipo de carrocerias disponibles junto con sus valores.
 * @author Licona Gomez Aldo Daniel
 */
public class Carroceria
{
	/* Valores de la carroceria. */
	int ataque=0;
	int defensa=0;
	int velocidad=0;
	int costo=0;

	/**
     * Da valores a la carroceria elegida.
     * @param opcion la opcion de carroceria elegida.
     */
	public void tipoDeCarroceria(int opcion)
	{
		switch (opcion)
		{
			case 1:
			ataque = 1;
			defensa = 10;
			velocidad = 5;
			costo = 1000;
			break;
			case 2:
			ataque = 10;
			defensa = 15;
			velocidad = 3;
			costo = 2500;
			break;
			case 3:
			ataque = 5;
			defensa = 10;
			velocidad = 15;
			costo = 4500;
			break;
			default:System.out.println("Opcion no encontrada");
		}
	}

	/**
     * Imprime un mensaje con el tipo de carroceria elegida.
     * @param eleccion el tipo de carroceria elegida.
     */
	public void mensajeEleccionCarroceria(int eleccion)
	{
		switch (eleccion)
		{
			case 1: 
			System.out.println("\nElegiste Carroceria de tipo CASUAL");
			break;
			case 2:
			System.out.println("\nElegiste Carroceria de tipo CAMION");
			break;
			case 3:
			System.out.println("\nElegiste Carroceria de tipo DEPORTIVA");
			break;
			default:System.out.println("Opcion no encontrada");
		}
	}

	/**
     * Regresa el ataque de la carroceria.
     * @return el ataque de la carroceria.
     */
	public int getAtaque()
	{
		return ataque;
	}

	/**
     * Regresa la defensa de la carroceria.
     * @return la defensa de la carroceria.
     */
	public int getDefensa()
	{
		return defensa;
	}

	/**
     * Regresa la velocidad de la carroceria.
     * @return la velocidad de la carroceria.
     */
	public int getVelocidad()
	{
		return velocidad;
	}

	/**
     * Regresa el costo de la carroceria.
     * @return el costo de la carroceria.
     */
	public int getCosto()
	{
		return costo;
	}
}