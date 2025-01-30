import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String contrasena1, contrasena2;
        System.out.println("Ingrese una contrasena: ");
        contrasena1 = scan.nextLine();
        System.out.println("Confirme su contrasena: ");
        contrasena2 = scan.nextLine();
        if(contrasena1.toLowerCase().equals(contrasena2.toLowerCase())){
            System.out.println("Contrasena correcta.");
        }else{
            System.out.println("Contrasena incorrecta.");
        }
    }
}