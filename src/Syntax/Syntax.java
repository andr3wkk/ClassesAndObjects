package Syntax;
import java.util.Scanner;
class Human {
    public String name;
    public String surname;
    private String location;
    private double weight;
    private int phoneNumber;
    private boolean hasHigherEducation;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isHasHigherEducation() {
        return this.hasHigherEducation;
    }

    public void setHasHigherEducation(boolean hasHigherEducation) {
        this.hasHigherEducation = hasHigherEducation;
    }

    Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printInfo() {
        System.out.println(getInfo());
    }

    public String getInfo() {
        return name + " " + surname + "; Location: " + getLocation() + "; Weight: " + getWeight() + "; Phone number: " + getPhoneNumber() + "; Higher education: " + hasHigherEducation;
    }
}