import java.util.ArrayList;
import java.util.List;

public class Main
{
	static Netflix cnetflix = new Netflix();
	static AmazonPV camazonpv = new AmazonPV();
	static Twitch ctwitch = new Twitch();
	static Spotify cspotify = new Spotify();
	static YouTube cyoutube = new YouTube();

	public static void main(String[] args)
	{
		/*Empresas*/
		Empresa netflix1 = new Empresa("Netflix");
		Empresa amazonpv1 = new Empresa("Amazon Prime Video");
		Empresa twitch1 = new Empresa("Twitch");
		Empresa spotify1 = new Empresa("Spotify");
		Empresa youtube1 = new Empresa("YouTube");

		Empresa netflix2 = new Empresa("Netflix");
		Empresa amazonpv2 = new Empresa("Amazon Prime Video");
		Empresa twitch2 = new Empresa("Twitch");
		Empresa spotify2 = new Empresa("Spotify");
		Empresa youtube2 = new Empresa("YouTube");

		Empresa netflix3 = new Empresa("Netflix");
		Empresa amazonpv3 = new Empresa("Amazon Prime Video");
		Empresa twitch3 = new Empresa("Twitch");
		Empresa spotify3 = new Empresa("Spotify");
		Empresa youtube3 = new Empresa("YouTube");

		Empresa netflix4 = new Empresa("Netflix");
		Empresa amazonpv4 = new Empresa("Amazon Prime Video");
		Empresa twitch4 = new Empresa("Twitch");
		Empresa spotify4 = new Empresa("Spotify");
		Empresa youtube4 = new Empresa("YouTube");

		Empresa netflix5 = new Empresa("Netflix");
		Empresa amazonpv5 = new Empresa("Amazon Prime Video");
		Empresa twitch5 = new Empresa("Twitch");
		Empresa spotify5 = new Empresa("Spotify");
		Empresa youtube5 = new Empresa("YouTube");

		/*Cuentas*/
		Usuario alician = new Usuario("Alicia",500,netflix1);
		Usuario aliciaapv = new Usuario("Alicia",500,amazonpv1);
		Usuario aliciat = new Usuario("Alicia",500,twitch1);
		Usuario alicias = new Usuario("Alicia",500,spotify1);
		Usuario aliciay = new Usuario("Alicia",500,youtube1);

		Usuario bobn = new Usuario("Bob",40,netflix2);
		Usuario bobapv = new Usuario("Bob",40,amazonpv2);
		Usuario bobt = new Usuario("Bob",40,twitch2);
		Usuario bobs = new Usuario("Bob",40,spotify2);
		Usuario boby = new Usuario("Bob",40,youtube2);

		Usuario cesarn = new Usuario("Cesar",40,netflix3);
		Usuario cesarapv = new Usuario("Cesar",40,amazonpv3);
		Usuario cesart = new Usuario("Cesar",40,twitch3);
		Usuario cesars = new Usuario("Cesar",40,spotify3);
		Usuario cesary = new Usuario("Cesar",40,youtube3);

		Usuario diegon = new Usuario("Diego",180,netflix4);
		Usuario diegoapv = new Usuario("Diego",180,amazonpv4);
		Usuario diegot = new Usuario("Diego",180,twitch4);
		Usuario diegos = new Usuario("Diego",180,spotify4);
		Usuario diegoy = new Usuario("Diego",180,youtube4);

		Usuario erikan = new Usuario("Erika",300,netflix5);
		Usuario erikaapv = new Usuario("Erika",300,amazonpv5);
		Usuario erikat = new Usuario("Erika",300,twitch5);
		Usuario erikas = new Usuario("Erika",300,spotify5);
		Usuario erikay = new Usuario("Erika",300,youtube5);


		System.out.println("\nInicio de simulacion de usuarios contratando servicios por 5 dias\n\n <<<<<<<<<<<<<<<<<<<<<<<<<< Dia 1 >>>>>>>>>>>>>>>>>>>>>>>>>> \n");

		alician.datosDeUsuario();
		System.out.println("Lista de servicios de Alicia:");

		/*Netflix*/
		System.out.println("*"+netflix1.getNombreEmpresa());
		netflix1.registrarSub(alician);
		cnetflix.tarifaPrimerDia15para4();

		/*AmazonPV*/
		System.out.println("\n*"+amazonpv1.getNombreEmpresa());
		amazonpv1.registrarSub(aliciaapv);
		camazonpv.tarifaPremiumPrimerDia();

		/*Twitch*/
		System.out.println("\n*"+twitch1.getNombreEmpresa());
		twitch1.registrarSub(aliciat);
		ctwitch.tarifaPrimerDia();

		/*Spotify*/
		System.out.println("\n*"+spotify1.getNombreEmpresa());
		spotify1.registrarSub(alicias);
		cspotify.tarifaPremiumPrimerDia();

		/*YouTube*/
		System.out.println("\n*"+youtube1.getNombreEmpresa());
		youtube1.registrarSub(aliciay);
		cyoutube.tarifaPremiumPrimerDia();

		System.out.println("\nEstado de suscripciones:");
		netflix1.setEstadoDeCuenta(alician,"Netflix:");
		amazonpv1.setEstadoDeCuenta(aliciaapv,"Amazon Prime Video:");
		twitch1.setEstadoDeCuenta(aliciat,"Twitch: ");
		spotify1.setEstadoDeCuenta(alicias,"Spotify:");
		youtube1.setEstadoDeCuenta(aliciay,"YouTube:");
		netflix1.notificar();
		amazonpv1.notificar();
		twitch1.notificar();
		spotify1.notificar();
		youtube1.notificar();
		System.out.println("\n");

		
		bobn.datosDeUsuario();
		System.out.println("Lista de servicios de Bob:");

		/*Netflix*/
		System.out.println("*"+netflix2.getNombreEmpresa());
		netflix2.registrarSub(bobn);
		cnetflix.tarifaPrimerDia15para4();

		/*AmazonPV*/
		System.out.println("\n*"+amazonpv2.getNombreEmpresa());
		amazonpv2.registrarSub(bobapv);
		camazonpv.tarifaPremiumPrimerDia();

		/*Twitch*/
		System.out.println("\n*"+twitch2.getNombreEmpresa());
		twitch2.registrarSub(bobt);
		ctwitch.tarifaPrimerDia();

		/*Spotify*/
		System.out.println("\n*"+spotify2.getNombreEmpresa());
		spotify2.registrarSub(bobs);
		cspotify.tarifaPremiumPrimerDia();

		/*YouTube*/
		System.out.println("\n*"+youtube2.getNombreEmpresa());
		youtube2.registrarSub(boby);
		cyoutube.tarifaPremiumPrimerDia();

		System.out.println("\nEstado de suscripciones:");
		netflix2.setEstadoDeCuenta(bobn,"Netflix:");
		amazonpv2.setEstadoDeCuenta(bobapv,"Amazon Prime Video:");
		twitch2.setEstadoDeCuenta(bobt,"Twitch: ");
		spotify2.setEstadoDeCuenta(bobs,"Spotify:");
		youtube2.setEstadoDeCuenta(boby,"YouTube:");
		netflix2.notificar();
		amazonpv2.notificar();
		twitch2.notificar();
		spotify2.notificar();
		youtube2.notificar();		
		System.out.println("\n");


		cesarn.datosDeUsuario();
		System.out.println("Lista de servicios de Cesar:");

		/*Spotify*/
		System.out.println("\n*"+spotify3.getNombreEmpresa());
		spotify3.registrarSub(cesars);
		cspotify.tarifaPremiumPrimerDia();

		/*YouTube*/
		System.out.println("\n*"+youtube3.getNombreEmpresa());
		youtube3.registrarSub(cesary);
		cyoutube.tarifaNormal();

		System.out.println("\nEstado de suscripciones:");
		spotify3.setEstadoDeCuenta(cesars,"Spotify:");
		youtube3.setEstadoDeCuenta(cesary,"YouTube:");
		spotify3.notificar();
		youtube3.notificar();
		System.out.println("\n");


		diegon.datosDeUsuario();
		System.out.println("Lista de servicios de Diego:");

		/*Netflix*/
		System.out.println("*"+netflix4.getNombreEmpresa());
		netflix4.registrarSub(diegon);
		cnetflix.tarifaPrimerDia10para2();

		/*AmazonPV*/
		System.out.println("\n*"+amazonpv4.getNombreEmpresa());
		amazonpv4.registrarSub(diegoapv);
		camazonpv.tarifaPremiumPrimerDia();

		System.out.println("\nEstado de suscripciones:");
		netflix4.setEstadoDeCuenta(diegon,"Netflix:");
		amazonpv4.setEstadoDeCuenta(diegoapv,"Amazon Prime Video:");
		netflix4.notificar();
		amazonpv4.notificar();
		System.out.println("\n");


		erikan.datosDeUsuario();
		System.out.println("Lista de servicios de Erika:");

		/*Netflix*/
		System.out.println("*"+netflix5.getNombreEmpresa());
		netflix5.registrarSub(erikan);
		cnetflix.tarifaPrimerDia15para4();

		/*Twitch*/
		System.out.println("\n*"+twitch5.getNombreEmpresa());
		twitch5.registrarSub(erikat);
		ctwitch.tarifaPrimerDia();

		/*Spotify*/
		System.out.println("\n*"+spotify5.getNombreEmpresa());
		spotify5.registrarSub(erikas);
		cspotify.tarifaNormal();

		/*YouTube*/
		System.out.println("\n*"+youtube5.getNombreEmpresa());
		youtube5.registrarSub(erikay);
		cyoutube.tarifaNormal();

		System.out.println("\nEstado de suscripciones:");
		netflix5.setEstadoDeCuenta(erikan,"Netflix:");		
		twitch5.setEstadoDeCuenta(erikat,"Twitch: ");
		spotify5.setEstadoDeCuenta(erikas,"Spotify:");
		youtube5.setEstadoDeCuenta(erikay,"YouTube:");
		netflix5.notificar();
		twitch5.notificar();
		spotify5.notificar();
		youtube5.notificar();

		System.out.println("\n <<<<<<<<<<<<<<<<<<<<<<<<<< Dia 2 >>>>>>>>>>>>>>>>>>>>>>>>>> \n");

		alician.datosDeUsuario();
		System.out.println("Lista de servicios de Alicia:");

		/*Netflix*/
		System.out.println("*"+netflix1.getNombreEmpresa());
		netflix1.registrarSub(alician);
		cnetflix.tarifa(alician,3);
		alician.pagar(cnetflix.dineroRestante());
		netflix1.actualizarDinero(alician,aliciaapv,aliciat,alicias,aliciay);

		/*AmazonPV*/
		System.out.println("\n*"+amazonpv1.getNombreEmpresa());
		amazonpv1.registrarSub(aliciaapv);
		camazonpv.tarifa(aliciaapv,2);
		aliciaapv.pagar(camazonpv.dineroRestante());
		amazonpv1.actualizarDinero(aliciaapv,alician,aliciat,alicias,aliciay);

		/*Twitch*/
		System.out.println("\n*"+twitch1.getNombreEmpresa());
		twitch1.registrarSub(aliciat);
		ctwitch.tarifa(aliciat,2);
		aliciat.pagar(ctwitch.dineroRestante());
		twitch1.actualizarDinero(aliciat,aliciaapv,alician,alicias,aliciay);

		/*Spotify*/
		System.out.println("\n*"+spotify1.getNombreEmpresa());
		spotify1.registrarSub(alicias);
		cspotify.tarifa(alicias,2);
		alicias.pagar(cspotify.dineroRestante());
		spotify1.actualizarDinero(alicias,aliciaapv,aliciat,alician,aliciay);

		/*YouTube*/
		System.out.println("\n*"+youtube1.getNombreEmpresa());
		youtube1.registrarSub(aliciay);
		cyoutube.tarifa(aliciay,2);
		aliciay.pagar(cyoutube.dineroRestante());
		youtube1.actualizarDinero(aliciay,aliciaapv,aliciat,alicias,alician);

		System.out.println("\nEstado de suscripciones:");
		netflix1.setEstadoDeCuenta(alician,"Netflix:");
		amazonpv1.setEstadoDeCuenta(aliciaapv,"Amazon Prime Video:");
		twitch1.setEstadoDeCuenta(aliciat,"Twitch: ");
		spotify1.setEstadoDeCuenta(alicias,"Spotify:");
		youtube1.setEstadoDeCuenta(aliciay,"YouTube:");
		netflix1.notificar();
		amazonpv1.notificar();
		twitch1.notificar();
		spotify1.notificar();
		youtube1.notificar();
		System.out.println("\n");


		bobn.datosDeUsuario();
		System.out.println("Lista de servicios de Bob:");

		/*Netflix*/
		System.out.println("*"+netflix2.getNombreEmpresa());
		netflix2.registrarSub(bobn);
		cnetflix.tarifa(bobn,3);
		bobn.pagar(cnetflix.dineroRestante());
		netflix2.actualizarDinero(bobn,bobapv,bobt,bobs,boby);

		/*AmazonPV*/
		System.out.println("\n*"+amazonpv2.getNombreEmpresa());
		amazonpv2.registrarSub(bobapv);
		camazonpv.tarifa(bobapv,2);
		bobapv.pagar(camazonpv.dineroRestante());
		amazonpv2.actualizarDinero(bobapv,bobn,bobt,bobs,boby);

		/*Twitch*/
		System.out.println("\n*"+twitch2.getNombreEmpresa());
		twitch2.registrarSub(bobt);
		ctwitch.tarifa(bobt,2);
		bobt.pagar(ctwitch.dineroRestante());
		twitch2.actualizarDinero(bobt,bobapv,bobn,bobs,boby);

		/*Spotify*/
		System.out.println("\n*"+spotify2.getNombreEmpresa());
		spotify2.registrarSub(bobs);
		cspotify.tarifa(bobs,2);
		bobs.pagar(cspotify.dineroRestante());
		spotify2.actualizarDinero(bobs,bobapv,bobt,bobn,boby);

		/*YouTube*/
		System.out.println("\n*"+youtube2.getNombreEmpresa());
		cyoutube.tarifa(boby,2);
		youtube2.eliminarSub(boby);

		System.out.println("\nEstado de suscripciones:");
		netflix2.setEstadoDeCuenta(bobn,"Netflix:");
		amazonpv2.setEstadoDeCuenta(bobapv,"Amazon Prime Video:");
		twitch2.setEstadoDeCuenta(bobt,"Twitch: ");
		spotify2.setEstadoDeCuenta(bobs,"Spotify:");
		netflix2.notificar();
		amazonpv2.notificar();
		twitch2.notificar();
		spotify2.notificar();
		System.out.println("\n");


		cesarn.datosDeUsuario();
		System.out.println("Lista de servicios de Cesar:");

		/*Spotify*/
		System.out.println("\n*"+spotify3.getNombreEmpresa());
		spotify3.registrarSub(cesars);
		cspotify.tarifa(cesars,2);
		cesars.pagar(cspotify.dineroRestante());
		spotify3.actualizarDinero(cesars,cesarapv,cesart,cesarn,cesary);

		/*YouTube*/
		System.out.println("\n*"+youtube3.getNombreEmpresa());
		youtube3.registrarSub(cesary);
		cyoutube.tarifaNormal();

		System.out.println("\nEstado de suscripciones:");
		spotify3.setEstadoDeCuenta(cesars,"Spotify:");
		youtube3.setEstadoDeCuenta(cesary,"YouTube:");
		spotify3.notificar();
		youtube3.notificar();
		System.out.println("\n");


		diegon.datosDeUsuario();
		System.out.println("Lista de servicios de Diego:");

		/*Netflix*/
		System.out.println("*"+netflix4.getNombreEmpresa());
		netflix4.registrarSub(diegon);
		cnetflix.tarifa(diegon,2);
		diegon.pagar(cnetflix.dineroRestante());
		netflix4.actualizarDinero(diegon,diegoapv,diegot,diegos,diegoy);

		/*AmazonPV*/
		System.out.println("\n*"+amazonpv4.getNombreEmpresa());
		amazonpv4.registrarSub(diegoapv);
		camazonpv.tarifa(diegoapv,2);
		diegoapv.pagar(camazonpv.dineroRestante());
		amazonpv4.actualizarDinero(diegoapv,diegon,diegot,diegos,diegoy);

		/*Twitch*/
		System.out.println("\n*"+twitch4.getNombreEmpresa());
		twitch4.registrarSub(diegot);
		ctwitch.tarifa(diegot,4);
		diegot.pagar(ctwitch.dineroRestante());
		twitch4.actualizarDinero(diegot,diegon,diegoapv,diegos,diegoy);

		System.out.println("\nEstado de suscripciones:");
		netflix4.setEstadoDeCuenta(diegon,"Netflix:");
		amazonpv4.setEstadoDeCuenta(diegoapv,"Amazon Prime Video:");
		twitch4.setEstadoDeCuenta(diegot,"Twitch:");
		netflix4.notificar();
		amazonpv4.notificar();
		twitch4.notificar();
		System.out.println("\n");


		erikan.datosDeUsuario();
		System.out.println("Lista de servicios de Erika:");

		/*Netflix*/
		System.out.println("*"+netflix5.getNombreEmpresa());
		netflix5.registrarSub(erikan);
		cnetflix.tarifa(erikan,3);
		erikan.pagar(cnetflix.dineroRestante());
		netflix5.actualizarDinero(erikan,erikaapv,erikat,erikas,erikay);

		/*Twitch*/
		System.out.println("\n*"+twitch5.getNombreEmpresa());
		twitch5.registrarSub(erikat);
		ctwitch.tarifa(erikat,1);
		erikat.pagar(ctwitch.dineroRestante());
		twitch5.actualizarDinero(erikat,erikaapv,erikan,erikas,erikay);

		/*Spotify*/
		System.out.println("\n*"+spotify5.getNombreEmpresa());
		spotify5.registrarSub(erikas);
		cspotify.tarifa(erikas,2);
		erikas.pagar(cspotify.dineroRestante());
		spotify5.actualizarDinero(erikas,erikaapv,erikan,erikat,erikay);

		/*YouTube*/
		System.out.println("\n*"+youtube5.getNombreEmpresa());
		youtube5.registrarSub(erikay);
		cyoutube.tarifa(erikay,2);
		erikay.pagar(cyoutube.dineroRestante());
		youtube5.actualizarDinero(erikay,erikaapv,erikan,erikas,erikat);

		System.out.println("\nEstado de suscripciones:");
		netflix5.setEstadoDeCuenta(erikan,"Netflix:");		
		twitch5.setEstadoDeCuenta(erikat,"Twitch: ");
		spotify5.setEstadoDeCuenta(erikas,"Spotify:");
		youtube5.setEstadoDeCuenta(erikay,"YouTube:");
		netflix5.notificar();
		twitch5.notificar();
		spotify5.notificar();
		youtube5.notificar();

		System.out.println("\n <<<<<<<<<<<<<<<<<<<<<<<<<< Dia 3 >>>>>>>>>>>>>>>>>>>>>>>>>> \n");

		alician.datosDeUsuario();
		System.out.println("Lista de servicios de Alicia:");

		/*Netflix*/
		System.out.println("*"+netflix1.getNombreEmpresa());
		netflix1.registrarSub(alician);
		cnetflix.tarifa(alician,3);
		alician.pagar(cnetflix.dineroRestante());
		netflix1.actualizarDinero(alician,aliciaapv,aliciat,alicias,aliciay);

		/*AmazonPV*/
		System.out.println("\n*"+amazonpv1.getNombreEmpresa());
		amazonpv1.registrarSub(aliciaapv);
		camazonpv.tarifa(aliciaapv,2);
		aliciaapv.pagar(camazonpv.dineroRestante());
		amazonpv1.actualizarDinero(aliciaapv,alician,aliciat,alicias,aliciay);

		/*Twitch*/
		System.out.println("\n*"+twitch1.getNombreEmpresa());
		twitch1.registrarSub(aliciat);
		ctwitch.tarifa(aliciat,2);
		aliciat.pagar(ctwitch.dineroRestante());
		twitch1.actualizarDinero(aliciat,aliciaapv,alician,alicias,aliciay);

		/*Spotify*/
		System.out.println("\n*"+spotify1.getNombreEmpresa());
		spotify1.registrarSub(alicias);
		cspotify.tarifa(alicias,2);
		alicias.pagar(cspotify.dineroRestante());
		spotify1.actualizarDinero(alicias,aliciaapv,aliciat,alician,aliciay);

		/*YouTube*/
		System.out.println("\n*"+youtube1.getNombreEmpresa());
		youtube1.registrarSub(aliciay);
		cyoutube.tarifa(aliciay,2);
		aliciay.pagar(cyoutube.dineroRestante());
		youtube1.actualizarDinero(aliciay,aliciaapv,aliciat,alicias,alician);

		System.out.println("\nEstado de suscripciones:");
		netflix1.setEstadoDeCuenta(alician,"Netflix:");
		amazonpv1.setEstadoDeCuenta(aliciaapv,"Amazon Prime Video:");
		twitch1.setEstadoDeCuenta(aliciat,"Twitch: ");
		spotify1.setEstadoDeCuenta(alicias,"Spotify:");
		youtube1.setEstadoDeCuenta(aliciay,"YouTube:");
		netflix1.notificar();
		amazonpv1.notificar();
		twitch1.notificar();
		spotify1.notificar();
		youtube1.notificar();
		System.out.println("\n");


		bobn.datosDeUsuario();
		System.out.println("Lista de servicios de Bob:");

		/*Netflix*/
		System.out.println("*"+netflix2.getNombreEmpresa());
		cnetflix.tarifa(bobn,3);
		netflix2.eliminarSub(bobn);

		/*AmazonPV*/
		System.out.println("\n*"+amazonpv2.getNombreEmpresa());
		camazonpv.tarifa(bobapv,2);
		amazonpv2.eliminarSub(bobapv);

		/*Twitch*/
		System.out.println("\n*"+twitch2.getNombreEmpresa());
		ctwitch.tarifa(bobt,1);
		twitch2.eliminarSub(bobt);

		/*Spotify*/
		System.out.println("\n*"+spotify2.getNombreEmpresa());
		spotify2.registrarSub(bobs);
		cspotify.tarifa(bobs,2);
		bobs.pagar(cspotify.dineroRestante());
		spotify2.actualizarDinero(bobs,bobapv,bobt,bobn,boby);

		/*YouTube*/
		System.out.println("\n*"+youtube2.getNombreEmpresa());
		cyoutube.tarifa(boby,2);
		youtube2.eliminarSub(boby);

		System.out.println("\nEstado de suscripciones:");
		spotify2.setEstadoDeCuenta(bobs,"Spotify:");
		spotify2.notificar();
		System.out.println("\n");


		cesarn.datosDeUsuario();
		System.out.println("Lista de servicios de Cesar:");

		/*Spotify*/
		System.out.println("\n*"+spotify3.getNombreEmpresa());
		spotify3.registrarSub(cesars);
		cspotify.tarifa(cesars,2);
		cesars.pagar(cspotify.dineroRestante());
		spotify3.actualizarDinero(cesars,cesarapv,cesarn,cesars,cesary);

		/*YouTube*/
		System.out.println("\n*"+youtube3.getNombreEmpresa());
		youtube3.registrarSub(cesary);
		cyoutube.tarifaNormal();

		System.out.println("\nEstado de suscripciones:");
		spotify3.setEstadoDeCuenta(cesars,"Spotify:");
		youtube3.setEstadoDeCuenta(cesary,"YouTube:");
		spotify3.notificar();
		youtube3.notificar();
		System.out.println("\n");


		diegon.datosDeUsuario();
		System.out.println("Lista de servicios de Diego:");

		/*Netflix*/
		System.out.println("*"+netflix4.getNombreEmpresa());
		diegon.cancelarSub();

		/*AmazonPV*/
		System.out.println("\n*"+amazonpv4.getNombreEmpresa());
		amazonpv4.registrarSub(diegoapv);
		camazonpv.tarifa(diegoapv,2);
		diegoapv.pagar(camazonpv.dineroRestante());
		amazonpv4.actualizarDinero(diegoapv,diegon,diegot,diegos,diegoy);

		/*Twitch*/
		System.out.println("\n*"+twitch4.getNombreEmpresa());
		twitch4.registrarSub(diegot);
		ctwitch.tarifa(diegot,2);
		diegot.pagar(ctwitch.dineroRestante());
		twitch4.actualizarDinero(diegot,diegon,diegoapv,diegos,diegoy);

		/*Spotify*/
		System.out.println("\n*"+spotify4.getNombreEmpresa());
		spotify4.registrarSub(diegos);
		cspotify.tarifaNormal();

		System.out.println("\nEstado de suscripciones:");
		amazonpv4.setEstadoDeCuenta(diegoapv,"Amazon Prime Video:");
		twitch4.setEstadoDeCuenta(diegot,"Twitch:");
		spotify4.setEstadoDeCuenta(diegos,"Spotify:");
		amazonpv4.notificar();
		twitch4.notificar();
		spotify4.notificar();
		System.out.println("\n");


		erikan.datosDeUsuario();
		System.out.println("Lista de servicios de Erika:");

		/*Netflix*/
		System.out.println("*"+netflix5.getNombreEmpresa());
		erikan.cancelarSub();

		/*AmazonPV*/
		System.out.println("\n*"+amazonpv5.getNombreEmpresa());
		amazonpv5.registrarSub(erikaapv);
		camazonpv.tarifa(erikaapv,2);
		erikaapv.pagar(camazonpv.dineroRestante());
		amazonpv5.actualizarDinero(erikaapv,erikan,erikat,erikas,erikay);

		/*Twitch*/
		System.out.println("\n*"+twitch5.getNombreEmpresa());
		twitch5.registrarSub(erikat);
		ctwitch.tarifa(erikat,2);
		erikat.pagar(ctwitch.dineroRestante());
		twitch5.actualizarDinero(erikat,erikaapv,erikan,erikas,erikay);

		/*Spotify*/
		System.out.println("\n*"+spotify5.getNombreEmpresa());
		spotify5.registrarSub(erikas);
		cspotify.tarifa(erikas,2);
		erikas.pagar(cspotify.dineroRestante());
		spotify5.actualizarDinero(erikas,erikaapv,erikan,erikat,erikay);

		/*YouTube*/
		System.out.println("\n*"+youtube5.getNombreEmpresa());
		youtube5.registrarSub(erikay);
		cyoutube.tarifa(erikay,2);
		erikay.pagar(cyoutube.dineroRestante());
		youtube5.actualizarDinero(erikay,erikaapv,erikan,erikas,erikat);

		System.out.println("\nEstado de suscripciones:");
		netflix5.setEstadoDeCuenta(erikan,"Netflix:");		
		twitch5.setEstadoDeCuenta(erikat,"Twitch: ");
		spotify5.setEstadoDeCuenta(erikas,"Spotify:");
		youtube5.setEstadoDeCuenta(erikay,"YouTube:");
		netflix5.notificar();
		twitch5.notificar();
		spotify5.notificar();
		youtube5.notificar();
		
		System.out.println("\n <<<<<<<<<<<<<<<<<<<<<<<<<< Dia 4 >>>>>>>>>>>>>>>>>>>>>>>>>> \n");

		alician.datosDeUsuario();
		System.out.println("Lista de servicios de Alicia:");

		/*Netflix*/
		System.out.println("*"+netflix1.getNombreEmpresa());
		netflix1.registrarSub(alician);
		cnetflix.tarifa(alician,3);
		alician.pagar(cnetflix.dineroRestante());
		netflix1.actualizarDinero(alician,aliciaapv,aliciat,alicias,aliciay);

		/*AmazonPV*/
		System.out.println("\n*"+amazonpv1.getNombreEmpresa());
		amazonpv1.registrarSub(aliciaapv);
		camazonpv.tarifa(aliciaapv,2);
		aliciaapv.pagar(camazonpv.dineroRestante());
		amazonpv1.actualizarDinero(aliciaapv,alician,aliciat,alicias,aliciay);

		/*Twitch*/
		System.out.println("\n*"+twitch1.getNombreEmpresa());
		twitch1.registrarSub(aliciat);
		ctwitch.tarifa(aliciat,2);
		aliciat.pagar(ctwitch.dineroRestante());
		twitch1.actualizarDinero(aliciat,aliciaapv,alician,alicias,aliciay);

		/*Spotify*/
		System.out.println("\n*"+spotify1.getNombreEmpresa());
		spotify1.registrarSub(alicias);
		cspotify.tarifa(alicias,2);
		alicias.pagar(cspotify.dineroRestante());
		spotify1.actualizarDinero(alicias,aliciaapv,aliciat,alician,aliciay);

		/*YouTube*/
		System.out.println("\n*"+youtube1.getNombreEmpresa());
		youtube1.registrarSub(aliciay);
		cyoutube.tarifa(aliciay,2);
		aliciay.pagar(cyoutube.dineroRestante());
		youtube1.actualizarDinero(aliciay,aliciaapv,aliciat,alicias,alician);

		System.out.println("\nEstado de suscripciones:");
		netflix1.setEstadoDeCuenta(alician,"Netflix:");
		amazonpv1.setEstadoDeCuenta(aliciaapv,"Amazon Prime Video:");
		twitch1.setEstadoDeCuenta(aliciat,"Twitch: ");
		spotify1.setEstadoDeCuenta(alicias,"Spotify:");
		youtube1.setEstadoDeCuenta(aliciay,"YouTube:");
		netflix1.notificar();
		amazonpv1.notificar();
		twitch1.notificar();
		spotify1.notificar();
		youtube1.notificar();
		System.out.println("\n");


		bobn.datosDeUsuario();
		System.out.println("Lista de servicios de Bob:");

		/*Spotify*/
		System.out.println("\n*"+spotify2.getNombreEmpresa());
		cspotify.tarifa(bobs,2);
		spotify2.eliminarSub(bobs);

		System.out.println("\nEstado de suscripciones:\nSin suscripciones.");
		System.out.println("\n");


		cesarn.datosDeUsuario();
		System.out.println("Lista de servicios de Cesar:");

		/*Spotify*/
		System.out.println("\n*"+spotify3.getNombreEmpresa());
		spotify3.registrarSub(cesars);
		cspotify.tarifa(cesars,2);
		cesars.pagar(cspotify.dineroRestante());
		spotify3.actualizarDinero(cesars,cesarapv,cesart,cesarn,cesary);

		/*YouTube*/
		System.out.println("\n*"+youtube3.getNombreEmpresa());
		youtube3.registrarSub(cesary);
		cyoutube.tarifaNormal();

		System.out.println("\nEstado de suscripciones:");
		spotify3.setEstadoDeCuenta(cesars,"Spotify:");
		youtube3.setEstadoDeCuenta(cesary,"YouTube:");
		spotify3.notificar();
		youtube3.notificar();
		System.out.println("\n");


		diegon.datosDeUsuario();
		System.out.println("Lista de servicios de Diego:");

		/*Netflix*/
		System.out.println("*"+netflix4.getNombreEmpresa());
		netflix4.registrarSub(diegon);
		cnetflix.tarifa(diegon,3);
		diegon.pagar(cnetflix.dineroRestante());
		amazonpv4.actualizarDinero(diegon,diegoapv,diegot,diegos,diegoy);

		/*AmazonPV*/
		System.out.println("\n*"+amazonpv4.getNombreEmpresa());
		amazonpv4.registrarSub(diegoapv);
		camazonpv.tarifa(diegoapv,2);
		diegoapv.pagar(camazonpv.dineroRestante());
		amazonpv4.actualizarDinero(diegoapv,diegon,diegot,diegos,diegoy);

		/*Twitch*/
		System.out.println("\n*"+twitch4.getNombreEmpresa());
		twitch4.registrarSub(diegot);
		ctwitch.tarifa(diegot,2);
		diegot.pagar(ctwitch.dineroRestante());
		twitch4.actualizarDinero(diegot,diegon,diegoapv,diegos,diegoy);

		/*Spotify*/
		System.out.println("\n*"+spotify4.getNombreEmpresa());
		spotify4.registrarSub(diegos);
		cspotify.tarifaNormal();

		System.out.println("\nEstado de suscripciones:");
		netflix4.setEstadoDeCuenta(diegoapv,"Netflix:");
		amazonpv4.setEstadoDeCuenta(diegoapv,"Amazon Prime Video:");
		twitch4.setEstadoDeCuenta(diegot,"Twitch:");
		spotify4.setEstadoDeCuenta(diegos,"Spotify:");
		netflix4.notificar();
		amazonpv4.notificar();
		twitch4.notificar();
		spotify4.notificar();
		System.out.println("\n");


		erikan.datosDeUsuario();
		System.out.println("Lista de servicios de Erika:");

		/*AmazonPV*/
		System.out.println("\n*"+amazonpv5.getNombreEmpresa());
		amazonpv5.registrarSub(erikaapv);
		camazonpv.tarifa(erikaapv,2);
		erikaapv.pagar(camazonpv.dineroRestante());
		amazonpv5.actualizarDinero(erikaapv,erikan,erikat,erikas,erikay);

		/*Twitch*/
		System.out.println("\n*"+twitch5.getNombreEmpresa());
		twitch5.registrarSub(erikat);
		ctwitch.tarifa(erikat,2);
		erikat.pagar(ctwitch.dineroRestante());
		twitch5.actualizarDinero(erikat,erikaapv,erikan,erikas,erikay);

		/*Spotify*/
		System.out.println("\n*"+spotify5.getNombreEmpresa());
		spotify5.registrarSub(erikas);
		cspotify.tarifa(erikas,2);
		erikas.pagar(cspotify.dineroRestante());
		spotify5.actualizarDinero(erikas,erikaapv,erikan,erikat,erikay);

		/*YouTube*/
		System.out.println("\n*"+youtube5.getNombreEmpresa());
		youtube5.registrarSub(erikay);
		cyoutube.tarifa(erikay,2);
		erikay.pagar(cyoutube.dineroRestante());
		youtube5.actualizarDinero(erikay,erikaapv,erikan,erikas,erikat);

		System.out.println("\nEstado de suscripciones:");
		netflix5.setEstadoDeCuenta(erikan,"Netflix:");		
		twitch5.setEstadoDeCuenta(erikat,"Twitch: ");
		spotify5.setEstadoDeCuenta(erikas,"Spotify:");
		youtube5.setEstadoDeCuenta(erikay,"YouTube:");
		netflix5.notificar();
		twitch5.notificar();
		spotify5.notificar();
		youtube5.notificar();
		
		System.out.println("\n <<<<<<<<<<<<<<<<<<<<<<<<<< Dia 5 >>>>>>>>>>>>>>>>>>>>>>>>>> \n");

		alician.datosDeUsuario();
		System.out.println("Lista de servicios de Alicia:");

		/*Netflix*/
		System.out.println("*"+netflix1.getNombreEmpresa());
		netflix1.registrarSub(alician);
		cnetflix.tarifa(alician,3);
		alician.pagar(cnetflix.dineroRestante());
		netflix1.actualizarDinero(alician,aliciaapv,aliciat,alicias,aliciay);

		/*AmazonPV*/
		System.out.println("\n*"+amazonpv1.getNombreEmpresa());
		amazonpv1.registrarSub(aliciaapv);
		camazonpv.tarifa(aliciaapv,2);
		aliciaapv.pagar(camazonpv.dineroRestante());
		amazonpv1.actualizarDinero(aliciaapv,alician,aliciat,alicias,aliciay);

		/*Twitch*/
		System.out.println("\n*"+twitch1.getNombreEmpresa());
		twitch1.registrarSub(aliciat);
		ctwitch.tarifa(aliciat,2);
		aliciat.pagar(ctwitch.dineroRestante());
		twitch1.actualizarDinero(aliciat,aliciaapv,alician,alicias,aliciay);

		/*Spotify*/
		System.out.println("\n*"+spotify1.getNombreEmpresa());
		spotify1.registrarSub(alicias);
		cspotify.tarifa(alicias,2);
		alicias.pagar(cspotify.dineroRestante());
		spotify1.actualizarDinero(alicias,aliciaapv,aliciat,alician,aliciay);

		/*YouTube*/
		System.out.println("\n*"+youtube1.getNombreEmpresa());
		youtube1.registrarSub(aliciay);
		cyoutube.tarifa(aliciay,2);
		aliciay.pagar(cyoutube.dineroRestante());
		youtube1.actualizarDinero(aliciay,aliciaapv,aliciat,alicias,alician);

		System.out.println("\nEstado de suscripciones:");
		netflix1.setEstadoDeCuenta(alician,"Netflix:");
		amazonpv1.setEstadoDeCuenta(aliciaapv,"Amazon Prime Video:");
		twitch1.setEstadoDeCuenta(aliciat,"Twitch: ");
		spotify1.setEstadoDeCuenta(alicias,"Spotify:");
		youtube1.setEstadoDeCuenta(aliciay,"YouTube:");
		netflix1.notificar();
		amazonpv1.notificar();
		twitch1.notificar();
		spotify1.notificar();
		youtube1.notificar();
		System.out.println("\n");


		cesarn.datosDeUsuario();
		System.out.println("Lista de servicios de Cesar:");

		/*Spotify*/
		System.out.println("\n*"+spotify3.getNombreEmpresa());
		spotify3.registrarSub(cesars);
		cspotify.tarifa(cesars,2);
		cesars.pagar(cspotify.dineroRestante());
		spotify3.actualizarDinero(cesars,cesarapv,cesart,cesarn,cesary);

		/*YouTube*/
		System.out.println("\n*"+youtube3.getNombreEmpresa());
		youtube3.registrarSub(cesary);
		cyoutube.tarifaNormal();

		System.out.println("\nEstado de suscripciones:");
		spotify3.setEstadoDeCuenta(cesars,"Spotify:");
		youtube3.setEstadoDeCuenta(cesary,"YouTube:");
		spotify3.notificar();
		youtube3.notificar();
		System.out.println("\n");


		diegon.datosDeUsuario();
		System.out.println("Lista de servicios de Diego:");

		/*Netflix*/
		System.out.println("*"+netflix4.getNombreEmpresa());
		netflix4.registrarSub(diegon);
		cnetflix.tarifa(diegon,3);
		diegon.pagar(cnetflix.dineroRestante());
		amazonpv4.actualizarDinero(diegon,diegoapv,diegot,diegos,diegoy);

		/*AmazonPV*/
		System.out.println("\n*"+amazonpv4.getNombreEmpresa());
		amazonpv4.registrarSub(diegoapv);
		camazonpv.tarifa(diegoapv,2);
		diegoapv.pagar(camazonpv.dineroRestante());
		amazonpv4.actualizarDinero(diegoapv,diegon,diegot,diegos,diegoy);

		/*Twitch*/
		System.out.println("\n*"+twitch4.getNombreEmpresa());
		twitch4.registrarSub(diegot);
		ctwitch.tarifa(diegot,2);
		diegot.pagar(ctwitch.dineroRestante());
		twitch4.actualizarDinero(diegot,diegon,diegoapv,diegos,diegoy);

		/*Spotify*/
		System.out.println("\n*"+spotify4.getNombreEmpresa());
		spotify4.registrarSub(diegos);
		cspotify.tarifaNormal();

		System.out.println("\nEstado de suscripciones:");
		netflix4.setEstadoDeCuenta(diegoapv,"Netflix:");
		amazonpv4.setEstadoDeCuenta(diegoapv,"Amazon Prime Video:");
		twitch4.setEstadoDeCuenta(diegot,"Twitch:");
		spotify4.setEstadoDeCuenta(diegos,"Spotify:");
		netflix4.notificar();
		amazonpv4.notificar();
		twitch4.notificar();
		spotify4.notificar();
		System.out.println("\n");


		erikan.datosDeUsuario();
		System.out.println("Lista de servicios de Erika:");

		/*AmazonPV*/
		System.out.println("\n*"+amazonpv5.getNombreEmpresa());
		amazonpv5.registrarSub(erikaapv);
		camazonpv.tarifa(erikaapv,2);
		erikaapv.pagar(camazonpv.dineroRestante());
		amazonpv5.actualizarDinero(erikaapv,erikan,erikat,erikas,erikay);

		/*Twitch*/
		System.out.println("\n*"+twitch5.getNombreEmpresa());
		twitch5.registrarSub(erikat);
		ctwitch.tarifa(erikat,2);
		erikat.pagar(ctwitch.dineroRestante());
		twitch5.actualizarDinero(erikat,erikaapv,erikan,erikas,erikay);

		/*Spotify*/
		System.out.println("\n*"+spotify5.getNombreEmpresa());
		spotify5.registrarSub(erikas);
		cspotify.tarifa(erikas,2);
		erikas.pagar(cspotify.dineroRestante());
		spotify5.actualizarDinero(erikas,erikaapv,erikan,erikat,erikay);

		/*YouTube*/
		System.out.println("\n*"+youtube5.getNombreEmpresa());
		youtube5.registrarSub(erikay);
		cyoutube.tarifa(erikay,2);
		erikay.pagar(cyoutube.dineroRestante());
		youtube5.actualizarDinero(erikay,erikaapv,erikan,erikas,erikat);

		System.out.println("\nEstado de suscripciones:");
		amazonpv5.setEstadoDeCuenta(erikan,"Netflix:");		
		twitch5.setEstadoDeCuenta(erikat,"Twitch: ");
		spotify5.setEstadoDeCuenta(erikas,"Spotify:");
		youtube5.setEstadoDeCuenta(erikay,"YouTube:");
		amazonpv5.notificar();
		twitch5.notificar();
		spotify5.notificar();
		youtube5.notificar();

		System.out.println("\n <<<<<<<<<<<<<<<<<<<<<<<<<< Fin de la simulacion >>>>>>>>>>>>>>>>>>>>>>>>>> \n");
	}
}
		/*
		Alicia
		dia 2 459
		dia 3 418
		dia 4 377
		dia 5 336

		Bob
		dia 2 40
		dia youtube elimina a bob

		Cesar
		dia 2 36
		dia 3 32
		dia 4 28
		dia 5 24

		Diego
		dia 2 154
		dia 3 138
		dia 4 107
		dia 5 76

		Erika
		dia 2 269
		dia 3 243
		dia 4 217
		dia 5 191
		*/