import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Vehiculos vehiculoBase = new Vehiculos(null, null, 0, null);
        Vehiculos vehiculo = null;
        Conductores conductorBase = new Conductores(null, null, null);
        Conductores conductor = null;
        Envios envio = null;
        Entregas entregaBase = new Entregas("", "");
        Entregas entrega = null;
        boolean menu = true;

        do{
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opción:\n" +
                    "1. Registro de vehículo\n" +
                    "2. Registro de conductor\n" +
                    "3. Asignar conductor a vehículo\n" +
                    "4. Registrar envío\n" +
                    "5. Registrar entrega\n" +
                    "6. Actualizar estado de entrega\n" +
                    "7. Mostrar información\n" +
                    "8. Salir", "Menú de automóviles", JOptionPane.PLAIN_MESSAGE));
            switch (opcion){
                case(1):{
                    vehiculoBase.solicitarInfo();
                    vehiculo = new Vehiculos(vehiculoBase.getPlaca(), vehiculoBase.getModelo(), vehiculoBase.getCapacidadCarga(), null);
                    break;
                }
                case(2):{
                    conductorBase.solicitarInfo();
                    conductor = new Conductores(conductorBase.getNombre(), conductorBase.getIdentificador(), conductorBase.getLicencia());
                    break;
                }
                case(3):
                {
                    if(vehiculo==null || conductor==null) {
                        JOptionPane.showMessageDialog(null, "Asignación no exitosa. Aún no se ha registrado un vehículo o un conductor.", "Asignación de conductor", JOptionPane.ERROR_MESSAGE);
                    }else{
                        vehiculo.asignarConductor(conductor);
                    }
                    break;
                }
                case(4):{
                    String[] botones = {"Si", "No"};
                    int peso = JOptionPane.showOptionDialog(null, "¿Se ingresará el peso del envío?", "Registro de envío", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
                    if(peso==1){
                        Envios envioBase = new Envios(null, null, null);
                        envioBase.crearEnvioPeso();
                        envio = new Envios(envioBase.getCodigoEnvio(), envioBase.getDestino(), envioBase.getPeso());
                    }else{
                        Envios envioBase = new Envios(null, null);
                        envioBase.crearEnvio();
                        envio = new Envios(envioBase.getCodigoEnvio(), envioBase.getDestino());
                    }
                    break;
                }
                case(5):{
                    entregaBase.solicitarInfo();
                    entrega = new Entregas(entregaBase.getNumeroGuia(), entregaBase.getEstado());
                    break;
                }
                case(6):{
                    if(entrega==null) {
                        JOptionPane.showMessageDialog(null, "Acción fallida. Aún no se ha registrado una entrega.", "Información del vehículo", JOptionPane.ERROR_MESSAGE);
                    }else{
                        entrega.actualizarEstado();
                    }
                    break;
                }
                case(7):{
                    if(vehiculo!=null){
                        if(conductor!=null && vehiculo.getConductor()!=null){
                            JOptionPane.showMessageDialog(null, "Modelo de vehículo: " + vehiculo.getModelo()
                                    + "\nPlaca del vehículo: " + vehiculo.getPlaca()
                                    + "\nCapacidad de carga del vehículo: " + vehiculo.getCapacidadCarga() + " Kg"
                                    + "\nConductor: " + vehiculo.getConductor().getNombre(), "Información de vehículo", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "Modelo de vehículo: " + vehiculo.getModelo()
                                    + "\nPlaca del vehículo: " + vehiculo.getPlaca()
                                    + "\nCapacidad de carga del vehículo: " + vehiculo.getCapacidadCarga() + " Kg"
                                    + "\nSin conductor asignado.",
                                    "Información de vehículo", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    if(envio!=null){
                        JOptionPane.showMessageDialog(null, "Código del envío: " + envio.getCodigoEnvio()
                                + "\nDestino del envío: " + envio.getDestino()
                                + "\nPeso del envío: " + envio.getPeso() + " Kg", "Información de envío", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if(entrega!=null){
                        JOptionPane.showMessageDialog(null, "Número de guía de la entrega: " + entrega.getNumeroGuia()
                                + "\nEstado de la entrega: " + entrega.getEstado(), "Información de entrega", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if(vehiculo==null && envio==null && entrega==null){
                        JOptionPane.showMessageDialog(null, "Acción fallida. No se ha hecho ningún registro.", "Panel de información", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                }
                case(8):{
                    menu = false;
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null, "Opción no existente. Por favor intente de nuevo.", "Menú de automóviles", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
        }while(menu);
    }
}