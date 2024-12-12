import java.util.ArrayList;
import java.util.Scanner;

class Student extends Person {
    private int attendance;
    public ArrayList<String> courses;
    public ArrayList<Float> grades;

    public Student(String name, int id) {
        super(name, id);
        this.attendance = 0;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public Student(String name, int id, float totalGrades) {
        super(name, id);
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public Student(String name, int id, int attendance) {
        super(name, id);
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.attendance = attendance;
    }

    public int getAttendance() {
        return attendance;
    }

    public void incrementAttendance() {
        this.attendance++;
    }


    public void CalcGradesPercentage(float total) {
        try {
            float totalGrades = 0;
            if (total == 0) {
                throw new ArithmeticException("Total cannot be zero. Division by zero is not allowed.");
            } else {
                for (float grade : grades) {
                    totalGrades += grade;
                }
                System.out.println(grades.isEmpty() ? 0 : (totalGrades / total) * 100);
            }

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public void EditStudentData(
            int attendance,
            ArrayList<String> courses,
            ArrayList<Float> grades
    ) {
        this.attendance = attendance;
        this.courses = courses;
        this.grades = grades;
    }

    public void EditStudentData(int attendance, String name, int id) {
        this.attendance = attendance;
        setId(id);
        setName(name);
    }

    public void DeleteStudentData() {
        setName("None");
        setId(0);
        this.attendance = 0;
        this.courses = null;
        this.grades = null;
    }

    public void displayInstructorDetails() {
        System.out.println("Student ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Attendance: " + attendance);
        System.out.println("Courses : " + courses);
        System.out.println("Grades : " + grades);
    }

    public void Record() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of grades you want to record:");

        // Read the number of grades to be entered
        int numberOfGrades = input.nextInt();

        // Loop to input grades
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            double grade = input.nextDouble();
            grades.add((float) grade); // Add the input grade to the grades list
        }

        System.out.println("Grades have been recorded successfully!");
    }

}