import java.util.ArrayList;

public class Department {
    private String departmentCode;
    private String departmentName;
    private ArrayList<Course> courses;

    public Department(String departmentCode, String departmentName) {
        this.departmentCode = departmentCode;
        this.departmentName = departmentName;
        this.courses = new ArrayList<>();
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
    public void removeCourse(Course course) {
        courses.remove(course);
    }
    @Override
    public String toString() {
        String info = getDepartmentCode() + " " + getDepartmentName();

        if(!(courses.isEmpty())) {
            info += "\nCourse";

            for (Course course: courses) {
                info += "\n"+course.getCourseCode()+" "+course.getCourseName() + " " + course.getCreditHour() + " Instructed By: " + course.getInstructor().toString();
            }
        }
        return info;
    }
}
