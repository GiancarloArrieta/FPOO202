import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entero entre 200 y 400: ");
        numero = scan.nextInt();
        if(numero>=200 && numero<=400){
            for(int i = numero; i<=400; i++){
                if(i%2 == 0){
                    if(i == 400){
                        System.out.print(i);
                    }else{
                        System.out.print(i + ", ");
                    }
                }
            }
        }else{
            System.out.println("ERROR: El numero ingresado no se encuentra entre 200 y 400");
        }
    }
}
