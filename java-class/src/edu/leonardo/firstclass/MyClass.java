package edu.leonardo.firstclass;

public class MyClass {
    public static void main (String [] args) {
        
        String firstName = "Leonardo";
        String lastName = "Rezende";

        String fullName = fullName(firstName, lastName);

        System.out.println(fullName);
    }

    public static String fullName (String firstName, String lastName){
        return "Method result: " + firstName.concat(" ").concat(lastName);
    }
}
