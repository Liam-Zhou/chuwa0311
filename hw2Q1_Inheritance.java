public class hw2Q1_Inheritance {
    // Parent class (superclass)
    static class Animal {
        // Properties
        String name;
        int age;

        // Constructor
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method
        public void sleep() {
            System.out.println(name + " is sleeping.");
        }
    }

    // Child class (subclass)
    static class Dog extends Animal {
        // Additional property
        String breed;

        // Constructor
        public Dog(String name, int age, String breed) {
            // Call superclass constructor
            super(name, age);
            this.breed = breed;
        }

        // Method overriding
        @Override
        public void sleep() {
            // Call superclass method
            super.sleep();
            System.out.println("It's a " + breed + " dog.");
        }

        // Additional method
        public void bark() {
            System.out.println(name + " is barking.");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the subclass
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");

        // Access properties and methods inherited from superclass
        System.out.println("Name: " + myDog.name);
        System.out.println("Age: " + myDog.age);
        myDog.sleep(); // Method from superclass

        // Access properties and methods specific to the subclass
        System.out.println("Breed: " + myDog.breed);
        myDog.bark(); // Method from subclass
    }
}
