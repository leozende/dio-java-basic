package operators;

public class Concatenation {
    public static void main(String[] args) {
        String fullName = "JAVA" + "LANGUAGE";
        System.out.println(fullName);

        //if there are numbers and text?

        String concatenation ="?"; 

        concatenation = 1+1+1+"1";
        System.out.println(concatenation);//print 31

        concatenation = 1+"1"+1+1;
        System.out.println(concatenation);//print 1111

        concatenation = 1+"1"+1+"1";
        System.out.println(concatenation);//print 1111

        concatenation = "1"+1+1+1;
        System.out.println(concatenation);//print 1111

        concatenation = "1"+(1+1+1);
        System.out.println(concatenation);//print 13
    }
}
