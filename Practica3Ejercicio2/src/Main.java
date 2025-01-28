import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String apellidoP, apellidoM, nombre;
        System.out.println("Ingrese su primer o unico nombre: ");
        nombre = scan.nextLine();
        System.out.println("Ingrese su apellido paterno: ");
        apellidoP = scan.nextLine();
        System.out.println("Ingrese su apellido materno: ");
        apellidoM = scan.nextLine();
        String nombreCompleto = nombre + apellidoP + apellidoM;
        System.out.println(nombreCompleto.toLowerCase());
        System.out.println(nombreCompleto.toUpperCase());
        System.out.println(nombre.substring(0,1).toUpperCase() + apellidoP.substring(0,1).toUpperCase() + apellidoM.substring(0,1).toUpperCase());

    }
}