//Implementar la clase cliente con los atributos (codCliente, aynCliente, mailCliente).

package Punto1;

public class Cliente {
    private int codCliente;
    private String aynCliente;
    private String mailCliente;
    
    public Cliente(int codCliente, String aynCliente, String mailCliente) {
        this.codCliente = codCliente;
        this.aynCliente = aynCliente;
        this.mailCliente = mailCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getAynCliente() {
        return aynCliente;
    }

    public void setAynCliente(String aynCliente) {
        this.aynCliente = aynCliente;
    }

    public String getMailCliente() {
        return mailCliente;
    }

    public void setMailCliente(String mailCliente) {
        this.mailCliente = mailCliente;
    }

    @Override
    public String toString() {
        return "Cliente [codCliente=" + codCliente + ", aynCliente=" + aynCliente + ", mailCliente=" + mailCliente
                + "]";
    }

}
