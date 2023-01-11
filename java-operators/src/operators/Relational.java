package operators;

public class Relational {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;

        boolean yesNo = number1 == number2;

        System.out.println("Is number one equal to number two? " + yesNo);//print false

        yesNo = number1 != number2;

        System.out.println("Is number one different to number two? " + yesNo);//print true

        yesNo = number1 > number2;

        System.out.println("Is number one greater than number two? " + yesNo);//print false

        yesNo = number1 < number2;

        System.out.println("Is number one less than number two? " + yesNo); //print true

        yesNo = number1 >= number2;

        System.out.println("Is number one greater than or equal to number two? " + yesNo);//print false

        yesNo = number1 <= number2;

        System.out.println("Is number one less than or equal to number two? " + yesNo);//print true

        //With objects

        String nameOne = "Leo";
        String nameTwo = "Leo";

        System.out.println(nameOne == nameTwo);//print true

        nameTwo = new String("Leo");

        System.out.println(nameOne == nameTwo);//print false
        System.out.println(nameOne.equals(nameTwo));//print true
    }
}
