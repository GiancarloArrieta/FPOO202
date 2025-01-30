import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float numero1, numero2;
        char operacion;
        System.out.println("Ingrese un numero: ");
        numero1 = scan.nextInt();
        System.out.println("Ingrese un segundo numero: ");
        numero2 = scan.nextInt();
        System.out.println("Seleccione un operador:\n+ = Suma\n- = Resta\n* = Multiplicacion\n/ = Division");
        operacion = scan.next().charAt(0);
        switch(operacion){
            case('+'):{
                System.out.println(numero1 + " + " + numero2 + " = " + (numero1+numero2));
                break;
            }
            case('-'):{
                System.out.println(numero1 + " - " + numero2 + " = " + (numero1-numero2));
                break;
            }
            case('*'):{
                System.out.println(numero1 + " * " + numero2 + " = " + (numero1*numero2));
                break;
            }
            case('/'):{
                System.out.println(numero1 + " / " + numero2 + " = " + (numero1/numero2));
                break;
            }
            default:{
                System.out.println("ERROR: Operador no valido.");
                break;
            }
        }
    }
}
