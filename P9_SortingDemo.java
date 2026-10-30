import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P9_SortingDemo {
    public static void main(String[] args) {
        List<P9_SortableEmployee> list = new ArrayList<>(Arrays.asList(
            new P9_SortableEmployee("Ravi", 90000, 30),
            new P9_SortableEmployee("Arun", 85000, 25),
            new P9_SortableEmployee("Kumar", 78000, 35)
        ));

        Collections.sort(list);
        System.out.println("Sorted by Name: " + list);

        list.sort(Comparator.comparingDouble(e -> e.salary));
        System.out.println("Sorted by Salary: " + list);

        list.sort(Comparator.comparingInt(e -> e.age));
        System.out.println("Sorted by Age: " + list);
    }
}
