import javax.swing.*;

public class Conductores {

    private String nombre, identificador, licencia;

    public Conductores(String nombre, String identificador, String licencia) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.licencia = licencia;
    }

    public void solicitarInfo(){
        setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del conductor:", "Registro de conductor", JOptionPane.QUESTION_MESSAGE));
        setIdentificador(JOptionPane.showInputDialog(null, "Ingrese el identificador del conductor:", "Registro de conductor", JOptionPane.QUESTION_MESSAGE));
        setLicencia(JOptionPane.showInputDialog(null, "Ingrese el numero de licencia del conductor:", "Registro de conductor", JOptionPane.QUESTION_MESSAGE));
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }
    private void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getLicencia() {
        return licencia;
    }
    private void setLicencia(String licencia) {
        this.licencia = licencia;
    }

}
