import java.util.HashMap;
import java.util.Map;

// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

//(qwer{123)}

public class prog53 {
    public static void main(String[] args) {        
        String str =  "[{a+]}{d*3)(}";
        //Map<Integer, String> db = new HashMap<>();
        // db.put(1, "один");
        // db.put(2, "два");
        // db.put(3, "три");
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
         
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '[') {
                count1++; 
            }
            if (str.charAt(i) == '(') {
                count2++; 
            }
            if (str.charAt(i) == '{') {                
                count3++; 
            }
            if (str.charAt(i) == '}') {                
                count3--; 
            }            
            if (str.charAt(i) == ')') {                
                count2--; 
            }
            if (str.charAt(i) == ']') {                
                count1--; 
            }      
        }
        if (count1 + count2 + count3 == 0) {
            System.out.println("истина");
        }else{
            System.out.println("ложь");
        }

/* 
        Map<Character, Character> bd = new HashMap<>();
        bd.put(')', '(');
        bd.put('}', '{');
        bd.put(']', '[');
        Deque<Character> stack = new LinkedList<>();
        for (char c : input.toCharArray()) {
            if (bd.containsValue(c)) {
                // одна из открывающих скобок
                stack.push(c);
            } else if (bd.containsKey(c)) {
                // одна из закрывающих скобок
                if (stack.isEmpty() || stack.pop() != bd.get(c)) {
                    return false;
                }
            }
        }
        // в конце стек должен быть пустым
        return stack.isEmpty();*/
        
    } 


            
}       
     