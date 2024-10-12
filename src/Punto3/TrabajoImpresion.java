//En la cola se deben insertar objetos de tipo trabajoImpresion que poseen los atributos (codTrabajo, nomTrabajo, cantPagTrabajo).

package Punto3;

public class TrabajoImpresion {
    private int codTrabajo;
    private String nomTrabajo;
    private int cantPagTrabajo;

    public TrabajoImpresion() {
    }

    public TrabajoImpresion(int codTrabajo, String nomTrabajo, int cantPagTrabajo) {
        this.codTrabajo = codTrabajo;
        this.nomTrabajo = nomTrabajo;
        this.cantPagTrabajo = cantPagTrabajo;
    }

    public int getcodTrabajo() {
        return codTrabajo;
    }
    public void setcodTrabajo(int codTrabajo) {
        this.codTrabajo = codTrabajo;
    }
    public String getNomTrabajo() {
        return nomTrabajo;
    }
    public void setNomTrabajo(String nomTrabajo) {
        this.nomTrabajo = nomTrabajo;
    }
    public int getCantPagTrabajo() {
        return cantPagTrabajo;
    }
    public void setCantPagTrabajo(int cantPagTrabajo) {
        this.cantPagTrabajo = cantPagTrabajo;
    }

    @Override
    public String toString() {
        return "TrabajoImpresion [codTrabajo=" + codTrabajo + ", nomTrabajo=" + nomTrabajo + ", cantPagTrabajo="
                + cantPagTrabajo + "]";
    }

    

}
