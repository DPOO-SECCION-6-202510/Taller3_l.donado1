package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente {

	public static final String NATURAL = "Natural";

	private String nombre;

	public ClienteNatural(String identificador, String nombre) {
	    super(identificador);
	    this.nombre = nombre;
	}

	public ClienteNatural(String nombre) {
	    super("ID por definir"); // 
	    this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}

	@Override
	public String getTipoCliente() {
		return NATURAL;
	}

}
