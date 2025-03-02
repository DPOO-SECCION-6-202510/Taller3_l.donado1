package uniandes.dpoo.aerolinea.persistencia;

import uniandes.dpoo.aerolinea.modelo.Aerolinea;


public interface IPersistenciaAerolinea {
    void cargarAerolínea(String archivo, Aerolinea aerolinea);
    void salvarAerolínea(String archivo, Aerolinea aerolinea);
}
