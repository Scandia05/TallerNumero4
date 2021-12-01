package Desastresnaturales;

public class Meteorologicos extends Desastres{
    private int personasAfectadas;
    private int impactoEconomico;
    private int númeroDesastres;



    public Meteorologicos(String nombre, String lugar, String fecha, int personasAfectadas, int impactoEconomico, int númeroDesastres) {
        super(nombre, lugar, fecha);
        this.personasAfectadas = personasAfectadas;
        this.impactoEconomico = impactoEconomico;
        this.númeroDesastres = númeroDesastres;
    }
    public void MostrarDatos(){
        System.out.println("Nombre : "+getNombre() +
                "/n" + "Fecha : "+getFecha() +
                "/n" + "Lugar : "+getLugar() +
                "/n" +"Personas Afectadas : "+personasAfectadas +
                "/n" +"Impacto Económico : "+impactoEconomico +
                "/n" + "Número de desastres : "+númeroDesastres );
    }
}
