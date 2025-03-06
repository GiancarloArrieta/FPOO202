import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        String[] opciones = {"Registrar empleado", "Listar empleados", "Salir"};
        String[] registroEmpleado = {"Conductor", "Administrativo"};
        boolean menu = true;
        int decisionMenu = 0;
        int decisionEmpleado = 0;
        do{
            decisionMenu = JOptionPane.showOptionDialog(null, "Eliga una de las siguientes opciones:", "Menú de empleados", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, 0);
            if(decisionMenu ==0){
                decisionEmpleado = JOptionPane.showOptionDialog(null, "Eliga el tipo de empleado a registrar:", "Registro de empleado", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, registroEmpleado, 0);
                if(decisionEmpleado == 0){
                    empleados.add(new Conductor(JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado: ", "Registro de empleado", JOptionPane.QUESTION_MESSAGE),
                            Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del empleado:", "Registro de empleado", JOptionPane.QUESTION_MESSAGE)),
                            Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado:", "Registro de empleado", JOptionPane.QUESTION_MESSAGE)),
                            JOptionPane.showInputDialog(null, "Ingrese el número de licencia del empleado:", "Registro de empleado", JOptionPane.QUESTION_MESSAGE)));
                    JOptionPane.showConfirmDialog(null, "Registro de empleado exitoso.", "Registro de empleado", JOptionPane.DEFAULT_OPTION);
                }
                if(decisionEmpleado == 1){
                    empleados.add(new Administrativo(JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado: ", "Registro de empleado", JOptionPane.QUESTION_MESSAGE),
                            Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del empleado:", "Registro de empleado", JOptionPane.QUESTION_MESSAGE)),
                            Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado:", "Registro de empleado", JOptionPane.QUESTION_MESSAGE)),
                            JOptionPane.showInputDialog(null, "Ingrese el departamento que administra el empleado:", "Registro de empleado", JOptionPane.QUESTION_MESSAGE)));
                    JOptionPane.showConfirmDialog(null, "Registro de empleado exitoso.", "Registro de empleado", JOptionPane.DEFAULT_OPTION);
                }
            }
            if(decisionMenu == 1){
                if(!empleados.isEmpty()) {
                    for (int i = 0; i <= empleados.size() - 1; i++) {
                        empleados.get(i).mostrarInfo();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Consultas fallidas.\nAún no se ha registrado a ningún empleado.", "Información de empleado", JOptionPane.ERROR_MESSAGE);
                }
            }
            if(decisionMenu == 2){
                menu = false;
            }
        }while(menu);
    }
}