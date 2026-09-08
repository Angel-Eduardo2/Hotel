package org.example;

public class Huesped {

    private String nombre;
    private int id;

    public Huesped(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void consultarHabitacion(Habitacion habitacion) {
        if (habitacion.getEstado().equals("disponible")) {
            System.out.println("Habitacion " + habitacion.getNumero() + " disponible");
        }
    }
}