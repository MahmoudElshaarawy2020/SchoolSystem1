class Grade {
    private int studentId;
    private int courseId;
    private double gradeValue;

    public Grade(int studentId, int courseId, double gradeValue) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.gradeValue = gradeValue;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public double getGradeValue() {
        return gradeValue;
    }

    public void setGradeValue(double gradeValue) {
        this.gradeValue = gradeValue;
    }

    public String calculateGradeLetter(double gradeValue) {
        if (gradeValue >= 90) {
            return "A";
        } else if (gradeValue >= 80) {
            return "B";
        } else if (gradeValue >= 70) {
            return "C";
        } else if (gradeValue >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayCourseDetails() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade Value: " + gradeValue);
    }
}