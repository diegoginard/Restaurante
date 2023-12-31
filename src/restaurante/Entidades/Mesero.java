
package restaurante.Entidades;

public class Mesero {  
    
    private int idMesero;
    private Reserva reserva;
    private String nombre;
    private String apellido;
    private Pedido pedido;
    private boolean estado;

    public Mesero(int idMesero, Reserva reserva, String nombre, String apellido, Pedido pedido, boolean estado) {
        this.idMesero = idMesero;
        this.reserva = reserva;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pedido = pedido;
        this.estado = estado;
    }

    public Mesero(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;  
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public Mesero(){}

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
   
   public String ToString(){
       return "nombre: "+ nombre  ;
       
   }
}
