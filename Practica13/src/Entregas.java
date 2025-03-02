import javax.swing.*;

public class Entregas {

    private String numeroGuia, estado="Pendiente";

    public Entregas(String numeroGuia, String estado) {
        this.numeroGuia = numeroGuia;
        this.estado = estado;
    }

    public void solicitarInfo(){
        setNumeroGuia(JOptionPane.showInputDialog(null, "Ingrese el número de guía de la entrega.", "Registro de entrega", JOptionPane.QUESTION_MESSAGE));
        String estado = JOptionPane.showInputDialog(null, "Ingrese el nuevo estado del pedido ('En tránsito'/'Entregado')\nAsegurese de escribirlo de forma idéntica a las opciones presentadas.\nSi el campo se queda vacío, el estado de la entrega será 'Pendiente'", "Actualización de entrega", JOptionPane.QUESTION_MESSAGE);
        if(estado.isEmpty()){
            setEstado("Pendiente");
            return;
        }
        boolean completado=true;
        do{
            if(estado.equals("En tránsito")||estado.equals("Entregado")){
                completado=false;
            }else{
                JOptionPane.showMessageDialog(null, "El texto ingresado no coincide con ninguna de las opciones presentadas.\nPor favor intente de nuevo.");
            }
        }while(completado);
    }

    public void actualizarEstado(){
        String nuevoEstado;
        boolean completado=true;
        do{
            nuevoEstado = JOptionPane.showInputDialog(null, "Ingrese el nuevo estado del pedido ('En tránsito'/'Entregado')\nAsegurese de escribirlo de forma idéntica a las opciones presentadas.", "Actualización de entrega", JOptionPane.QUESTION_MESSAGE);
            if(nuevoEstado.equals("En tránsito")||nuevoEstado.equals("Entregado")){
                setEstado(nuevoEstado);
                completado=false;
            }else{
                JOptionPane.showMessageDialog(null, "El texto ingresado no coincide con ninguna de las opciones presentadas.\nPor favor intente de nuevo.");
            }
        }while(completado);
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }
    private void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getEstado() {
        return estado;
    }
    private void setEstado(String estado) {
        this.estado = estado;
    }
}
