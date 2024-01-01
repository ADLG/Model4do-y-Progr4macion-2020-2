/**
 * Clase de Almacen donde estan los ingredientes de los cuales dispondran las Maquinas.
 */
public class Almacen
{
	/* Entero que guarda la cantidad de ingrediente de almendras. */
	static int almendrasi;
	/* Entero que guarda la cantidad de ingrediente de cacao en polvo. */
	static int cacaoPolvoi;
	/* Entero que guarda la cantidad de ingrediente de leche. */
	static int lechei;
	/* Entero que guarda la cantidad de ingrediente de manteca de cacao. */
	static int manteaCacaoi;

	/**
     * Metodo que reduce las almendras pedidas y de ser necesario reabaste dicho ingrediente.
     * @param i la cantidad que se pide para un ingrediente.
     */
	public void usarAlmendras(int i)
	{
		if (almendrasi<=0)
		{
			System.out.println("\n***\nSe acabaron las Almendras\nReabasteciendo...		Listo.");
			almendrasi+=50;
			System.out.println("+Ahora hay "+almendrasi+"pz de Almendras en el Almacen\n***\n");
		}
		almendrasi-=i;
		System.out.println("Usadas "+i+"pz de Almendras");
	}

	/**
     * Metodo que reduce la leche pedida y de ser necesario reabaste dicho ingrediente.
     * @param i la cantidad que se pide para un ingrediente.
     */
	public void usarLeche(int i)
	{
		if (lechei<=0)
		{
			System.out.println("\n***\nSe acabo la Leche\nReabasteciendo...		Listo.");
			lechei+=2000;
			System.out.println("+Ahora hay "+lechei+"ml de Leche en el Almacen\n***\n");
		}
		lechei-=i;
		System.out.println("Usados "+i+"ml de Leche");
	}

	/**
     * Metodo que reduce el cacao en povlo pedido y de ser necesario reabaste dicho ingrediente.
     * @param i la cantidad que se pide para un ingrediente.
     */
	public void usarCacaoPolvo(int i)
	{
		if (cacaoPolvoi<=0)
		{
			System.out.println("\n***\nSe acabo el Cacao en Polvo\nReabasteciendo...		Listo.");
			cacaoPolvoi+=2000;
			System.out.println("+Ahora hay "+cacaoPolvoi+"gr de Cacao en Polvo en el Almacen\n***\n");
		}
		cacaoPolvoi-=i;
		System.out.println("Usados "+i+"gr de Cacao en Polvo");
	}

	/**
     * Metodo que reduce la manteca de cacao pedido y de ser necesario reabaste dicho ingrediente.
     * @param i la cantidad que se pide para un ingrediente.
     */
	public void usarMantecaC(int i)
	{
		if (manteaCacaoi<=0)
		{
			System.out.println("\n***\nSe acabo la Manteca de Cacao\nReabasteciendo...		Listo.");
			manteaCacaoi+=1000;
			System.out.println("+Ahora hay "+manteaCacaoi+"gr de Manteca de Cacao en el Almacen\n***\n");
		}
		manteaCacaoi-=i;
		System.out.println("Usados "+i+"gr de Manteca de Cacao");
	}

	/**
     * Metodo que imprime los ingredientes disponibles para crear chocolates.
     */
	public void almacenC()
	{
		System.out.println("Ingredientes disponibles del Almacen para crear Chocolates:");
		System.out.println(almendrasi+"pz de Almendras");
		System.out.println(cacaoPolvoi+"gr de Cacao en Polvo");
		System.out.println(lechei+"ml de Leche");
		System.out.println(manteaCacaoi+"gr de Manteca de Cacao");
	}


	/* Entero que guarda la cantidad de ingrediente de grenetina. */
	static int grenetinai;
	/* Entero que guarda la cantidad de ingrediente de agua. */
	static int aguai;
	/* Entero que guarda la cantidad de ingrediente de miel de maiz. */
	static int mielMaizi;
	/* Entero que guarda la cantidad de ingrediente de azucar. */
	static int azucari;
	/* Entero que guarda la cantidad de ingrediente de saborizante acido. */
	static int saborizanteAcidoi;
	/* Entero que guarda la cantidad de ingrediente de chamoy. */
	static int chamoyi;

