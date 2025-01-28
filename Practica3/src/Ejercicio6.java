import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase, fraseInvertida = "";
        System.out.println("Ingrese una frase: ");
        frase = scan.nextLine();
        for(int i = frase.length()-1; i >= 0; i--){
            fraseInvertida += frase.charAt(i);
        }
        System.out.println("Frase invertida: " + fraseInvertida);
    }
}
