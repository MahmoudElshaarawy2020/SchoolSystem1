import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Instructor Inst1 = new Instructor("Hassan", 23, "Math");
        Instructor Inst2 = new Instructor("Hatem", 50, "Arabic");
        Instructor Inst3 = new Instructor("Basil", 30, "English");

        Course course1 = new Course("Math", 30);
        Course course2 = new Course("English", 40);
        Course course3 = new Course("Arabic", 68);

        Student std1 = new Student("Mahmoud", 2838);
        Student std2 = new Student("Fatma", 3421);
        Student std3 = new Student("Nada", 6567);

        Grade grd1 = new Grade(2838, 30, 85);

        Inst1.setSpecialization("Engineering");


        std1.courses.add("Math");
        std1.grades.add(85.0f);

        std1.courses.add("Arabic");
        std1.grades.add(75.0f);

        std1.courses.add("English");
        std1.grades.add(90.0f);

        std2.courses.add("Math");
        std2.grades.add(85.0f);

        std2.courses.add("Arabic");
        std2.grades.add(75.0f);

        std2.courses.add("English");
        std2.grades.add(90.0f);

        std3.courses.add("Math");
        std3.grades.add(85.0f);

        std3.courses.add("Arabic");
        std3.grades.add(75.0f);

        std3.courses.add("English");
        std3.grades.add(90.0f);

        Inst1.displayInstructorDetails();
        System.out.println("=====================================");
        course1.displayCourseDetails();
        System.out.println("=====================================");
        ArrayList<Student> students = new ArrayList<>();
        students.add(std1);
        students.add(std2);
        students.add(std3);

        std1.EditStudentData(4, "Ahmed", 5545);
        std1.displayInstructorDetails();

        System.out.println(std1.CalcGradesPercentage());


    }
}