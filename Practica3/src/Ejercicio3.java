import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int total = 0;
        System.out.println("Ingrese un numero entero positivo: ");
        numero = scan.nextInt();
        if(numero>0){
            for(int i=0; i<=numero; i++){
                total += i;
            }
            System.out.println("Suma de todos los enteros de 1 a " + numero + ": " + total);
        }else{
            System.out.println("ERROR: El numero ingresado no es positivo.");
        }
    }
}
