public class Ruta {
    private Aeropuerto origen;
    private Aeropuerto destino;
    private String horaSalida;
    private String horaLlegada;
    private String codigoRuta;

    public Ruta(Aeropuerto origen, Aeropuerto destino, String horaSalida, String horaLlegada, String codigoRuta) {
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.codigoRuta = codigoRuta;
    }

    public String getCodigoRuta() {
        return codigoRuta;
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public int getDuracion() {
        int minutosSalida = getMinutos(horaSalida);
        int minutosLlegada = getMinutos(horaLlegada);
        return minutosLlegada - minutosSalida;
    }

    public static int getMinutos(String horaCompleta) {
        return Integer.parseInt(horaCompleta) % 100;
    }

    public static int getHoras(String horaCompleta) {
        return Integer.parseInt(horaCompleta) / 100;
    }
}