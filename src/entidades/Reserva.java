/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;

/**
 *
 * @author Hogar
 */
public class Reserva {
    
    
    private int idReserva ;
    private Mesa mesa;
    private String nombreCliente;
    private int dniCliente;
    private LocalDate fechaHora;
    private boolean estado;

    public Reserva() {
    }

    public Reserva(Mesa mesa, String nombreCliente, int dniCliente, LocalDate fechaHora, boolean estado) {
        this.mesa = mesa;
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaHora = fechaHora;
        this.estado = estado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Reserva(int idReserva, Mesa mesa, String nombreCliente, int dniCliente, LocalDate fechaHora, boolean estado) {
        this.idReserva = idReserva;
        this.mesa = mesa;
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaHora = fechaHora;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", mesa=" + mesa + ", nombreCliente=" + nombreCliente + ", dniCliente=" + dniCliente + ", fechaHora=" + fechaHora + ", estado=" + estado + '}';
    }

}
