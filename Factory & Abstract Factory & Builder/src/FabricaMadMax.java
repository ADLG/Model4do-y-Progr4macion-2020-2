/**
 * Clase para la Fabrica de coches Mad Max.
 * @author Licona Gomez Aldo Daniel
 */
public class FabricaMadMax
{
	/* Variable de tipo Usuario. */
	private Usuario usuario;
	/* Variable que guardara el nombre del Usuario. */
	private String nombrecliente;
	/* Variable que guardara el dinero del Usuario. */
	private int dinerocliente;

	/**
     * Meotodo que establece el nombre del Usuario.
     * @param nombrecliente nombre del Usuario.
     */
	public void setUsuario(String nombrecliente)
	{
		this.nombrecliente = nombrecliente;
	}

	/**
     * Meotodo que establece el dinero del Usuario.
     * @param dinero dinero del Usuario.
     */
	public void setDineroUser(int dinero)
	{
		this.dinerocliente = dinero;
	}

	/**
     * Regresa el dinero del Usuario.
     * @return el dinero del Usuario.
     */
	public int getDineroUser()
	{
		return dinerocliente;
	}

	/**
     * Crea el Usuario.
     */
	public void crearUsuario()
	{
		usuario = new Usuario(nombrecliente,dinerocliente);
	}

	/**
     * Imprime informacion del Usuario.
     */
	public void infoUsuario()
	{
		usuario.mostrarDatosUser();
	}

	/**
     * Imprime informacion final del Usuario.
     */
	public void infoUsuarioFinal()
	{
		System.out.println("Usuario: "+nombrecliente+"\nDinero Restante: $"+dinerocliente+"\n");
	}

	/**
     * Metodo que cobra el dinero del Usuario dependiendo de las llantas elegidas.
     * @param dinero dinero del Usuario.
     * @param opcion llantas elegidas por el Usuario.
     */
	public void cobrarLl(int dinero,int opcion)
	{
		dinerocliente = dinero;
		if (opcion==1)
			dinerocliente-=1000;
		else if (opcion==2)
			dinerocliente-=5000;
		else if (opcion==3)
			dinerocliente-=3000;
		else if (opcion==4)
			dinerocliente-=4500;
	}

	/**
     * Metodo que cobra el dinero del Usuario dependiendo de las motor elegido.
     * @param dinero dinero del Usuario.
     * @param opcion motor elegido por el Usuario.
     */
	public void cobrarMo(int dinero,int opcion)
	{
		dinerocliente = dinero;
		if (opcion==1)
			dinerocliente-=2000;
		else if (opcion==2)
			dinerocliente-=3000;
		else if (opcion==3)
			dinerocliente-=5000;
	}

	/**
     * Metodo que cobra el dinero del Usuario dependiendo la carroceria elegida.
     * @param dinero dinero del Usuario.
     * @param opcion carroceria elegida por el Usuario.
     */
	public void cobrarCa(int dinero,int opcion)
	{
		dinerocliente = dinero;
		if (opcion==1)
			dinerocliente-=1000;
		else if (opcion==2)
			dinerocliente-=2500;
		else if (opcion==3)
			dinerocliente-=4500;
	}

	/**
     * Metodo que cobra el dinero del Usuario dependiendo de las blindaje elegido.
     * @param dinero dinero del Usuario.
     * @param opcion blindaje elegido por el Usuario.
     */
	public void cobrarBl(int dinero,int opcion)
	{
		dinerocliente = dinero;
		if (opcion==1)
			dinerocliente-=1000;
		else if (opcion==2)
			dinerocliente-=2500;
		else if (opcion==3)
			dinerocliente-=6000;
	}

	/**
     * Metodo que cobra el dinero del Usuario dependiendo de las armas elegidas.
     * @param dinero dinero del Usuario.
     * @param opcion armas elegidas por el Usuario.
     */
	public void cobrarAr(int dinero,int opcion)
	{
		dinerocliente = dinero;
		if (opcion==1)
			dinerocliente-=1000;
		else if (opcion==2)
			dinerocliente-=2500;
		else if (opcion==3)
			dinerocliente-=1500;
		else if (opcion==4)
			dinerocliente-=2000;
		else if (opcion==5)
			dinerocliente-=4000;
	}

