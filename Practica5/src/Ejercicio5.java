import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase;
        char caracter;
        int contador = 0;
        System.out.println("Ingrese una palabra o frase: ");
        frase = scan.nextLine();
        System.out.println("Ingrese una letra o caracter: ");
        caracter = scan.next().charAt(0);
        for(int i = 0; i<=frase.length()-1; i++){
            if(frase.toLowerCase().charAt(i) == Character.toLowerCase(caracter)){
                contador++;
            }
        }
        System.out.println("La frase ingresada contiene el caracter '" + caracter + "' " + contador + " veces");
    }
}
