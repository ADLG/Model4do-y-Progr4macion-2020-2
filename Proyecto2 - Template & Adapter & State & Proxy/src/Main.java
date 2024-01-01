import java.util.Scanner;
/*
 * Clase para Probar el Funcionamiento del Proyecyo 2.
 */
public class Main
{
	public static void main(String[] args)
	{
		Maquina maquina = new Maquina();
		EmpresaDulcesRosa empresadr = new EmpresaDulcesRosa();
		JefeTecnico jefe = new JefeTecnico();
		Repostero repostero = new Repostero();
		repostero.iniciarAlmacen();
		Scanner t = new Scanner(System.in);
		int id=0,id1=0,id2=0;
		boolean b1=true,b2=true;
		empresadr.inicio();
		maquina.activar();

		while (true)
		{
			System.out.println("\n1.Ver el inventario de las 3 Sucursales.\n2.Crear Dulces\n3.Salir");
			id = t.nextInt();
			switch (id)
			{
				case 1:
					System.out.println("INVENTARIO DE SUCURSALES:");
					jefe.reporteSucursales();
				break;

				case 2:
					while (b1)
					{
						System.out.println("\nMenu de Creacion de Dulces:\n\n1.Crear 7 Lotes de:\nChocolates con Almendras\nGomitas Ositos Dulces\nGalletas Saladas\n");
						System.out.println("2.Crear 7 Lotes de:\nChocolates Oscuros\nGomitas Gusanos Acidos\nGalletas de Mermelada\n");
						System.out.println("3.Crear 7 Lotes de:\nChocolates con Leche\nGomitas Frutas con Chamoy\nGalletas con Chispas\n");
						System.out.println("4.Opcion en la cual la Sucursal A tiene dulces suficientes y aun asi hace un pedido de dulces\n");
						System.out.println("[Los Lotes seran enviados a las 3 Sucursales]");
						id1 = t.nextInt();
						switch (id1)
						{
							case 1: b1=false; repostero.solicitarDulces(11); maquina.preparandodulce();
								System.out.println("\nSe terminaron de crear los 7 Lotes de Chocolates\nDigite un numero o una letra para continuar...\n");
								id1=t.nextInt();
								repostero.solicitarDulces(21);
								System.out.println("\nSe terminaron de crear los 7 Lotes de Gomitas\nDigite un numero o una letra para continuar...\n");
								id1=t.nextInt();
								repostero.solicitarDulces(31);
								System.out.println("\nSe terminaron de crear los 7 Lotes de Galletas\nDigite un numero o una letra para continuar...\n");
								maquina.empacando();
								maquina.enEspera();
								id1=t.nextInt();

								System.out.println("INFORMACION DE REPARTIDORES, CAMIONES y SUCURSALES:");
								empresadr.iniciarEmpresa();
								System.out.println("Digite un numero o una letra para continuar...");
								id1=t.nextInt();
								empresadr.asignarCamiones();
								System.out.println("Digite un numero o una letra para continuar...");
								id1=t.nextInt();
								jefe.relacionSucursales();
								System.out.println("Digite un numero o una letra para continuar...");
								id1=t.nextInt();

								jefe.notificarRepartidores();
								System.out.println("\nDigite un numero o una letra para continuar...");
								id1=t.nextInt();

								repostero.origanizaLotes();
								jefe.entregarLotesRepartidores(repostero.getLote1(), repostero.getLote2(), repostero.getLote3(), repostero.getLote4(), repostero.getLote5(), repostero.getLote6(), repostero.getLote7());
								repostero.origanizaLotes();
								jefe.entregarLotesRepartidores(repostero.getLote1(), repostero.getLote2(), repostero.getLote3(), repostero.getLote4(), repostero.getLote5(), repostero.getLote6(), repostero.getLote7());
								repostero.origanizaLotes();
								jefe.entregarLotesRepartidores(repostero.getLote1(), repostero.getLote2(), repostero.getLote3(), repostero.getLote4(), repostero.getLote5(), repostero.getLote6(), repostero.getLote7());
								System.out.println("\nReporte del Inventario de las Sucursales:");
								jefe.reporteSucursales();
								jefe.vender();
								System.out.println("\nReporte final del Inventario de las Sucursales:");
								jefe.reporteSucursales();
								maquina.apagar();
								 System.exit(0);
							break;

							case 2: b1=false; repostero.solicitarDulces(12); maquina.preparandodulce();
								System.out.println("\nSe terminaron de crear los 7 Lotes de Chocolates\nDigite un numero o una letra para continuar...\n");
								id1=t.nextInt();
								repostero.solicitarDulces(22);
								System.out.println("\nSe terminaron de crear los 7 Lotes de Gomitas\nDigite un numero o una letra para continuar...\n");
								id1=t.nextInt();
								repostero.solicitarDulces(32);
								System.out.println("\nSe terminaron de crear los 7 Lotes de Galletas\nDigite un numero o una letra para continuar...\n");
								maquina.empacando();
								maquina.enEspera();
								id1=t.nextInt();

								System.out.println("INFORMACION DE REPARTIDORES, CAMIONES y SUCURSALES:");
								empresadr.iniciarEmpresa();
								System.out.println("Digite un numero o una letra para continuar...");
								id1=t.nextInt();
								empresadr.asignarCamiones();
								System.out.println("Digite un numero o una letra para continuar...");
								id1=t.nextInt();
								jefe.relacionSucursales();
								System.out.println("Digite un numero o una letra para continuar...");
								id1=t.nextInt();

								jefe.notificarRepartidores();
								System.out.println("\nDigite un numero o una letra para continuar...");
								id1=t.nextInt();

								repostero.origanizaLotes();
								jefe.entregarLotesRepartidores(repostero.getLote1(), repostero.getLote2(), repostero.getLote3(), repostero.getLote4(), repostero.getLote5(), repostero.getLote6(), repostero.getLote7());
								repostero.origanizaLotes();
								jefe.entregarLotesRepartidores(repostero.getLote1(), repostero.getLote2(), repostero.getLote3(), repostero.getLote4(), repostero.getLote5(), repostero.getLote6(), repostero.getLote7());
								repostero.origanizaLotes();
								jefe.entregarLotesRepartidores(repostero.getLote1(), repostero.getLote2(), repostero.getLote3(), repostero.getLote4(), repostero.getLote5(), repostero.getLote6(), repostero.getLote7());
								System.out.println("\nReporte del Inventario de las Sucursales:");
								jefe.reporteSucursales();
								jefe.vender();
								System.out.println("\nReporte final del Inventario de las Sucursales:");
								jefe.reporteSucursales();
								maquina.apagar();
								System.exit(0);
							break;

							case 3: b1=false; repostero.solicitarDulces(13);maquina.preparandodulce();
								System.out.println("\nSe terminaron de crear los 7 Lotes de Chocolates\nDigite un numero o una letra para continuar...\n");
								id1=t.nextInt();
								repostero.solicitarDulces(23);
								System.out.println("\nSe terminaron de crear los 7 Lotes de Gomitas\nDigite un numero o una letra para continuar...\n");
								id1=t.nextInt();
								repostero.solicitarDulces(33);
								System.out.println("\nSe terminaron de crear los 7 Lotes de Galletas\nDigite un numero o una letra para continuar...\n");
								maquina.empacando();
								maquina.enEspera();
								id1=t.nextInt();

								System.out.println("INFORMACION DE REPARTIDORES, CAMIONES y SUCURSALES:");
								empresadr.iniciarEmpresa();
								System.out.println("Digite un numero o una letra para continuar...");
								id1=t.nextInt();
								empresadr.asignarCamiones();
								System.out.println("Digite un numero o una letra para continuar...");
								id1=t.nextInt();
								jefe.relacionSucursales();
								System.out.println("Digite un numero o una letra para continuar...");
								id1=t.nextInt();

								jefe.notificarRepartidores();
								System.out.println("\nDigite un numero o una letra para continuar...");
								id1=t.nextInt();

								repostero.origanizaLotes();
								jefe.entregarLotesRepartidores(repostero.getLote1(), repostero.getLote2(), repostero.getLote3(), repostero.getLote4(), repostero.getLote5(), repostero.getLote6(), repostero.getLote7());
								repostero.origanizaLotes();
								jefe.entregarLotesRepartidores(repostero.getLote1(), repostero.getLote2(), repostero.getLote3(), repostero.getLote4(), repostero.getLote5(), repostero.getLote6(), repostero.getLote7());
								repostero.origanizaLotes();
								jefe.entregarLotesRepartidores(repostero.getLote1(), repostero.getLote2(), repostero.getLote3(), repostero.getLote4(), repostero.getLote5(), repostero.getLote6(), repostero.getLote7());
								System.out.println("\nReporte del Inventario de las Sucursales:");
								jefe.reporteSucursales();
								jefe.vender();
								System.out.println("\nReporte final del Inventario de las Sucursales:");
								jefe.reporteSucursales();
								maquina.apagar();
								System.exit(0);
							break;

							case 4: b1=false;
								System.out.println("Se llenara los inventarios de la Sucursal A\n");
								maquina.preparandodulce();
								repostero.solicitarDulces(11);
								System.out.println("\nSe terminaron de crear 7 Lotes de Chocolates\nDigite un numero o una letra para continuar...\n");
								id1=t.nextInt();
								repostero.solicitarDulces(12);
								System.out.println("\nSe terminaron de crear 7 Lotes de Chocolates\nDigite un numero o una letra para continuar...\n");
								id1=t.nextInt();
								repostero.solicitarDulces(13);
								System.out.println("\nSe terminaron de crear 7 Lotes de Chocolates\nDigite un numero o una letra para continuar...\n");
								id1=t.nextInt();

								repostero.solicitarDulces(21);
								System.out.println("\nSe terminaron de crear 7 Lotes de Gomitas\nDigite un numero o una letra para continuar...\n");
								id1=t.nextInt();
								repostero.solicitarDulces(22);
								System.out.println("\nSe terminaron de crear 7 Lotes de Gomitas\nDigite un numero o una letra para continuar...\n");
								id1=t.nextInt();
								repostero.solicitarDulces(23);
								System.out.println("\nSe terminaron de crear 7 Lotes de Gomitas\nDigite un numero o una letra para continuar...\n");
								id1=t.nextInt();

								repostero.solicitarDulces(31);
								System.out.println("\nSe terminaron de crear los 7 Lotes de Galletas\nDigite un numero o una letra para continuar...\n");
								id1=t.nextInt();
								repostero.solicitarDulces(32);
								System.out.println("\nSe terminaron de crear los 7 Lotes de Galletas\nDigite un numero o una letra para continuar...\n");
								id1=t.nextInt();
								repostero.solicitarDulces(33);
								System.out.println("\nSe terminaron de crear los 7 Lotes de Galletas\nDigite un numero o una letra para continuar...\n");
								maquina.empacando();
								maquina.enEspera();
								id1=t.nextInt();


								System.out.println("INFORMACION DE REPARTIDORES, CAMIONES y SUCURSALES:");
								empresadr.iniciarEmpresa();
								System.out.println("Digite un numero o una letra para continuar...");
								id1=t.nextInt();
								empresadr.asignarCamiones();
								System.out.println("Digite un numero o una letra para continuar...");
								id1=t.nextInt();

								jefe.relacionSucursal(1);
								System.out.println("Digite un numero o una letra para continuar...");
								id1=t.nextInt();

								jefe.notificarRepartidores();
								System.out.println("\nDigite un numero o una letra para continuar...");
								id1=t.nextInt();

								for (int i=0; i<9; i++)
								{	
									repostero.origanizaLotes();
									jefe.entregarLotesRepartidores(repostero.getLote1(), repostero.getLote2(), repostero.getLote3(), repostero.getLote4(), repostero.getLote5(), repostero.getLote6(), repostero.getLote7());
								}

								System.out.println("Reporte del Inventario de la Sucursal");
								jefe.reporteSucursal();

								System.out.println("\n1.Pedir mas Dulces para la Sucursal\n2.Salir");
								id1=t.nextInt();
								if (id1==1)
								{
									if (jefe.getEstadoSA()==true)
									System.out.println("El Almacen de la Sucursal A tiene Dulces suficientes\nNO es posible pedir mas Dulces para esta sucursal");
								}
								System.out.println("\nReporte del Inventario de la Sucursal:");
								jefe.reporteSucursalA();
								jefe.venderA();
								System.out.println("\nReporte final del Inventario de la Sucursal:");
								jefe.reporteSucursal();
								maquina.apagar();
									System.exit(0);
							break;

							default: b1=true; System.out.println("Opcion no valida, digite una opcion que aparezca en el Menu.\n");
						}
					}
				break;
				case 3: System.exit(0);
				break;
				default: System.out.println("Opcion no valida, digite una opcion que aparezca en el Menu.\n");
			}
		}
	}
}