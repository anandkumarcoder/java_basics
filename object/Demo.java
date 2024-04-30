//  package object;

/**
 * InnerDemo
 */
class Calculator {
    // this is class which has methoda which is used as object below
    int a = 5; // assining variable

    // creating method

    public int add(int n1, int n2) {

        int r = n1 + n2;

        return r;

        // System.out.println("hi from calculator class");

    }

}

public class Demo {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 5; // primitive variables

        /*
         * int result = num1 + num2;
         * 
         * System.out.println(result);
         */

        Calculator calc = new Calculator(); // object is created
        /*
         * Calculator is a type / class name
         * calc - referrrence variable for accessing the method
         * new Calculator(num1, num2) : object is created and space is occupied, object
         * of type calculator
         */

        // int result = calc.add(4,5);
        int result = calc.add(num1, num2);
        System.out.println(result);

    }
}
