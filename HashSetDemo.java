import java.util.HashSet;
import java.util.LinkedHashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();
        students.add("Bhathra");
        students.add("Nima");
        students.add("Varsh");
        students.add("Shalini");
        System.out.println("HashSet:");
        System.out.println(students);
        LinkedHashSet<String> linkedStudents = new LinkedHashSet<>();
        linkedStudents.add("Bhathra");
        linkedStudents.add("Nima");
        linkedStudents.add("Varsh");
        linkedStudents.add("Shalini");
        System.out.println("LinkedHashSet:");
        System.out.println(linkedStudents);
    }
}