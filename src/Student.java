import java.util.ArrayList;

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


    public float CalcGradesPercentage(){
        float total = 300;
        float totalGrades = 0;
        for(float grades : grades){
            totalGrades += grades;
        }

        return grades.isEmpty() ? 0 : (totalGrades / total) * 100;
    }

    public void EditStudentData(
            int attendance,
            ArrayList<String> courses,
            ArrayList<Float> grades
    ){
        this.attendance = attendance;
        this.courses = courses;
        this.grades = grades;
    }

    public void EditStudentData(int attendance, String name, int id){
        this.attendance = attendance;
        setId(id);
        setName(name);
    }

    public void DeleteStudentData(){
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


}