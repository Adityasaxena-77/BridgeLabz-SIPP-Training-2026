import java.util.Scanner;
 class fibonnaci {
    public int fib(int n){
        if(n==0){
           return 0;
        }else if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
   
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    fibonnaci f=new fibonnaci();
    System.out.println(f.fib(n));
    sc.close();
    }
}
