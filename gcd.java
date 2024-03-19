import java.util.Scanner;
//recursion
public class gcd {
    class gcd{
        int gcd2(int a,int b)
        {
            if(a>b){int t = a;a=b;b=t;}
            if(b%a==0) return a;
            else return(gcd2|(b%a,a));
        }
    }
    public static void main(String[]args){
         gcd obj = new gcd();
         int a, b,c;
         Scanner sc = new Scanner(System.in);
         System.out.println("Input the first number");
         a = sc.nextInt();
         System.out.println("Input the seconf number");
         b = sc.nextInt();
         c = obj.gcd2(a,b);
         System.out.println("GCD of "+a+"and "+b+"is "+c);
    }     
}
