public class SpartanIV extends Spartan{

    public SpartanIV(String nombre, int salud, String arma, int escudo){
        super(nombre, salud, arma, escudo);
    }

    public void usarPropulsores(){
        System.out.println(nombre + " usa propulsores para moverse rapidamente.");
    }
}
