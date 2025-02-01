import java.util.Scanner;

public class Ejercicio7
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base;
        System.out.println("Ingrese un número impar la base del árbol:");
        base = scan.nextInt();
        if(base%2 != 0){
            int altura = (base/2)+1;
            for(int i=0; i<altura; i++){
                for(int j = 0; j<(altura-i - 1); j++){
                    System.out.print(" ");
                }
                for(int k=0; k<(2*i + 1); k++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }else{
            System.out.println("ERROR: El número ingresado no es impar");
        }
    }
}
