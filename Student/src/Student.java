import java.util.Scanner;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private double mark;

    public Student(int id, String firstName, String lastName, double mark) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

    public void scanInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        this.id = sc.nextInt();
        System.out.println("Enter first name: ");
        this.firstName = sc.nextLine();
        System.out.println("Enter last name: ");
        this.lastName = sc.nextLine();
        System.out.println("Enter ID: ");
        this.mark = sc.nextDouble();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mark=" + mark +
                '}';
    }
}
