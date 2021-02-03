/*
Author(s): Laith Oudah & Klas Nordquist
Assignment: Lab 1
*/

package lab1;

public class Person {

    private int age;
    private String firstName, secondName;
    private Building address;
    private static boolean theFormat;
    public static final boolean WITHAGE = true, NOAGE = false;

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public void setaddress(Building streetName) {
        this.address = streetName;
    }

    public Building getaddress() {
        return address;
    }

    public boolean isPerson(String firstName, String secondName, int age) {
        return this.firstName.equals(firstName) && this.secondName.equals(secondName) && age == this.age;
    }

    public static boolean changeFormat(boolean FormatPerson) {
        theFormat = FormatPerson;
        return FormatPerson;
    }

    public String toString() {
        String dummy;
        if (theFormat == WITHAGE) {
            dummy = firstName + "\t" + secondName + "\t" + "age: " + age;
        } else {
            dummy = firstName + "\t" + secondName + "\t";
        }
        return dummy;
    }
}
