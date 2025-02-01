import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base;
        System.out.println("Ingrese un número impar la base del árbol:");
        base = scan.nextInt();
        if(base%2 != 0){
            int i = 0, altura = (base/2)+1;
            while (i < altura) {
                int j = 0;
                while (j < (altura - i - 1)) {
                    System.out.print(" ");
                    j++;
                }
                int k = 0;
                while (k < (2 * i + 1)) {
                    System.out.print("*");
                    k++;
                }
                System.out.println();
                i++;
            }
        }else{
            System.out.println("ERROR: El número ingresado no es impar");
        }
    }
}
