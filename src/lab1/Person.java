/*
Author(s): Laith Oudah & Klas Nordquist
Assignment: Lab 1
*/

package lab1;

public class Person {

    private final int age;
    private final String firstName, secondName;
    private Building address;
    private static boolean theFormat;
    public static final boolean WITHAGE = true, NOAGE = false;

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public void setAdress(Building streetName) {
        address = streetName;
    }

    public Building getAdress() {
        return address;
    }

    public boolean isPerson(String firstName, String secondName, int age) {
        return this.firstName.equals(firstName) && this.secondName.equals(secondName) && age == this.age;
    }

    public static void changeFormat(boolean FormatPerson) {
        theFormat = FormatPerson;
    }

    public String toString() {
        if (theFormat == WITHAGE) {
            return  firstName + "\t" + secondName + "\t" + "age: " + age;
        } else {
           return  firstName + "\t" + secondName + "\t";
        }
    }
}
