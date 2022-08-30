package ProjectPresentation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class PlanPresentation {


    public void planPresentation(){
        List<String> names = readNames();
        shuffleAndPrint(names);
    }


    int sessions = 4;

     void shuffleAndPrint(List<String> names){
        Collections.shuffle(names);
        int peoplePerWeek = names.size()/sessions;

        for(int i=0; i< names.size(); i++){
            if(i%peoplePerWeek == 0){
                System.out.println("\n*************************\n");
            }
            System.out.println(names.get(i));
        }


    }



    List<String> readNames(){
        List<String> names = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader("./src/ProjectPresentation/people"))) {
            for(String line; (line = br.readLine()) != null; ) {
                names.add(line);
            }
            // line is not visible here.
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }

}
