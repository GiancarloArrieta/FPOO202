//1. Estructura de código
//Zona de importaciones
import java.util.Scanner;

//Clase principal
public class Main {

    //Método principal
    public static void main(String[] args) {
        /*System.out.println("Hello, Giancarlo Arrieta!");*/

        //2. Cadenas

            /*String cadena = "Giancarlo" + "Arrieta" + "Zatarain";
            System.out.println(cadena);

            //.length: Imprime la cantidad de caracteres en una cadena
            System.out.println(cadena.length());

            //.substring(n,n): Extrae el rango de caracteres en una cadena
            System.out.println(cadena.substring(2,5));
            System.out.println(cadena.substring(2));
            System.out.println(cadena.substring(0,5));*/


        //3. Variables
            /*String cadena = "333", cadena2, cadena3;
            int entero = 3, entero2, entero3;
            double decimal = 3.333, decimal2, decimal3;

            //Convertir cadena a int
            entero2 = Integer.parseInt(cadena);
            System.out.println(entero2);

            //Convertir double a int
            entero3 = (int)decimal;
            System.out.println(entero3);

            //Convertir double a cadena
            cadena2 = String.valueOf(decimal);
            System.out.println(cadena2);

            //Convertir int a double
            decimal2 = Double.valueOf(entero);
            System.out.println(decimal2);

            //Conversión implícita
            int i = 12;
            double numd= i;
            System.out.println(numd);
            //*Solo funciona entre datos numéricos
             */


        //4. Solicitud de información
            /*Scanner scn = new Scanner(System.in);
            System.out.println("Escribe una cadena de texto: ");
            String cadena = scn.nextLine();
            System.out.println("Escribe un numero entero: ");
            int entero = scn.nextInt();
            System.out.println("Escribe un numero decimal: ");
            double decimal = scn.nextDouble();

            System.out.println("Numero decial guardado: " + decimal);
            System.out.println("Numero entero guardado: " + entero);
            System.out.println("Cadena de texto guardada: " + cadena);*/

        //5. Booleanos, operadores lógicos y de comparación

            //Operadores de comparación
            /*System.out.println(10>9);
            System.out.println(10==9);
            System.out.println(10<9);
            System.out.println(10>=9);
            System.out.println(10<=9);
            System.out.println(10!=9);*/

            //Operadores lógicos
            int x = 3;
            System.out.println(x<5 && x>10);
            System.out.println(x<5 || x>10);
            System.out.println(!(x<5 && x>10));
            System.out.println(!(x<5 || x>10));
    }
}