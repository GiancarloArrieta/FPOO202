import javax.swing.*;
import java.util.*;

public class Contrasena {

    Random random = new Random();

    private int longitud = 8;
    private boolean permitirMayusculas;
    private boolean permitirCaracteresEspeciales;
    private int contadorFortaleza = 0;
    private String contrasena = "";

    public Contrasena(int longitud, boolean permitirMayusculas, boolean permitirCaracteresEspeciales, int contadorFortaleza, String contrasena) {
        this.longitud = longitud;
        this.permitirMayusculas = permitirMayusculas;
        this.permitirCaracteresEspeciales = permitirCaracteresEspeciales;
        this.contadorFortaleza = contadorFortaleza;
        this.contrasena = contrasena;
    }

    char[][] arregloCaracteres = new char[4][];

    private void insercionesArreglo(){
        char[] numeros = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
        char[] letrasMinusculas = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        char[] letrasMayusculas = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'C', 'W', 'X', 'Y', 'Z' };
        char[] caracteresEspeciales = { '!', '@', '#', '$', '^', '&', '(', ')', '_', '=', '+', '-', '*', '/', '%', '<', '>', '?', '[', ']', '{', '}' };
        arregloCaracteres[0] = numeros;
        arregloCaracteres[1] = letrasMinusculas;
        arregloCaracteres[2] = letrasMayusculas;
        arregloCaracteres[3] = caracteresEspeciales;
    }

    public void solicitarLongitud(){
        String decision1 = JOptionPane.showInputDialog(null, "Ingrese la longitud de su contrasena. Si el campo queda vacio, la longitud por defecto sera de 8 caracteres.", "GENERADOR DE CONTRASENAS", JOptionPane.QUESTION_MESSAGE);
        if(decision1.isEmpty()){
            return;
        }else{
            setLongitud(Integer.parseInt(decision1));
        }
    }
    public void solicitarMayusculas(){
        String botones[] = {"Si", "No"};
        int decision2 = JOptionPane.showOptionDialog(null, "¿Permitir el uso de mayusculas?", "GENERADOR DE CONTRASENAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if(decision2==0){
            setPermitirMayusculas(true);
        }else{
            setPermitirMayusculas(false);
        }
    }
    public void solicitarCaracteresEspeciales(){
        String botones[] = {"Si", "No"};
        int decision3 = JOptionPane.showOptionDialog(null, "¿Permitir el uso de caracteres especiales?", "GENERADOR DE CONTRASENAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if(decision3==0){
            setPermitirCaracteresEspeciales(true);
        }else{
            setPermitirCaracteresEspeciales(false);
        }
    }

    public void generarContrasena(){
        int arreglo = 0;
        int caracter = 0;
        insercionesArreglo();

        if(permitirMayusculas && permitirCaracteresEspeciales){
            for(int i = 0; i<=longitud; i++){
                do{
                    arreglo = random.nextInt(arregloCaracteres.length);
                }while(arreglo<0 || arreglo>4);
                caracter = random.nextInt(arregloCaracteres[arreglo].length);
                setContrasena(contrasena+arregloCaracteres[arreglo][caracter]);
            }
        }

        if(permitirMayusculas && !permitirCaracteresEspeciales){
            for(int i = 0; i<=longitud; i++){
                do{
                    arreglo = random.nextInt(arregloCaracteres.length);
                }while(arreglo<0 || arreglo>2);
                caracter = random.nextInt(arregloCaracteres[arreglo].length);
                setContrasena(contrasena+arregloCaracteres[arreglo][caracter]);
            }
        }

        if(!permitirMayusculas && permitirCaracteresEspeciales){
            for(int i = 0; i<=longitud; i++){
                do{
                    arreglo = random.nextInt(arregloCaracteres.length);
                }while(arreglo<0 || arreglo>4 || arreglo==2);
                caracter = random.nextInt(arregloCaracteres[arreglo].length);
                setContrasena(contrasena+arregloCaracteres[arreglo][caracter]);
            }
        }
        if(!permitirMayusculas && !permitirCaracteresEspeciales){
            for(int i = 0; i<=longitud; i++){
                do{
                    arreglo = random.nextInt(arregloCaracteres.length);
                }while(arreglo<0 || arreglo>1);
                caracter = random.nextInt(arregloCaracteres[arreglo].length);
                setContrasena(contrasena+arregloCaracteres[arreglo][caracter]);
            }
        }
    }

    public void imprimirContrasena(){
        JOptionPane.showMessageDialog(null, "Contrasena generada:\n" + getContrasena(), "GENERADOR DE CONTRASENAS", JOptionPane.INFORMATION_MESSAGE);
        if(longitud>=15){
            setContadorFortaleza(contadorFortaleza+1);
        }
        if(permitirMayusculas){
            setContadorFortaleza(contadorFortaleza+1);
        }
        if(permitirCaracteresEspeciales){
            setContadorFortaleza(contadorFortaleza+1);
        }
        switch(contadorFortaleza){
            case(0):{
                JOptionPane.showMessageDialog(null, "Su contrasena tiene una fortaleza de:\n0 de 3 (Muy debil).", "GENERADOR DE CONTRASENAS", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case(1):{
                JOptionPane.showMessageDialog(null, "Su contrasena tiene una fortaleza de:\n1 de 3 (Debil).", "GENERADOR DE CONTRASENAS", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case(2):{
                JOptionPane.showMessageDialog(null, "Su contrasena tiene una fortaleza de:\n2 de 3 (Intermedia).", "GENERADOR DE CONTRASENAS", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case(3):{
                JOptionPane.showMessageDialog(null, "Su contrasena tiene una fortaleza de:\n3 de 3 (Fuerte).", "GENERADOR DE CONTRASENAS", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }

    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isPermitirMayusculas() {
        return permitirMayusculas;
    }

    public void setPermitirMayusculas(boolean permitirMayusculas) {
        this.permitirMayusculas = permitirMayusculas;
    }

    public boolean isPermitirCaracteresEspeciales() {
        return permitirCaracteresEspeciales;
    }

    public void setPermitirCaracteresEspeciales(boolean permitirCaracteresEspeciales) {
        this.permitirCaracteresEspeciales = permitirCaracteresEspeciales;
    }

    public int getContadorFortaleza() {
        return contadorFortaleza;
    }

    public void setContadorFortaleza(int contadorFortaleza) {
        this.contadorFortaleza = contadorFortaleza;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
