package MovieStore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Store store = new Store();

    public static void main(String[] args) {

        Movie[] movie = new Movie[] {
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("The Dark Knight", "BlueRay", 9.0),
            new Movie("Schindler's List", "DVD", 8.9),
            new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new Movie("Pulp Fiction", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

        for (int i = 0; i < movie.length; i++) {
            store.setMovie(i, movie[i]);
        }

        printStore();
        userInput();
    }
    public static void userInput(){
            Scanner scan = new Scanner(System.in);
            String status="continue";
            while(status.equals("continue")){
                System.out.print("Please choose an integer between 0-8: ");
                int choice=scan.nextInt();
                Movie movie = store.getMovie(choice);
                System.out.println("Set a new rating for  " + movie.getName() + " : ");
                double rating = scan.nextDouble();
                movie.setRating(rating);
                store.setMovie(choice, movie);
                printStore();
                System.out.println("To edit another rating, type 'continue': ");
                status=scan.next();
            }
            scan.close();
    }
    public static void printStore() {
        System.out.println("****************************** MOVIE STORE ******************************");
        System.out.println(store);
    }   
}
