import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Даны 2 строки, написать метод, который вернет true, если эти строки являются
// изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове 
// можно заменить на некоторую букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением 
// порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)

// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

//шалаш  конок    fooeell = dggppqq

public class prog52 {
    public static void main(String[] args) {        
        boolean flag = true;     
        char temp1 = ' ';
        char temp2 = ' ';

        String s = "paper"; 
        String t = "title";

        if (s.length() != t.length()){
            flag = false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (flag) {
                temp1 = s.charAt(i); temp2 = t.charAt(i);
                for (int j = 0; j < t.length(); j++) {
                    if ((temp1 == s.charAt(j)) && (temp2 == t.charAt(j)) ||
                     ((temp1 != s.charAt(j)) && (temp2 != t.charAt(j)))) {
                        flag = true;
                    } else {
                        flag = false;
                        //System.out.println(flag);
                        break;
                    }
                }
            } 
            }   
        } 
        System.out.println(flag);
    }   
}
