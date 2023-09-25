package Main;
import java.util.Scanner;
class Series {
    public String name;
    public int releaseYear;
    public String genre;
    public String country;
    public int numberOfSeasons;
    private String favouriteCharacter;
    private double[] rating;

    public String getFavouriteCharacter() {
        return favouriteCharacter;
    }

    public void setFavouriteCharacter(String favouriteCharacter) {
        this.favouriteCharacter = favouriteCharacter;
    }

    Series(String name, int releaseYear, String genre, String country, int numberOfSeasons) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.country = country;
        this.numberOfSeasons = numberOfSeasons;
        printFullInformation();
    }
    public void setNumberOfSeasons (int seasons) {
        numberOfSeasons = seasons;
    }

    public void setRating (int seasonNumber, double ratingPoints) {
        rating[seasonNumber] = ratingPoints;
    }
    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }
    //in main2
    public double getRating(int seasonNumber) {
        return rating[seasonNumber];
    }

    public double getRatingSum() {
        double average = 0;
        for (int i = 0; i < numberOfSeasons; ++i) {
            average += rating[i];
        }
        return average;
    }
    public void printFullInformation() {
        System.out.println("Series name: " + name + ".");
        System.out.println("First episode was released in " + releaseYear + ", " + country + ".");
        System.out.println("Genre of " + "'" + name + "'" + " is " + genre);
        System.out.println("This series consists of " + numberOfSeasons + " seasons.");
        System.out.println("Your average rating of seasons is: " + getRatingSum());
        System.out.println();
    }
}