	/**
     * Metodo que reduce la grenetina pedida y de ser necesario reabaste dicho ingrediente.
     * @param i la cantidad que se pide para un ingrediente.
     */
	public void usarGrenetina(int i)
	{
		if (grenetinai<=0)
		{
			System.out.println("\nSe acabo la Grenetina\nReabasteciendo...		Listo.");
			grenetinai+=500;
			System.out.println("*Ahora hay "+grenetinai+"gr de Grenetina en el Almacen\n");
		}
		grenetinai-=i;
		System.out.println("Usados "+i+"gr de Grenetina");
	}

	/**
     * Metodo que reduce el agua pedida y de ser necesario reabaste dicho ingrediente.
     * @param i la cantidad que se pide para un ingrediente.
     */
	public void usarAgua(int i)
	{
		if (aguai<=0)
		{
			System.out.println("\nSe acabo el Agua\nReabasteciendo...		Listo.");
			aguai+=2000;
			System.out.println("*Ahora hay "+aguai+"ml de Agua en el Almacen\n");
		}
		aguai-=i;
		System.out.println("Usados "+i+"ml de Agua");
	}

	/**
     * Metodo que reduce la miel de maiz pedida y de ser necesario reabaste dicho ingrediente.
     * @param i la cantidad que se pide para un ingrediente.
     */
	public void usarMielDeMaiz(int i)
	{
		if (mielMaizi<=0)
		{
			System.out.println("\nSe acabo la Miel de Maiz\nReabasteciendo...		Listo.");
			mielMaizi+=1000;
			System.out.println("*Ahora hay "+mielMaizi+"ml de Miel de Maiz en el Almacen\n");
		}
		mielMaizi-=i;
		System.out.println("Usados "+i+"ml de Miel de Maiz");
	}

	/**
     * Metodo que reduce el azucar pedida y de ser necesario reabaste dicho ingrediente.
     * @param i la cantidad que se pide para un ingrediente.
     */
	public void usarAzucar(int i)
	{
		if (azucari<=0)
		{
			System.out.println("\nSe acabo el Azucar\nReabasteciendo...		Listo.");
			azucari+=1000;
			System.out.println("*Ahora hay "+azucari+"gr de Azucar en el Almacen\n");
		}
		azucari-=i;
		System.out.println("Usados "+i+"gr de Azucar");
	}

	/**
     * Metodo que reduce el acido pedido y de ser necesario reabaste dicho ingrediente.
     * @param i la cantidad que se pide para un ingrediente.
     */
	public void usarAcido(int i)
	{
		if (saborizanteAcidoi<=0)
		{
			System.out.println("\nSe acabo el Saborizante Acido\nReabasteciendo...		Listo.");
			saborizanteAcidoi+=500;
			System.out.println("*Ahora hay "+saborizanteAcidoi+"gr de Saborizante Acido en el Almacen\n");
		}
		saborizanteAcidoi-=i;
		System.out.println("Usados "+i+"gr de Saborizante Acido");
	}

	/**
     * Metodo que reduce el chamoy pedido y de ser necesario reabaste dicho ingrediente.
     * @param i la cantidad que se pide para un ingrediente.
     */
	public void usarChamoy(int i)
	{
		if (chamoyi<=0)
		{
			System.out.println("\nSe acabo el Chamoy\nReabasteciendo...		Listo.");
			chamoyi+=1000;
			System.out.println("*Ahora hay "+chamoyi+"ml de Chamoy en el Almacen\n");
		}
		chamoyi-=i;
		System.out.println("Usados "+i+"ml de Chamoy");
	}

	/**
     * Metodo que imprime los ingredientes disponibles para crear las Gomitas.
     */
	public void almacenG()
	{
		System.out.println("Ingredientes disponibles del Almacen para crear Gomitas:");
		System.out.println(grenetinai+"gr de Grenetina");
		System.out.println(aguai+"ml de Agua");
		System.out.println(mielMaizi+"ml de Miel de Maiz");
		System.out.println(azucari+"gr de Azucar");
		System.out.println(saborizanteAcidoi+"gr de Saborizante Acido");
		System.out.println(chamoyi+"gr de Chamoy");
	}


	/* Entero que guarda la cantidad de ingrediente de harina. */
	static int harinai;
	/* Entero que guarda la cantidad de ingrediente de huevos. */
	static int huevoi;
	/* Entero que guarda la cantidad de ingrediente de sal. */
	static int sali;
	/* Entero que guarda la cantidad de ingrediente de chispas de chocolate. */
	static int chispasChocolatei;
	/* Entero que guarda la cantidad de ingrediente de mermelada. */
	static int mermeladai;

