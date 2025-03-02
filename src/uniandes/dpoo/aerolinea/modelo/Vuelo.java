package uniandes.dpoo.aerolinea.modelo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;

public class Vuelo {
    private Ruta ruta;
    private String fecha;
    private Avion avion;
    private Map<String, Tiquete> tiquetes;

    public Vuelo(Ruta ruta, String fecha, Avion avion) {
        this.ruta = ruta;
        this.fecha = fecha;
        this.avion = avion;
        this.tiquetes = new HashMap<>();
    }

    public Ruta getRuta() {
        return ruta;
    }

    public String getFecha() {
        return fecha;
    }

    public Avion getAvion() {
        return avion;
    }

    public Map<String, Tiquete> getTiquetes() {
        return tiquetes;
    }

    public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
        int precioTotal = calculadora.calcularTarifa(this, cantidad);
        for (int i = 0; i < cantidad; i++) {
            String codigoTiquete = "TQ" + (tiquetes.size() + 1);
            tiquetes.put(codigoTiquete, new Tiquete(cliente, this));
        }
        return precioTotal;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vuelo vuelo = (Vuelo) obj;
        return Objects.equals(ruta, vuelo.ruta) &&
               Objects.equals(fecha, vuelo.fecha) &&
               Objects.equals(avion, vuelo.avion);
    }
}
