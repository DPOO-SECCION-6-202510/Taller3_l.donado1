 package uniandes.dpoo.aerolinea.tiquetes;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
 

public class Tiquete {
	
	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo;
	private Cliente clienteComprador;

	public Tiquete(String codigo,Vuelo vuelo, Cliente clienteComprador, int tarifa ) {
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.clienteComprador = clienteComprador;
		this.vuelo = vuelo;
		this.usado = false;
	}
	
	public Cliente getCliente() {
		return clienteComprador;
	}
	
	public Vuelo getVuelo() {
		return vuelo;
	}
	public String getCodigo() {
		return codigo;
	}
	
	public int getTarifa() {
		return tarifa;
		
	}
	public void marcarComoUsado() {
		this.usado = true; 
	}
	
	public boolean esUsado () {
		
		return usado;
	}
}
	
	
	

