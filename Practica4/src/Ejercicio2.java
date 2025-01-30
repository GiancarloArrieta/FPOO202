import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero: ");
        numero = scan.nextInt();
        if((numero%2) == 0){
            System.out.println("El numero ingresado es par.");
        }else{
            System.out.println("El numero ingresado es impar.");
        }
    }
}
