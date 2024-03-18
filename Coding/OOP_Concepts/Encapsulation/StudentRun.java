package Encapsulation;

public class StudentRun {
    public static void main(String args[]){
        Student s = new Student();
        s.setName("Allison");
        s.setAge(24);
        System.out.println("Name: " + s.getName() + ", Age: " + s.getAge());
    }
}