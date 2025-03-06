import javax.swing.*;

public class Empleado {
    protected String nombre;
    protected int id;
    protected double salario;

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public void mostrarInfo(){
        String mensaje = "ID de empleado: " + id + "\nNombre de empleado: " + nombre + "\nSalario de empleado: $" + salario;
        JOptionPane.showMessageDialog(null, mensaje, "Información de empleado", JOptionPane.INFORMATION_MESSAGE);
    }
}
