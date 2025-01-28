import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String apellidoP, apellidoM, nombre;
        System.out.println("Ingrese su primer o unico nombre: ");
        nombre = scan.nextLine();
        System.out.println("Ingrese su apellido paterno: ");
        apellidoP = scan.nextLine();
        System.out.println("Ingrese su apellido materno: ");
        apellidoM = scan.nextLine();
        int total = nombre.length()+apellidoP.length()+apellidoM.length();
        System.out.println("Nombre completo en mayusculas: " + nombre.toUpperCase() + " " + apellidoP.toUpperCase() + " " +  apellidoM.toUpperCase());
        System.out.println("Su nombre completo completo consta de " + total + " letras.");
    }
}
