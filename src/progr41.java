import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

// Принимает от пользователя строку вида
// text~num
// 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет
//  её из списка.


public class progr41 {
    public static void main(String[] args) throws IOException {
        LinkedList<String> llist = new LinkedList<String>();
        llist.add(0,"zero");
        llist.add(1,"first");
        llist.add(2,"second");
        llist.add(3,"thi");
       
           
    
        String str = inputString("введите: text~num");        
        String[] arr = new String[2];
        arr = str.split("\\~");
        System.out.println(Arrays.toString(arr));

        if (arr[0].equals("print")) {
            System.out.println(llist.get(Integer.parseInt(arr[1])));        
            llist.remove(Integer.parseInt(arr[1]));        
        } else {
            llist.add(Integer.parseInt(arr[1]) , arr[0]);
        }
        if (arr[0].equals("1")){
            System.exit(0);
        }

        System.out.println(llist); 
    }
        
    
    public static String inputString(String helloWord){
        Scanner iScanner = new Scanner(System.in);
        System.out.println(helloWord);
        String data = iScanner.nextLine();
        iScanner.close();
        return data;
    }
        
        
}
