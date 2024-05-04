import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {

        try {
            Person person = new Person("Mike", 24);
        } catch (InvalidAgeException e) {
            throw new InvalidAgeException();
        }

        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Sample message");

        int sum = MathUtils.add(2, 5);
        System.out.println("Result of adding: " + sum);
        emailMessenger.sendMessage("Result of adding: " + sum);

        Person[] people = new Person[5];


        final int b = 10;
        try {
            people[0] = new Person("Jame", 45);
            people[1] = new Person("Rich", 12);
            people[2] = new Person("Jack", 14);
            people[3] = new Person("Jimmy", 79);
            people[4] = new Person("Daniel", 65);
        }
        catch(InvalidAgeException e) {
            throw new InvalidAgeException();
        }

        for(Person person : people) {
            int value = MathUtils.add(person.getAge(), b);
            emailMessenger.sendMessage("The value: " + value);
        }
    }
}