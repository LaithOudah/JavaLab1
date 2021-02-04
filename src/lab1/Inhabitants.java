/*
Author(s): Laith Oudah & Klas Nordquist
Assignment: Lab 1
*/

package lab1;

import java.util.ArrayList;

public class Inhabitants {

    private ArrayList<Person> thePeople;

    public Inhabitants() {
        thePeople = new ArrayList<>();
    }

    public Person addPerson(String firstName, String secondName, int age) {
        Person person = new Person(firstName, secondName, age);
        for (Person thePerson : thePeople) {
            if (thePerson.isPerson(firstName, secondName, age)) {
                System.out.println("Person Already Exists");
                return null;
            }
        }
        thePeople.add(person);
        System.out.println("Person Added");
        return person;
    }

    public Person searchPerson(String firstName, String secondName, int age) {
        for (Person thePerson : thePeople) {
            if (thePerson.isPerson(firstName, secondName, age))
                return thePerson;
        }
        return null;
    }

    public String getNumberOfPeople() {
        return "Number of People:" + thePeople.size();
    }

    public String toString() {
        StringBuilder returner = new StringBuilder("List of Inhabitants \n-------------------\n" );
        for (Person thePerson : thePeople) {
            returner.append(thePerson).append("\n");
        }
        return returner.toString();
    }
}
