import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Contrasena contrasena1 = new Contrasena(8, false, false, 0, "");
        contrasena1.solicitarLongitud();
        contrasena1.solicitarMayusculas();
        contrasena1.solicitarCaracteresEspeciales();

        contrasena1.generarContrasena();
        contrasena1.imprimirContrasena();
    }
}