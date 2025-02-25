public class Spartan {

    //Atributos
    private String nombre, armaPrincipal;
    private int salud, escudo;

    public Spartan(String nombre, String armaPrincipal, int salud, int escudo) {
        this.nombre = nombre;
        this.armaPrincipal = armaPrincipal;
        this.salud = salud;
        this.escudo = escudo;
    }

    //Métodos
    public void mostrarInfo(){
        System.out.println("Informacion del Spartan:");
        System.out.println("Nombre: " + nombre);
        System.out.println("% de salud: " + salud);
        System.out.println("% de escudo: " + escudo);
        System.out.println("Arma utilizada: " + armaPrincipal);
    }
    public void atacar(String enemigo){
        System.out.println(nombre + " ataca a " + enemigo + " con " + armaPrincipal);
    }
    public void recargarArma(int municiones){
        int restantes=10;
        int total = restantes+municiones;
        System.out.println(armaPrincipal + " ahora tiene disponible " + total + " balas");
    }
    public void correr(boolean status){
        if(status){
            System.out.println(nombre + " esta corriendo");
        }else{
            System.out.println(nombre + " se detuvo");
        }
    }

    private void consultarCortana(){
        System.out.println("Conversacion privada...");
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }
    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public int getSalud() {
        return salud;
    }
    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEscudo() {
        return escudo;
    }
    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }
}
