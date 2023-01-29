package relations.inheritance;

/**
 * Child class
 */

class Manager extends Employee {
    
    @Override
    void method1() {
        System.out.println("Method 1 of the Child 2 (Manager)");
    }
    
    @Override
    void method2() {
        System.out.println("Method 2 of the Child 2 (Manager)");
    }
}
