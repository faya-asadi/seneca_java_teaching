package Collections;

import java.util.*;

public class ListExample {

    void createVector(){
        List<Integer> v = new Vector<Integer>();


    }

    void createArrayList(){
   //     Integer[] integerAry;
//        int[] intAry;
//        List<int> intLi;

        String[] strAry= {"Sunday", "Monday", "Friday", "Saturday"};

        List<String> al = new ArrayList<>();

        for(String str : strAry){
            al.add(str);
        }




        List<String> al2 = new ArrayList<String>(){
            {
                add("Sunday");
                add("Monday");
                add("Friday");
            }
        };

        List<String> al7 = new ArrayList<String>();
        al7.add("Sunday");



        List<String> al3 = new ArrayList<String>(  Arrays.asList("Sunday", "Monday", "Friday", "Saturday")  );

        List<String> al9 = new ArrayList<String>(al7);

        List<String> al4 =  new ArrayList<String>(List.of(strAry));



        List<String> al5 =  new ArrayList<String>();
        al5.addAll( List.of(strAry) );



        al5.addAll(al2);

        for(int i= 0; i< al5.size(); i++){
            System.out.println(al5.get(i));
        }
    }


    public void listMethods(){


        Integer[] intAry= {3, 1, 0, 9, 5,4, 2, 8};
        List<Integer> intlist = new ArrayList<Integer>(List.of(intAry));

        int max =  Collections.max(intlist);

        // System.out.println("max is: "+ max);

        int min = Collections.min(intlist);
        System.out.println("min is: "+ min);
        System.out.println("###################### \n \n");
//
        System.out.println("list before reverse: " + intlist);
        Collections.reverse(intlist);
        System.out.println("list After reverse: " + intlist);


//
        System.out.println("###################### \n \n");
        Collections.sort(intlist); // sorts arraylist
        System.out.println("list After sort: " + intlist);

    }




    public <T> void printList(List<T> list){
        for(T item : list){
            System.out.println(item);
        }
    }






}
