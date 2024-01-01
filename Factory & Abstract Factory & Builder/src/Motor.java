/**
 * Clase para el tipo de motores disponibles junto con sus valores.
 * @author Licona Gomez Aldo Daniel
 */
public class Motor
{
	/* Valores del Motor. */
	int ataque=0;
	int defensa=0;
	int velocidad=0;
	int costo=0;

	/**
     * Da valores a el Motor elegido.
     * @param opcion la opcion de Motor elegido.
     */
	public void tipoDeMotor(int opcion)
	{
		switch (opcion)
		{
			case 1:
			ataque = 0;
			defensa = 1;
			velocidad = 15;
			costo = 2000;
			break;
			case 2:
			ataque = 0;
			defensa = 1;
			velocidad = 20;
			costo = 3000;
			break;
			case 3:
			ataque = 0;
			defensa = 1;
			velocidad = 35;
			costo = 5000;
			break;
			default:System.out.println("Opcion no encontrada");
		}
	}

	/**
     * Imprime un mensaje con el tipo de motor elegido.
     * @param eleccion el tipo de motor elegido.
     */
	public void mensajeEleccionMotor(int eleccion)
	{
		switch (eleccion)
		{
			case 1: 
			System.out.println("\nElegiste Motor de tipo SIMPLE");
			break;
			case 2:
			System.out.println("\nElegiste Motor de tipo DIESEL");
			break;
			case 3:
			System.out.println("\nElegiste Motor de tipo DEPORTIVO");
			break;
			default:System.out.println("Opcion no encontrada");
		}
	}

	/**
     * Regresa el ataque del motor.
     * @return el ataque del motor.
     */
	public int getAtaque()
	{
		return ataque;
	}

	/**
     * Regresa la defensa del motor.
     * @return la defensa del motor.
     */
	public int getDefensa()
	{
		return defensa;
	}

	/**
     * Regresa la velocidad del motor.
     * @return la velocidad del motor.
     */
	public int getVelocidad()
	{
		return velocidad;
	}

	/**
     * Regresa el costo del motor.
     * @return el costo del motor.
     */
	public int getCosto()
	{
		return costo;
	}
}