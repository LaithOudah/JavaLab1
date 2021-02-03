/*
Author(s): Laith Oudah & Klas Nordquist
Assignment: Lab 1
*/

package lab1;

import java.util.ArrayList; // import the ArrayList class

public class AllBuildings {

    private ArrayList<Building> theBuildings;

    public AllBuildings() {
        theBuildings = new ArrayList<>();
    }

    public Building getBuilding(String streetName, int number) {
        Building bDummy = new Building(streetName, number);
        boolean checker = true;

        for (Building theBuilding : theBuildings) {
            if (streetName.equals(theBuilding.getStreet()) && number == theBuilding.getNumber()) {
                System.out.println("Building already exists");
                checker = false;
                bDummy = theBuilding;
                break;
            }
        }

        if (checker) {
            theBuildings.add(bDummy);
            System.out.println("Building Added.");
        }
        return bDummy;
    }

    public String getNumberOfBuildings() {
        return "Number of Buildings:" + theBuildings.size();
    }

    void cleanUp() {
        for (int i = 0; i < theBuildings.size(); i++) {
            if (theBuildings.get(i).residents() == 0) {
                theBuildings.remove(i);
            }
        }
    }

    public String toString() {
        StringBuilder returner = new StringBuilder("List of buildings: -----------------");
        for (Building theBuilding : theBuildings) {
            returner.append(theBuilding.toString()).append("\n");
        }
        return returner.toString();
    }
}
