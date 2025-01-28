import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int horas;
        float salario;
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        horas = scan.nextInt();
        System.out.println("Ingrese su salario por hora: ");
        salario = scan.nextFloat();
        System.out.println("A usted le corresponde un pago de $" + horas*salario);
    }
}