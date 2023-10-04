
package restaurante.Entidades;

public class Mesero {  
    
    private int idMesero;
    private Reserva reserva;
    private String nombre;
    private Pedido pedido;
    private boolean estado;

    public Mesero(int idMesero, Reserva reserva, String nombre, Pedido pedido, boolean estado) {
        this.idMesero = idMesero;
        this.reserva = reserva;
        this.nombre = nombre;
        this.pedido = pedido;
        this.estado = estado;
    }

    public Mesero(Reserva reserva, String nombre, Pedido pedido, boolean estado) {
        this.reserva = reserva;
        this.nombre = nombre;
        this.pedido = pedido;
        this.estado = estado;
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
