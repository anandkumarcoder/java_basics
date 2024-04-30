public class reiterate {
    public static void main(String args[]) {

        // loop - while, do while, for

        // while loop
        /*
         * int i = 0;
         * 
         * while (i<=4) {
         * System.out.println("hello" + i);
         * // nested while loop
         * int j = 1;
         * while (j<=3) {
         * System.out.println("hello " + j );
         * j++ ;// inner while loop :
         * }
         * 
         * 
         * i++;
         * }
         * System.out.println("Loop ended with value of i " + i); // this will be
         * pringted after loop ends
         */
        // ------------

        // DO while loop : execute the block even if the condition is false

        /*
         * int i = 5;
         * do
         * {
         * System.out.println("sorry condition is false" + i);
         * // output : sorry condition is false5
         * 
         * i++;
         * } while (i <= 4);
         * 
         */

        // ----------- for loop

        for (int i = 0; i < 4; i++) {
            System.out.println("Day" + i);

            for(int  j = 1; j<=9; j++){
                System.out.println((j+8)+ "---"+ (j+9));
            }

        }

    }

}
