package operators;

public class Logic {
    public static void main(String[] args) {
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
