package Collections.Maps;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Transcript {

    Map<String, List<Double>> transcripts ;

    public Transcript(){

        transcripts = new HashMap<>();
    }

    public void createPrintTranscript(String fileName){
        createTransCript(fileName);
        printTranscript();

    }

//
//    public String getFileName() {
//        return fileName;
//    }
//
//    public void setFileName(String fileName) {
//        this.fileName = fileName;
//    }

    String fileName;


    void printTranscript(){
        for(String name : transcripts.keySet()){
            System.out.println( name +": "+ transcripts.get(name));
        }
    }



     void createTransCript(String fileName) {
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            for(String line; (line = br.readLine()) != null; ) {
                addInfoToTranscripts(line);
            }
            // line is not visible here.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void addInfoToTranscripts(String line){

        String[] split = line.split(",");
        if(split.length < 2){
            return;// do nothing
        }
        String name = split[0];
        Double mark = Double.parseDouble(split[1]);


        if(!transcripts.containsKey(name)){
            transcripts.put(name, new ArrayList<Double>());
        }

        List<Double> mraksList = transcripts.get(name);
        mraksList.add(mark);


    }

}
