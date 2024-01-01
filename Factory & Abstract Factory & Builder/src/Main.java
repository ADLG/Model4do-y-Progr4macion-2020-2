import java.util.Scanner;
/**
 * Main para probar el funcionamiento correcto del programa.
 * @author Licona Gomez Aldo Daniel
 */
public class Main
{
	public static void main(String[] args)
	{
		FabricaMadMax fabricaMM = new FabricaMadMax();
		Scanner t = new Scanner(System.in);
		Builder constructor = new Builder();
		Auto auto;
		int a;
		boolean b = true;
		String nombreU;

		fabricaMM.bienvenida();

		System.out.println("Digita el nombre de usuario quieras tener");
		nombreU = t.next();
		fabricaMM.setUsuario(nombreU);
		fabricaMM.setDineroUser(25000);
		fabricaMM.crearUsuario();
		System.out.println("\nTus datos son:");
		fabricaMM.infoUsuario();

		fabricaMM.menu();

		while (b)
		{
		a = t.nextInt();
		switch (a)
		{
			case 1:
				constructor.setAuto(a);
				System.out.println("Comenzaras a crear tu propio Auto");
			while (b)
			{
				System.out.println("Que tipo de Llantas Quieres para tu Auto\n");
				fabricaMM.llantas();
				a = t.nextInt();
				switch (a)
				{
					case 1:	constructor.agregarLlantas(a); fabricaMM.cobrarLl(fabricaMM.getDineroUser(),1);
					System.out.println("Dinero Actual:"+fabricaMM.getDineroUser()); b=false;
					break;
					case 2:	constructor.agregarLlantas(a); fabricaMM.cobrarLl(fabricaMM.getDineroUser(),2);
					System.out.println("Dinero Actual:"+fabricaMM.getDineroUser()); b=false;
					break;
					case 3:	constructor.agregarLlantas(a); fabricaMM.cobrarLl(fabricaMM.getDineroUser(),3);
					System.out.println("Dinero Actual:"+fabricaMM.getDineroUser()); b=false;
					break;
					case 4:	constructor.agregarLlantas(a); fabricaMM.cobrarLl(fabricaMM.getDineroUser(),4);
					System.out.println("Dinero Actual:"+fabricaMM.getDineroUser()); b=false;
					break;
					default:System.out.println("Digita una opcion Valida"); b=true;
				}
			}

			b=true;
			while (b)
			{
				System.out.println("Que tipo de Motor Quieres para tu Auto\n");
				fabricaMM.motores();
				a = t.nextInt();
				switch (a)
				{
					case 1:	constructor.agregarMotor(a); fabricaMM.cobrarMo(fabricaMM.getDineroUser(),1);
					System.out.println("Dinero Actual:"+fabricaMM.getDineroUser()); b=false;
					break;
					case 2:	constructor.agregarMotor(a); fabricaMM.cobrarMo(fabricaMM.getDineroUser(),2);
					System.out.println("Dinero Actual:"+fabricaMM.getDineroUser()); b=false;
					break;
					case 3:	constructor.agregarMotor(a); fabricaMM.cobrarMo(fabricaMM.getDineroUser(),3);
					System.out.println("Dinero Actual:"+fabricaMM.getDineroUser()); b=false;
					break;
					default:System.out.println("Digita una opcion Valida"); b=true;
				}
			}

			b=true;
			while (b)
			{
				System.out.println("Que tipo de Carroceria Quieres para tu Auto\n");
				fabricaMM.carrocerias();
				a = t.nextInt();
				switch (a)
				{
					case 1:	constructor.agregarCarroceria(a); fabricaMM.cobrarCa(fabricaMM.getDineroUser(),1);
					System.out.println("Dinero Actual:"+fabricaMM.getDineroUser()); b=false;
					break;
					case 2:	constructor.agregarCarroceria(a); fabricaMM.cobrarCa(fabricaMM.getDineroUser(),2);
					System.out.println("Dinero Actual:"+fabricaMM.getDineroUser()); b=false;
					break;
					case 3:	constructor.agregarCarroceria(a); fabricaMM.cobrarCa(fabricaMM.getDineroUser(),3);
					System.out.println("Dinero Actual:"+fabricaMM.getDineroUser()); b=false;
					break;
					default:System.out.println("Digita una opcion Valida"); b=true;
				}
			}

			b=true;
			while (b)
			{
				System.out.println("Que tipo de Blindaje Quieres para tu Auto\n");
				fabricaMM.blindajes();
				a = t.nextInt();
				switch (a)
				{
					case 1:	constructor.agregarBlindaje(a); fabricaMM.cobrarBl(fabricaMM.getDineroUser(),1);
					System.out.println("Dinero Actual:"+fabricaMM.getDineroUser()); b=false;
					break;
					case 2:	constructor.agregarBlindaje(a); fabricaMM.cobrarBl(fabricaMM.getDineroUser(),2);
					System.out.println("Dinero Actual:"+fabricaMM.getDineroUser()); b=false;
					break;
					case 3:	constructor.agregarBlindaje(a); fabricaMM.cobrarBl(fabricaMM.getDineroUser(),3);
					System.out.println("Dinero Actual:"+fabricaMM.getDineroUser()); b=false;
					break;
					default:System.out.println("Digita una opcion Valida"); b=true;
				}
			}

			b=true;
			while (b)
			{
				System.out.println("Que tipo de Armas Quieres para tu Auto\n");
				fabricaMM.armas();
				a = t.nextInt();
				switch (a)
				{
					case 1:	constructor.agregarArmas(a); fabricaMM.cobrarAr(fabricaMM.getDineroUser(),1);
					System.out.println("Dinero Actual:"+fabricaMM.getDineroUser()); b=false;
					break;
					case 2:	constructor.agregarArmas(a); fabricaMM.cobrarAr(fabricaMM.getDineroUser(),2);
					System.out.println("Dinero Actual:"+fabricaMM.getDineroUser()); b=false;
					break;
					case 3:	constructor.agregarArmas(a); fabricaMM.cobrarAr(fabricaMM.getDineroUser(),3);
					System.out.println("Dinero Actual:"+fabricaMM.getDineroUser()); b=false;
					break;
					case 4:	constructor.agregarArmas(a); fabricaMM.cobrarAr(fabricaMM.getDineroUser(),4);
					System.out.println("Dinero Actual:"+fabricaMM.getDineroUser()); b=false;
					break;
					case 5:	constructor.agregarArmas(a); fabricaMM.cobrarAr(fabricaMM.getDineroUser(),5);
					System.out.println("Dinero Actual:"+fabricaMM.getDineroUser()); b=false;
					break;
					default:System.out.println("Digita una opcion Valida"); b=true;
				}
			}
			auto = constructor.getAuto();
			auto.crear();
			auto.partes();
			auto.informacionAuto();
			fabricaMM.infoUsuarioFinal();
			break;

			case 2:
					constructor.setAuto(a);
					constructor.autoSimple();
					fabricaMM.cobrarLl(fabricaMM.getDineroUser(),1);
					fabricaMM.cobrarMo(fabricaMM.getDineroUser(),1);
					fabricaMM.cobrarCa(fabricaMM.getDineroUser(),1);
					fabricaMM.cobrarBl(fabricaMM.getDineroUser(),1);
					fabricaMM.cobrarAr(fabricaMM.getDineroUser(),1);
					auto = constructor.getAuto();
					auto.crear();
					auto.partes();
					auto.informacionAuto();
					fabricaMM.infoUsuarioFinal();
					b = false;
			break;

			case 3:
					constructor.setAuto(a);
					constructor.autoDeportivo();
					fabricaMM.cobrarLl(fabricaMM.getDineroUser(),2);
					fabricaMM.cobrarMo(fabricaMM.getDineroUser(),3);
					fabricaMM.cobrarCa(fabricaMM.getDineroUser(),3);
					fabricaMM.cobrarBl(fabricaMM.getDineroUser(),2);
					fabricaMM.cobrarAr(fabricaMM.getDineroUser(),5);
					auto = constructor.getAuto();
					auto.crear();
					auto.partes();
					auto.informacionAuto();
					fabricaMM.infoUsuarioFinal();
					b = false;
			break;

			case 4:
					constructor.setAuto(a);
					constructor.autoPesado();
					fabricaMM.cobrarLl(fabricaMM.getDineroUser(),4);
					fabricaMM.cobrarMo(fabricaMM.getDineroUser(),2);
					fabricaMM.cobrarCa(fabricaMM.getDineroUser(),2);
					fabricaMM.cobrarBl(fabricaMM.getDineroUser(),3);
					fabricaMM.cobrarAr(fabricaMM.getDineroUser(),2);
					auto = constructor.getAuto();
					auto.crear();
					auto.partes();
					auto.informacionAuto();
					fabricaMM.infoUsuarioFinal();
					b = false;
			break;

			default:System.out.println("Digita una opcion Valida");
		}
		}
	}
}