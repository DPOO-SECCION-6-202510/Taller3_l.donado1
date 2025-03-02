package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.List;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import uniandes.dpoo.aerolinea.modelo.Vuelo;

public abstract class Cliente {
	protected String identificador;
	protected List<Tiquete> tiquetes;

	public Cliente(String identificador) {
		this.identificador = identificador;
		this.tiquetes = new ArrayList<>();
	}

	public String getIdentificador() {
		return identificador;
	}

	public void agregarTiquete(Tiquete tiquete) {
		if (tiquetes != null) {
			tiquetes.add(tiquete);

		} else {
			System.out.println(" El tiquete es nulo y no se puede agregar");
		}

	}

	public double calcularValorTotalTiquetes() {
	    double total = 0;
	    for (Tiquete tiquete : tiquetes) {
	        total += tiquete.getTarifa();
	    }
	    return total; // ✅ Mover el return fuera del for para que sume todos los tiquetes correctamente.
	}


	public void usarTiquetes() {

		for (Tiquete tiquete : tiquetes) {
			if (!tiquete.esUsado()) {
				System.out.println("Tiquete usado: " + tiquete);
				tiquete.marcarComoUsado();

			} else {
				System.out.println("El tiquete ya fue usado");
			}
		}

	}

	public abstract String getTipoCliente();

}
