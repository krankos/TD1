public class Student {
    private String name;
    private double grade1;
    private double grade2;

    public Student(String name, float grade1, float grade2) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public double average() {
        return (grade1 + grade2) / 2;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Average: " + average());
    }
}
