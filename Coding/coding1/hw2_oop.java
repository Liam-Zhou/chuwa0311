// Encapsulation
class Animal {
  private String name;

  public Animal(String name) {
      this.name = name;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getDetails() {
      return "Animal: " + name;
  }
}

// Inheritance
class Dog extends Animal {
  private String breed;

  public Dog(String name, String breed) {
      super(name); // Call the parent class constructor
      this.breed = breed;
  }

  public String getBreed() {
      return breed;
  }

  // Overridden method to demonstrate dynamic polymorphism
  @Override
  public String getDetails() {
      return "Dog: " + getName() + ", Breed: " + breed;
  }

  // Method overloading to demonstrate static polymorphism (compile-time)
  public String getDetails(String ownerName) {
      return getDetails() + ", Owner: " + ownerName;
  }
}

// Main class
public class hw2_oop {
  public static void main(String[] args) {
      // Dynamic polymorphism in action
      Animal myAnimal = new Dog("Buddy", "Golden Retriever");
      System.out.println(myAnimal.getDetails()); // Calls the overridden method in Dog

      // Static polymorphism in action
      Dog myDog = new Dog("Rex", "German Shepherd");
      System.out.println(myDog.getDetails("John")); // Calls the overloaded method in Dog
  }
}