package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas {
    private static final int COSTO_POR_KM = 1000;

    @Override
    protected int calcularCostosBase(Vuelo vuelo, Cliente cliente) {
        int distancia = calcularDistanciaDesdeRuta(vuelo.getRuta());
        return distancia * COSTO_POR_KM;
    }

    @Override
    protected double calcularPorcentajeDescuento(Cliente cliente) {
        return 0; 
    }
}
