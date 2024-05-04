import company.beans.Person;
import company.exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {
        try {
            Person person = new Person("Mike", 24);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            throw new InvalidAgeException();
        }
    }
}