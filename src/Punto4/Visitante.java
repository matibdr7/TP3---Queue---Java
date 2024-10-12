//Implementar la clase Visitante (idVisitante, aynVisitante, edad). 

package Punto4;

public class Visitante {
    private int idVisitante;
    private String aynVisitante;
    private int Edad;

    public Visitante() {
    }

    public Visitante(int idVisitante, String aynVisitante, int edad) {
        this.idVisitante = idVisitante;
        this.aynVisitante = aynVisitante;
        Edad = edad;
    }

    public int getIdVisitante() {
        return idVisitante;
    }
    public void setIdVisitante(int idVisitante) {
        this.idVisitante = idVisitante;
    }
    public String getAynVisitante() {
        return aynVisitante;
    }
    public void setAynVisitante(String aynVisitante) {
        this.aynVisitante = aynVisitante;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }

    @Override
    public String toString() {
        return "Visitante [idVisitante=" + idVisitante + ", aynVisitante=" + aynVisitante + ", Edad=" + Edad + "]";
    }
}
