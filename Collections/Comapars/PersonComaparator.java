package Collections.Comapars;

import Collections.Comapars.Person;

import java.util.Comparator;

public class PersonComaparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.age > o2.age){
            return 1;
        }
        if(o1.age < o2.age){
            return -1;
        }

        if(o1.name.length() > o2.name.length()){
            return 1;
        }
        if(o1.name.length() < o2.name.length()){
            return -1;
        }
        return 0;

    }
}
