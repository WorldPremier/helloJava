package com.tts;
import java.util.Scanner;

public class IntroJava {
    public static void main(String[] args) {
        System.out.println("What kind of sound does it make");
        Scanner userInput = new Scanner(System.in);
        String sound  = userInput.nextLine();
//        String bark = "barks";
        String Sound = "sound";

        if (sound.equals("barks")){
            System.out.println("You sound like you're barking!");
        }else{
            System.out.println("I don't hear anything");
        }
    }
}
