import java.util.*;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageAmar = sc.nextInt();
        int ageAkbar = sc.nextInt();
        int ageAnthony = sc.nextInt();

        double heightAmar = sc.nextDouble();
        double heightAkbar = sc.nextDouble();
        double heightAnthony = sc.nextDouble();

        if (ageAmar < ageAkbar && ageAmar < ageAnthony)
            System.out.println("Amar is Youngest");
        else if (ageAkbar < ageAmar && ageAkbar < ageAnthony)
            System.out.println("Akbar is Youngest");
        else
            System.out.println("Anthony is Youngest");

        if (heightAmar > heightAkbar && heightAmar > heightAnthony)
            System.out.println("Amar is Tallest");
        else if (heightAkbar > heightAmar && heightAkbar > heightAnthony)
            System.out.println("Akbar is Tallest");
        else
            System.out.println("Anthony is Tallest");
    }
}
