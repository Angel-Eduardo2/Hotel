package org.example;

public class Reserva {

    private int numero;
    private String fechaEntrada;
    private String fechaSalida;
    private Huesped huesped;
    private Habitacion habitacion;

    public Reserva(int numero, String fechaEntrada, String fechaSalida, Huesped huesped, Habitacion habitacion) {
        this.numero = numero;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.huesped = huesped;
        this.habitacion = habitacion;
    }

    public int getNumero() {
        return numero;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }
}