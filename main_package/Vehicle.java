package main_package;

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor");
    }
}

class Car extends Vehicle {
    Car() {
        super();
        System.out.println("Car constructor");
    }
}


