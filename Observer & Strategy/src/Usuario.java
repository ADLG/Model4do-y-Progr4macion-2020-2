import java.util.List;
import java.util.ArrayList;

public class Usuario implements Observador
{
	private String nombre;
	private int dinero;
	private Empresa empresa;
	List<String> estadoDeServicios = new ArrayList<String>();

	public Usuario(String nombre, int dinero, Empresa empresa)
	{
		this.nombre = nombre;
		this.dinero = dinero;
		this.empresa = empresa;
		estadoDeServicios = empresa.getEstadoDeCuenta();
	}

	@Override
	public void actualizar()
	{
		estadoDeServicios = empresa.getEstadoDeCuenta();
		cuentaServicios();
	}

	public String getUsuario()
	{
		return nombre;
	}

	public int getDinero()
	{
		return dinero;
	}

	public void pagar(int dinero)
	{
		this.dinero = dinero;
	}

	public void cancelarSub()
	{
		empresa.eliminarSub(this);
	}

	public void datosDeUsuario()
	{
		System.out.println("Usuario: "+nombre+"\n"+"Dinero: $"+dinero+"\n");
	}

	public void cuentaServicios()
	{
		this.estadoDeServicios = empresa.getEstadoDeCuenta();
		if (estadoDeServicios.size() == 1)
			System.out.println("*"+estadoDeServicios.get(0)+" suscrito "+estadoDeServicios.size()+" vez");
		else if (estadoDeServicios.size() > 1)
			System.out.println("*"+estadoDeServicios.get(0)+" suscrito "+estadoDeServicios.size()+" veces seguidas");
	}
}