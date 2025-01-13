package Section6;
import java.util.*;
public class DealershipApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Java Dealership!");
        System.out.println(" Select option a to buy a car");
        System.out.println("Select option b to sell a car");
        String option =scan.nextLine();
    
    switch(option){
        case "a": System.out.println("you chose option " + option);
        System.out.println("What is your budget?");
        double budget=scan.nextDouble();
        if(budget>=10000){
            System.out.println("Great! A Nissan Altima is available");
            System.out.println("Do you have insurance?");
            scan.nextLine();
            String insurance = scan.nextLine();
            System.out.println("Do you have license?");
            String license=scan.nextLine();
            System.out.println("What is your credit score?");
            int creditScore=scan.nextInt();
            if(insurance.equals("yes") && license.equals("yes") && creditScore>660){
                System.out.println("Sold! Pleasure doing business with you.");
            }else{
                System.out.println("We're sorry, we cannot sell you the car.");
            }
        }
        else{
            System.out.println("We're Sorry, you are not eligible");
        }
        break;
        case "b": System.out.println("you chose option " + option);
        System.out.println("What is your car valued at?");
        int value=scan.nextInt();
        System.out.println("What is your selling price?");
        int sellingPrice=scan.nextInt();
        if(value>sellingPrice && sellingPrice <30000){
            System.out.println("We will buy your car, pleasure doing business with you.");
        }else{
            System.out.println("Sorry, we're not interested.");
        }
        break;
        default: System.out.println("Invalid option " + option);
    }
    
    scan.close();
}
}
