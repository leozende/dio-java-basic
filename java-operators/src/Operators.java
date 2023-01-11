public class Operators {
    public static void main(String[] args) throws Exception {
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

        //Unary operator
        int number = 5;
                
        System.out.println(- number);//print -5

        System.out.println(number);//print 5

        number = - number;
        System.out.println(number);//print -5
        number = + number;
        System.out.println(number);//print -5
        number = number * -1;
        System.out.println(number);//print 5

        number ++;
        System.out.println(number);//print 6

        System.out.println(number ++);//print 6

        System.out.println(number);//print 7

        System.out.println(++ number);//print 8

        System.out.println(number --);//print 8

        System.out.println(number); //print 7

        System.out.println(-- number); //print 6

        boolean right = true;

        System.out.println("Inverted " + !right);//print false

        System.out.println(right);//print true

        right = !right;

        System.out.println(right);//print false

        //Ternary operator

        int a, b;

        a = 5;
        b = 6;

        String result = "";

        if(a == b)
            result = "true";
        else
            result = "false";

        System.out.println(result);

        //With ternary operator

        String result2 = a == b ? "true" : "false";

        System.out.println(result2);

        //With number is possible too

        int resultNumber = a == b ? 2 : 1;

        System.out.println(resultNumber);

        //Relational operators

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

        //Logic operators

        boolean condition1 = true;
        boolean condition2 = false;

        if(condition1 && condition2){
            System.out.println("both conditions are true");
        }
        if(condition1 && (7 > 4)){
            System.out.println("both conditions are true, but the second condition is different");
        }
        if(condition1 || condition2){
            System.out.println("One of the conditions is true");
        }

        System.out.println("END");

        boolean conditionResult = condition1 && condition2;

        System.out.println(conditionResult);

    }
}
