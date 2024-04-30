/* class conditional 
{
    public static void main (String args []){

int x = 3;
int y = 7;
int z = 9;



if(x>10 && x<=20) //output here will be true
System.out.println("hello");
else // prints when if is true
System.out.println("BYE"); // prints when if is false


/* 
if(x>y)
{
System.out.println(x);
System.out.println("hello again");
// curly braces when u need to print more than two statement
}

else
System.out.println(y);*/


// if else ---
/*  if(x > y && x >z) //false
    System.out.println(x);
    else if(y > x && y > z)
    System.out.println(y);
    else
    System.out.println(z);

 */
// terenary operator 
//   int result = 0;  


/*if(x%2 == 0)
result = 10;
else 
result = 30;
System.out.println(result);
 */


//  condition ?  if true value : if false value;

/* result = x%2 ==0 ? 10 : 20 ;

System.out.println(result);
    } 


   
} */
 

//  switch 

 class Switch {
    public static void main(String args[]){
        int n = 8;

        switch (n){
           case 1:
        System.out.println("Monday");
        break; // Added break statement for cleaner code
      case 2:
        System.out.println("Tuesday"); // Removed extra colon
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;

      default:   
      System.out.println("Enter the valid numbers");
        }
        
    


    }
}
