import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int payasos;
        int munecas;
        System.out.println("Ingresa la cantidad de payasos en el paquete: ");
        payasos = scan.nextInt();
        System.out.println("Ingresa la cantidad de munecas en el paquete: ");
        munecas = scan.nextInt();
        int pesoPayasos = payasos * 112;
        int pesoMunecas = munecas * 75;
        System.out.println("Peso de payasos: " + pesoPayasos + " g");
        System.out.println("Peso de munecas: " + pesoMunecas + " g");
        System.out.println("Peso total: " + (pesoPayasos+pesoMunecas) + " g");
    }
}