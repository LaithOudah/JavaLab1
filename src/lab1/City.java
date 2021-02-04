/*
Author(s): Laith Oudah & Klas Nordquist
Assignment: Lab 1
*/

package lab1;

public class City {

    private AllBuildings infrastructure;
    private Inhabitants people;

    public City() {
        infrastructure = new AllBuildings();
        people = new Inhabitants();
    }

    public void addPerson(String firstName, String secondName, int age, String streetName, int number) {
        Building tempBuilding = infrastructure.getBuilding(streetName, number);
        Person tempPerson = people.addPerson(firstName, secondName, age);

        if (tempPerson != null) {
            tempPerson.setAdress(tempBuilding);
            tempBuilding.addPerson(tempPerson);
        }
    }

    public void movePerson(String firstName, String secondName, int age, String streetName, int number) {
        Person person = people.searchPerson(firstName, secondName, age);
        Building building;

        if (person == null) {
            System.out.println("Person does not exist");
        } else {
            Building remove = person.getAdress();
            remove.removePerson(person);

            building = infrastructure.getBuilding(streetName, number);
            building.addPerson(person);
            infrastructure.cleanUp();
        }
    }

    public String listBuildings() {
        return infrastructure.toString();
    }

    public String listPeople() {
        return people.toString();
    }

    public String toString() {
        return ("City Statistics\n---------------\n"
                + infrastructure.getNumberOfBuildings() + "\n"
                + people.getNumberOfPeople());
    }
}
