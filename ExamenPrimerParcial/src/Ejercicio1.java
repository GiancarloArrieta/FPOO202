import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //EJERCICIO 1: Programa con funciones y un menú que nos permita convertir temperaturas a decisión del usuario:
        Scanner scan = new Scanner(System.in);
        float temperatura = 0;
        int decision;
        boolean menu = true;
        System.out.println("Bienvenido");
        do{
            System.out.println("Eliga una de las siguientes opciones: ");
            System.out.println("1. Cambiar de grados Centigrados a Fahrenheit\n2. Cambiar de grados Fahrenheit a Centigrados\n3. Cambiar de grados Centigrados a Kelvin\n4. Salir del programa");
            decision = scan.nextInt();
            switch(decision){
                case(1):{
                    System.out.print("Ingrese la temperatura en Centigrados: ");
                    temperatura = scan.nextFloat();
                    System.out.println(temperatura + "° C en Fahrenheit son: " + ((temperatura*9/5)+32) + "°");
                    break;
                }
                case(2):{
                    System.out.print("Ingrese la temperatura en Fahrenheit: ");
                    temperatura = scan.nextFloat();
                    System.out.println(temperatura + "° F en grados centigrados son: " + ((temperatura-32)*(5.00/9.00)) + "°");
                    break;
                }
                case(3):{
                    System.out.println("Ingrese la temperatura en Celsius: ");
                    temperatura = scan.nextFloat();
                    System.out.println(temperatura + "° C en Kelvin son: " + (temperatura+273.15) + "°");
                    break;
                }
                case(4):{
                    menu = false;
                    break;
                }
                default:{
                    System.out.println("Eliga una opcion correcta.");
                    break;
                }
            }
        }while(menu);

    }
}