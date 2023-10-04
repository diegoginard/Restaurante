
package restaurante.Entidades;

import java.sql.Date;
import java.util.List;

public class Pedido {
    
    private int idPedido;
    private Mesa mesa;
    private Mesero mesero;
    private List <Producto> producto;
    private Date fechaHora;
    private boolean pagado;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public Pedido(int idPedido, Mesa mesa, Mesero mesero, List<Producto> producto, Date fechaHora, boolean pagado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.mesero = mesero;
        this.producto = producto;
        this.fechaHora = fechaHora;
        this.pagado = pagado;
    }

    public Pedido(Mesa mesa, Mesero mesero, List<Producto> producto, Date fechaHora, boolean pagado) {
        this.mesa = mesa;
        this.mesero = mesero;
        this.producto = producto;
        this.fechaHora = fechaHora;
        this.pagado = pagado;
    }

    public Pedido() {
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", mesa=" + mesa + ", mesero=" + mesero + ", producto=" + producto + ", fechaHora=" + fechaHora + ", pagado=" + pagado + '}';
    }

    
}
