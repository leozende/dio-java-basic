public class Main {
    public static void main(String[] args) {
        System.out.println("Started the program in the main method.");
        a();
        System.out.println("Ended the program in the main method.");
    }

    static void a() {
        System.out.println("You have entered method a.");
        b();
        System.out.println("Finished method a.");
    }
    static void b() {
        System.out.println("You entered method b.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finished method b.");
    }
    
    static void c(){
        System.out.println("Entered method c.");
        Thread.dumpStack();
        System.out.println("Finished method c.");
    }
}
