/**
 * File: MagelightUniversity.java
 * Description: Main class that creates and displays a list of Person objects with their age, gender, and phone number.
 * Lessons Learned: How to use ArrayList, for loops, and LocalDate to manage and display objects.
 * Teacher's Name: Jeff Light
 *
 * @author     Lucas Perez Echeimberg
 * @since      05/14/2025
 */

package MageLightUniversity;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class MagelightUniversity {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Rachel", "1993-05-12", "F", "801-555-1212"));
        people.add(new Person("Jose", "2004-12-01", "M", "480-555-1212"));
        people.add(new Person("Prya", "2001-02-27", "F", "385-555-1212"));
        people.add(new Person("Bob", "1984-06-06", "M", "916-555-1212"));

        LocalDate today = LocalDate.now();

        System.out.println("The people at the Magelight University include:\n");
        System.out.printf("%-20s %-8s %-10s %-15s%n", "Name", "Age", "Gender", "Phone Number");
        System.out.println("----------------------------------------------------------");

        for (Person person : people) {
            int age = Period.between(person.getBirthday(), today).getYears();
            System.out.printf("%-20s %-8d %-10s %-15s%n",
                    person.getName(),
                    age,
                    person.getGender(),
                    person.getPhoneNumber());
        }
    }
}