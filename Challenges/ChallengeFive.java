package Challenges;
import java.util.*;
public class ChallengeFive {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for black jack?");
        System.out.println("We shall see");
        System.out.println("ready?Press enter to begin.");
        scan.nextLine();
        int yourCard1=randomCard();
        int yourCard2=randomCard();
        int dealerCard1=randomCard();
        int dealerCard2=randomCard();
        String downCard="+---------+\n" + 
                        "|/////////|\n" + 
                        "|/////////|\n" + 
                        "|/////////|\n" + 
                        "|/////////|\n" + 
                        "|/////////|\n" + 
                        "+---------+";
        System.out.println("You get a\n" + drawCard(yourCard1) + "and a \n" + drawCard(yourCard2));
        int yourTotal=Math.min(yourCard1,10)+Math.min(yourCard2,10);
        System.out.println("Your sum: "+yourTotal);
        System.out.println("The dealer shows:\n" + drawCard(dealerCard1) + "\nand has a card facing down\n" + downCard);
        int dealerTotal=Math.min(10,dealerCard1)+Math.min(10,dealerCard2);
        System.out.println("Dealer's sum is hidden");
        while(true){
            String option=hitOrStay();
            if(option.equals("stay")){
                break;
            }
            int yourCard3=randomCard();
            yourTotal+=Math.min(yourCard3,10);
            System.out.println("here's your 3rd card:\n" + drawCard(yourCard3));
            System.out.println("Your total is: " +yourTotal);
            if(yourTotal>21){
                System.out.println("you lose!");
                System.exit(0);
            }
        }
        System.out.println("\nDealer's Turn");
        System.out.println("Dealer's cards are:\n" + drawCard(dealerCard1) + "\nand\n" + drawCard(dealerCard2));
        System.out.println("Dealer's total: " + dealerTotal);
        while(dealerTotal<17){
            int dealerCard3=randomCard();
            dealerTotal+=Math.min(10,dealerCard3);
            System.out.println("Dealer gets a:\n" + drawCard(dealerCard3));
            System.out.println("dealer's total: " + dealerTotal);
        }
        if(dealerTotal>21){
            System.out.println("Dealer loses!");   
        }
        if(yourTotal>dealerTotal){
            System.out.println("you win");
        }
        else{
            System.out.println("Dealer wins");
        }
    }
    public static String hitOrStay(){
        System.out.println("Hit or stay?");
        String yourTurn=scan.nextLine();
        while(!(yourTurn.equalsIgnoreCase("hit") || yourTurn.equalsIgnoreCase("stay")))
        {
            System.out.println("Try again");
            yourTurn=scan.nextLine();
        }
        return yourTurn;
    }
    public static int randomCard(){
        return (int)(Math.random()*13+1);
    }
    public static String drawCard(int cardNum){
        switch(cardNum){
            case 1:
                return  "   _____\n"+
                        "  |A _  |\n"+ 
                        "  | ( ) |\n"+
                        "  |(_'_)|\n"+
                        "  |  |  |\n"+
                        "  |____V|\n";
            case 2:
                return  "   _____\n"+              
                        "  |2    |\n"+ 
                        "  |  o  |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____Z|\n";
            case 3:
                return "   _____\n" +
                        "  |3    |\n"+
                        "  | o o |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____E|\n";

            case 4: return
                   "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";

             case 5: return
                    "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

             case 6: return
                    "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

             case 7: return
              
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
          
             case 8: return
            
                    "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
             
             case 9: return
                    "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

            case 10: return
                    "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
            
             case 11: return

                    "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
            
            case 12: return

                    "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
              
              case 13: return 
                    "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
            default: return "Out of range";
        }
    }
}
