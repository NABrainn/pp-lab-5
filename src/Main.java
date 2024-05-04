import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {

        try {
            Person person = new Person("Mike", 240);
        } catch (InvalidAgeException e) {
            throw new InvalidAgeException();
        }

        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Sample message");
    }
}