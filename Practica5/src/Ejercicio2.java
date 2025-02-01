import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entero positivo: ");
        numero = scan.nextInt();
        if(numero>0){
            for(int i = numero; i>=0; i--){
                System.out.print(i + ", ");
            }
        }else{
            System.out.println("ERROR: El numero ingresado no es positivo");
        }
    }
}
