import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String str1 = "din";
        String str2 = "recede";
        String str3 = "Success";
        String str4 = "(( @";

        System.out.println(strToHooks(str1));
        System.out.println(strToHooks(str2));
        System.out.println(strToHooks(str3));
        System.out.println(strToHooks(str4));
    }

    public static String strToHooks(String str) {
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (m.containsKey(c))
                m.put(c, m.get(c) + 1);
            else
                m.put(c, 0);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (m.get(Character.toLowerCase(str.charAt(i))) > 0)
                sb.append(")");
            else
                sb.append("(");
        }
        return sb.toString();
    }
}
