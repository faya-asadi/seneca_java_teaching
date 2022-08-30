package Exceptions.Checked;

import java.io.*;

public class FileWorking {

    public String ReadingFile() {
        byte[] array = new byte[100];
        InputStream input = null;
        String data = null;

        try {
            input = new FileInputStream("input.txt");
            System.out.println("Available bytes in the file: " + input.available());
            // Read byte from the input stream
            input.read(array);
            System.out.println("Data read from the file: ");
            // Convert byte array into string
            data = new String(array);
            System.out.println(data);

        } catch (FileNotFoundException e) {
            System.out.println("Hey Goofi the file you're trying to access does not exist!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Unfortunaely an unexpected IO exception happened, so sorry!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(RuntimeException ex){

        } catch (Exception e){
            e.printStackTrace();
        }
        finally{
            try {
                input.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        return data;
    }




}
