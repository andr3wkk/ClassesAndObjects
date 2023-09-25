package Main;
import java.util.Scanner;
public class Main2 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Series series1 = new Series("Breaking Bad", 2008, "Crime drama","USA", 5);
        series1.setFavouriteCharacter("Skyler White");
        series1.setRating(1,7);
        series1.setRating(2,8);
        series1.setRating(3,9);
        series1.setRating(4,10);
        series1.setRating(5,10);

        //Series series2 = new Series("Game of Thrones", 2011,"Fantasy", "USA",8);
        //series2.setFavouriteCharacter("Daenerys Targaryen");
        //series2.setRating(1,7);
        //series2.setRating(2,9);
        //series2.setRating(3,10);
        //series2.setRating(4,10);
        //series2.setRating(5,8);
        //series2.setRating(6,9);
        //series2.setRating(7,8);
        //series2.setRating(8,6);
    }
}