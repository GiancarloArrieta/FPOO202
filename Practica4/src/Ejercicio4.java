import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cadena, cadenaInv = "";
        System.out.println("Ingrese una palabra o frase.");
        cadena = scan.nextLine();
        for(int i = cadena.length()-1; i>=0; i--){
            cadenaInv += cadena.charAt(i);
        }
        if(cadenaInv.replace(" ","").toLowerCase().equals(cadena.replace(" ","").toLowerCase())){
            System.out.println("La cadena es un palindromo.");
        }else{
            System.out.println("La cadena no es un palindromo.");
        }
    }
}
