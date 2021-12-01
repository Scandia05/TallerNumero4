package Desastresnaturales;

public class Geofisicos extends Desastres{
    private int personasAfectadas;
    private int impactoEconomico;
    private int númeroDesastres;



    public Geofisicos(String nombre, String lugar, String fecha, int personasAfectadas, int impactoEconomico, int númeroDesastres) {
        super(nombre, lugar, fecha);
        this.personasAfectadas = personasAfectadas;
        this.impactoEconomico = impactoEconomico;
        this.númeroDesastres = númeroDesastres;
    }
    public void MostrarDatos(){
        System.out.println("Nombre : "+getNombre() +
                "\n" + "Fecha : "+getFecha() +
                "\n" + "Lugar : "+getLugar() +
                "\n" +"Personas Afectadas : "+personasAfectadas +
                "\n" +"Impacto Económico : "+impactoEconomico + "miles"+
                "\n" + "Número de desastres : "+númeroDesastres );
    }
}

