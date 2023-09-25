package Syntax;
import java.util.Scanner;
public class Syntax2 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello! Please, type Your name and surname:");
        Human human1 = new Human(in.nextLine(), in.nextLine());
        System.out.println("Where do You live?");
        human1.setLocation(in.nextLine());
        System.out.println("Please, enter Your phone number:");
        //human1.phoneNumber = in.nextInt(); error
        human1.setPhoneNumber(in.nextInt());
        System.out.println("Please, enter Your weight:");
        human1.setWeight(in.nextDouble());
        System.out.println("Do you have higher education");
        human1.setHasHigherEducation(true);
        System.out.println("Here is Your info:");
        human1.printInfo();
    }
}