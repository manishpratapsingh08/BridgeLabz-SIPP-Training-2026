class Vehicle {
    void fuelCost(int km) {
        System.out.println("Fuel Cost");
    }
}

class Car extends Vehicle {
    void fuelCost(int km) {
        System.out.println("Car Fuel Cost = " + (km * 8));
    }
}

class Bus extends Vehicle {
    void fuelCost(int km) {
        System.out.println("Bus Fuel Cost = " + (km * 15));
    }
}

class Bike extends Vehicle {
    void fuelCost(int km) {
        System.out.println("Bike Fuel Cost = " + (km * 3));
    }
}

class ElectricCar extends Vehicle {
    void fuelCost(int km) {
        System.out.println("Electric Car Charging Cost = " + (km * 2));
    }
}

    class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        int km = 20;

        for (Vehicle v : vehicles) {
            if (v instanceof Car)
                ((Car) v).fuelCost(km);
            else if (v instanceof Bus)
                ((Bus) v).fuelCost(km);
            else if (v instanceof Bike)
                ((Bike) v).fuelCost(km);
            else if (v instanceof ElectricCar)
                ((ElectricCar) v).fuelCost(km);
        }
    }
}