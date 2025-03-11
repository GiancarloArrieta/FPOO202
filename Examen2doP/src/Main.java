import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Matriculas matricula = new Matriculas(JOptionPane.showInputDialog(null, "Ingrese su primer o segundo nombre:", "Generador de matrículas", JOptionPane.QUESTION_MESSAGE),
                JOptionPane.showInputDialog(null, "Ingrese su apellido paterno:", "Generador de matrículas", JOptionPane.QUESTION_MESSAGE),
                JOptionPane.showInputDialog(null, "Ingrese su apellido materno:", "Generador de matrículas", JOptionPane.QUESTION_MESSAGE),
                JOptionPane.showInputDialog(null, "Ingrese la carrera universitaria que cursa:", "Generador de matrículas", JOptionPane.QUESTION_MESSAGE),
                Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su año de nacimiento:", "Generador de matrículas", JOptionPane.QUESTION_MESSAGE)));

        matricula.generarMatricula();
    }
}