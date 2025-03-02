import javax.swing.*;

public class Vehiculos {

    private String placa, modelo;
    private float capacidadCarga;
    private Conductores conductor;

    public Vehiculos(String placa, String modelo, float capacidadCarga, Conductores conductor) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
        this.conductor = conductor;
    }

    public void solicitarInfo(){
        setPlaca(JOptionPane.showInputDialog(null, "Ingrese la placa del vehículo:", "Registro de vehículo", JOptionPane.QUESTION_MESSAGE));
        setModelo(JOptionPane.showInputDialog(null, "Ingrese el modelo del vehículo:", "Registro de vehículo", JOptionPane.QUESTION_MESSAGE));
        setCapacidadCarga(Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la capacidad de carga del vehículo en kilogramos:", "Registro de vehículo", JOptionPane.QUESTION_MESSAGE)));
    }

    public void asignarConductor(Conductores conductor){
        setConductor(conductor);
        JOptionPane.showMessageDialog(null, "Conductor asignado a vehículo exitosamente.", "Asignación de conductor", JOptionPane.PLAIN_MESSAGE);
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Conductores getConductor() {
        return conductor;
    }
    private void setConductor(Conductores conductor) {
        this.conductor = conductor;
    }
}
