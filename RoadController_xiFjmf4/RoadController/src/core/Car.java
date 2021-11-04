package core;

public class Car {
    public String number; // переменная number тип string, почему тип string не понял
    public int height;  // переменная height тип int,
    public double weight; // переменная weight тип double,
    public boolean hasVehicle;  // переменная hasVehicle тип boolean, true или false
    public boolean isSpecial;  // переменная isSpecial тип boolean, true или false

    public String toString() {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}