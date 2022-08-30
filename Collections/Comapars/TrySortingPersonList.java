package Collections.Comapars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class TrySortingPersonList {

    void trySorting(){
        List<Person> people= new ArrayList<>();
        Collections.sort(people, new PersonComaparator());
        Collections.sort(people);
    }

}
