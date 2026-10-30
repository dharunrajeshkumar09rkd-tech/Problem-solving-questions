public class P7_Manager extends P7_Employee {
    protected int teamSize;

    public P7_Manager(int id, String name, double salary, int teamSize) {
        super(id, name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(", Team Size: " + teamSize);
    }
}
