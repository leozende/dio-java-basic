package operators.logics;

public class Main {
    public static void main(String[] args) {
        
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 : " + (b1 && b2));
        System.out.println("b1 && b3 : " + (b1 && b3));

        System.out.println("b2 || b3 : " + (b2 || b3));
        System.out.println("b2 || b4 : " + (b2 || b4));

        System.out.println("b1 ^ b3 : " + (b1 ^ b3));
        System.out.println("b4 ^ b1 : " + (b4 ^ b1));

        System.out.println("!b1 : " + !b1);
        System.out.println("!b2 : " + !b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((i1 + i2) < (f2 - f1)) && true : " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("((i1 > i2) || (f2 < f1)) : " + ((i1 > i2) || (f2 < f1)));

        double monthSalary = 11893.58d;
        double mediaSalary = 10500d;

        int dependentsQuantity = 4;
        int mediaDependents = 2;

        System.out.println("(monthSalary < mediaSalary) && (dependentsQuantity >= mediaDependents) : " + ((monthSalary < mediaSalary) && (dependentsQuantity >= mediaDependents)));

        boolean lowSalary = monthSalary < mediaSalary;
        boolean manyDependents = dependentsQuantity >= mediaDependents;

        System.out.println("lowSalary && manyDependents : " + (lowSalary && manyDependents));

        boolean receiveAssistance = (lowSalary) && (manyDependents);

        System.out.println("receiveAssistance : " + (receiveAssistance));

    }
}
