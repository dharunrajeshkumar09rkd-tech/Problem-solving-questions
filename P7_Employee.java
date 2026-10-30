public class P7_Employee {
    protected int id;
    protected String name;
    protected double salary;

    public P7_Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.print("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}
