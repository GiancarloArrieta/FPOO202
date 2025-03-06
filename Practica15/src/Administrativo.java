import javax.swing.*;

public class Administrativo extends Empleado{

    private String departamento;

    public Administrativo(String nombre, int id, float salario, String departamento){
        super(nombre, id, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInfo(){
        String mensaje = "ID de empleado: " + id + "\nNombre de empleado: " + nombre + "\nSalario de empleado: $" + salario + "\nDepartamento del administrativo: " + departamento;
        JOptionPane.showMessageDialog(null, mensaje, "Información de empleado", JOptionPane.INFORMATION_MESSAGE);
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
