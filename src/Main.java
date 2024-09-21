import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Adding 10 students to the ArrayList
        students.add(new Student(1, "John", "Winter Garden"));
        students.add(new Student(2, "Kelly", "Las Vegas"));
        students.add(new Student(3, "Jerry", "Winter Garden"));
        students.add(new Student(4, "Jill", "Pleasant Grove"));
        students.add(new Student(5, "Billy", "Jupiter"));
        students.add(new Student(6, "Jackie", "Spain"));
        students.add(new Student(7, "Freddy", "Salt Lake City"));
        students.add(new Student(8, "Hanna", "Savannah"));
        students.add(new Student(9, "Joe", "Boulder City"));
        students.add(new Student(10, "Jack", "Henderson"));

        System.out.println("Original List:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting by roll number
        System.out.println("\nSorting by Roll Number:");
        SelectionSort.selectionSort(students, new StudentRollNoComparator());
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting by name
        System.out.println("\nSorting by Name:");
        SelectionSort.selectionSort(students, new StudentNameComparator());
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
