package Exceptions.Unchecked;

public class ArithmaticNumeric {

    public int  divideByZero(int a, int b){
        int  c = -1;
        try {
             c = a / b;
        } catch(ArithmeticException e){
            System.out.println(e);
        }finally{
            return c;
        }


    }




    public int StringToInt(String str){
        int number = 0;
        try{
            number = Integer.parseInt(str);
            System.out.println(number);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        return number;
    }



}
