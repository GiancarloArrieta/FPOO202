import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        boolean menu = true;
        int opcion;

        cuentasBancarias cuenta1 = new cuentasBancarias("1234567890", "", 0, 0);
        cuenta1.solicitarNombreTitular();
        cuenta1.solicitarEdadTitular();
        cuenta1.solicitarSaldoInicial();

        do{
            String decision = JOptionPane.showInputDialog(null, "Eliga una opcion a realizar con su cuenta:" +
                    "\n1. Consultar informacion de cuenta" +
                    "\n2. Deposito propio" +
                    "\n3. Deposito a tercero" +
                    "\n4. Retirar efectivo" +
                    "\n5. Salir del programa", "Menu principal", JOptionPane.PLAIN_MESSAGE);
            opcion = Integer.parseInt(decision);
            switch(opcion) {
                case(1):{
                    cuenta1.consultarInfo();
                    break;
                }
                case(2):{
                    cuenta1.depositoPropio();
                    break;
                }
                case(3):{
                    cuenta1.depositoOtraCuenta();
                    break;
                }
                case(4):{
                    cuenta1.retirarEfectivo();
                    break;
                }
                case(5):{
                    menu = false;
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null, "El numero ingresado no es valido, por favor intente de nuevo.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }while(menu);
    }
}