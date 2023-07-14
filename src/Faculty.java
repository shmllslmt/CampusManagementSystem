import java.util.ArrayList;

public class Faculty {
    private String facultyCode;
    private String facultyName;
    private ArrayList<Department> departments;

    public Faculty(String facultyCode, String facultyName) {
        this.facultyCode = facultyCode;
        this.facultyName = facultyName;
        this.departments = new ArrayList<>();
    }

    public String getFacultyCode() {
        return facultyCode;
    }

    public String getFacultyName() {
        return facultyName;
    }
    public Faculty getFaculty() {
        return this;
    }
    public void addDepartment(Department department) {
        departments.add(department);
    }
    public void removeDepartment(Department department) {
        departments.remove(department);
    }
    @Override
    public String toString() {
        String info = getFacultyCode() + " " + getFacultyName();

        if(!(departments.isEmpty())) {
            info += "\nDepartment";

            for (Department department: departments) {
                info += "\n"+department.getDepartmentCode()+" "+department.getDepartmentName();
            }
        }
        return info;
    }
}
