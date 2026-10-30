public class P9_SortableEmployee implements Comparable<P9_SortableEmployee> {
    public String name;
    public double salary;
    public int age;

    public P9_SortableEmployee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public int compareTo(P9_SortableEmployee other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " (" + age + ") - $" + salary;
    }
}
