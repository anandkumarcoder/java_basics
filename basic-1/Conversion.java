 //class Conversion
{
    public static void main(String args[] ) {

       int a = 300;
        byte k = (byte) a ;
    //    byte k =  a ; //implicit conversion


// converting float
float f = 5.8f;

int i = (int) f;// this casting, expilicit conversion
         System.out.println(i);


// type promotion

byte b = 20;
byte c = 30;

 int result = b*c; //even though 600 is out of range for byte it will be automatically converted to  byte

System.out.println(result);


    }
} */



// operator

class Operators
{
    public static void main(String args[] ) {

int num1 = 8;
 int num2 = 8;

// num1 = num1 + 3;
// short cut for above

// num1 += 2;
// num1++ ; // post incrementing
// ++num1; // pre incrementing
//  num1--;  //decrementing
// num1 *= 2;


int result = num1++; // first fetch the value then increment it
int result2 = ++num1; // first increment it and then fetch the value


// System.out.println(num1);
// System.out.println(num2);
// System.out.println( result);
// System.out.println( result2);


// comparison


boolean result3 = num1 = num2;
 System.out.println(num1);

System.out.println(result3);

    }
}