	/**
     * Metodo que imprime un mensaje de bienvenida.
     */
	public void bienvenida()
	{
		System.out.println("\nBienvenido a la fabrica de Autos:\n         ***************\n         *** MAD MAX ***\n         ***************\n");
	}

	/**
     * Metodo que imprime un menu de la Fabrica.
     */
	public void menu()
	{
		System.out.println("Menu\n1.Crear un Auto desde cero\n2.Elegir Auto Simple\n3.Elegir Auto Deportivo\n4.Elegir Auto Pesado");
	}

	/**
     * Metodo que imprime los tipos de llantas disponibles.
     */
	public void llantas()
	{
		System.out.println("Tipos de Llantas:\n");
		System.out.println("1.Simple \n -Ataque    +0\n -Defensa   +1\n -Velocidad +5\n -Costo     +$1000\n");
		System.out.println("2.Deportiva \n -Ataque    +0\n -Defensa   +0\n -Velocidad +25\n -Costo     +$5000\n");
		System.out.println("3.Off-Road \n -Ataque    +0\n -Defensa   +3\n -Velocidad +15\n -Costo     +$3000\n");
		System.out.println("4.Oruga de Tanque \n -Ataque    +0\n -Defensa   +15\n -Velocidad +10\n -Costo     +$4500\n");
	}

	/**
     * Metodo que imprime los tipos de motores disponibles.
     */
	public void motores()
	{
		System.out.println("Tipos de Motores:\n");
		System.out.println("1.Simple \n -Ataque    +0\n -Defensa   +1\n -Velocidad +15\n -Costo     +$2000\n");
		System.out.println("2.Diesel \n -Ataque    +0\n -Defensa   +1\n -Velocidad +20\n -Costo     +$3000\n");
		System.out.println("3.Deportivo \n -Ataque    +0\n -Defensa   +1\n -Velocidad +35\n -Costo     +$5000\n");
	}

	/**
     * Metodo que imprime los tipos de carrocerias disponibles.
     */
	public void carrocerias()
	{
		System.out.println("Tipos de Carrocerias:\n");
		System.out.println("1.Casual \n -Ataque    +1\n -Defensa   +10\n -Velocidad +5\n -Costo     +$1000\n");
		System.out.println("2.Camion \n -Ataque    +10\n -Defensa   +15\n -Velocidad +3\n -Costo     +$2500\n");
		System.out.println("3.Deportiva \n -Ataque    +5\n -Defensa   +10\n -Velocidad +15\n -Costo     +$4500\n");
	}

	/**
     * Metodo que imprime los tipos de blindajes disponibles.
     */
	public void blindajes()
	{
		System.out.println("Tipos de Blindajes:\n");
		System.out.println("1.Simple \n -Ataque    +5\n -Defensa   +30\n -Velocidad +0\n -Costo     +$1000\n");
		System.out.println("2.Reforzado \n -Ataque    +10\n -Defensa   +40\n -Velocidad +0\n -Costo     +$2500\n");
		System.out.println("3.Tanque \n -Ataque    +15\n -Defensa   +55\n -Velocidad +0\n -Costo     +$6000\n");
	}

	/**
     * Metodo que imprime los tipos de armas disponibles.
     */
	public void armas()
	{
		System.out.println("Tipos de Armas:\n");
		System.out.println("1.Arpon \n -Ataque    +5\n -Defensa   +0\n -Velocidad +5\n -Costo     +$1000\n");
		System.out.println("2.Lanzallamas \n -Ataque    +15\n -Defensa   +0\n -Velocidad +10\n -Costo     +$2500\n");
		System.out.println("3.Lanza \n -Ataque    +10\n -Defensa   +0\n -Velocidad +5\n -Costo     +$1500\n");
		System.out.println("4.Sierra \n -Ataque    +5\n -Defensa   +0\n -Velocidad +10\n -Costo     +$2000\n");
		System.out.println("5.Metralleta \n -Ataque    +25\n -Defensa   +0\n -Velocidad +15\n -Costo     +$4000\n");
	}
}