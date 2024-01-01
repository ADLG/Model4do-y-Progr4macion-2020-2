public class YouTube implements Tarifa
{
	int dinero = 0;
	@Override
	public void tarifa(Usuario user, int numero)
	{
		this.dinero = user.getDinero();
		if (numero == 1)
		{
			if (dinero >= 6)
			{
				dinero-=6;
				System.out.println("Bienvenido a la version de usuario PREMIUM de YouTube.");
				System.out.println("Su saldo es de: $"+dinero);
			}
			else
			{
				System.out.println("Lo sentimos, no tienes dinero suficiente para contratar la version de usuario PREMIUM de YouTube.");
			}
		}
		else if (numero == 2)
		{
			if (dinero >= 6)
			{
				dinero-=6;
				System.out.println("Bienvenido de nuevo a la version de usuario PREMIUM de YouTube.");
				System.out.println("Su saldo es de: $"+dinero);
			}
			else
			{
				System.out.println("Lo sentimos, no tienes dinero suficiente para contratar la version de usuario PREMIUM de YouTube.");
			}
		}
	}

	public void tarifaPremiumPrimerDia()
	{
		System.out.println("Bienvenido a la version de usuario PREMIUM de YouTube.\n(!Su primer suscripcion es gratis!)");
	}

	public void tarifaNormal()
	{
		System.out.println("Bienvenido de nuevo a la version de usuario NORMAL gratuita de YouTube.");
	}

	public void tarifaNormal_1()
	{
		System.out.println("Bienvenido a la version de usuario NORMAL gratuita de YouTube.");
	}

	public int dineroRestante()
	{
		return dinero;
	}
}