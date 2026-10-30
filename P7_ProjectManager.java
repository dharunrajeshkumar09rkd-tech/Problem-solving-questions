public class P7_ProjectManager extends P7_Manager {
    private String projectName;

    public P7_ProjectManager(int id, String name, double salary, int teamSize, String projectName) {
        super(id, name, salary, teamSize);
        this.projectName = projectName;
    }

    @Override
    public void display() {
        System.out.print("ID: " + id + ", Name: " + name + ", Salary: " + salary + ", Team Size: " + teamSize);
        System.out.println(", Project Name: " + projectName);
    }
}
    