public class Student {
    private static String university = "ULAB";
    private static int totalStudents = 0;

    private int id;
    private String name;
    private String department;
    private double cgpa;

    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        totalStudents++;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
    }

    public static void displayTotalStudents() {
        System.out.println("Total number of students: " + totalStudents);
    }

    public static void main(String[] args) {
        Student student1 = new Student(223014100, "Jannatul Tazree", "CSE", 3.50);
        Student student2 = new Student(223014212, "Tamim Hasan Riyad", "BBA", 4.00);
        Student student3 = new Student(223014098, "Humaura Kabir Upoma", "MSJ", 2.98);

        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
        System.out.println();
        student3.displayDetails();
        System.out.println();

        Student.displayTotalStudents();
    }
}

