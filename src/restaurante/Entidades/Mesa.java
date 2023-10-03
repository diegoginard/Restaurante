/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.Entidades;

/**
 *
 * @author Hogar
 */
public class Mesa {
    private int idMesa;
    private Reserva reserva;
    private Pedido pedido;
    private boolean estado;

    
    
    public Mesa(int idMesa, Reserva reserva, Pedido pedido, boolean estado) {
        this.idMesa = idMesa;
        this.reserva = reserva;
        this.pedido = pedido;
        this.estado = estado;
    }

    public Mesa(Reserva reserva, Pedido pedido, boolean estado) {
        this.reserva = reserva;
        this.pedido = pedido;
        this.estado = estado;
    }

     public Mesa(){}

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
 
 
 
    
}
