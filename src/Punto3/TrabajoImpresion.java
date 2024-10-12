//En la cola se deben insertar objetos de tipo trabajoImpresion que poseen los atributos (codTrabajo, nomTrabajo, cantPagTrabajo).

package Punto3;

public class TrabajoImpresion {
    private int codTrabajao;
    private String nomTrabajo;
    private int cantPagTrabajo;

    public TrabajoImpresion() {
    }

    public TrabajoImpresion(int codTrabajao, String nomTrabajo, int cantPagTrabajo) {
        this.codTrabajao = codTrabajao;
        this.nomTrabajo = nomTrabajo;
        this.cantPagTrabajo = cantPagTrabajo;
    }

    public int getCodTrabajao() {
        return codTrabajao;
    }
    public void setCodTrabajao(int codTrabajao) {
        this.codTrabajao = codTrabajao;
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
        return "TrabajoImpresion [codTrabajao=" + codTrabajao + ", nomTrabajo=" + nomTrabajo + ", cantPagTrabajo="
                + cantPagTrabajo + "]";
    }

    

}
