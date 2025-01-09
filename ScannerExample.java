import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = sc.nextDouble();
        System.out.println("How much money you spend on fast food?");
        double fastFoodPrice = sc.nextDouble();
        sc.close();
    }
}
