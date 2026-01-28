public class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        setCgpa(cgpa);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 4.0");
            this.cgpa = 0.0;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 3.8);
        Student s2 = new Student(102, "Bob", 2.5);

        System.out.println("Student 1:");
        System.out.println("ID: " + s1.getId());
        System.out.println("Name: " + s1.getName());
        System.out.println("CGPA: " + s1.getCgpa());

        System.out.println("\nStudent 2:");
        System.out.println("ID: " + s2.getId());
        System.out.println("Name: " + s2.getName());
        System.out.println("CGPA: " + s2.getCgpa());

        System.out.println("\nTesting validation:");
        Student s3 = new Student(103, "Charlie", 5.0);
        System.out.println("Charlie's CGPA: " + s3.getCgpa());

        s1.setCgpa(3.9);
        System.out.println("\nUpdated Alice's CGPA: " + s1.getCgpa());
    }
}