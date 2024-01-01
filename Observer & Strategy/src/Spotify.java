public class Spotify implements Tarifa
{
	int dinero = 0;
	@Override
	public void tarifa(Usuario user, int numero)
	{
		this.dinero = user.getDinero();
		if (numero == 1)
		{
			if (dinero >= 4)
			{
				dinero-=4;
				System.out.println("Bienvenido a la version de usuario PREMIUM de Spotify.");
				System.out.println("Su saldo es de: $"+dinero);
			}
			else
			{
				System.out.println("Lo sentimos, no tienes dinero suficiente para contratar la version de usuario PREMIUM de Spotify.");
			}
		}
		else if (numero == 2)
		{
			if (dinero >= 4)
			{
				dinero-=4;
				System.out.println("Bienvenido de nuevo a la version de usuario PREMIUM de Spotify.");
				System.out.println("Su saldo es de: $"+dinero);
			}
			else
			{
				System.out.println("Lo sentimos, no tienes dinero suficiente para contratar la version de usuario PREMIUM de Spotify.");
			}
		}
	}

	public void tarifaPremiumPrimerDia()
	{
		System.out.println("Bienvenido a la version de usuario PREMIUM de Spotify.\n(!Su primer suscripcion es gratis!)");
	}

	public void tarifaNormal()
	{
		System.out.println("Bienvenido de nuevo a la version de usuario NORMAL gratuita de Spotify.");
	}

	public void tarifaNormal_1()
	{
		System.out.println("Bienvenido a la version de usuario NORMAL gratuita de Spotify.");
	}

	public int dineroRestante()
	{
		return dinero;
	}
}