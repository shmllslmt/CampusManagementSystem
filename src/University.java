import java.util.ArrayList;

public class University {
    private String universityName;
    private String universityStatus;
    private ArrayList<Faculty> faculties;

    public University(String universityName, String universityStatus) {
        this.universityName = universityName;
        this.universityStatus = universityStatus;
        this.faculties = new ArrayList<>();
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getUniversityStatus() {
        return universityStatus;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }
    public void addFaculty(String facultyName) {
        String[] temp = facultyName.split(" ");
        StringBuilder facultyCode = new StringBuilder();

        for(String t: temp) {
            t = t.toUpperCase();
            if(!(t.equals("OF") || t.equals("AND"))) {
                facultyCode.append(t.charAt(0));
            }
        }

        Faculty faculty = new Faculty(facultyCode.toString(), facultyName);

        faculties.add(faculty);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
    public void removeFaculty(String facultyCode) {
        faculties.removeIf(faculty -> faculty.getFacultyCode().equals(facultyCode));
    }
    public void removeFaculty(Faculty faculty) {
        faculties.remove(faculty);
    }
    @Override
    public String toString() {
        String info = universityName + "\nUniversity Status = " + universityStatus;

        if(!(faculties.isEmpty())) {
            info += "\nFaculty";

            for (Faculty faculty: faculties) {
                info += "\n"+faculty.getFacultyCode()+" "+faculty.getFacultyName();
            }
        }
        return info;
    }
}
