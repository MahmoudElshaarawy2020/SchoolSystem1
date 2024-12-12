class Instructor extends Person {
    private String courseName;
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    public Instructor(String name, int id, String courseName) {
        super(name, id);
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void displayInstructorDetails() {
        System.out.println("Instructor ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Specialization: " + specialization);
    }
}