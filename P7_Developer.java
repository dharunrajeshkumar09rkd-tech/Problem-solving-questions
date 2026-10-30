public class P7_Developer extends P7_Employee {
    private String programmingLanguage;

    public P7_Developer(int id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(", Language: " + programmingLanguage);
    }
}
