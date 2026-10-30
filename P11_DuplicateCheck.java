import java.util.HashSet;

public class P11_DuplicateCheck {
    public static boolean hasDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
