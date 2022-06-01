import java.util.*;

public class StudentList {
    private ArrayList<Student> list;
    private int length;
    
    public StudentList() { list = new ArrayList<Student>();}
    
    public ArrayList<Student> findByName(String name) {
        boolean found = false;
        ArrayList<Student> matches = new ArrayList<>();
        for (Student s :
                list) {
            String fullName = new String(s.getFirstName() + " " + s.getLastName().toLowerCase());
            if (fullName.matches(".*" + name.toLowerCase() + "(.*)")) {
                matches.add(s);
                found = true;
            }
        }
        return matches;
    }

    public Student findById(int id) {
        for (Student s :
                list) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public void add(Student s) {
        list.add(s);
    }

    public void remove(int id) {
        boolean found = false;
        for (Student s :
                list) {
            if (s.getId() == id) {
                int choice;
                System.out.println("Are you sure deleting this student? (1. Yes 2.No");
                choice = new Scanner(System.in).nextInt();
                if (choice == 1) {
                    list.remove(s);
                }
                found = true;
            }
            else if (found == false) {
                System.out.println(("Cannot find this student" + id));
            }
        }
    }

    public void sortByMark() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getMark() > o2.getMark()) {
                    return -1;
                }
                else if (o1.getMark() < o2.getMark()) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });
    }
    
    public void showList() {
        for (Student s :
                list) {
            s.toString();
        }
    }
    
    public void showList(ArrayList<Student> list) {
        for (Student s :
                list) {
            s.toString();
        }
    }


 }
