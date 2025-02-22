/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.Duration;

public class Cajero {

    private double montoCliente;

    private double montototal;

    private int Tiempototal;
    private int tiempoCliente;

    public Cajero() {
    }

    
    public void sumarTiempoTotal(){
        Tiempototal+=getTiempoCliente();
    }
     public void sumarMontoTotal(){
        montototal+=getMontoCliente();
    }
    /**
     * Get the value of montototal
     *
     * @return the value of montototal
     */
    public double getMontototal() {
        return montototal;
    }

    /**
     * Set the value of montototal
     *
     * @param montototal new value of montototal
     */
    public void setMontototal(double montototal) {
        this.montototal = montototal;
    }

   

    public double getMontoCliente() {
        return montoCliente;
    }

    public void setMontoCliente(double montoCliente) {
        this.montoCliente = montoCliente;
    }

    public int getTiempototal() {
        return Tiempototal;
    }

    public void setTiempototal(int Tiempototal) {
        this.Tiempototal = Tiempototal;
    }

    public int getTiempoCliente() {
        return tiempoCliente;
    }

    public void setTiempoCliente(int tiempoCliente) {
        this.tiempoCliente = tiempoCliente;
    }

    @Override
    public String toString() {
        return "Cajero{" + "montoCliente=" + montoCliente + ", montototal=" + montototal + ", Tiempototal=" + Tiempototal + ", tiempoCliente=" + tiempoCliente + '}';
    }

   


}
