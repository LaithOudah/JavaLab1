/*
Author(s): Laith Oudah & Klas Nordquist
Assignment: Lab 1
*/

package lab1;

import java.util.ArrayList; // import the ArrayList class

public class Building {

    private ArrayList<Person> residents = new ArrayList<>();
    private int number;
    private String streetName;
//    private AllBuildings theCity; // Never used, why is it here even?

    public Building(String function, int function2) {
        streetName = function;
        number = function2;
    }

    public boolean addPerson(Person thePerson) {
        for (Person resident : residents) {
            if (resident == thePerson)
                return false;
        }
        residents.add(thePerson);
        return true;
    }

    public void removePerson(Person function) {
        for (int i = 0; i < residents.size(); i++) {
            if (residents.get(i) == function) {
                residents.remove(i);
            }
        }
    }

    public int getNumber() {
        return number;
    }

    public String getStreet() {
        return streetName;
    }

    public int residents() {
        return residents.size();
    }

    public String toString() {
        return "Street name: " + streetName + " " + number + " , number of residents: " + residents();
    }
}