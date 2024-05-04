import company.beans.Person;
import company.exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {
        try {
            Person person = new Person("Mike", 24);
        } catch (InvalidAgeException e) {
            throw new InvalidAgeException();
        }
    }
}