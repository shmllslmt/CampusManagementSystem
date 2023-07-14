import java.util.ArrayList;

public class Student extends Person {
    private String studentID;
    private ArrayList<Course> courses;
    private int cumulativeCreditHour;

    protected Student(String studentID) {
        this("Jane Doe", studentID);
    }
    protected Student(String name, String studentID) {
        super(name);
        this.studentID = studentID;
        this.cumulativeCreditHour = 0;
        this.courses = new ArrayList<>();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public void enrollCourse(Course course) {
        this.cumulativeCreditHour += course.getCreditHour();

        courses.add(course);
    }
    public void dropCourse(Course course) {
        this.cumulativeCreditHour -= course.getCreditHour();
        courses.remove(course);
    }
    @Override
    public String toString() {
        String info = studentID + " " + super.getName();
        if (!(courses.isEmpty())) {
            info += "\nThis student is taking the following subjects:\n";
            for (Course course: courses) {
                info += course.getCourseCode() + " " + course.getCourseName() + "\n";
            }
            info += "\nCumulative Credit Hour: " + cumulativeCreditHour;
        }

        return info;
    }
}
