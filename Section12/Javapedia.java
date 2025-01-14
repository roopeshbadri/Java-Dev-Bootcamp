package Section12;
import java.util.*;
public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
           System.out.println("How many historical figures will you register?");
           int numFigures=scan.nextInt();
           scan.nextLine();
           String database[][]=new String[numFigures][3];
           for(int i=0;i<database.length;i++){
                System.out.print("\t Name: ");
                database[i][0]=scan.nextLine();
                System.out.print("\t DOB: ");
                database[i][1]=scan.nextLine();
                System.out.print("\t Occupation: ");
                database[i][2]=scan.nextLine();
                System.out.println("\n");
           }
           System.out.println("These are the values you stored: ");
           print2DArray(database);
           System.out.println("Who do you want the information on?");
           String info=scan.nextLine();
           for(int i=0;i<database.length;i++){
                if(database[i][0].equals(info)){
                    System.out.println("Here's the information you need: ");
                    for(int j=0;j<database[i].length;j++){
                        System.out.print(database[i][j] + " ");
                    }
                }
           }
           scan.close();
    }
    public static void print2DArray(String db[][]){
        for(int i=0;i<db.length;i++){
            for(int j=0;j<db[i].length;j++){
                System.out.print(db[i][j]+ " ");
            }
            System.out.println("\n");
        }
    }
}
