/**
 * File: Person.java
 * Description: Defines the Person class with attributes and methods for name, birthday, gender, and phone number.
 * Lessons Learned: I learned how to create a class with multiple constructors and use the LocalDate API.
 * Teacher's Name: Jeff Light
 *
 * @author     Lucas Perez Echeimberg
 * @since      05/14/2025
 */

package MageLightUniversity;

import java.time.LocalDate;

public class Person {
    private String name;
    private String gender;
    private String phone;
    private LocalDate dob;

    public Person(String name, String dob, String gender, String phone) {
        this.name = name;
        this.dob = LocalDate.parse(dob);
        this.gender = gender;
        this.phone = phone;
    }

    public Person(String name, LocalDate dob, String gender, String phone) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
    }

    public String getName() { return name; }
    public LocalDate getBirthday() { return dob; }
    public String getGender() { return gender; }
    public String getPhoneNumber() { return phone; }

    public void setName(String name) { this.name = name; }
    public void setDob(String dob) { this.dob = LocalDate.parse(dob); }
    public void setGender(String gender) { this.gender = gender; }
    public void setPhone(String phone) { this.phone = phone; }
}
