import java.util.*; 
public class BMICalculator {
    public double BMICalculator(double weight, double height){
        double BMI= weight/(height*height);
        return BMI;
    }
    public double Classification(double BMI){
        if(BMI<18.5) System.out.println("Underweight Category.");
        else if(BMI >=18.5 && BMI < 25.0) System.out.println("Normal Category.");
        else System.out.println("Overweight Category");
        return BMI;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        double height =sc.nextFloat();
        System.out.println("Height = ");
        double weight= sc.nextInt();
        System.out.println("Weight = ");
        BMICalculator BMI = new BMICalculator();
    }
}