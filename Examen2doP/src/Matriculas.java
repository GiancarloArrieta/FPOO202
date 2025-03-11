import javax.swing.JOptionPane;
import java.util.Random;

public class Matriculas {
    private String nombre, aP, aM, carrera;
    private int anioNacimiento, anioActual = 2025;
    private String digitos = "1234567890";

    Random random = new Random();

    public Matriculas(String nombre, String aP, String aM, String carrera, int anio) {
        this.nombre = nombre;
        this.aP = aP;
        this.aM = aM;
        this.carrera = carrera;
        this.anioNacimiento = anio;
    }

    public void generarMatricula(){
        JOptionPane.showMessageDialog(null, "Matrícula generada:\n"
                + String.valueOf(anioActual).substring(2,4)
                + String.valueOf(anioNacimiento).substring(2,4)
                + nombre.substring(0,1).toUpperCase()
                + aP.substring(0,1).toUpperCase()
                + aM.substring(0,1).toUpperCase()
                + digitos.charAt(random.nextInt(digitos.length()))
                + digitos.charAt(random.nextInt(digitos.length()))
                + digitos.charAt(random.nextInt(digitos.length()))
                + carrera.substring(0,3).toUpperCase(), "Generador de matrículas", JOptionPane.PLAIN_MESSAGE);
    }
}
