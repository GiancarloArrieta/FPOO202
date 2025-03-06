public class Main {
    public static void main(String[] args) {
        SpartanII jefeMaestro = new SpartanII("John", 90, "Rifle de asalto", 150);

        jefeMaestro.mostrarInfo();
        jefeMaestro.usarManejoAvanzado();
        jefeMaestro.atacar("Convenant");
        jefeMaestro.recibirDano(160);
        jefeMaestro.recargarEscudo();
        jefeMaestro.mostrarInfo();
        System.out.println("-----------------------------");
        SpartanIII spartanIII = new SpartanIII("Elin", 75, "Bazooka", 150);
        spartanIII.mostrarInfo();
        spartanIII.camuflajeActivo();
        spartanIII.atacar("Grunt");
        spartanIII.recibirDano(175);
        spartanIII.mostrarInfo();
        System.out.println("-----------------------------");
        SpartanIV spartanIV = new SpartanIV("Penny", 150, "Espada de luz", 0);
        spartanIV.mostrarInfo();
        spartanIV.usarPropulsores();
        spartanIV.recargarEscudo();
        spartanIV.recibirDano(175);
        spartanIV.atacar("Slime");
        spartanIV.mostrarInfo();
    }
}