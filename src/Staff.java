public class Staff extends Person {
    private String staffID;

    protected Staff() {
        this("S001");
    }
    protected Staff(String staffID) {
        this.staffID = staffID;
    }
    protected Staff(String name, String staffID) {
        super(name);
        this.staffID = staffID;
    }
    @Override
    public String toString() {
        return staffID + " " + super.getName();
    }
}
