public class AmazonPV implements Tarifa
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
				System.out.println("Bienvenido de nuevo, gracias por contratar Amazon Prime Video.");
				System.out.println("Su saldo ahora es de: $"+dinero);
			}
			else
			{
				System.out.println("Lo sentimos, no tienes dinero suficiente para contratar Amazon Prime Video.");
			}
		}
		else if (numero == 2)
		{
			if (dinero >= 13)
			{
				dinero-=13;
				System.out.println("Bienvenido de nuevo a la version de usuario PREMIUM de Amazon Prime Video.");
				System.out.println("Su saldo es de: $"+dinero);
			}
			else
			{
				System.out.println("Lo sentimos, no tienes dinero suficiente para contratar la version PREMIUM de Amazon Prime Video.");
			}
		}
		else if (numero == 3)
		{
			if (dinero >= 7)
			{
				dinero-=7;
				System.out.println("Bienvenido, gracias por contratar Amazon Prime Video.");
				System.out.println("Su saldo ahora es de: $"+dinero);
			}
			else
			{
				System.out.println("Lo sentimos, no tienes dinero suficiente para contratar Amazon Prime Video.");
			}
		}
		else if (numero == 4)
		{
			if (dinero >= 13)
			{
				dinero-=13;
				System.out.println("Bienvenido a la version de usuario PREMIUM de Amazon Prime Video.");
				System.out.println("Su saldo es de: $"+dinero);
			}
			else
			{
				System.out.println("Lo sentimos, no tienes dinero suficiente para contratar la version PREMIUM de Amazon Prime Video.");
			}
		}
	}

	public void tarifaPrimerDia()
	{
		System.out.println("Bienvenido a la version de usuario NORMAL de Amazon Prime Video.\n(!Su primer suscripcion es gratis!)");
	}

	public void tarifaPremiumPrimerDia()
	{
		System.out.println("Bienvenido a la version de usuario PREMIUM de Amazon Prime Video.\n(!Su primer suscripcion es gratis!)");
	}

	public int dineroRestante()
	{
		return dinero;
	}
}