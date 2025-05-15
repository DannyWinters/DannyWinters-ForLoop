import org.junit.Test;

public class Application {
    /**
     * This class contains a main method that allows you to manually test the For Loop lab functionality.
     * No changes you make here affect the test case results. You must still run & pass the test cases.
     * All implementation code should be written in the Lab class.
     *
     * The Lab.returnNumbers method should return a String of all numbers between two numbers. All code needed to
     * produce such a result is included in the For Loop lab documentation.
     */
    public static void main(String[] args) {
        Lab forlap = new Lab();
        System.out.println("This lab code should return a String of all numbers from 1 to 6, not including 6.");
        System.out.println("Current result: ");
        String result = forlap.returnNumbers(1, 6).trim();
        System.out.println(result);

        System.out.println(" Given input 1 and 4, returnNumber should return 1 2 3.");
        result = forlap.returnNumbers(1,4).trim();
        System.out.println(result);
    
        System.out.println("Given input 3 and 7, returnNumber should return 3 4 5 6.");    
        result = forlap.returnNumbers(3, 7).trim();
        System.out.println(result);
    }
}
