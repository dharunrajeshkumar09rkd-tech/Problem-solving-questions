import java.util.HashMap;

public class P12_StudentMarks {
    public static void main(String[] args) {
        HashMap<String, Integer> marksMap = new HashMap<>();
        marksMap.put("Arun", 85);
        marksMap.put("Ravi", 90);
        marksMap.put("Kumar", 78);

        if (marksMap.containsKey("Ravi")) {
            System.out.println("Ravi's Mark: " + marksMap.get("Ravi"));
        }
    }
}
