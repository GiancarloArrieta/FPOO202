import javax.swing.JOptionPane;

public class cuentasBancarias {

    String numCuenta, titular;
    int edadTitular;
    float saldo;

    public String solicitarNombreTitular(){
        titular = JOptionPane.showInputDialog(null,"Ingrese su nombre", "Solicitud de nombre", JOptionPane.QUESTION_MESSAGE);
        return titular;
    }
    public int solicitarEdadTitular() {
        String edad = JOptionPane.showInputDialog(null, "Ingrese su edad", "Solicitud de edad", JOptionPane.QUESTION_MESSAGE);
        return Integer.parseInt(edad);
    }
    public float solicitarSaldoInicial() {
        String monto = JOptionPane.showInputDialog(null, "Bienvenido, " + titular + "\nIngrese su saldo inicial.", "Saldo inicial", JOptionPane.PLAIN_MESSAGE);
        return Float.parseFloat(monto);
    }
    public void consultarInfo(){
        JOptionPane.showMessageDialog(null, "Titular: " + titular
                + "\nEdad: " + edadTitular
                + "\nNumero de cuenta: " + numCuenta
                + "\nSALDO: " + saldo, "Informacion de cuenta", JOptionPane.INFORMATION_MESSAGE);
    }
    public void depositoPropio(){
        String monto = JOptionPane.showInputDialog(null, "Ingrese el monto a depositar:", "Deposito", JOptionPane.PLAIN_MESSAGE);
        float importe = Float.parseFloat(monto);
        if(importe<=saldo && importe>0) {
            saldo += importe;
            JOptionPane.showMessageDialog(null, "Deposito exitoso\nSu nuevo saldo se vera reflejado en su cuenta en breve", "Deposito", JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Deposito fallido\nEl importe ingresado no es valido o es mayor al saldo de su cuenta.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void depositoOtraCuenta(){
       String monto = JOptionPane.showInputDialog(null, "Ingrese el monto a depositar:", "Deposito a tercero", JOptionPane.PLAIN_MESSAGE);
       float importe = Float.parseFloat(monto);
       if(importe<=saldo && importe>0) {
           saldo -= importe;
           numCuenta = JOptionPane.showInputDialog(null, "Ingrese el numero de la cuenta a la que va a depositar:", "Deposito a tercero", JOptionPane.PLAIN_MESSAGE);
           JOptionPane.showMessageDialog(null, "Deposito exitoso\nSe ha enviado la cantidad de $" + importe + " a la cuenta " + numCuenta + "\nSu nuevo saldo se vera reflejado en su cuenta en breve", "Deposito a tercero", JOptionPane.PLAIN_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(null, "Retiro fallido\nEl importe ingresado no es valido o es mayor al saldo de su cuenta.", "ERROR", JOptionPane.ERROR_MESSAGE);
       }
    }
    public void retirarEfectivo(){
        String monto = JOptionPane.showInputDialog(null, "Ingrese el monto a retirar:", "Retiro", JOptionPane.PLAIN_MESSAGE);
        float importe = Float.parseFloat(monto);
        if(importe<=saldo && importe>0) {
            saldo -= importe;
            JOptionPane.showMessageDialog(null, "Retiro exitoso\nSu nuevo saldo se vera reflejado en su cuenta en breve", "Retiro", JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Retiro fallido\nEl importe ingresado no es valido o es mayor al saldo de su cuenta.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
