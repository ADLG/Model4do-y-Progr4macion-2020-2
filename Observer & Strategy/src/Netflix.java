public class Netflix implements Tarifa
{
	int dinero = 0;
	@Override
	public void tarifa(Usuario user, int numero)
	{
		this.dinero = user.getDinero();
		if (numero == 1)
		{
			if (dinero >= 7)
			{
				dinero-=7;
				System.out.println("Bienvenido de nuevo, gracias por contratar Netflix para 1 dispositivo.");
				System.out.println("Su saldo ahora es de: $"+dinero);
			}
			else
			{
				System.out.println("Lo sentimos, no tienes dinero suficiente para contratar Netflix para 1 dispositivo.");
			}
		}
		else if (numero == 2)
		{
			if (dinero >= 10)
			{
				dinero-=10;
				System.out.println("Bienvenido de nuevo, gracias por contratar Netflix para 2 dispositivos.");
				System.out.println("Su saldo ahora es de: $"+dinero);
			}
			else
			{
				System.out.println("Lo sentimos, no tienes dinero suficiente para contratar Netflix para 2 dispositivos.");
			}
		}
		else if (numero == 3)
		{
			if (dinero >= 15)
			{
				dinero-=15;
				System.out.println("Bienvenido de nuevo, gracias por contratar Netflix para 4 dispositivos.");
				System.out.println("Su saldo ahora es de: $"+dinero);
			}
			else
			{
				System.out.println("Lo sentimos, no tienes dinero suficiente para contratar Netflix para 4 dispositivos.");
			}
		}

		else if (numero == 4)
		{
			if (dinero >= 7)
			{
				dinero-=7;
				System.out.println("Bienvenido, gracias por contratar Netflix para 1 dispositivo.");
				System.out.println("Su saldo ahora es de: $"+dinero);
			}
			else
			{
				System.out.println("Lo sentimos, no tienes dinero suficiente para contratar Netflix para 1 dispositivo.");
			}
		}
		else if (numero == 5)
		{
			if (dinero >= 10)
			{
				dinero-=10;
				System.out.println("Bienvenido, gracias por contratar Netflix para 2 dispositivos.");
				System.out.println("Su saldo ahora es de: $"+dinero);
			}
			else
			{
				System.out.println("Lo sentimos, no tienes dinero suficiente para contratar Netflix para 2 dispositivos.");
			}
		}
		else if (numero == 6)
		{
			if (dinero >= 15)
			{
				dinero-=15;
				System.out.println("Bienvenido, gracias por contratar Netflix para 4 dispositivos.");
				System.out.println("Su saldo ahora es de: $"+dinero);
			}
			else
			{
				System.out.println("Lo sentimos, no tienes dinero suficiente para contratar Netflix para 4 dispositivos.");
			}
		}

	}

	public void tarifaPrimerDia7para1()
	{
		System.out.println("Bienvenido, gracias por contratar Netflix para 1 dispositivo.\n(!Su primer suscripcion es gratis!)");
	}

	public void tarifaPrimerDia10para2()
	{
		System.out.println("Bienvenido, gracias por contratar Netflix para 2 dispositivos.\n(!Su primer suscripcion es gratis!)");
	}

	public void tarifaPrimerDia15para4()
	{
		System.out.println("Bienvenido, gracias por contratar Netflix para 4 dispositivos.\n(!Su primer suscripcion es gratis!)");
	}

	public int dineroRestante()
	{
		return dinero;
	}
}