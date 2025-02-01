import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int saldo = 0;
        String operacion = null;
        boolean continuar = true;
        System.out.println("Ingrese una operacion:\nD: Depositar (D n)\nR: Retirar (R n)\nNo ingrese nada para salir del programa");
        while(true){
            operacion = scan.nextLine();
            if(operacion.isEmpty()){
                break;
            }
            if(operacion.toLowerCase().charAt(0) == 'd'){
                    saldo += Integer.parseInt(operacion.substring(2));
                }
            if(operacion.toLowerCase().charAt(0) == 'r'){
                saldo -= Integer.parseInt(operacion.substring(2));
            }
        }
        System.out.println("Su saldo final es de: $" + saldo);
    }
}
