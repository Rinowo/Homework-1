import java.util.Scanner;

public class Application {
    private static StudentList list;

    public static void menu(){
        System.out.println("1. Add a new student to the list");
        System.out.println("2. Delete a student from the list");
        System.out.println("3. Search by name");
        System.out.println("4. Search by id");
        System.out.println("5. Print student info in descending order of mark");
        System.out.println("6. Exit");
    }

    public static void main(String[] args) {
        StudentList list = new StudentList();
        Scanner sc = new Scanner(System.in);
        int choose;

        do {
            menu();
            choose = sc.nextInt();
            sc.nextLine();

            if (choose == 1) {
                System.out.println("Enter student ID: "); int id = sc.nextInt();
                System.out.println("Enter first name: "); String fn = sc.nextLine();
                System.out.println("Enter last name: "); String ln = sc.nextLine();
                System.out.println("Enter mark: "); double mark = sc.nextDouble();
                Student s = new Student(id, fn, ln, mark);
                list.add(s);
            }
            else if (choose == 2) {
                System.out.println("Enter id to delete: "); int id = sc.nextInt();
                list.remove(id);
            }


        }while (choose != 6);
    }
}
