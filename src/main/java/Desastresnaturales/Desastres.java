package Desastresnaturales;

public class Desastres {
    protected String Nombre;
    protected String Lugar;
    protected String Fecha;

    public Desastres(String nombre, String lugar, String fecha) {
        Nombre = nombre;
        Lugar = lugar;
        Fecha = fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }
}



