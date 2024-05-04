import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {

        try {
            Person person = new Person("Mike", 24);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            throw new InvalidAgeException();
        }

        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Sample message");

        int sum = MathUtils.add(2, 5);
        System.out.println("Result of adding: " + sum);
        emailMessenger.sendMessage("Result of adding: " + sum);
    }
}