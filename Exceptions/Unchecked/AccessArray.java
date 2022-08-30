package Exceptions.Unchecked;

public class AccessArray {
    public String getString(String[] strArray, int index){
        String found = null;
        try{
            found = strArray[index];
        } catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }finally{
            return found;
        }
    }
}
