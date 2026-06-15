
import java.util.Scanner;
public class MathWizard {
       public boolean isPrime(int n){
        int count=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        } 
        if(count==2){
            return true;
        }else{
            return false;
        }
       }

       public int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        return fact;
       }

       public int fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
       }

       public int gcd(int a, int b){
        int gcd=1;
        for(int i=1; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
       }

       public int Lcm(int a, int b){
        int lcm=(a*b)/gcd(a,b);
        return lcm;
       }


       public int power(int a, int b){
        int power=1;
        for(int i=1; i<=b; i++){
            power=power*a;
         
        }
        return power;
       }
       public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MathWizard math=new MathWizard();

        System.out.println("Enter your choice:\n1. Prime Number\n2. Factorial\n3. Fibonacci\n4. GCD\n5. LCM\n6. Power");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter a number:"); 
                int num1=sc.nextInt();
                boolean prime=math.isPrime(num1);
                System.out.println("the prime number is: " + prime);
                break;

            case 2:
                System.out.println("Enter a number:");
                int num2=sc.nextInt();
                int fact=math.factorial(num2);
                System.out.println("factorial of the number is: " + fact);
                break;

            case 3:
                System.out.println("Enter a number:");
                int num3=sc.nextInt();
                int fib=math.fibonacci(num3);
                System.out.println("fibonacci of number is:" + fib);
                break;

            case 4:
                System.out.println("Enter two numbers:");
                int a=sc.nextInt();
                int b=sc.nextInt();
                int gcd=math.gcd(a, b);
                System.out.println("GCD of of a number is: " + gcd);
                break;

            case 5:
                System.out.println("Enter two numbers:");
                int x=sc.nextInt();
                int y=sc.nextInt();
                int lcm=math.Lcm(x, y);
                System.out.println("Lcm of the number is :" + lcm);
                break;

            case 6:
                System.out.println("Enter base and exponent:");
                int base=sc.nextInt();
                int exp=sc.nextInt();
                int power=math.power(base, exp);
                System.out.println("Power of the number is :" + power);
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }

       }

}