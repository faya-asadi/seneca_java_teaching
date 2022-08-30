package Exceptions.Unchecked;

public class ArrayOUtOfBound {

    int[] ary;

    public ArrayOUtOfBound(){
        ary = new int[]{ 1,2,3,4,5};
    }

    public int getValueAt(int index){
        try {
            return ary[index];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }


}
