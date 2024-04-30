class logical 
{
    public static void main(String args[] ) {


int x =7;
int y =8;
int a =9;
int b =10;


//boolean result = a > b || y > x; // true (1->f,2->t) any condition satisfy 
//boolean result = a > b || y < x || a > 1; // true (1->f,2->t) any condition satisfy for true
//boolean result = a > b || y < x || a < 1; // all false condition output will be false
//boolean result = a > b && y > x; // false (1->f,2->t) both  condition should satisfy



boolean result = a > b ; // 
System.out.println(!result); // will give true as output because a is not greater than b, hence true 

    }

}