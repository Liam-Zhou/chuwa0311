// Encapsulation
class BankAccount {
    private float balance;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float amount) {
        balance = amount;
    }
}

// Polymorphism
class Vehicle {
    public String run();

    public float speed();
}

class Car extends Vehicle {

    @Override
    public String run() {
        return "Run by engine.";
    }

    //overload
    public float speed(float distance, float time) {
        return distance / time;
    }
}

// Inheritance
class Animal {
    protected String name;

    public void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
}