public class Methods {
    public static void main(String[] args) throws Exception {
        int n1 = 10;
        int n2 = 20;

        int add = add(n1,n2);
        print(add);
    }

    public static int add (int num1, int num2){
        return num1 + num2;
    }

    public static void print (int num)
    {
        System.out.println(num);
    }
}
