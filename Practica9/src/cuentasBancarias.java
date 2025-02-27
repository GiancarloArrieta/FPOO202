import javax.swing.JOptionPane;

public class cuentasBancarias {

    private String numCuenta, titular;
    private int edadTitular;
    private float saldo;

    public cuentasBancarias(String numCuenta, String titular, int edadTitular, float saldo) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.edadTitular = edadTitular;
        this.saldo = saldo;
    }

    public void solicitarNombreTitular(){
        titular = JOptionPane.showInputDialog(null,"Ingrese su nombre", "Solicitud de nombre", JOptionPane.QUESTION_MESSAGE);
        setTitular(titular);
    }
    public void solicitarEdadTitular() {
        String edad = JOptionPane.showInputDialog(null, "Ingrese su edad", "Solicitud de edad", JOptionPane.QUESTION_MESSAGE);
        setEdadTitular(Integer.parseInt(edad));
    }
    public void solicitarSaldoInicial() {
        String monto = JOptionPane.showInputDialog(null, "Bienvenido, " + getTitular() + "\nIngrese su saldo inicial.", "Saldo inicial", JOptionPane.PLAIN_MESSAGE);
        setSaldo(Float.parseFloat(monto));
    }
    public void consultarInfo(){
        JOptionPane.showMessageDialog(null, "Titular: " + getTitular()
                + "\nEdad: " + getEdadTitular()
                + "\nNumero de cuenta: " + getNumCuenta()
                + "\nSALDO: " + getSaldo(), "Informacion de cuenta", JOptionPane.INFORMATION_MESSAGE);
    }
    public void depositoPropio(){
        String monto = JOptionPane.showInputDialog(null, "Ingrese el monto a depositar:", "Deposito", JOptionPane.PLAIN_MESSAGE);
        float importe = Float.parseFloat(monto);
        if(importe>0) {
            setSaldo(saldo+importe);
            JOptionPane.showMessageDialog(null, "Deposito exitoso\nSu nuevo saldo se vera reflejado en su cuenta en breve", "Deposito", JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Deposito fallido\nEl importe ingresado no es valido o es mayor al saldo de su cuenta.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void depositoOtraCuenta(){
       String monto = JOptionPane.showInputDialog(null, "Ingrese el monto a depositar:", "Deposito a tercero", JOptionPane.PLAIN_MESSAGE);
       float importe = Float.parseFloat(monto);
       if(importe<=saldo && importe>0) {
           setSaldo(saldo-importe);
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
            setSaldo(saldo-importe);
            JOptionPane.showMessageDialog(null, "Retiro exitoso\nSu nuevo saldo se vera reflejado en su cuenta en breve", "Retiro", JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Retiro fallido\nEl importe ingresado no es valido o es mayor al saldo de su cuenta.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getEdadTitular() {
        return edadTitular;
    }

    public void setEdadTitular(int edadTitular) {
        this.edadTitular = edadTitular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}
