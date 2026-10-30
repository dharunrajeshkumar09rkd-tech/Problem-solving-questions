public class P14_VersionComparator {
    public static String getLatestVersion(String v1, String v2) {
        String[] arr1 = v1.split("\\.");
        String[] arr2 = v2.split("\\.");
        
        int length = Math.max(arr1.length, arr2.length);
        for (int i = 0; i < length; i++) {
            int num1 = i < arr1.length ? Integer.parseInt(arr1[i]) : 0;
            int num2 = i < arr2.length ? Integer.parseInt(arr2[i]) : 0;
            
            if (num1 > num2) return v1;
            if (num2 > num1) return v2;
        }
        return "Equal";
    }

    public static void main(String[] args) {
        System.out.println(getLatestVersion("3.11.54.2", "3.11.53.1"));
    }
}
