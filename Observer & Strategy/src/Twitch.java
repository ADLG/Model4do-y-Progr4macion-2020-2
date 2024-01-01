public class Twitch implements Tarifa
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
				System.out.println("Bienvenido de nuevo a la version de usuario NORMAL de Twitch.");
				System.out.println("Su saldo ahora es de: "+dinero);
			}
			else
				System.out.println("Lo sentimos, no tienes dinero suficiente para contratar la version NORMAL de Twitch.");
		}
		else if (numero == 2)
		{
			{
			if (dinero >= 3)
			{
				dinero-=3;
				System.out.println("Bienvenido de nuevo a la version de usuario NORMAL de Twitch.\n*(por estar suscrito a Amazon Prime Video se le ha hecho un descuento del 50%.)");
				System.out.println("Su saldo ahora es de: $"+dinero);
			}
			else
				System.out.println("Lo sentimos, no tienes dinero suficiente para contratar la version NORMAL de Twitch.");
			}
		}

		else if (numero == 3)
		{
			if (dinero >= 6)
			{
				dinero-=6;
				System.out.println("Bienvenido a la version de usuario NORMAL de Twitch.");
				System.out.println("Su saldo ahora es de: "+dinero);
			}
			else
				System.out.println("Lo sentimos, no tienes dinero suficiente para contratar la version NORMAL de Twitch.");
		}
		else if (numero == 4)
		{
			{
			if (dinero >= 3)
			{
				dinero-=3;
				System.out.println("Bienvenido a la version de usuario NORMAL de Twitch.\n*(por estar suscrito a Amazon Prime Video se le ha hecho un descuento del 50%.)");
				System.out.println("Su saldo ahora es de: $"+dinero);
			}
			else
				System.out.println("Lo sentimos, no tienes dinero suficiente para contratar la version NORMAL de Twitch.");
			}
		}
	}

	public void tarifaPrimerDia()
	{
		System.out.println("Bienvenido a la version de usuario NORMAL de Twitch.\n(!Su primer suscripcion es gratis!)");
	}
	
	public int dineroRestante()
	{
		return dinero;
	}
}