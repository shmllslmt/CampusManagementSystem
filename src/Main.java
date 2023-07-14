public class Main {
    public static void main(String[] args) {
        University southern = new University("Southern University College", "University College");
        southern.addFaculty("Faculty of Engineering and Information Technology");

        Faculty feit;
        Department dcs = new Department("DCS", "Department of Computer Science");
        Department dee = new Department("DEE", "Department of Electrical Engineering");

        for(Faculty faculty: southern.getFaculties()) {
            feit = faculty.getFaculty();
            if(feit.getFacultyName().equals("Faculty of Engineering and Information Technology")) {
                feit.addDepartment(dcs);
                feit.addDepartment(dee);
            }
        }

        Staff instructor = new Staff("S001", "Alex Turner");
        Course oop = new Course("BTPR2123", "Object-Oriented Programming", 3, instructor);
        Course java = new Course("BTPR1103", "Java Programming", 3, instructor);
        dcs.addCourse(oop);
        dcs.addCourse(java);

        Student student = new Student("BCS0001", "Elon Musk");
        student.enrollCourse(oop);
        student.enrollCourse(java);

        System.out.println(southern +"\n");
        System.out.println(dcs + "\n");
        System.out.println(student);
    }
}