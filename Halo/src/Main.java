public class Main {
    public static void main(String[] args) {

        //Creación de instancia
        Spartan MasterChief = new Spartan();

        //Uso de atributos
        MasterChief.nombre = "John";
        MasterChief.salud = 100;
        MasterChief.escudo = 50;
        MasterChief.armaPrincipal = "Rifle de asalto";

        //Invocacion de métodos
        MasterChief.mostrarInfo();
        MasterChief.atacar("Grunt");
        MasterChief.recargarArma(60);
        MasterChief.correr(true);

        //Creacion de instancia 2
        Spartan Spartan2 = new Spartan();

        Spartan2.nombre = "Eli";
        Spartan2.salud = 75;
        Spartan2.escudo = 150;
        Spartan2.armaPrincipal = "Rifle de rafaga";

        Spartan2.mostrarInfo();
        Spartan2.atacar("Brute");
        Spartan2.recargarArma(30);
        Spartan2.correr(false);
    }
}