public class P13_ClassA {
    public String getName(String name) {
        try {
            if (name == null) throw new NullPointerException("Name cannot be null");
            return name;
        } catch (Exception e) {
            System.out.println("Exception handled in getName(): " + e.getMessage());
            return "Default Name";
        }
    }

    public void getDisplay(String msg) {
        try {
            System.out.println(msg.toUpperCase());
        } catch (Exception e) {
            System.out.println("Exception handled in getDisplay(): " + e.getMessage());
        }
    }
}
