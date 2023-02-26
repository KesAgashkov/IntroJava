import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String str1 ="anna";
        String str2 ="noon";
        System.out.println(isIsomorphic(str1,str2));
    }
    public static boolean isIsomorphic(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length())
            return false;
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char charStr1 = str1.charAt(i);
            char charStr2 = str2.charAt(i);
            if (map.containsKey(charStr1))
            {
                if (map.get(charStr1) != charStr2)
                    return false;
            }
            else
            {
                if (map.containsValue(charStr2))
                    return false;
                map.put(charStr1, charStr2);
            }
        }

        return true;
    }
}