import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero del 1 al 10:");
        numero = scan.nextInt();
        if(numero>0 && numero<=10){
            System.out.println("Tabla de multiplicar del numero " + numero +":");
            for(int i = 1; i<=10; i++){
                System.out.println(numero + " * " + i + " = " + (numero*i));
            }
        }else{
            System.out.println("ERROR: El numero ingresado no se encuentra entre 1 y 10");
        }
    }
}
