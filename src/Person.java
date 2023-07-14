public class Person {
    private String name;

    protected Person() {
        this("Jane Doe");
    }
    protected Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
