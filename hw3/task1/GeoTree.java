package hw3.task1;

import java.util.HashMap;

public class GeoTree {
    int index;
    HashMap<Integer, String> people = new HashMap<Integer, String>();
    public void append(String person) {
        people.put(index, person);
        index ++;
    }
    public HashMap<Integer, String> showTree() {
        return people;
    }

    public void showFamily(String surname) {
        System.out.println("This is " + surname + " Family:");
        for(int i=0; i<people.size(); i++){
            String a = people.get(i);
            if (a.indexOf(surname) > 0){
                System.out.println(a);
            }

        }
    }
}
