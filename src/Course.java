public class Course {
    private String courseCode;
    private String courseName;
    private int creditHour;
    private Staff instructor;

    public Course(String courseCode, String courseName, int creditHour, Staff instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHour = creditHour;
        this.instructor = instructor;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHour() {
        return creditHour;
    }

    public Staff getInstructor() {
        return instructor;
    }
}
