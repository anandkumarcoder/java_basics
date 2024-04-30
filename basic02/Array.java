package basic02;

public class Array {

    public static void main(String[] args) {
        // video number 28
        /*
         * // int num [] = {3,7,2,4}; // directly putting the number in an array
         * // array is indexed based starting from zero
         * 
         * 
         * int num [] = new int[4];
         * 
         * num[0] = 1;
         * num[1] = 2;
         * num[2] = 3;
         * num[3] = 4;
         * 
         * 
         * // printing all the elements of an array
         * 
         * for (int i = 0; i < 4; i++) {
         * System.out.println(num[i]);
         * }
         */
        // ------------------------------

        // #video- 29 -> multi dimensional array

        /*
         * int nums [] [] = new int[3][4];
         * 
         * // assigning random number
         * 
         * 
         * for (int i = 0; i < 3; i++) {
         * for (int j = 0; j < 4; j++) {
         * nums[i][j] = (int) (Math.random()*10);; // (int) -> used for typecasting
         * // System.out.println(nums[i][j]);
         * }
         * }
         * 
         * // printing the elements of an array
         * for (int i=0; i<3; i++){
         * for (int j = 0; j < 4; j++) {
         * System.out.print(nums[i][j] + " ");
         * }
         * 
         * System.out.println();
         * }
         * 
         * // enhanced loop
         * 
         * for(int n[] : nums){
         * // n is not a variable but a single dimensional array coming from nums
         * for (int m: n) {
         * // m: n is taking the element value from array n
         * System.out.print(m + " ");
         * }
         * System.out.println();
         * }
         */
        // -------------------

        // video 30 - jagged and 3d array
        /*
         * int nums[][] = new int[3][]; // jagged array - we dont know the array length
         * of each array
         * 
         * // int nums [] [] [] = new int[3][4][5] ; 3d arrAy
         * 
         * nums[0] = new int[3]; // for first array there are 3 elements
         * nums[1] = new int[4]; // for first array there are 4 elements
         * nums[2] = new int[2];
         * 
         * // assigning random number
         * 
         * for (int i = 0; i < nums.length; i++) {
         * for (int j = 0; j < nums[i].length; j++) {
         * nums[i][j] = (int) (Math.random() * 10);
         * ; // (int) -> used for typecasting
         * // System.out.println(nums[i][j]);
         * }
         * }
         * 
         * // enhanced loop
         * 
         * for (int n[] : nums) {
         * // n is not a variable but a single dimensional array coming from nums
         * for (int m : n) {
         * // m: n is taking the element value from array n
         * System.out.print(m + " ");
         * }
         * System.out.println();
         * }
         */
        // --------------

        // #32- array of object in java

        /*
         * int nums [] = new int[4] ;
         * 
         * nums[0] = 4; // for first array there are 3 elements
         * nums[1] = 8; // for first array there are 4 elements
         * nums[2] = 3;
         * nums[3] = 9;
         * 
         * 
         * for (int i = 0; i < nums.length; i++) {
         * System.out.println(nums[i]);
         * }
         * 
         * 
         * 
         */

        // creating student object
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "rahul";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "rahul2";
        s2.marks = 882;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "rahul3";
        s3.marks = 883;

        //System.out.println(s1); // this will give referrence to the object
// creating array of students

Student students[]= new Student[3];
students[0] = s1;
students[1] = s2;
students[2] = s3;

/* for (int i = 0; i < students.length; i++) {
    System.out.println(students[i].name + " "+":" + students[i].marks);
}
 */

//  enchanced loop
 for(Student stud : students){
    System.out.println(stud.name + " : " + stud.marks);
 }

    }

}



class Student {
    int rollno;
    String name;
    int marks;
}