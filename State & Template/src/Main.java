import java.util.Scanner;

/**
 * Main para probar el funcionamiento correcto del robot y la implementacion de los patrones State y Template.
 * @author Licona Gomez Aldo Daniel
 */

public class Main
{
	public static void main(String[] args)
	{
		Robot robot = new Robot();
		Construccion construccion;
		Scanner t = new Scanner(System.in);
		Casa casa = new Casa();
		casa.setCosto(1000000);
		robot.saludo();
		int id = 0;
		boolean booleano1 = true, booleano2=true, boolaux1 = false, boolaux2=false, boolaux3=false, boolaux4=true, boolaux5 =false;

		while (true)
		{
			System.out.println("Menu\n1.Activar\n2.Suspender\n3.Caminar\n4.Construir\n5.Recibir orden\n6.Reabastecer\n7.Salir");
			id = t.nextInt();
			switch(id)
			{
				case 1: robot.activar(); robot.getRobot(); boolaux4=true;
				break;

				case 2: robot.suspender(); robot.getRobot(); boolaux4=false;
				break;
				
				case 3: robot.camina(); robot.getRobot();
				break;

				case 4:
					if (boolaux1&&boolaux2&&boolaux3&&boolaux4)
					{	
						while (booleano1)
						{
						System.out.println("De que material quieres que sea el Aislamiento y el Esqueleto de la casa:\n1.Concreto - $2,500,000\n2.Reforzado - $4,000,000\n3.Madera - $1,000,000\n4.Vidrio - $2,500,000\n");
							id = t.nextInt();	
							switch(id)
							{
								case 1:booleano1=false; 
								construccion = new Concreto();
								construccion.pasosDeConstruccion();
								casa.numeros(1,1);
								casa.acumularDinero(2500000);
								break;

								case 2:booleano1=false; 
								construccion = new Reforzado();
								construccion.pasosDeConstruccion();
								casa.numeros(2,2);
								casa.acumularDinero(4000000);
								break;

								case 3:booleano1=false; 
								construccion = new Madera();
								construccion.construccionEsqueleto();
								while (booleano2)
								{
									id = t.nextInt();
									switch (id) 
									{
										case 1: construccion.pasosDeConstruccion(id);
										casa.numeros(1,3);
										casa.acumularDinero(1500000);
										booleano2 = false;
										break;

										case 2: construccion.pasosDeConstruccion(id);
										casa.numeros(2,3);
										casa.acumularDinero(2000000);
										booleano2 = false;
										break;

										default: booleano2 = true;
										System.out.println("Elige una opcion valida");
									}
								}
								booleano2 = false;
								break;

								case 4:booleano1=false; 
								construccion = new Vidrio();
								construccion.construccionEsqueleto();
								while (booleano2)
								{
									id = t.nextInt();
									switch (id) 
									{
										case 1: construccion.pasosDeConstruccion(id);
										casa.numeros(1,4);
										casa.acumularDinero(3000000);
										booleano2 = false;
										break;

										case 2: construccion.pasosDeConstruccion(id);
										casa.numeros(2,4);
										casa.acumularDinero(3500000);
										booleano2 = false;
										break;

										default: booleano2 = true;
										System.out.println("Elige una opcion valida");
									}
								}
								booleano2 = false;
								break;

								default: booleano1=true;
								System.out.println("Opcion no valida, digite una opcion que aparezca en el Menu.\n");
							}
						}
					booleano1=true; boolaux1 = false; boolaux2 = false; boolaux3=false; boolaux4=false; boolaux5=true;
					}
				robot.construye(); robot.getRobot(); 
				if (boolaux5)
				{
					casa.caracteristcas(casa.getNumero1(),casa.getNumero2());
					System.out.println("\nEl precio final de la Construccion es: $"+casa.getCosto()+"\n");
					casa.setCosto(1000000);
					boolaux5 = false;
				}
				break;

				case 5: robot.recibeOrden(); robot.getRobot();
				boolaux2 = true;
				break;

				case 6: robot.reabastece(); robot.getRobot();
				if (boolaux2&&boolaux3)
				{	
					boolaux1 = true;
					booleano2 = true;
				}
				else
					boolaux3=true;
				break;

				case 7: System.out.println("Saliendo de la simulacion... :'(");
				System.exit(0);
				break;

				default: System.out.println("Opcion no valida, digite una opcion que aparezca en el Menu.\n");
			}
		}

	}
}