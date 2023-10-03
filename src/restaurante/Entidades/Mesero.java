/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.Entidades;

/**
 *
 * @author Hogar
 */
public class Mesero {
    
    
    private int idMesero;
    private String nombre;
    private Pedido pedido;
    private boolean estado;

    public Mesero(int idMesero, String nombre, String apellido, Pedido pedido, boolean estado) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.pedido = pedido;
        this.estado = estado;
    }

    public Mesero(String nombre, String apellido, Pedido pedido, boolean estado) {
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
