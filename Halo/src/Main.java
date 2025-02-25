public class Main {
    public static void main(String[] args) {

        //Creación de instancia
        Spartan MasterChief = new Spartan("John", "Rifle de asalto", 100, 50);

        //Invocacion de métodos
        MasterChief.mostrarInfo();
        MasterChief.atacar("Grunt");
        MasterChief.recargarArma(60);
        MasterChief.correr(true);

        //Uso de get y set para cambiar el atributo Nombre
        MasterChief.setNombre("Giancarlo");
        MasterChief.mostrarInfo();
        System.out.println(MasterChief.getNombre());

        //Creacion de instancia 2
        Spartan Spartan2 = new Spartan("Eli", "Rifle de rafaga", 75, 150);

        Spartan2.mostrarInfo();
        Spartan2.atacar("Brute");
        Spartan2.recargarArma(30);
        Spartan2.correr(false);

        //Intento de uso de método privado
        //Spartan2.consultarCortana();
    }
}