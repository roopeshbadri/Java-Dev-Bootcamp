package Challenges;

import java.util.Scanner;

public class ChallengeThree {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1. Which country held the 2016 summer olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td)India");
        String firstAnswer=scan.nextLine();
        System.out.println("Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Jupiter\n\tc) Earth\n\td)Mars");
        String secondAnswer=scan.nextLine();
        System.out.println("What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td)AB -negative");
        String thirdAnswer=scan.nextLine();
        System.out.println("Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        String fourthAnswer=scan.nextLine();
        scan.close();
        int score=0;
        if(firstAnswer.equals("c")){
            score+=5;
        }
        if(secondAnswer.equals("a")){
            score+=5;
        }
        if(thirdAnswer.equals("d")){
            score+=5;
        }
        if(fourthAnswer.equals("a") || fourthAnswer.equals("b")){
            score+=5;
        }
        System.out.println("Your score is:" + score + "/20");
        if(score>=15){
            System.out.println("Wow, you know your stuff");
        }
        else if(score>=5){
            System.out.println("Not bad!");
        }
        else{
            System.out.println("better luck next time");
        }

    }
}
