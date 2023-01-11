package operators;

public class Ternary {
    public static void main(String[] args) {
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
    }
}
