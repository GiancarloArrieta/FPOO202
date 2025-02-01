import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, contador;
        System.out.println("Ingrese la altura del triangulo: ");
        numero = scan.nextInt();
        if(numero>1){
            for(int i = 1; i<=numero; i++) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                System.out.print("\n");
            }
        }else{
            System.out.println("ERROR: La altura no es suficiente para formar un triangulo");
        }
    }
}
