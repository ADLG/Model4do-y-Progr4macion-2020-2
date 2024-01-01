import java.util.List;
import java.util.ArrayList;

public class Empresa implements Servicio
{
	String nombre;
	List<Usuario> suscriptores = new ArrayList<Usuario>();
	List<String> estadoDeCuenta = new ArrayList<String>();
	int contador = 0, numero=0;

	public Empresa(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNombreEmpresa()
	{
		return nombre;
	}

	public List<String> getEstadoDeCuenta()
	{
		return estadoDeCuenta;
	}

	public void setEstadoDeCuenta(Usuario user, String estadoDeCuenta)
	{
		this.estadoDeCuenta.add(estadoDeCuenta);
	}

	public void actualizarDinero(Usuario dineroActual, Usuario user1, Usuario user2, Usuario user3, Usuario user4)
	{
		user1.pagar(dineroActual.getDinero());
		user2.pagar(dineroActual.getDinero());
		user3.pagar(dineroActual.getDinero());
		user4.pagar(dineroActual.getDinero());
	}

	public void registrarSub(Usuario user)
	{
		boolean contiene = suscriptores.contains(user.getUsuario());
		if (contiene == false)
		{
			if (contador == 0)
			{
				suscriptores.add(user);
			}
			contador++;
		}
	}

	public void eliminarSub(Usuario user)
	{
			suscriptores.remove(user);
			System.out.println("Lamentamos que dejes el Servicio "+user.getUsuario()+". :'(");
	}

	public void notificar()
	{
		for (Usuario u: suscriptores)
		{
			u.actualizar();
		}
	}
}
