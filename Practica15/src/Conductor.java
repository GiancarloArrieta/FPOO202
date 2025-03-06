import javax.swing.*;

public class Conductor extends Empleado{

    private String licencia;

    public Conductor(String nombre, int id, float salario, String licencia){
        super(nombre, id, salario);
        this.licencia = licencia;
    }

    @Override
    public void mostrarInfo(){
        String mensaje = "ID de empleado: " + id + "\nNombre de empleado: " + nombre + "\nSalario de empleado: $" + salario + "\nLicencia de coductor: " + licencia;
        JOptionPane.showMessageDialog(null, mensaje, "Información de empleado", JOptionPane.INFORMATION_MESSAGE);
    }

    public String getLicencia() {
        return licencia;
    }
}
