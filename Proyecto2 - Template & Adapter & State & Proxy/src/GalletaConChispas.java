/**
 * Clase de tipo de Galletas Saladas.
 */
public class GalletaConChispas extends Galleta
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
		System.out.println("Agregando 100gr de Chispas de Chocolate...	Listo.");
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
		System.out.println("Creando Masa... 				Listo.");
		masa = 300;
	}

	/**
     * Imprime el procedimiento para cocinar la masa.
     */
	public void cocinarMasa()
	{
		System.out.println("\nLa Masa no se ha cocinado\nCocinando "+masa+"gr de Masa con 100gr de Chispas... Listo.\n");
	}

	/**
     * Usa las chispas de chocolate del almacen para las Galletas.
     * @param chispasChocolate las chispas de chocolate de las Galletas.
     */
	public void usarAlmacen(int chispasChocolate)
	{
		System.out.println("CHISP");
		almacen.almacenIngGalleta();
		System.out.println("Ingrediente usado para las Galletas:");
		almacen.usarChispasChoco(chispasChocolate);
	}
}