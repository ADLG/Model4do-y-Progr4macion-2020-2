public class GalletaRellenasMermelada extends Galleta
{
	/* Entero que guarda la cantidad de harina. */
	int harina;
	/* Entero que guarda las piezas de huevos. */
	int huevo;
	/* Entero que guarda la cantidad de leche. */
	int leche;

	/* Entero que guarda la cantidad de masa. */
	int masa;

	/* Referencia de Almacen para usar sus metodos. */
	Almacen almacen = new Almacen();

	/**
     * Imprime el procedimiento de la mezcla para crear las Galletas.
     */
	public void mezcla()
	{
		System.out.println("\nMEZCLA:\nSe realizara la mezcla para preparar las Galletas:\n");
		System.out.println("Agregando "+masa+"gr de Masa...			Listo.");
		System.out.println("Agregando 100gr de Mermelada...			Listo.");
		System.out.println("Mezcla\n...\n..\n.\nListo.\n");
	}

	/**
     * Prepara la masa de las galletas
     * @param leche leche usada para la masa.
     * @param harina harina usada para la masa.
     * @param huevo huevos usados para la masa.
     */
	public void prepararMasa(int leche, int harina, int huevo)
	{
		almacen.almacenM();
		System.out.println("\nIngredientes para crear la Masa");
		almacen.usarHarina(harina);
		almacen.usarHuevo(huevo);
		almacen.usarLeche(leche);
		System.out.println("Creando Masa...			Listo.");
		masa = 200;
	}

	/**
     * Imprime el procedimiento para cocinar la masa.
     */
	public void cocinarMasa()
	{
		System.out.println("\nLa Masa no se ha cocinado\nCocinando "+masa+"gr de masa...	Listo.\n");
	}

	/**
     * Usa la mermelada del almacen para las Galletas.
     * @param mermelada la mermelada de las Galletas.
     */
	public void usarAlmacen(int mermelada)
	{
		System.out.println("MERME");
		almacen.almacenIngGalleta();
		System.out.println("Ingrediente usado para las Galletas:");
		almacen.usarMermelada(mermelada);
	}
}