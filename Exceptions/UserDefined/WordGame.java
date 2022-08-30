package Exceptions.UserDefined;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class WordGame {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void startGame() throws IOException {
        try {
            EnterWord();
        } catch (WrongWordException e) {
            System.out.println(e.getMessage());
            System.out.println("Do you want to start a new game?");
            String answer = reader.readLine();
            if (answer.equalsIgnoreCase("yes") ){  //answer.toLowerCase() == "yes"!!!!!
                startGame();
            }
        }
    }

    void EnterWord() throws IOException, WrongWordException {
        char begin = 'a';
        int score = 0;
        for(int i=0; i<20; i++){
            {
                System.out.print("Enter a word that begins with '"+ begin + "': ");
                String word = reader.readLine();
                char ch = word.toLowerCase().charAt(0);
                if(ch == begin ){
                    score++;
                    begin = word.toLowerCase().charAt(word.length()-1);
                    System.out.println("Great answer, your score is: "+score);
                }else{
                    throw new WrongWordException("The word you entered is not valid, Your score is: " + score);
                }
            }
        }
    }
}



