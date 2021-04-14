package com.tts;
import java.util.Scanner;

public class IntroJava {
    public static void main(String[] args) {

    for(int i = 0; i<3; i++){
        boolean activeSound = true;
    while(activeSound){

        System.out.println("What kind of sound does it make");
        Scanner userInput = new Scanner(System.in);
        String sound  = userInput.nextLine();
        String soundBark = "bark";
        String soundWolf = "wolf";
        String soundMeow = "meow";

        if (sound.equals("bark")){
            System.out.println("You sound like a dog!");
            System.out.println("Give me your name: ");
            String yourName = userInput.nextLine();

            System.out.printf("I been hearing things: Animals talking to me! \n");
            System.out.printf("\n Dear %s,", yourName);
            activeSound = false;
        }else if(sound.equals("meow")){
            System.out.println("You sound like a cat!");
            activeSound = false;
        }else if(sound.equals("wolf")){
            System.out.println("You sound like a wolf!");
            activeSound = false;
        }else{
            System.out.println("You sound like trash lol!");
            activeSound = false;
        }
    }
      }
    }
}
