import java.util.Scanner;

/**
 * Clase Main para probar el funcionamiento correcto de los Baguettes y las Pizzas.
 * @author Licona Gomez Aldo Daniel
 */

public class Main
{
	public static void main(String[] args)
	{
		Scanner t = new Scanner(System.in);
		boolean b = true;
		int a=0,i=0;
		bienvenida();
		while(b)
		{
			System.out.println("Menu:\n1.Baguette Blanco\n2.Baguette Integral\n3.Pizza\n4.Salir\n");
			a = t.nextInt();
			switch (a)
			{
				case 1:System.out.println("Elegiste Baguette Blanco");
					Baguette baguetteB = new BaguetteBlanco();
				while (i<15)
				{	
					System.out.println("Ingredientes Disponibles:\n1.Catsup      $3\n2.Cebolla     $1\n3.Jamon       $2\n4.Jitomate    $1\n5.Lechuga     $1\n6.Mayonesa    $3\n7.Mostaza     $3\n8.Pepperoni   $4\n9.Pollo       $6\n");
					System.out.println("*Tiene un maximo de 15 ingredientes a elegir.\nSi ya ha terminado de elegir sus ingredientes\ndigite el numero 10 para recibir su pedido junto con su Ticket");
					a = t.nextInt();
					switch (a)
					{
						case 1: baguetteB = new Catsup(baguetteB);
						break;
						case 2: baguetteB = new Cebolla(baguetteB);
						break;
						case 3: baguetteB = new Jamon(baguetteB);
						break;
						case 4: baguetteB = new Jitomate(baguetteB);
						break;
						case 5: baguetteB = new Lechuga(baguetteB);
						break;
						case 6: baguetteB = new Mayonesa(baguetteB);
						break;
						case 7: baguetteB = new Mostaza(baguetteB);
						break;
						case 8: baguetteB = new Pepperoni(baguetteB);
						break;
						case 9: baguetteB = new Pollo(baguetteB);
						break;
						case 10: i = 15;
						break;
						default:System.out.println("No se ha encontrado la opcion, digite un ingrediente del menu.");
						i--;
					}
				i++;
				}
				ticketBaguette(baguetteB);
				System.out.println("Orden entregada.\n");
				i=0;
				break;

				case 2:System.out.println("Elegiste Baguette Integral");
					Baguette baguetteI = new BaguetteIntegral();
				while (i<15)
				{
					System.out.println("Ingredientes Disponibles:\n1.Catsup      $3\n2.Cebolla     $1\n3.Jamon       $2\n4.Jitomate    $1\n5.Lechuga     $1\n6.Mayonesa    $3\n7.Mostaza     $3\n8.Pepperoni   $4\n9.Pollo       $6\n");
					System.out.println("*Tiene un maximo de 15 ingredientes a elegir.\nSi ya ha terminado de elegir sus ingredientes\ndigite el numero 10 para recibir su pedido junto con su Ticket");
					a = t.nextInt();
					switch (a)
					{
						case 1: baguetteI = new Catsup(baguetteI);
						break;
						case 2: baguetteI = new Cebolla(baguetteI);
						break;
						case 3: baguetteI = new Jamon(baguetteI);
						break;
						case 4: baguetteI = new Jitomate(baguetteI);
						break;
						case 5: baguetteI = new Lechuga(baguetteI);
						break;
						case 6: baguetteI = new Mayonesa(baguetteI);
						break;
						case 7: baguetteI = new Mostaza(baguetteI);
						break;
						case 8: baguetteI = new Pepperoni(baguetteI);
						break;
						case 9: baguetteI = new Pollo(baguetteI);
						break;
						case 10: i = 15;
						break;
						default:System.out.println("No se ha encontrado la opcion, digite un ingrediente del menu.");
						i--;
					}
				i++;
				}
				ticketBaguette(baguetteI);
				System.out.println("Orden entregada.\n");
				i=0;
				break;

				case 3:
				while (b)
				{
					
				System.out.println("Pizzaz Disponibles:\n1.Pizza combinada con Queso:Chedar, Carne:Salchicha y Masa:Gruesa."+
					"\n2.Pizza combinada con Queso:Chedar, Carne:Jamon y Masa:Gruesa."+
					"\n3.Pizza combinada con Queso:Manchego, Carne:Pollo y Masa:Delgada."+
					"\n4.Pizza combinada con Queso:Manchego, Carne:Salchicha y Masa:Delgada."+
					"\n5.Pizza combinada con Queso:Manchego, Carne:Jamon y Masa:Delgada.\n");
					a = t.nextInt();
					switch (a)
					{
						case 1: Pizza pizzacsg = new PizzaChedarSalchichaGruesa();
						Baguette pizzacsginfo = new PizzaAdapter(pizzacsg);
						System.out.println("Pizza combinada con Queso:Chedar, Carne:Salchicha y Masa:Gruesa.");
						ticketPizza(pizzacsginfo);
						b=false;
						break;
						case 2: Pizza pizzacjg = new PizzaChedarJamonGruesa();
						Baguette pizzacjginfo = new PizzaAdapter(pizzacjg);
						System.out.println("Pizza combinada con Queso:Chedar, Carne:Jamon y Masa:Gruesa.");
						ticketPizza(pizzacjginfo);
						b=false;
						break;
						case 3: Pizza pizzampd = new PizzaManchegoPolloDelgada();
						Baguette pizzampdinfo = new PizzaAdapter(pizzampd);
						System.out.println("Pizza combinada con Queso:Manchego, Carne:Pollo y Masa:Delgada.");
						ticketPizza(pizzampdinfo);
						b=false;
						break;
						case 4: Pizza pizzamsd = new PizzaManchegoSalchichaDelgada();
						Baguette pizzamsdinfo = new PizzaAdapter(pizzamsd);
						System.out.println("Pizza combinada con Queso:Manchego, Carne:Salchicha y Masa:Delgada.");
						ticketPizza(pizzamsdinfo);
						b=false;
						break;
						case 5: Pizza pizzamjd = new PizzaManchegoJamonDelgada();
						Baguette pizzamjdinfo = new PizzaAdapter(pizzamjd);
						System.out.println("Pizza combinada con Queso:Manchego, Carne:Jamon y Masa:Delgada.");
						ticketPizza(pizzamjdinfo);
						b=false;
						break;
						default:System.out.println("No se ha encontrado la opcion, digite una Pizza del menu.\n");
						b=true;
					}
				}
				System.out.println("Gracias por su compra **Vuelva Pronto** :)");
				break;

				case 4: System.out.println("Saliendo del restaurante ... *Vuelva Pronto*.");
				System.exit(0);
				default: System.out.println("Elige una opcion valida");
			}
		}
	}

	/* Metodo para crear un ticket de una Pizza. */
	public static void ticketPizza(Baguette b)
	{
		System.out.println("************TICKET************");
		System.out.println(b.getDescripcion()+" \nCosto Total                $"+b.costo()+"\n******************************");
	}

	/* Metodo para crear un ticket de un Baguette. */
	public static void ticketBaguette(Baguette b)
	{
		System.out.println("*******TICKET********");
		System.out.println(b.getDescripcion()+" \n\nCosto Total       $"+b.costo()+"\n*********************");
	}

	/* Metodo para dar la bienvenida al usuario. */
	public static void bienvenida()
	{
		System.out.println("*********************************************************************");
		System.out.println("*                                                                   *");
		System.out.println("* Bienvenido a los restaurantes WaySub y Las Pizzas de Don Cangrejo *");
		System.out.println("*                                                                   *");
		System.out.println("*********************************************************************");
	}
}