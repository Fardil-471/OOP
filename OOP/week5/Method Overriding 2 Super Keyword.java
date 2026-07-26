class Vehicle {
    String define_me() {
        return "a vehicle with pedals.";
    }
}

class Bicycle extends Vehicle {
}

class Motorcycle extends Bicycle {

    String define_me() {
        return "a cycle with an engine.";
    }

    void printHello() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());
        System.out.println("My ancestor is a cycle who is " + super.define_me());
    }
}

public class Solution {
    public static void main(String[] args) {
        Motorcycle M = new Motorcycle();
        M.printHello();
    }
}