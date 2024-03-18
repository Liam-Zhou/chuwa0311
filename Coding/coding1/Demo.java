public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Animal{" +
               "name='" + getName() + '\'' +
               ", age=" + getAge() +
               '}';
    }
    
}


public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age); 
        this.canFly = canFly;
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "Bird{" +
            "name='" + getName() + '\'' +
            ", age=" + getAge() +
            ", canFly=" + canFly +
            '}';
    }
}
