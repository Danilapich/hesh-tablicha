import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("fan", 37);
        hashMap.put("stan", 242);
        hashMap.put("uran", 55);

        System.out.println("Number of fan: " + hashMap.get("fan"));
        System.out.println("Number of stan: " + hashMap.get("stan"));
        System.out.println("Number of uran: " + hashMap.get("uran"));
    }
}
