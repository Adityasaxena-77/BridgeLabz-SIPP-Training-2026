import java.util.*;
public class Reversestring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String first=sc.next();
        String second=sc.next();
        String third=sc.next();
        System.out.print(first+ " "+second+ " ");
            for(int i=third.length()-1; i>=0; i--){
            System.out.print(third.charAt(i));
            }
    }
}