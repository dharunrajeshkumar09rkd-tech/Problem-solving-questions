import java.util.ArrayList;
import java.util.List;

public class P7_HierarchyDemo {
    public static void main(String[] args) {
        List<P7_Employee> employees = new ArrayList<>();
        employees.add(new P7_Developer(101, "Alice", 80000, "Java"));
        employees.add(new P7_Manager(102, "Bob", 95000, 10));
        employees.add(new P7_ProjectManager(103, "Charlie", 110000, 5, "Alpha"));

        for (P7_Employee emp : employees) {
            emp.display();
        }
    }
}
