package relations.inheritance;

/**
 * Run Application
 */

public class RunApplication {
    public static void main(String[] args) {
        
        // Learning about Upcast and Downcast
        // Employee employee = new Employee();

        // Employee manager = new Manager();
        // Employee seller = new Seller();
        // Employee cleaner = new Cleaner();

        // Manager manager_ = new Employee();
        // Seller seller_ = (Seller) new Employee();

        // Learning about orverride

        Employee[] classes = new Employee[]{new Cleaner(), new Manager(), new Employee()};

        for (Employee classe : classes) {
            classe.method1();
        }

        System.out.println("");

        for (Employee classe : classes) {
            classe.method2();
        }

        System.out.println("");

        Manager managerClass = new Manager();
        managerClass.method2();
    }
}
