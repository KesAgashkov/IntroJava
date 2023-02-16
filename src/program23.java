////Напишите метод, который принимает на вход строку (String) 
//и определяет является ли строка палиндромом (возвращает boolean значение).

public class program23 {
    public static void main(String[] args) {
        
        System.out.println(poli("шаль"));       
        
    }
    public static boolean poli(String string) {
        StringBuilder myString = new StringBuilder(string);        
        
        return string.equals(myString.reverse().toString());
                                  
    }
}
