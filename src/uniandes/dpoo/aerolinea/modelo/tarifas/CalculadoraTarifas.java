package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Ruta;

public abstract class CalculadoraTarifas {
    protected static final double IMPUESTO = 0.28;

    public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
        int costoBase = calcularCostosBase(vuelo, cliente);
        double descuento = calcularPorcentajeDescuento(cliente);
        int costoConDescuento = (int) (costoBase * (1 - descuento));
        int impuesto = calcularValorImpuesto(costoConDescuento);
        return costoConDescuento + impuesto;
    }

    protected abstract int calcularCostosBase(Vuelo vuelo, Cliente cliente);
    protected abstract double calcularPorcentajeDescuento(Cliente cliente);

    protected int calcularDistanciaDesdeRuta(Ruta ruta) {
        return ruta.getDuracion(); 
    }

    protected int calcularValorImpuesto(int costoBase) {
        return (int) (costoBase * IMPUESTO);
    }
}