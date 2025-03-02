import javax.swing.*;

public class Envios {

    private String codigoEnvio, destino;
    private Float peso;

    public Envios(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = null;
    }

    public Envios(String codigoEnvio, String destino, Float peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    public void crearEnvioPeso(){
            setCodigoEnvio(JOptionPane.showInputDialog(null, "Ingrese el código del envío:", "Registro de envío", JOptionPane.QUESTION_MESSAGE)) ;
            setDestino(JOptionPane.showInputDialog(null, "Ingrese el destino del envío:", "Registro de envío", JOptionPane.QUESTION_MESSAGE));
    }

    public void crearEnvio(){
        setCodigoEnvio(JOptionPane.showInputDialog(null, "Ingrese el código del envío:", "Registro de envío", JOptionPane.QUESTION_MESSAGE)) ;
        setDestino(JOptionPane.showInputDialog(null, "Ingrese el destino del envío:", "Registro de envío", JOptionPane.QUESTION_MESSAGE));
        setPeso(Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el peso del envío en kilogramos:", "Registro de envío:", JOptionPane.QUESTION_MESSAGE)));
    }

    public String getCodigoEnvio() {
        return codigoEnvio;
    }
    public void setCodigoEnvio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Float getPeso() {
        return peso;
    }
    public void setPeso(Float peso) {
        this.peso = peso;
    }

}
