public class Operators {
    public static void main(String[] args) {
        int bagOfSweets1=5;
        int bagOfSweets2=10;

        long stars_milklyWay=250_000_000_000L;
        long stars_Andromeda=1_000_000_000_000L;
        double testScore=6.7;
        System.out.println("Fred and George collected" + (bagOfSweets1+bagOfSweets2) + " sweets");
        System.out.println("There are " + (stars_milklyWay+stars_Andromeda)+ " stars in milky way and andromeda galaxies");

        System.out.println("Fred and George collected" + (bagOfSweets1-bagOfSweets2) + " sweets");
        System.out.println("There are " + (stars_Andromeda-stars_milklyWay)+ " stars in milky way and andromeda galaxies");

        System.out.println(testScore*1.25);
        System.out.println(testScore/2.0);
    }
}
