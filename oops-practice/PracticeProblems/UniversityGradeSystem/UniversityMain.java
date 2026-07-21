package UniversityGradeSystem;

import java.nio.channels.Pipe.SourceChannel;

public class UniversityMain {
    public static void main(String[] args) {
        GradeStudent studentOne = new GradeStudent(101,
                                                    "aditya",
                                                    123456,
                                                    70.0,
                                                    "Artificial Intelligence"
                                                );
        System.out.println(studentOne);

        System.out.println("-----------------");

        GradeStudent studentTwo= new GradeStudent(102,
                                                    "anubhav",
                                                    123457,
                                                    71.0,
                                                    "Artificial Intelligence"
                                                );
    }
}
