import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad: ");
        edad = scan.nextInt();
        if(edad<0){
            System.out.println("ERROR: Edad no valida.");
        }
        if(edad>0 && edad <4){
            System.out.println("Su entrada es gratis.");
        }
        if(edad>=4 && edad<=18){
            System.out.println("Se cobraran $110 por su entrada.");
        }
        if(edad>18){
            System.out.println("Se cobraran $190 por su entrada.");
        }
    }
}
