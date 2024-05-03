package oop;
// import object.Test2; // importing package object ka class 


import object.*; // importing package object

// PS D:\Anand\java\basics> javac oop/TestOne.java
// PS D:\Anand\java\basics> java oop/TestOne



public class TestOne {

    public static void main(String[] args) {
        
          Employee engineer = new Employee(); // even if employee is in different file we dont need to import it because it is located inside the same folder 
          //System.out.println(engineer.empID); //this is the only way to access object properties

     /*      Test2 test2class = new Test2();
          test2class.print(); */
         
        

        //System.out.println(Employee.empID); // same output but static word should be used infromt of empId

        System.out.println(engineer.getph()); 
        System.out.println(engineer.getName());
    }
}
