package basic02;

public class MyString {

    //  #34 -> What is String in Java
    public static void main(String[] args) {
       /*  String name = "rahulm"; // same as below , behind the scene create an object

        // String name = new String("Rahul"); //old method

        System.out.println("hello" + name);
        System.out.println(name.charAt(2)); // methods on class


        System.out.println(name.concat("Z")); */

        // ----------

        // #35 -> Mutable vs Immutable String in Java

       /*  String name = "rahul";
        name = name + " yadav"; // a new object is created 
        System.out.println("hello " + name);

        String s1 = "Anand";
        String s2 = "Anand"; */
        /* 
         * mutable string - which can be changed
         * immutable - which cannot be changed
         * by default String is immutable
         * 
         * String buffer or string builder is mutuable
         */
        // -----------------

        // #36 StringBuffer and StringBuilder in Java

        StringBuffer sb = new StringBuffer("hello");
        // System.out.println(sb.capacity());

        sb.append("Singh");
        sb.deleteCharAt(2);
        sb.insert(0, "java ");

        System.out.println(sb);
        

    }
}
