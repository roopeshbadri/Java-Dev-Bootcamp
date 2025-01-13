package Challenges;
import java.util.*;
public class ChallengeFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's Play Rock Paper Scissors!");
        System.out.println("When I say shoot, choose rock, paper or scissors.");
        System.out.println("Are you ready? Write 'yes' if you are.");
        String ready = scan.nextLine();
        if(ready.equals("yes")){
            System.out.println("Great!");
            System.out.println("rock-paper-scissors, shoot!");
            String userChoice=scan.nextLine();
            String computerChoice=compChoice();
            String result = result(userChoice, computerChoice);
            finalResult(userChoice, computerChoice, result);
        }
        scan.close();
    }
    public static String compChoice(){
        int randomNum=(int)(Math.random()*3);
        if(randomNum==0){
            return "rock";
        }
        else if(randomNum==1){
            return "paper";
        }
        else{
            return "scissors";
        }
    }
    public static String result(String userChoice, String computerChoice){
        String result=" ";
        if(userChoice.equals("rock") && compChoice().equals("scissors")){
            return "You won!";
        }
        if(userChoice.equals("paper") && compChoice().equals("rock")){
            return "You won!";
        }
        if(userChoice.equals("scissors") && compChoice().equals("paper")){
            return "You won!";
        }
        if(userChoice.equals("rock") && compChoice().equals("paper")){
            return"Computer won!";
        }
        if(userChoice.equals("paper") && compChoice().equals("scissors")){
            return "Computer won!";
        }
        if(userChoice.equals("scissors") && compChoice().equals("rock")){
            return "Computer won!";
        }
        if(userChoice.equals(computerChoice)){
            return "Its a tie!";
        }
                return result;
    }
    public static void finalResult(String userChoice, String computerChoice, String result){
        System.out.println("Your choice: "+ userChoice);
        System.out.println("Computer's choice: "+ computerChoice);
        System.out.println("Result: "+result);
    }

}
