package MakerPlanQuestion.UniversitySystem;

public class UniversityMain {
    public static void main(String[] args) {
        Person studentOne = new GradStudent(
                101,
                "Tarang",
                112001,
                70.0,
                "AI"
        );
        System.out.println(studentOne);

        Person studentTwo = new GradStudent(
                102,
                "Varanita",
                112002,
                84.0,
                "BlockChain"
        );
        System.out.println(studentTwo);



    }
}