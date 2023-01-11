package operators;

public class Unary {
    public static void main(String[] args) {
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
    }
}