	/**
     * Metodo que reduce la harina pedida y de ser necesario reabaste dicho ingrediente.
     * @param i la cantidad que se pide para un ingrediente.
     */
	public void usarHarina(int i)
	{
		if (harinai<=0)
		{
			System.out.println("\nSe acabo la Harina\nReabasteciendo...		Listo.");
			harinai+=2000;
			System.out.println("*Ahora hay "+harinai+"gr de Harina en el Almacen\n");
		}
		harinai-=i;
		System.out.println("Usados "+i+"gr de Harina");
	}

	/**
     * Metodo que reduce los huevos pedido y de ser necesario reabaste dicho ingrediente.
     * @param i la cantidad que se pide para un ingrediente.
     */
	public void usarHuevo(int i)
	{
		if (huevoi<=0)
		{
			System.out.println("\nSe acabaron los Huevos\nReabasteciendo...		Listo.");
			huevoi+=60;
			System.out.println("*Ahora hay "+huevoi+"pz de Huevos en el Almacen\n");
		}
		huevoi-=i;
		System.out.println("Usados "+i+"pz de Huevos");
	}

	/**
     * Metodo que reduce la sal pedida y de ser necesario reabaste dicho ingrediente.
     * @param i la cantidad que se pide para un ingrediente.
     */
	public void usarSal(int i)
	{
		if (sali<=0)
		{
			System.out.println("\nSe acabo la Sal\nReabasteciendo...		Listo.");
			sali+=300;
			System.out.println("*Ahora hay "+sali+"gr de Sal en el Almacen\n");
		}
		sali-=i;
		System.out.println("Usados "+i+"gr de Sal");
	}

	/**
     * Metodo que reduce las chispas de chocolate pedidas y de ser necesario reabaste dicho ingrediente.
     * @param i la cantidad que se pide para un ingrediente.
     */
	public void usarChispasChoco(int i)
	{
		if (chispasChocolatei<=0)
		{
			System.out.println("\nSe acabaron las Chispas de Chocolate\nReabasteciendo...		Listo.");
			chispasChocolatei+=500;
			System.out.println("*Ahora hay "+chispasChocolatei+"gr de Chispas de Chocolate en el Almacen\n");
		}
		chispasChocolatei-=i;
		System.out.println("Usados "+i+"gr de Chispas de Chocolate");
	}

	/**
     * Metodo que reduce la mermelada pedida y de ser necesario reabaste dicho ingrediente.
     * @param i la cantidad que se pide para un ingrediente.
     */
	public void usarMermelada(int i)
	{
		if (mermeladai<=0)
		{
			System.out.println("\nSe acabo la Mermelada\nReabasteciendo...		Listo.");
			mermeladai+=500;
			System.out.println("*Ahora hay "+mermeladai+"gr de Mermelada en el Almacen\n");
		}
		mermeladai-=i;
		System.out.println("Usados "+i+"gr de Mermelada");
	}

	/**
     * Metodo que imprime los ingredienes disponibles para crear la masa para las galletas.
     */
	public void almacenM()
	{
		System.out.println("Ingredientes disponibles del Almacen para crear la Masa para las Galletas:");
		System.out.println(harinai+"gr de Harina");
		System.out.println(huevoi+"pz de Huevos");
		System.out.println(lechei+"ml de Leche");
	}

	/**
     * Metodo que imprime los ingredienes disponibles para crear Galletas.
     */
	public void almacenIngGalleta()
	{
		System.out.println("Ingredientes disponibles del Almacen para Galletas:");
		System.out.println(sali+"gr de Sal");
		System.out.println(chispasChocolatei+"gr de Chispas de Chocolate");
		System.out.println(mermeladai+"gr de Mermelada\n");
	}

	/**
     * Metodo que rellena cada ingrediente del almacen.
     */
	public void rellenar()
	{
			lechei += 2000;
			cacaoPolvoi += 2000;
			manteaCacaoi += 1000;
			almendrasi += 50;

			grenetinai += 500;
			aguai += 2000;
			mielMaizi += 1000;
			azucari += 1000;
			saborizanteAcidoi += 500;
			chamoyi += 1000;

			harinai += 2000;
			huevoi += 60;
			sali += 300;
			chispasChocolatei += 500;
			mermeladai += 500;
	}
}
