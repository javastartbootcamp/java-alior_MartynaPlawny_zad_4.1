package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room("pokój dzienny", 21, true);
        Room room2 = new Room("kuchnia", 15, true);
        Room room3 = new Room(100, "pokój mały", 23.63, true, 19);
        Room room4 = new Room("pokój duży", 35.9, false);

        System.out.println(room1.getName() + " - Temperatura: " + room1.getTemperature());
        System.out.println(room2.getName() + " - Temperatura: " + room2.getTemperature());
        System.out.println(room3.getName() + " - Temperatura: " + room3.getTemperature());
        System.out.println(room4.getName() + " - Temperatura: " + room4.getTemperature());
        System.out.println();

        System.out.println(room1.getName() + ": Czy udało się zredukować temperaturę? " + room1.reduceTemperature());
        System.out.println("Temperatura " + room1.getName() + ": " + room1.getTemperature());
        System.out.println();
        System.out.println(room2.getName() + ": Czy udało się zredukować temperaturę? " + room2.reduceTemperature());
        System.out.println("Temperatura " + room2.getName() + ": " + room2.getTemperature());
        System.out.println();
        System.out.println(room3.getName() + ": Czy udało się zredukować temperaturę? " + room3.reduceTemperature());
        System.out.println("Temperatura " + room3.getName() + ": " + room3.getTemperature());
        System.out.println(room3.getName() + ": Czy udało się zredukować temperaturę? " + room3.reduceTemperature());
        System.out.println("Temperatura " + room3.getName() + ": " + room3.getTemperature());
        System.out.println(room3.getName() + ": Czy udało się zredukować temperaturę? " + room3.reduceTemperature());
        System.out.println("Temperatura " + room3.getName() + ": " + room3.getTemperature());
        System.out.println(room3.getName() + ": Czy udało się zredukować temperaturę? " + room3.reduceTemperature());
        System.out.println("Temperatura " + room3.getName() + ": " + room3.getTemperature());
        System.out.println(room3.getName() + ": Czy udało się zredukować temperaturę? " + room3.reduceTemperature());
        System.out.println("Temperatura " + room3.getName() + ": " + room3.getTemperature());
        System.out.println(room3.getName() + ": Czy udało się zredukować temperaturę? " + room3.reduceTemperature());
        System.out.println("Temperatura " + room3.getName() + ": " + room3.getTemperature());
        System.out.println();
        System.out.println(room4.getName() + ": Czy udało się zredukować temperaturę? " + room4.reduceTemperature());
        System.out.println("Temperatura " + room4.getName() + ": " + room4.getTemperature());
    }
}
