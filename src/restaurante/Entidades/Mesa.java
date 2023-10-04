
package restaurante.Entidades;

public class Mesa {
    private int idMesa;
    private Reserva reserva;
    private Pedido pedido;
    private int capacidad;
    private boolean estado;

    public Mesa(int idMesa, Reserva reserva, Pedido pedido, int capacidad, boolean estado) {
        this.idMesa = idMesa;
        this.reserva = reserva;
        this.pedido = pedido;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public Mesa(Reserva reserva, Pedido pedido, int capacidad, boolean estado) {
        this.reserva = reserva;
        this.pedido = pedido;
        this.capacidad = capacidad;
        this.estado = estado;
    }
   
    public Mesa(){
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    
    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
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

    @Override
    public String toString() {
        return "Mesa{" + "idMesa=" + idMesa + ", reserva=" + reserva + ", pedido=" + pedido + ", capacidad=" + capacidad + ", estado=" + estado + '}';
    }
 
}
