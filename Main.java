package org.example;

public class Main {

    public static void main(String[] args) {

        Huesped Carlos = new Huesped("Carlos", 1);
        Huesped Laura = new Huesped("Laura", 2);

        Habitacion h101 = new Habitacion(101, "individual", "disponible");
        Habitacion h102 = new Habitacion(102, "doble", "disponible");
        Habitacion h103 = new Habitacion(103, "suite", "mantenimiento");

        Carlos.consultarHabitacion(h101);
        Laura.consultarHabitacion(h102);
        Laura.consultarHabitacion(h103);

        Reserva r1 = new Reserva(1, "08/09/2026", "10/09/2026", Carlos, h101);
        Reserva r2 = new Reserva(2, "09/09/2026", "12/09/2026", Laura, h102);

        System.out.println("Reserva " + r1.getNumero() + " realizada por " + r1.getHuesped().getNombre());
        System.out.println("Habitacion: " + r1.getHabitacion().getNumero());

        System.out.println("Reserva " + r2.getNumero() + " realizada por " + r2.getHuesped().getNombre());
        System.out.println("Habitacion: " + r2.getHabitacion().getNumero());
    }
}