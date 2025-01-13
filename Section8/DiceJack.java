package Section8;
import java.util.*;
public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick three numbers");
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();
        int thirdNum = scan.nextInt();
        scan.close();
        int num1=diceRoll();
        int num2=diceRoll();
        int num3=diceRoll();
        System.out.println("Dice Rolls: ");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        if(areLessThanOne(firstNum, secondNum, thirdNum) || areGreaterThanSix(firstNum,secondNum,thirdNum)){
            System.out.println("Choose a number that is > 0 and < 6");
        }
        else{
            int sumUser=firstNum+secondNum+thirdNum;
            int sumDice=num1+num2+num3;
            System.out.println("Your sum: "+ sumUser);
            System.out.println("Computer's sum: "+ sumDice);
            if(resultFunc(sumUser,sumDice)){
                System.out.println("\nYay! You won.");
            } 
            else{
                System.out.println("\nBetter luck next time.");
            }
        }

    }
    public static boolean resultFunc(int sumUser,int sumDice){
        return ((sumUser>sumDice) && (sumUser-sumDice<3));
    }
    public static boolean areLessThanOne(int firstNum,int secondNum, int thirdNum){
        return (firstNum < 1 || secondNum < 1 || thirdNum<1);
    }
    public static boolean areGreaterThanSix(int firstNum,int secondNum, int thirdNum){
        return (firstNum > 6 || secondNum > 6 || thirdNum>6);
    }
    public static int diceRoll(){
        int diceRolls=(int)(Math.random()*6+1);
        return diceRolls;
    }
}
